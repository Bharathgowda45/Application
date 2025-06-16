package com.applicationInJava.javaSpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.applicationInJava.javaSpringBoot.DTO.PaymentRequestDTO;
import com.applicationInJava.javaSpringBoot.DTO.PaymentResponseDTO;
import com.applicationInJava.javaSpringBoot.Service.PaymentService;

@Controller
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	PaymentService servce;
	
	@GetMapping("/{id}")
	public ResponseEntity<PaymentResponseDTO> getPaymentById(@PathVariable int id){
		PaymentRequestDTO reqObj = new PaymentRequestDTO();
		reqObj.setPaymentId(id);
		PaymentResponseDTO payment = servce.getPaymentDtlsById(reqObj);
		
		return ResponseEntity.ok(payment);
		
	}
	
	//public Rep
	
	@GetMapping("/tell")
	public ResponseEntity<String> getPaymentSatus(){
//		PaymentRequestDTO reqObj = new PaymentRequestDTO();
//		reqObj.setPaymentId(id);
//		PaymentResponseDTO payment = servce.getPaymentDtlsById(reqObj);
		
		return ResponseEntity.ok("Alive");
		
	}

}
