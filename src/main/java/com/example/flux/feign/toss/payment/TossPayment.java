package com.example.flux.feign.toss.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class TossPayment {
    private String orderName;
    private String method;
    private String totalAmount;
    private Card card;
//    private VirtualAccount virtualAccount;

    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Card{
        private String approveNo;
    }
}