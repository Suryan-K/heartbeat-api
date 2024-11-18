package com.tanjer.heartbeat.wsgenfile.pharmacy.saleService;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.datatype.XMLGregorianCalendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tanjer.heartbeat.requestDTO.PharmacySaleServiceRequestDTO;
import com.tanjer.heartbeat.utils.CommonUtils;

@Component
public class HPharmacySalesService {
	private static final Logger logger = LoggerFactory.getLogger(HPharmacySalesService.class);

	@Autowired
	private PharmacySaleService pharmacySaleService;
	
	@Autowired
	private CommonUtils commonUtils;
	
	public PharmacySaleServiceResponse pharmacyServiceThirdParyCall(PharmacySaleServiceRequestDTO dto) {
		logger.info("PharmacySaleServiceRequest Processing started");
		PharmacySaleServiceRequest request = mapToSoapRequest(dto);
		try {
			PharmacySaleServiceResponse responce = pharmacySaleService.notifyPharmacySale(request);
			return responce;
		} catch (ServiceError e) {
			e.printStackTrace();
			return null;
		}
	}

	private PharmacySaleServiceRequest mapToSoapRequest(PharmacySaleServiceRequestDTO dto) {
		PharmacySaleServiceRequest request = new PharmacySaleServiceRequest();
		request.setTOGLN(dto.getTogln());
		request.setDOCTORID(dto.getDoctorid());
		request.setPATIENTNATIONALID(dto.getPatientnationalid());
		request.setPRESCRIPTIONID(dto.getPrescriptionid());

		try {
			if (dto.getPrescriptiondate() == null || dto.getPrescriptiondate().isEmpty()) {
				throw new RuntimeException("Date input is null or empty");
			}
			XMLGregorianCalendar xmlDate = commonUtils.convertToXMLGregorianCalendar(dto.getPrescriptiondate());
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
