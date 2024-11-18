package com.tanjer.heartbeat.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class ResponseDTO {
	
	private boolean status;
	private String message;
	private Object data;

}
