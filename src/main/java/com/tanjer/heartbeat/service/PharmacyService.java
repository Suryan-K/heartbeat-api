package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.AcceptServiceRequestDto;
import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleCancelServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch.AcceptDispatchServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService.AcceptServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService.DeactivationServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService.PharmacySaleCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.PharmacySaleServiceResponse;

public interface PharmacyService {
	
	public PharmacySaleServiceResponse pharmacyServiceRes(PharmacySaleServiceRequestDTO requestDTO);

	public AcceptServiceResponse getAcceptService(AcceptServiceRequestDto request);

	public AcceptDispatchServiceResponse getAcceptDispatchService(String dispatchNotificationId);

	public PharmacySaleCancelServiceResponse getSaleCancelService(PharmacySaleCancelServiceRequestDTO request);

	public DeactivationServiceResponse getDeactivationService(DeactivationServiceRequestDTO request);

}
