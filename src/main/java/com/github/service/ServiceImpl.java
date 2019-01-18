package com.github.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.mapper.Mapper;

@Service
public class ServiceImpl {

	@Autowired
	private Mapper mapper;
	
	public void updateNoWhere() {
		mapper.updateNoWhere();
	}

	public void deleteNoWhere() {
		mapper.deleteNoWhere();
	}

	public void selectAllColumn() {
		mapper.selectAllColumn();
	}
}
