package com.bancodebogota.colaborative.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/simple")
public class SimpleService {

	protected ResponseEntity<String> responseEntity;
	
	@GetMapping(path = "")
	@ResponseBody
	public ResponseEntity<String> add() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok("Simple rest to Bancolombia");
	}
	
}
