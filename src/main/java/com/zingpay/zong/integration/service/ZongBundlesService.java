package com.zingpay.zong.integration.service;

import com.zingpay.zong.integration.config.CustomLogicalHandler;
import com.zingpay.zong.integration.dto.BundlesResponseDto;
import lombok.Getter;
import lombok.Setter;
import org.example.bankchannelservice.BankChannelService;
import org.example.bankchannelservice.BankChannelService_Service;
import org.example.bankchannelservice.GetBundles;
import org.springframework.stereotype.Service;

import javax.xml.ws.BindingProvider;
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

    public List<BundlesResponseDto> getBundlesList(GetBundles bundles) {
        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new CustomLogicalHandler());
        ((BindingProvider)bankChannelService).getBinding().setHandlerChain(handlers);

        bankChannelService.getBundles(bundles);
        return bundlesResponseDto;
    }
}
