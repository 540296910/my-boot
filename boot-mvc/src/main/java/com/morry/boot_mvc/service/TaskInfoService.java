package com.morry.boot_mvc.service;

import java.util.List;

import com.morry.boot_mvc.mybatis.TaskInfo;

public interface TaskInfoService {
	
	public List<TaskInfo> findAll();
}
