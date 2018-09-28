package com.morry.boot_mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.morry.boot_mvc.async.MyAsyncService;
import com.morry.boot_mvc.jpa.TaskInfo;
import com.morry.boot_mvc.jpa.TaskInfoReporsitory;
import com.morry.boot_mvc.service.TaskInfoService;

/**
 * Rest接口返回数据 
 * @author lenovo
 *
 */
@RestController
public class HelloRestController {

	/**
	 * jpa方式操作数据库
	 */
	@Autowired
	private TaskInfoReporsitory taskInfoReporsitory;
	
	@Autowired
	private MyAsyncService myAsyncService;
	/**
	 * mybatis方式操作数据库
	 */
	@Autowired
	private TaskInfoService taskInfoService;
	
	/**
	 * jpa查询数据
	 * @return
	 */
	@RequestMapping("/rest/hello")
	public TaskInfo hello() {
		return taskInfoReporsitory.findById(45L);
	}
	
	/**
	 * mybatis查询数据
	 * @return
	 */
	@RequestMapping("/rest/all")
	public List<com.morry.boot_mvc.mybatis.TaskInfo> allTaskInfo() {
		return taskInfoService.findAll();
	}
	
	/**
	 * 请求异步处理
	 * @return
	 */
	@RequestMapping("/rest/async")
	public String async() {
		myAsyncService.testThread();
		return "async";
	}
	
	@RequestMapping(value="/rest/add" ,method= RequestMethod.POST)
	public String addTaskInfo(com.morry.boot_mvc.mybatis.TaskInfo taskInfo) {
		taskInfoService.addTaskInfo(taskInfo);
		return "ok";
	}
	
	@RequestMapping(value="/rest/jpaAdd" ,method= RequestMethod.POST)
	public TaskInfo save(TaskInfo taskInfo) {
		
		return taskInfoReporsitory.save(taskInfo);
	}
}
