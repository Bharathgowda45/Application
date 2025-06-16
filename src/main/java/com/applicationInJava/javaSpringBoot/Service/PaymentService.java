package com.applicationInJava.javaSpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationInJava.javaSpringBoot.DTO.PaymentRequestDTO;
import com.applicationInJava.javaSpringBoot.DTO.PaymentResponseDTO;
import com.applicationInJava.javaSpringBoot.Entity.PaymentEntity;
import com.applicationInJava.javaSpringBoot.Repository.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo paymentRepo;
	
	public PaymentResponseDTO getPaymentDtlsById(PaymentRequestDTO reqObj) {
		PaymentEntity paymentModule = paymentRepo.getPaymentById(reqObj);
		PaymentResponseDTO res = mapReponse(paymentModule);
		
		return res;
	}
	
	private PaymentResponseDTO mapReponse(PaymentEntity paymentEntity) {
		PaymentResponseDTO response = new PaymentResponseDTO();
		response.setStatus("Active");
		
		return response;
	}
}
