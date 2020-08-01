package com.bancodebogota.colaborative.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/health")
public class HealthService {

	@GetMapping(path = "")
	@ResponseBody
	public ResponseEntity<String> health() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok("The Bancolombia simple service is currently up");
	}
	
}
