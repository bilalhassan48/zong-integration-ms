package com.zingpay.zong.integration.controller;

import com.zingpay.zong.integration.dto.BundlesResponseDto;
import com.zingpay.zong.integration.service.ZongBundlesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.bankchannelservice.GetBundles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @ApiOperation(value = "Takes in ZongLoadDto as requestbody and perform zong load.", response = BundlesResponseDto.class)
    @GetMapping
    public List<BundlesResponseDto> getBundles(@RequestBody GetBundles bundles) {
        return zongBundlesService.getBundlesList(bundles);
    }
}
