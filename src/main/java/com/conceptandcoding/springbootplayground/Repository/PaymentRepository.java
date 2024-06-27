package com.conceptandcoding.springbootplayground.Repository;

import com.conceptandcoding.springbootplayground.DTO.PaymentRequest;
import com.conceptandcoding.springbootplayground.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    // get payment entity back by using request
    public PaymentEntity getPaymentById(PaymentRequest paymentRequest) {
        PaymentEntity paymentEntity = executeQuery(paymentRequest);
        return paymentEntity;
    }

    // create and return the PaymentEntity by using the data fetching from DB
    private PaymentEntity executeQuery(PaymentRequest request) {

        // TODO: connect with DB and fetch the data

        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setId(request.getPaymentId());
        paymentEntity.setPaymentCurrency("LKR");
        paymentEntity.setPaymentAmount(1500.75);

        return paymentEntity;
    }
}
