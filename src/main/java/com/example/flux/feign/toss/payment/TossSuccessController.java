package com.example.flux.feign.toss.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TossSuccessController {

    private final PaymentService paymentService;
    public TossSuccessController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/toss/confirm")
    public ResponseEntity tossPaymentSuccess(
             @RequestBody PaymentConfirmVO paymentConfirmVO
    ) {
        System.out.println("paymentConfirmVO = " + paymentConfirmVO.toString());
        TossPayment tossPayment = paymentService.confirmPayment(paymentConfirmVO);
        return new ResponseEntity(tossPayment, HttpStatus.OK);
    }

}
