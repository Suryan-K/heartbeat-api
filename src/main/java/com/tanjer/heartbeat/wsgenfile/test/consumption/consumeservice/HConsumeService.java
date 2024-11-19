package com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.ConsumeServiceRequestDTO;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HConsumeService {
	
	private static final Logger logger = LoggerFactory.getLogger(HConsumeService.class);
	
	@Autowired
	private ConsumeService consumeService;
	
	@Autowired
	private CommonUtils commonUtils;
	
	public ConsumeServiceResponse consumeServiceThirdParyCall(ConsumeServiceRequestDTO dto) {
		logger.info("PharmacySaleServiceRequest Processing started");
		ConsumeServiceRequest request = mapToSoapRequest(dto);
		
		try {
			ConsumeServiceResponse responce = consumeService.notifyConsume(request);
			return responce;
		} catch (ServiceError e) {
			e.printStackTrace();
			return null;
		}
	}


	private ConsumeServiceRequest mapToSoapRequest(ConsumeServiceRequestDTO dto) {
		ConsumeServiceRequest request = new ConsumeServiceRequest();
		ConsumeServiceRequest.PRODUCTLIST productlist = new ConsumeServiceRequest.PRODUCTLIST();
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
