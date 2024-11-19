package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.ConsumeServiceRequestDTO;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;

public interface ConsumeSaleService {
	
	public ConsumeServiceResponse consumeServiceRes(ConsumeServiceRequestDTO request);
	
}
