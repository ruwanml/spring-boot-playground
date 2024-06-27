package com.conceptandcoding.springbootplayground.Controller;

import com.conceptandcoding.springbootplayground.DTO.PaymentRequest;
import com.conceptandcoding.springbootplayground.DTO.PaymentResponse;
import com.conceptandcoding.springbootplayground.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id) {

        // 1. map incoming data to internal request DTO
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setPaymentId(id);

        // 2. pass the internal request DTO to further layer for processing and get the response DTO
        PaymentResponse paymentResponse = paymentService.getPaymentById(paymentRequest);

        // 3. return the response DTO
        return ResponseEntity.ok(paymentResponse);
    }
}
