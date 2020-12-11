package com.zingpay.zong.integration.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Bilal Hassan on 08-Dec-20
 * @project zong-integration-microservice
 */

@Getter
@Setter
public class ZongLoadDto {
    private String channelNum;
    private String channelPassword;
    private String userNum;
    private long amount;
    private Date requestDate;
    private String requestId;
}
