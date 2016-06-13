package com.mailworld.weboa.ms.base.domain;

import java.util.List;

public class JSONResp<E> {
	
	private int code;
	
	private String message;
	
	private List<E> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}
}
