package com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.PharmacySaleCancelServiceRequestDTO;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HPharmacySaleCancelService {
	
	@Autowired
	private PharmacySaleCancelService pharmacySaleCancelService;
	
	@Autowired
	private CommonUtils commonUtils;

	public PharmacySaleCancelServiceResponse pharmacySaleCancelServiceThirdPartyCall(
			PharmacySaleCancelServiceRequestDTO request) {
		
		PharmacySaleCancelServiceRequest requestObj = mapToPharmacySaleCancelServiceRequest(request);
		PharmacySaleCancelServiceResponse responce = null;
		try {
			responce = pharmacySaleCancelService.notifyPharmacySaleCancel(requestObj);
		} catch (ServiceError e) {
			e.printStackTrace();
		} 
		return responce;
	}

	private PharmacySaleCancelServiceRequest mapToPharmacySaleCancelServiceRequest(
			PharmacySaleCancelServiceRequestDTO request) {
		PharmacySaleCancelServiceRequest requestObj = new PharmacySaleCancelServiceRequest();
		requestObj.setTOGLN(request.getTogln());
		requestObj.setPRESCRIPTIONID(request.getPrescriptionId());
		
		PharmacySaleCancelServiceRequest.PRODUCTLIST productlist = new PharmacySaleCancelServiceRequest.PRODUCTLIST();
		List<Product> products = request.getProductlist().stream().map(productDto -> {
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
		productlist.getPRODUCT().addAll(products);
		requestObj.setPRODUCTLIST(productlist);
		
		return requestObj;
	}
	
	
	

}
