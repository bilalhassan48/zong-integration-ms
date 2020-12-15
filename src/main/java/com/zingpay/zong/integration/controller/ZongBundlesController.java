package com.zingpay.zong.integration.controller;

import com.zingpay.zong.integration.service.ZongBundlesService;
import com.zingpay.zong.integration.util.Status;
import com.zingpay.zong.integration.util.StatusMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.bankchannelservice.GetBundles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

@RestController
@RequestMapping("/bundles")
@Api(value="zongbundles", description="Contains methods related to Zong Bundles.")
public class ZongBundlesController extends BaseController {

    @Autowired
    private ZongBundlesService zongBundlesService;

    @ApiOperation(value = "Takes in ZongLoadDto as requestbody and perform zong load.", response = Status.class)
    @PostMapping
    public Status getBundles(@RequestBody GetBundles bundles) {
        return new Status(StatusMessage.SUCCESS, zongBundlesService.getBundlesList(bundles));
    }
}
