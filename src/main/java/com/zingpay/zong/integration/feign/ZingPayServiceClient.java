package com.zingpay.zong.integration.feign;

import com.zingpay.zong.integration.util.Status;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Bilal Hassan on 06-Jan-21
 * @project zong-integration-microservice
 */

@FeignClient(value = "${feign.zingpay.name}", url = "${feign.zingpay.url:#{null}}")
public interface ZingPayServiceClient {
    @GetMapping("/validate/service/user/{accountId}/amount/{amount}")
    Status validateUser(@RequestHeader("Authorization") String token,
                        @PathVariable(name = "accountId") int accountId,
                        @PathVariable(name = "amount") double amount);
}
