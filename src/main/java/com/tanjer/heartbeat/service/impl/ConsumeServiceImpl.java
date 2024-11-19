package com.tanjer.heartbeat.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.service.ConsumeSaleService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice.ConsumeCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice.HConsumeCancelService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.ConsumeServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice.HConsumeService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.DeactivationCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.HDeactivationCancelService;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice.DeactivationServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice.HDeactivationService;


@Service
public class ConsumeServiceImpl implements ConsumeSaleService{
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumeServiceImpl.class);
	
	@Autowired
	private HConsumeService hConsumeService;
	
	@Autowired
	private HConsumeCancelService hConsumeCancelService;
	
	@Autowired
	private HDeactivationService hDeactivationService;
	
	@Autowired
	private HDeactivationCancelService hDeactivationCancelService;
	
	@Override
	public ConsumeServiceResponse consumeServiceRes(ListProductModelDTO dto) {
		logger.info("consumeServiceRes Processing started");
		ConsumeServiceResponse response = hConsumeService.consumeServiceThirdParyCall(dto);
		return response;
	}
	
	@Override
	public ConsumeCancelServiceResponse consumeCancelServiceRes(ListProductModelDTO dto) {
		logger.info("consumeCancelServiceRes Processing started");
		ConsumeCancelServiceResponse response = hConsumeCancelService.consumeCancelServiceThirdParyCall(dto);
		return response;
	}
	
	@Override
	public DeactivationServiceResponse deactivateServiceRes(DeactivationServiceRequestDTO dto) {
		logger.info("deactivateServiceRes Processing started");
		DeactivationServiceResponse response = hDeactivationService.deactivationServiceThirdParyCall(dto);
		return response;
	}

	@Override
	public DeactivationCancelServiceResponse deactivateCancelServiceRes(ListProductModelDTO dto) {
		logger.info("deactivateCancelServiceRes Processing started");
		DeactivationCancelServiceResponse response = hDeactivationCancelService.deactivationCancelServiceThirdParyCall(dto);
		return response;
	}
}
