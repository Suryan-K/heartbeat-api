package com.tanjer.heartbeat.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanjer.heartbeat.requestDTO.ConsumeServiceRequestDTO;
import com.tanjer.heartbeat.service.ConsumeSaleService;
import com.tanjer.heartbeat.wsgenfile.consumption.consumeservice.ConsumeService;
import com.tanjer.heartbeat.wsgenfile.consumption.consumeservice.ConsumeServiceRequest;
import com.tanjer.heartbeat.wsgenfile.consumption.consumeservice.ConsumeServiceResponse;
import com.tanjer.heartbeat.wsgenfile.consumption.consumeservice.Product;
import com.tanjer.heartbeat.wsgenfile.consumption.consumeservice.ServiceError;


@Service
public class ConsumeServiceImpl implements ConsumeSaleService{
	
	private static final Logger logger = LoggerFactory.getLogger(ConsumeServiceImpl.class);
	
	@Autowired
	private ConsumeService consumeService;
	
	@Override
	public ConsumeServiceResponse consumeServiceRes(ConsumeServiceRequestDTO dto) {

		ConsumeServiceRequest request = mapToSoapRequest(dto);
		ConsumeServiceResponse response = null;
		try {
			response =  consumeService.notifyConsume(request);
		} catch (ServiceError e) {
			e.printStackTrace();
		}
			return response;
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
				XMLGregorianCalendar xmlDate = convertToXMLGregorianCalendar(productDto.getXd());
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
	public XMLGregorianCalendar convertToXMLGregorianCalendar(String dateStr) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(dateStr);
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			gregorianCalendar.setTime(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (Exception e) {
			throw new RuntimeException("Error converting date: " + e.getMessage(), e);
		}
	}
}
