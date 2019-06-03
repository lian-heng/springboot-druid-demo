package com.github.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
/**
 *
 */
public interface Mapper {
	
	@Select("select * from user")
	public List<HashMap> selectAllColumn();

	@Delete("delete from user")
	public void deleteNoWhere();

	@Update("update user set id = 1")
	public void updateNoWhere();
}
