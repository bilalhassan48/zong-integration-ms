package com.zingpay.zong.integration.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Bilal Hassan on 06-Jan-21
 * @project zong-integration-microservice
 */

@Getter
@Setter
public class TransactionDto {
    private int accountId;
    private long serviceId;
    private Double amount;
    private String serviceProvider;
    private String retailerRefNumber; //MOBILE-10 digits random number or WEB-10 digits random number
    private String refTo;
    private String bundleId;
    private Date dateTime;
    private boolean success;
}
