package com.zingpay.zong.integration.controller;

import com.zingpay.zong.integration.component.LoadComponent;
import com.zingpay.zong.integration.dto.ZongLoadDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.bankchannelservice.BankRechargeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bilal Hassan on 08-Dec-20
 * @project zong-integration-microservice
 */

@RestController
@RequestMapping("/load")
@Api(value="load", description="Contains methods related to Zong Load.")
public class LoadController extends BaseController {

    @Autowired
    private LoadComponent loadComponent;

    @ApiOperation(value = "Takes in ZongLoadDto as requestbody and perform zong load.", response = BankRechargeResponse.class)
    @PostMapping
    public BankRechargeResponse zongLoad(@RequestHeader("Authorization") String token, @RequestBody ZongLoadDto zongLoadDto) {
        return loadComponent.zongLoad(zongLoadDto);
    }
}
