package com.tanjer.heartbeat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.service.ConsumeSaleService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;

@RestController
public class ConsumptionController {
	
	
	@Autowired
	private ConsumeSaleService consumeService;
	
	@PostMapping("/consumeService")
	public ConsumeServiceResponse request(@RequestBody ListProductModelDTO request){
		ConsumeServiceResponse responseBody = consumeService.consumeServiceRes(request);
		
		return responseBody;
	}

}
