package com.tanjer.heartbeat.requestDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeactivationServiceRequestDTO {
	
	private String dr;
	private String explanation;
	private List<ProductModel> productlist;

}
