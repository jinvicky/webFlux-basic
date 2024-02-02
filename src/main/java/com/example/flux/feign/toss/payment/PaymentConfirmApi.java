package com.example.flux.feign.toss.payment;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "toss-payment", url = "${toss.successConfirmUrl}")
public interface PaymentConfirmApi {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    TossPayment confirmPayment(@RequestHeader("Authorization") String basicAuthCode, @RequestBody PaymentConfirmVO paymentConfirmVO);
}
