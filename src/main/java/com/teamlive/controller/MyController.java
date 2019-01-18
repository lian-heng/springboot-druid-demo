package com.teamlive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamlive.service.TestService;

@RestController
public class MyController {
	@Autowired
	private TestService service;
	
	@RequestMapping("/test")
	public String test(){
		service.test();
		return "hello";
	}
	
	@RequestMapping("/updateAll")
	public String updateAll(){
		service.updateAll();
		return "hello";
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll(){
		service.deleteAll();
		return "hello";
	}
	
	@RequestMapping("/selectAll")
	public String selectAll(){
		service.selectAll();
		return "hello";
	}
}
