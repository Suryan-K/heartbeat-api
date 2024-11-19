package com.tanjer.heartbeat.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class ResponseDTO {
	
	private boolean status;
	private String message;
	private Object data;

}
