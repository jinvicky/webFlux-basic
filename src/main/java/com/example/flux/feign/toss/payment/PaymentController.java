package com.example.flux.feign.toss.payment;


import com.example.flux.feign.toss.payment.vo.PaymentRespVO;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@Validated
@RequestMapping("/")
public class PaymentController {

    private final TossPaymentConfig tossPaymentConfig;

    public PaymentController(TossPaymentConfig tossPaymentConfig) {
        this.tossPaymentConfig = tossPaymentConfig;
    }

    // 사용자와 비교,
//    @PostMapping("/toss")
//    public ResponseEntity requestTossPayment( @RequestBody @Valid PaymentDto paymentReqDto) {
////        PaymentRespVO paymentResDto = paymentService.requestTossPayment(paymentReqDto.toEntity(), principal.getUsername()).toPaymentResDto();
//        paymentResDto.setSuccessUrl(paymentReqDto.getYourSuccessUrl() == null ? tossPaymentConfig.getSuccessUrl() : paymentReqDto.getYourSuccessUrl());
//        paymentResDto.setFailUrl(paymentReqDto.getYourFailUrl() == null ? tossPaymentConfig.getFailUrl() : paymentReqDto.getYourFailUrl());
//        return ResponseEntity.ok().body(new SingleResponse<>(paymentResDto));
//    }

//    @GetMapping("/toss/success")
//    public ResponseEntity tossPaymentSuccess(
//            @RequestParam String paymentKey,
//            @RequestParam String orderId,
//            @RequestParam Long amount
//    ) {
//
//        System.out.println("paymentKey = " + paymentKey);
//        System.out.println("amount = " + amount);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    private String clientSecretAndSemicolon = "test_sk_6bJXmgo28ePAmodRWE7jrLAnGKWx:";
//    private String confirmUrl = "https://api.tosspayments.com/v1/payments/confirm";
//    public void confirmPayment() {
//        String basicAuth = Base64.getEncoder().encodeToString(clientSecretAndSemicolon.getBytes());
//
//
//    }
}
