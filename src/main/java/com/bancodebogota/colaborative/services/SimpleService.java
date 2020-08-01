package com.bancodebogota.colaborative.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bancodebogota.colaborative.models.ResponseModel;


@RestController
@RequestMapping(path = "/simple")
public class SimpleService {
	 
	@Autowired
	private ResponseModel<String> response;
	
	@Value("${default.value}")
	private String defaultValue;
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "response", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ResponseModel> simpleResponse() {
		// TODO Auto-generated method stub		
		return this.response(defaultValue);
		
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "response/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ResponseModel> simpleResponseByParam(@PathVariable("name") String name) {
		// TODO Auto-generated method stub
		
		return this.response(name);
		
	}
	
	@SuppressWarnings("rawtypes")
	public ResponseEntity<ResponseModel> response(String name) {
		response.setData(name);
		response.setMsg(HttpStatus.OK.name());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
}
