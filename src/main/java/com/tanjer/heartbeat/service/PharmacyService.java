package com.tanjer.heartbeat.service;

import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleServiceResponse;

public interface PharmacyService {
	
	public PharmacySaleServiceResponse pharmacyServiceRes(PharmacySaleServiceRequestDTO requestDTO);

}
