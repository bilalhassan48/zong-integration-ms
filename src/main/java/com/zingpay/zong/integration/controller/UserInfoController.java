package com.zingpay.zong.integration.controller;

import com.zingpay.zong.integration.component.UserInfoComponent;
import com.zingpay.zong.integration.util.Status;
import com.zingpay.zong.integration.util.StatusMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.bankchannelservice.GetUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bilal Hassan on 15-Dec-20
 * @project zong-integration-microservice
 */

@RestController
@RequestMapping("/user-info")
@Api(value="user", description="Contains methods related to Zong user.")
public class UserInfoController extends BaseController {

    @Autowired
    private UserInfoComponent userInfoComponent;

    @ApiOperation(value = "Takes in ZongLoadDto as dn, username and password and return user info object.", response = Status.class)
    @PostMapping
    public Status getUserInfo(@RequestBody GetUserInfo getUserInfo) {
        return new Status(StatusMessage.SUCCESS, userInfoComponent.getUserInfo(getUserInfo));
    }
}
