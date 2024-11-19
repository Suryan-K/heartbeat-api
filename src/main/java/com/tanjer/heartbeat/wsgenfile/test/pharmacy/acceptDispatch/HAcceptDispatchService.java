package com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HAcceptDispatchService {

	private static final Logger logger = LoggerFactory.getLogger(HAcceptDispatchService.class);
	@Autowired
	private AcceptDispatchService acceptDispatchservice;

	public AcceptDispatchServiceResponse pharmacyAcceptDispatchServiceThirdParyCall(String dispatchNotificationId) {
		logger.info("AcceptDispatchServiceRequest Processing started");
		AcceptDispatchServiceRequest request = new AcceptDispatchServiceRequest();
		request.setDISPATCHNOTIFICATIONID(dispatchNotificationId);
		try {
			AcceptDispatchServiceResponse responce = acceptDispatchservice.notifyAccept(request);
			return responce;
		} catch (ServiceError e) {
			e.printStackTrace();
			return null;
		}
	}

}
