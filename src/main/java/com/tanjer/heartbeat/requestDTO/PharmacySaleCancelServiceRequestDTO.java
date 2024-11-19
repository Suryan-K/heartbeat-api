package com.tanjer.heartbeat.requestDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PharmacySaleCancelServiceRequestDTO {
	
	private String togln;
	private String prescriptionId;
	List<ProductModel> productlist;

}
