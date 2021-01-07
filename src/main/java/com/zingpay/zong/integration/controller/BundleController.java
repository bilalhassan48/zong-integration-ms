package com.zingpay.zong.integration.controller;

import com.zingpay.zong.integration.component.BundleComponent;
import com.zingpay.zong.integration.feign.ZingPayServiceClient;
import com.zingpay.zong.integration.rabbitmq.RabbitMQSender;
import com.zingpay.zong.integration.util.Status;
import com.zingpay.zong.integration.util.StatusMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.bankchannelservice.GetBundles;
import org.example.bankchannelservice.SubBundle;
import org.example.bankchannelservice.SubBundleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

@RestController
@RequestMapping("/bundles")
@Api(value="zongbundles", description="Contains methods related to Zong Bundles.")
public class BundleController extends BaseController {

    @Autowired
    private BundleComponent bundleComponent;

    @ApiOperation(value = "Takes in GetBundles object as requestbody and returns bundles list.", response = Status.class)
    @PostMapping
    public Status getBundles(@RequestBody GetBundles bundles) {
        return new Status(StatusMessage.SUCCESS, bundleComponent.getBundlesList(bundles));
    }

    @ApiOperation(value = "Takes in SubBundle object as requestbody, subscribe bundle and returns SubBundleResponse object.", response = SubBundleResponse.class)
    @PutMapping
    public Status subscribeBundle(@RequestBody SubBundle subBundle) {
        return new Status(StatusMessage.SUCCESS, bundleComponent.subscribeBundle(subBundle));
    }
}
