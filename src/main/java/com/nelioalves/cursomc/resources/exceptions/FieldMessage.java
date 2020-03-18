package com.nelioalves.cursomc.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	private String fileStatus;
	
	public FieldMessage() {
		
	}

	public FieldMessage(String fieldName, String message) {
		super();
		this.fieldName = fieldName;
		this.message = message;
	}

	public FieldMessage(String fieldName, String message, String fileStatus) {
		super();
		this.fieldName = fieldName;
		this.message = message;
		this.fileStatus = fileStatus;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
}
