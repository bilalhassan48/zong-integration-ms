package com.zingpay.zong.integration.service;

import com.zingpay.zong.integration.config.CustomLogicalHandler;
import com.zingpay.zong.integration.dto.BundlesResponseDto;
import lombok.Getter;
import lombok.Setter;
import org.example.bankchannelservice.*;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

@Service
@Getter
@Setter
public class ZongBundlesService {

    public static List<BundlesResponseDto> bundlesResponseDto;

    public static SubBundleResponse subBundleResponse;

    public List<BundlesResponseDto> getBundlesList(GetBundles bundles) {
        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new CustomLogicalHandler());
        ((BindingProvider)bankChannelService).getBinding().setHandlerChain(handlers);

        bankChannelService.getBundles(bundles);
        return bundlesResponseDto;
    }

    public SubBundleResponse subscribeBundle(SubBundle subBundle) {
        try {
            BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
            BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

            List<Handler> handlers = new ArrayList<>();
            handlers.add(new CustomLogicalHandler());
            ((BindingProvider) bankChannelService).getBinding().setHandlerChain(handlers);

            bankChannelService.subBundle("3155711432", "524624", subBundle.getUserNum(), subBundle.getBundleId(), new Holder<String>(subBundle.getRequestId()), "ZING", "ZING#8%23", null, null, null, null, null, null, null, null, null, null, null);
        } catch (Exception e) {

        }
        return subBundleResponse;
    }
}
