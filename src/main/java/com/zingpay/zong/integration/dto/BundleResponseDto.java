package com.zingpay.zong.integration.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Bilal Hassan on 14-Dec-20
 * @project zong-integration-microservice
 */

@Getter
@Setter
public class BundleResponseDto {
    private String bundleId;
    private String bundleName;
    private int bdpnoTax;
    private int bdTax;
    private int rechargeTax;
    private int discount;
    private int deductAmount;
    private int serviceFee;
    private int serviceTax;
    private int ait;
    private int rechargeRequired;
}
