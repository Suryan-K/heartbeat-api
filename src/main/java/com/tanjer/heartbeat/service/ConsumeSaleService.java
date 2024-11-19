package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;

public interface ConsumeSaleService {
	
	public ConsumeServiceResponse consumeServiceRes(ListProductModelDTO request);
	
}
