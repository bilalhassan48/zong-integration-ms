package com.zingpay.zong.integration.component;

import com.zingpay.zong.integration.config.CustomLogicalHandler;
import org.example.bankchannelservice.BankChannelService;
import org.example.bankchannelservice.BankChannelService_Service;
import org.example.bankchannelservice.GetUserInfo;
import org.example.bankchannelservice.GetUserInfoResponse;
import org.springframework.stereotype.Component;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bilal Hassan on 15-Dec-20
 * @project zong-integration-microservice
 */

@Component
public class UserInfoComponent {
    public static GetUserInfoResponse getUserInfoResponse;

    public GetUserInfoResponse getUserInfo(GetUserInfo getUserInfo) {
        BankChannelService_Service bankChannelService_Service = new BankChannelService_Service();
        BankChannelService bankChannelService = bankChannelService_Service.getBankChannelServiceSOAP();

        List<Handler> handlers = new ArrayList<>();
        handlers.add(new CustomLogicalHandler());
        ((BindingProvider)bankChannelService).getBinding().setHandlerChain(handlers);

        try {
            bankChannelService.getUserInfo(getUserInfo.getDN(), getUserInfo.getUsername(), getUserInfo.getPassword(), null, null, null, null);
        } catch(Exception e) {

        }
        return getUserInfoResponse;
    }
}
