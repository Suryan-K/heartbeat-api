package com.tanjer.heartbeat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.service.ConsumeSaleService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.DeactivationCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice.DeactivationServiceResponse;

@RestController
@RequestMapping("consumption/service")
public class ConsumptionController {
	
	
	@Autowired
	private ConsumeSaleService consumeService;
	
	@PostMapping("consume")
	public ConsumeServiceResponse request(@RequestBody ConsumeServiceRequestDTO request){
		return consumeService.consumeServiceRes(request);
	}
	
	@PostMapping("deactivation")
	public DeactivationServiceResponse request(@RequestBody DeactivationServiceRequestDTO request){
		return consumeService.deactivateServiceRes(request);
	}
	
	@PostMapping("deactivation/cancel")
	public DeactivationCancelServiceResponse request(@RequestBody DeactivationCancelServiceRequestDTO request){
		return consumeService.deactivateCancelServiceRes(request);
	}

}
