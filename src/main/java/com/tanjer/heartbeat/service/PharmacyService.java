package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.AcceptServiceRequestDto;
import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.wsgenfile.pharmacy.acceptDispatch.AcceptDispatchServiceResponse;
import com.tanjer.heartbeat.wsgenfile.pharmacy.acceptService.AcceptServiceResponse;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleService.PharmacySaleServiceResponse;

public interface PharmacyService {
	
	public PharmacySaleServiceResponse pharmacyServiceRes(PharmacySaleServiceRequestDTO requestDTO);

	public AcceptServiceResponse getAcceptService(AcceptServiceRequestDto request);

	public AcceptDispatchServiceResponse getAcceptDispatchService(String dispatchNotificationId);

}
