package com.example.flux.feign.toss.payment;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;

@Service
public class PaymentService {

    private final PaymentConfirmApi confirmApi;

    private final TossPaymentConfig tossPaymentConfig;

    public PaymentService(PaymentConfirmApi confirmApi, TossPaymentConfig tossPaymentConfig) {
        this.confirmApi = confirmApi;
        this.tossPaymentConfig = tossPaymentConfig;
    }

    public TossPayment confirmPayment(PaymentConfirmVO paymentConfirmVO) {

        String secretValue = tossPaymentConfig.getClientSecret() + ":";
        String basicAuth = Base64.getEncoder().encodeToString(secretValue.getBytes());

        TossPayment paymentResult = confirmApi.confirmPayment(
                "Basic " + basicAuth,
               paymentConfirmVO
        );
        return paymentResult;
    }
}
