package com.tanjer.heartbeat.requestDTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AcceptServiceRequestDto {
	
	private String fromgln;
	private List<ProductSample> productlist;

}
