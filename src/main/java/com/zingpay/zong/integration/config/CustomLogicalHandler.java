package com.zingpay.zong.integration.config;

import com.zingpay.zong.integration.dto.BundlesResponseDto;
import com.zingpay.zong.integration.service.LoadService;
import com.zingpay.zong.integration.service.ZongBundlesService;
import org.example.bankchannelservice.BankRechargeResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;

/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

public class CustomLogicalHandler implements LogicalHandler<LogicalMessageContext> {
    @Override
    public boolean handleMessage(LogicalMessageContext logicalMessageContext) {
        try {
            if(!(boolean) logicalMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
                Source payload = logicalMessageContext.getMessage().getPayload();
                StringWriter sw = new StringWriter();
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                Result result = new StreamResult(sw);
                transformer.transform(payload, result);

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(new InputSource(new StringReader(sw.toString())));
                Element rootElement = document.getDocumentElement();

                if(rootElement.getTagName().contains("getBundlesResponse")) {
                    getBundles(rootElement);
                } else if(rootElement.getTagName().contains("bankRechargeResponse")) {
                    bankRecharge(rootElement);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean handleFault(LogicalMessageContext logicalMessageContext) {
        return false;
    }

    @Override
    public void close(MessageContext messageContext) {

    }

    private String getString(String tagName, Element element) {
        NodeList list = element.getElementsByTagName(tagName);
        if (list != null && list.getLength() > 0) {
            NodeList subList = list.item(0).getChildNodes();

            if (subList != null && subList.getLength() > 0) {
                return subList.item(0).getNodeValue();
            }
        }

        return null;
    }

    private void getBundles(Element element) {
        String bundles = getString("PRODLIST", element);
        ZongBundlesService.bundlesResponseDto = null;
        if(bundles.contains("#")) {
            String[] hashSplittedArray = bundles.split("#");
            for(int i=0; i<hashSplittedArray.length; i++) {
                if(hashSplittedArray[i].contains("|")) {
                    String[] bundlesArray = hashSplittedArray[i].split("\\|");
                    BundlesResponseDto bundlesResponseDto = new BundlesResponseDto();
                    bundlesResponseDto.setBundleId(bundlesArray[0]);
                    bundlesResponseDto.setBundleName(bundlesArray[1]);
                    bundlesResponseDto.setBdpnoTax(Integer.parseInt(bundlesArray[2]));
                    bundlesResponseDto.setBdTax(Integer.parseInt(bundlesArray[3]));
                    bundlesResponseDto.setRechargeTax(Integer.parseInt(bundlesArray[4]));
                    bundlesResponseDto.setDiscount(Integer.parseInt(bundlesArray[5]));
                    bundlesResponseDto.setDeductAmount(Integer.parseInt(bundlesArray[6]));
                    bundlesResponseDto.setServiceFee(Integer.parseInt(bundlesArray[7]));
                    bundlesResponseDto.setServiceTax(Integer.parseInt(bundlesArray[8]));
                    bundlesResponseDto.setAit(Integer.parseInt(bundlesArray[9]));
                    bundlesResponseDto.setRechargeRequired(Integer.parseInt(bundlesArray[10]));
                    if(ZongBundlesService.bundlesResponseDto == null) {
                        ZongBundlesService.bundlesResponseDto = new ArrayList<BundlesResponseDto>();
                    }
                    ZongBundlesService.bundlesResponseDto.add(bundlesResponseDto);
                }
            }
        }
    }

    private void bankRecharge(Element element) {
        BankRechargeResponse bankRechargeResponse = new BankRechargeResponse();
        bankRechargeResponse.setBossId(getString("bossId", element));
        bankRechargeResponse.setRequestId(getString("requestId", element));
        if(getString("RETN", element) != null) {
            bankRechargeResponse.setRETN(Integer.parseInt(getString("RETN", element)));
        }
        bankRechargeResponse.setDESC(getString("DESC", element));
        System.out.println(bankRechargeResponse);

        LoadService.bankRechargeResponse = bankRechargeResponse;
    }
}
