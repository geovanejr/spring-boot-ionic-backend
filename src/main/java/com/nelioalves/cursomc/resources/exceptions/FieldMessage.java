package com.nelioalves.cursomc.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String message;
	private String fileStatus;
	
	public FieldMessage() {
		
	}

	public FieldMessage(String message, String fileStatus) {
		super();
		this.message = message;
		this.fileStatus = fileStatus;
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
