package com.tanjer.heartbeat.wsgenfile.pharmacy.acceptService;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.AcceptServiceRequestDto;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HAcceptService {
	
	@Autowired
	private AcceptService acceptService;
	
	@Autowired
	private CommonUtils commonUtils;
	
	public AcceptServiceResponse getAcceptServiceThirdPartyCall(AcceptServiceRequestDto dto) {
		AcceptServiceRequest request = mapToAcceptServiceRequest(dto);
		AcceptServiceResponse responce = null;
		try {
			responce = acceptService.notifyAccept(request);
		} catch (ServiceError e) {
			
			e.printStackTrace();
		} 

		return responce;
	}

	private AcceptServiceRequest mapToAcceptServiceRequest(AcceptServiceRequestDto request) {
		AcceptServiceRequest requestObj = new AcceptServiceRequest();
		requestObj.setFROMGLN(request.getFromgln());
		
		AcceptServiceRequest.PRODUCTLIST productlist = new AcceptServiceRequest.PRODUCTLIST();
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
