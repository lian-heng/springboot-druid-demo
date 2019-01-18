package com.teamlive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamlive.mapper.TestMapper;


@Service
public class TestService {

	@Autowired
	private TestMapper mapper;
	
	public void test(){
		mapper.count();
	}

	public void updateAll() {
		mapper.updateAll();
	}

	public void deleteAll() {
		mapper.deleteAll();
	}

	public void selectAll() {
		mapper.selectAll();
	}
}
