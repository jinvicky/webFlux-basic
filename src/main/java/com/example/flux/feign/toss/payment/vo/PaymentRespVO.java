package com.example.flux.feign.toss.payment.vo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PaymentRespVO {

    private String payType;
    private Long amount;
    private String orderName;
    private String orderId;
    private String customerEmail;
    private String customerName;
    private String successUrl;
    private String failUrl;

    private String failReason;
    private boolean cancelYN;
    private String cancelReason;
    private String createdAt;
}
