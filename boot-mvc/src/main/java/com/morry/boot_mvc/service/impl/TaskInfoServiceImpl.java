package com.morry.boot_mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morry.boot_mvc.mybatis.TaskInfo;
import com.morry.boot_mvc.mybatis.TaskInfoMapper;
import com.morry.boot_mvc.service.TaskInfoService;

@Service
public class TaskInfoServiceImpl implements TaskInfoService {
	
	@Autowired
	private TaskInfoMapper taskInfoMapper;
	
	@Override
	public List<TaskInfo> findAll() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAll();
	}

	@Override
	public int addTaskInfo(TaskInfo taskInfo) {
		return taskInfoMapper.addTaskInfo(taskInfo);
	}

}
