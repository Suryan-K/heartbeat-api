package com.tanjer.heartbeat.requestDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ProductSample {
	
	private String gtin;
	private String sn;
	private String bn;
	private String xd;

}
