package com.morry.boot_mvc.mybatis;

import java.io.Serializable;

/**
 * mybatis实体
 * @author lenovo
 *
 */
public class TaskInfo implements Serializable{
	
	public TaskInfo() {
		
	}
	private Long id;
	
	private String taskId;
	
	private String taskName;
	
	private int taskType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getTaskType() {
		return taskType;
	}

	public void setTaskType(int taskType) {
		this.taskType = taskType;
	}

	
}
