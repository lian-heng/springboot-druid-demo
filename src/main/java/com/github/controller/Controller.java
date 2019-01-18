package com.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.service.ServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private ServiceImpl service;
	
	@RequestMapping("/updateNoWhere")
	public void updateNoWhere(){
		service.updateNoWhere();
	}
	
	@RequestMapping("/deleteNoWhere")
	public void deleteNoWhere(){
		service.deleteNoWhere();
	}
	
	@RequestMapping("/selectAllColumn")
	public void selectAllColumn(){
		service.selectAllColumn();
	}
}
