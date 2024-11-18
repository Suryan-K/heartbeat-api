package com.tanjer.heartbeat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.service.PharmacyService;
import com.tanjer.heartbeat.service.impl.PharmacyServiceImpl;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleServiceResponse;

@RestController
public class PharmacyController {
	
	private static final Logger logger = LoggerFactory.getLogger(PharmacyServiceImpl.class);
	
	@Autowired
	private PharmacyService pharmacyService;
	
	@PostMapping("/pharmacySaleService")
	public PharmacySaleServiceResponse request(@RequestBody PharmacySaleServiceRequestDTO request){
		logger.info(request.getTogln());
		PharmacySaleServiceResponse responseBody = pharmacyService.pharmacyServiceRes(request);
		
		return responseBody;
		
		
	}

}
