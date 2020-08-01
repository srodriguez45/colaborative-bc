package com.bancodebogota.colaborative.models;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel<T> {

	private String msg;
	private T data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg.isEmpty() ? "Ok" : msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
