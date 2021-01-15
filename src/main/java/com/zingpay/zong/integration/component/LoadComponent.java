package com.zingpay.zong.integration.component;

import com.zingpay.zong.integration.config.CustomLogicalHandler;
import com.zingpay.zong.integration.dto.LoadDto;
import org.example.bankchannelservice.BankChannelService;
import org.example.bankchannelservice.BankChannelService_Service;
import org.example.bankchannelservice.BankRechargeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Bilal Hassan on 08-Dec-20
 * @project zong-integration-microservice
 */

@Component
public class LoadComponent {

    public static BankRechargeResponse bankRechargeResponse;

    @Value("${zong.channel.number}")
    private String channelNum;
    @Value("${zong.channel.password}")
    private String channelPassword;
    @Value("${zong.encryptedpassword}")
    private String encryptedPassword;

    public BankRechargeResponse zongLoad(LoadDto loadDto) {
        loadDto.setChannelNum(channelNum);
        loadDto.setChannelPassword(encryptedPassword);
        XMLGregorianCalendar xmlGregCal = null;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new CustomLogicalHandler());
        ((BindingProvider)bankChannelService).getBinding().setHandlerChain(handlers);

        try {
            long loadAmount = loadDto.getAmount()*100;
            bankChannelService.bankRecharge(loadDto.getChannelNum(), loadDto.getChannelPassword(), loadDto.getUserNum(), Integer.parseInt(loadAmount+""), xmlGregCal, new Holder<String>(loadDto.getRequestId()), null, null, null);
        } catch(Exception e) {

        }

        return bankRechargeResponse;
    }
}
