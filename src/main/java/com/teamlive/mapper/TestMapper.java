package com.teamlive.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TestMapper {
	
	@Select("select count(0) from role")
	public Integer count();

	@Select("select roleid from role")
	public List<HashMap> selectAll();

	@Delete("delete from role")
	public void deleteAll();

	@Update("update role set roleid = 1")
	public void updateAll();
}
