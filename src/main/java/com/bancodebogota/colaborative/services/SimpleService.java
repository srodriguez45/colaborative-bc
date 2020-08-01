package com.bancodebogota.colaborative.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/simple")
public class SimpleService {

	protected ResponseEntity<String> responseEntity;
	
	@GetMapping(path = "")
	@ResponseBody
	public ResponseEntity<String> simple() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok("Welcome to Bancolombia");
	}
	
	@GetMapping(path = "/{name}")
	@ResponseBody
	public ResponseEntity<String> simpleByParam(@PathVariable("name") String name) {
		// TODO Auto-generated method stub
		String paramName = !name.isEmpty() ? name : "guest";
		return ResponseEntity.ok("Welcome: " + paramName + " to Bancolombia");
	}
	
}
