package com.applicationInJava.javaSpringBoot.Repository;

import org.springframework.stereotype.Repository;

import com.applicationInJava.javaSpringBoot.DTO.PaymentRequestDTO;
import com.applicationInJava.javaSpringBoot.Entity.PaymentEntity;

@Repository
public class PaymentRepo {
	
	public PaymentEntity getPaymentById(PaymentRequestDTO request) {
		
		PaymentEntity paymentModule = executeQuery(request);
		return paymentModule;
	}
	
	private PaymentEntity executeQuery(PaymentRequestDTO request) {
		PaymentEntity payment =new PaymentEntity();
		payment.setId(request.getPaymentId());
		payment.setPaymentAmount(request.getAmount());
		payment.setPaymentCurrency("INR");
		
		return payment;
	}

}
