package com.tanjer.heartbeat.requestDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeactivationCancelServiceRequestDTO {
	
	private List<ProductSample> productlist;

}