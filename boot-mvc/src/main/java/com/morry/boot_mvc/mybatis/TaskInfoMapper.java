package com.morry.boot_mvc.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * mybatis操作接口
 * @author lenovo
 *
 */
@Mapper
public interface TaskInfoMapper {
	
	public List<TaskInfo> findAll();
}
