package com.fidelity.rest.exceptions.models;

import lombok.Data;

@Data
public class ApiError {
	private Integer errorCode;
	private String message;
	private String type;
	private String uri;
}
