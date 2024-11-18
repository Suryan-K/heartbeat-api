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
public class PharmacySaleServiceRequestDTO {

	    private String togln;
	    private String doctorid;
	    private String patientnationalid;
	    private String prescriptionid;
	    private String prescriptiondate;
	    private List<ProductSample> productlist;
		
	    
}
