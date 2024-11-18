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

import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.service.PharmacyService;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleService;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleServiceRequest;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.PharmacySaleServiceResponse;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.Product;
import com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice.ServiceError;

@Service
public class PharmacyServiceImpl implements PharmacyService {
	
	private static final Logger logger = LoggerFactory.getLogger(PharmacyServiceImpl.class);

	@Autowired
	private PharmacySaleService pharmacySaleService;

	@Override
	public PharmacySaleServiceResponse pharmacyServiceRes(PharmacySaleServiceRequestDTO dto) {

		PharmacySaleServiceRequest request = mapToSoapRequest(dto);
		logger.info("doctor id"+ request.getDOCTORID());
		PharmacySaleServiceResponse responce = null;
		try {
			responce = pharmacySaleService.notifyPharmacySale(request);
		} catch (ServiceError e) {
			e.printStackTrace();
		}

		return responce;
	}

	private PharmacySaleServiceRequest mapToSoapRequest(PharmacySaleServiceRequestDTO dto) {
		PharmacySaleServiceRequest request = new PharmacySaleServiceRequest();
		request.setTOGLN(dto.getTogln());
		request.setDOCTORID(dto.getDoctorid());
		request.setPATIENTNATIONALID(dto.getPatientnationalid());
		request.setPRESCRIPTIONID(dto.getPrescriptionid());

		// Convert date
		try {
			if (dto.getPrescriptiondate() == null || dto.getPrescriptiondate().isEmpty()) {
				throw new RuntimeException("Date input is null or empty");
			}
			XMLGregorianCalendar xmlDate = convertToXMLGregorianCalendar(dto.getPrescriptiondate());
			request.setPRESCRIPTIONDATE(xmlDate);
		} catch (Exception e) {
			throw new RuntimeException("Error converting date", e);
		}

		// Convert product list
		PharmacySaleServiceRequest.PRODUCTLIST productlist = new PharmacySaleServiceRequest.PRODUCTLIST();
		List<Product> products = dto.getProductlist().stream().map(productDto -> {
			Product product = new Product();
			product.setGTIN(productDto.getGtin());
			product.setSN(productDto.getSn());
			product.setBN(productDto.getBn());

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
			logger.info("date "+ date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (Exception e) {
			throw new RuntimeException("Error converting date: " + e.getMessage(), e);
		}
	}

}
