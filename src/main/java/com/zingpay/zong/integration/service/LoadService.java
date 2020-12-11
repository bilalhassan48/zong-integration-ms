package com.zingpay.zong.integration.service;

import com.zingpay.zong.integration.dto.ZongLoadDto;
import org.example.bankchannelservice.BankChannelService;
import org.example.bankchannelservice.BankChannelService_Service;
import org.example.bankchannelservice.BankRechargeResponse;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.util.GregorianCalendar;

/**
 * @author Bilal Hassan on 08-Dec-20
 * @project zong-integration-microservice
 */

@Service
public class LoadService {

    public static BankRechargeResponse bankRechargeResponse;

    public BankRechargeResponse zongLoad(ZongLoadDto zongLoadDto) {
        XMLGregorianCalendar xmlGregCal = null;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();
        try {
            bankChannelService.bankRecharge(zongLoadDto.getChannelNum(), zongLoadDto.getChannelPassword(), zongLoadDto.getUserNum(), Integer.parseInt(zongLoadDto.getAmount()+""), xmlGregCal, new Holder<String>(zongLoadDto.getRequestId()), null, null, null);
        } catch(Exception e) {

        }

        return bankRechargeResponse;
    }
}
