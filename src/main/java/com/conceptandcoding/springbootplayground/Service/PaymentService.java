package com.conceptandcoding.springbootplayground.Service;

import com.conceptandcoding.springbootplayground.DTO.PaymentRequest;
import com.conceptandcoding.springbootplayground.DTO.PaymentResponse;
import com.conceptandcoding.springbootplayground.Entity.PaymentEntity;
import com.conceptandcoding.springbootplayground.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentById(PaymentRequest paymentRequest) {

        // 1. pass the internal request DTO to further layer for processing
        PaymentEntity paymentEntity = paymentRepository.getPaymentById(paymentRequest);

        // 2. map Entity to internal response DTO
        PaymentResponse paymentResponse = mapEntityToResponseDTO(paymentEntity);

        // 3. return the response DTO
        return paymentResponse;
    }

    private PaymentResponse mapEntityToResponseDTO(PaymentEntity entity) {
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(entity.getId());
        response.setAmount(entity.getPaymentAmount());
        response.setCurrency(entity.getPaymentCurrency());

        return response;
    }
}
