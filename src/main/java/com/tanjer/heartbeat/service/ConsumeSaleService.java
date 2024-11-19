package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.DeactivationCancelServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice.ConsumeCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.DeactivationCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice.DeactivationServiceResponse;

public interface ConsumeSaleService {
	
	public ConsumeServiceResponse consumeServiceRes(ListProductModelDTO request);

	public DeactivationServiceResponse deactivateServiceRes(DeactivationServiceRequestDTO dto);

	public DeactivationCancelServiceResponse deactivateCancelServiceRes(DeactivationCancelServiceRequestDTO request);

	public ConsumeCancelServiceResponse consumeCancelServiceRes(ListProductModelDTO dto);
	
}
