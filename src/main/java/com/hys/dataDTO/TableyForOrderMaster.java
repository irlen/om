package com.hys.dataDTO;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class TableyForOrderMaster {
    private String key;
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
}
