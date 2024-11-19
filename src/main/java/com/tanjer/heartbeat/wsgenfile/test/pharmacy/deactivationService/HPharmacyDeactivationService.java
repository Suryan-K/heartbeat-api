package com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.DeactivationServiceRequestDTO;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HPharmacyDeactivationService {
	
	@Autowired
	private CommonUtils commonUtils;
	
	@Autowired
	private DeactivationService deactivationService;
	
	public DeactivationServiceResponse deactivationServiceTirdPartyCall(DeactivationServiceRequestDTO requestDTO) {
		
		DeactivationServiceRequest requestObj = mapToDeactivationServiceRequest(requestDTO);
		try {
			DeactivationServiceResponse response = deactivationService.notifyDeactivation(requestObj);
			return response;
		} catch (ServiceError e) {
			e.printStackTrace();
			return null;
		}
	}

	private DeactivationServiceRequest mapToDeactivationServiceRequest(DeactivationServiceRequestDTO requestDTO) {
		
		DeactivationServiceRequest requestObj = new DeactivationServiceRequest();
		requestObj.setDR(requestDTO.getDr());
		requestObj.setEXPLANATION(requestDTO.getExplanation());
		DeactivationServiceRequest.PRODUCTLIST productList = new DeactivationServiceRequest.PRODUCTLIST();
		List<Product> products = requestDTO.getProductlist().stream().map(productDto -> {
			Product product = new Product();
			product.setGTIN(productDto.getGtin());
			product.setSN(productDto.getSn());
			product.setBN(productDto.getBn());

			try {
				if (productDto.getXd() == null || productDto.getXd().isEmpty()) {
					throw new RuntimeException("Date input is null or empty");
				}
				XMLGregorianCalendar xmlDate = commonUtils.convertToXMLGregorianCalendar(productDto.getXd());
				product.setXD(xmlDate);
			} catch (Exception e) {
				throw new RuntimeException("Error converting product expiry date", e);
			}

			return product;
		}).collect(Collectors.toList());
		productList.getPRODUCT().addAll(products);
		requestObj.setPRODUCTLIST(productList);
		return requestObj;
	}
	

}
