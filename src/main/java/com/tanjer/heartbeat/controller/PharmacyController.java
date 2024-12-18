package com.tanjer.heartbeat.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanjer.heartbeat.requestDTO.AcceptServiceRequestDto;
import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleCancelServiceRequestDTO;
import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.service.PharmacyService;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch.AcceptDispatchServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService.AcceptServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationCancelService.DeactivationCancelServiceRequest;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService.DeactivationServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService.PharmacySaleCancelServiceResponse;
import com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleService.PharmacySaleServiceResponse;

@RestController
@RequestMapping("rsd/pharmacy/service")
public class PharmacyController {

	@Autowired
	private PharmacyService pharmacyService;

	@PostMapping("sale")
	public PharmacySaleServiceResponse saleService(@RequestBody final PharmacySaleServiceRequestDTO request) {
		return pharmacyService.pharmacyServiceRes(request);
	}
	
	@PostMapping("sale/cancel")
	public PharmacySaleCancelServiceResponse saleCancelServiceResponse(
			@RequestBody PharmacySaleCancelServiceRequestDTO request) {
		return pharmacyService.getSaleCancelService(request);
	}

	@PostMapping("accept")
	public AcceptServiceResponse acceptService(@RequestBody final AcceptServiceRequestDto request) {
		return pharmacyService.getAcceptService(request);
	}

	@GetMapping("dispatch/{dispatchNotificationId}")
	public AcceptDispatchServiceResponse acceptDispatchServiceResponse(
			@PathVariable(required = true) final String dispatchNotificationId) {
		return pharmacyService.getAcceptDispatchService(dispatchNotificationId);
	}

	@PostMapping("/deactivation")
	public DeactivationServiceResponse deactivationServiceResponse(@RequestBody DeactivationServiceRequestDTO request) {
		return pharmacyService.getDeactivationService(request);
	}

	/*
	 * @PostMapping("sale/cancel") public DeactivationCancelServiceRequest
	 * deactivationCancelService(
	 * 
	 * @RequestBody PharmacySaleCancelServiceRequestDTO request) { return
	 * pharmacyService.getSaleCancelService(request); }
	 */
}
