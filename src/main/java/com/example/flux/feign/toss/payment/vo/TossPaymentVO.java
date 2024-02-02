package com.example.flux.feign.toss.payment.vo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TossPaymentVO {

    @NonNull
    private PayType payType;

    private Long amount;

    private String orderName;

    private String yourSucessUrl;

    private String yourFailUrl;

//    public Payment toEntity() {
//        return Payment.builder()
//                .payType(payType)
//                .amount(amount)
//                .orderName(orderName)
//                .orderId(UUID.randomUUID().toString())
//                .paySuccessYN(false)
//                .build();
//    }
}
