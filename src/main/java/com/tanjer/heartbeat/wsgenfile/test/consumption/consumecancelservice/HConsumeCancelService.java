package com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.ListProductModelDTO;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HConsumeCancelService {
	
	@Autowired
	private ConsumeCancelService consumeCancelService;
	
	@Autowired
	private CommonUtils commonUtils;
	
	private static final Logger logger = LoggerFactory.getLogger(HConsumeCancelService.class);

	public ConsumeCancelServiceResponse consumeCancelServiceThirdParyCall(ListProductModelDTO dto) {
		logger.info("ConusmeCancelServiceRequest Processing started");
		ConsumeCancelServiceRequest request = mapToSoapRequest(dto);
		
		try {
			ConsumeCancelServiceResponse responce = consumeCancelService.notifyConsumeCancel(request);
			return responce;
		} catch (ServiceError e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private ConsumeCancelServiceRequest mapToSoapRequest(ListProductModelDTO dto) {
		ConsumeCancelServiceRequest request = new ConsumeCancelServiceRequest();
		ConsumeCancelServiceRequest.PRODUCTLIST productlist = new ConsumeCancelServiceRequest.PRODUCTLIST();
		List<Product> products = dto.getProductlist().stream().map(productDto -> {
			Product product = new Product();
			product.setGTIN(productDto.getGtin());
			product.setSN(productDto.getSn());
			product.setBN(productDto.getBn());
			logger.error("Gtin" + productDto.getGtin());
			logger.error("SN"+ productDto.getSn());
			logger.error("BN"+ productDto.getBn());
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
		request.setPRODUCTLIST(productlist);

		return request;
		
	}
	
	

}
