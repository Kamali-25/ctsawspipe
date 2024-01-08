package com.stackroute.samplepipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/api/home")
	public ResponseEntity<?> getHome()
	{
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}
	
	@GetMapping("/api/view")
	public ResponseEntity<?> getall()
	{
		return new ResponseEntity<String>("This is AWS cicd",HttpStatus.OK);
	}
	
//	@GetMapping("/api/news")
//	public ResponseEntity<?> getNews()
//	{
//		return new ResponseEntity<String>("Elon Musk's new K-12 school in USA",HttpStatus.OK);
//	}
}
