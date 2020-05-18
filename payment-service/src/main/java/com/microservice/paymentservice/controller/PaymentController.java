package com.microservice.paymentservice.controller;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findByPaymentHistoryByOrderId(@PathVariable int orderId){
        return service.
                findPaymentHistoryByOrderId(orderId);
    }
}
