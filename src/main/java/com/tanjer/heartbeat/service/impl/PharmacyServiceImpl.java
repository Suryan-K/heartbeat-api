package com.tanjer.heartbeat.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanjer.heartbeat.requestDTO.AcceptServiceRequestDto;
import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleCancelServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.service.PharmacyService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch.AcceptDispatchServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch.HAcceptDispatchService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService.AcceptServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService.HAcceptService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService.DeactivationServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService.HDeactivationService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService.HPharmacySaleCancelService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService.PharmacySaleCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.HPharmacySalesService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.PharmacySaleServiceResponse;

@Service
public class PharmacyServiceImpl implements PharmacyService {
	
	private static final Logger logger = LoggerFactory.getLogger(PharmacyServiceImpl.class);

	@Autowired
	private HPharmacySalesService pharmacyService;
	
	@Autowired
	private HAcceptService acceptService;
	
	@Autowired
	private HAcceptDispatchService acceptDispatchService;
	
	@Autowired
	private HPharmacySaleCancelService pharmacyCancelSaleService;
	
	@Autowired
	private HDeactivationService deactivationSaleService;

	@Override
	public PharmacySaleServiceResponse pharmacyServiceRes(PharmacySaleServiceRequestDTO dto) {
		logger.info("pharmacyServiceRes Processing started");
		PharmacySaleServiceResponse responce = pharmacyService.pharmacyServiceThirdParyCall(dto);
		return responce;
	}

	@Override
	public AcceptServiceResponse getAcceptService(AcceptServiceRequestDto dto) {
		AcceptServiceResponse responce = acceptService.getAcceptServiceThirdPartyCall(dto);
		return responce;
	}

	@Override
	public AcceptDispatchServiceResponse getAcceptDispatchService(String dispatchNotificationId) {
		AcceptDispatchServiceResponse response = acceptDispatchService.pharmacyAcceptDispatchServiceThirdParyCall(dispatchNotificationId);
		return response;
	}

	@Override
	public PharmacySaleCancelServiceResponse getSaleCancelService(PharmacySaleCancelServiceRequestDTO request) {
		PharmacySaleCancelServiceResponse response = pharmacyCancelSaleService.pharmacySaleCancelServiceThirdPartyCall(request);
		return response;
	}

	@Override
	public DeactivationServiceResponse getDeactivationService(DeactivationServiceRequestDTO request) {
		DeactivationServiceResponse response = deactivationSaleService.deactivationServiceTirdPartyCall(request);
		return response;
	}
	
	

	
}
