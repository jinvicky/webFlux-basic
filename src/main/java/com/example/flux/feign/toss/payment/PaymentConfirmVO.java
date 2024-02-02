package com.example.flux.feign.toss.payment;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentConfirmVO {

    private String paymentType;
    private String paymentKey;
    private String orderId;
    private Integer amount;
}
