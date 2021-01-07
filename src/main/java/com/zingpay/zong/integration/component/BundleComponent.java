package com.zingpay.zong.integration.component;

import com.zingpay.zong.integration.config.CustomLogicalHandler;
import com.zingpay.zong.integration.dto.BundleResponseDto;
import org.example.bankchannelservice.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

@Component
public class BundleComponent {

    public static List<BundleResponseDto> bundleResponseDto;

    public static SubBundleResponse subBundleResponse;

    @Value("${zong.channel.number}")
    private String channelNumber;
    @Value("${zong.channel.password}")
    private String channelPassword;
    @Value("${zong.username}")
    private String zongUsername;
    @Value("${zong.password}")
    private String zongPassword;

    public List<BundleResponseDto> getBundlesList(GetBundles bundles) {
        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new CustomLogicalHandler());
        ((BindingProvider)bankChannelService).getBinding().setHandlerChain(handlers);

        bankChannelService.getBundles(bundles);
        return bundleResponseDto;
    }

    public SubBundleResponse subscribeBundle(SubBundle subBundle) {
        try {
            /*SubBundle subBundle = new SubBundle();
            subBundle.setUserNum(transactionDto.getRefTo());
            subBundle.setBundleId(transactionDto.getBundleId());
            subBundle.setRequestId(transactionDto.getRetailerRefNumber().split("-")[1]);*/
            BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
            BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

            List<Handler> handlers = new ArrayList<>();
            handlers.add(new CustomLogicalHandler());
            ((BindingProvider) bankChannelService).getBinding().setHandlerChain(handlers);

            bankChannelService.subBundle(channelNumber, channelPassword, subBundle.getUserNum(), subBundle.getBundleId(), new Holder<String>(subBundle.getRequestId()), zongUsername, zongPassword, null, null, null, null, null, null, null, null, null, null, null);
        } catch (Exception e) {

        }
        return subBundleResponse;
    }
}
