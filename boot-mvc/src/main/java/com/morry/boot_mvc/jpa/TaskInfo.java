package com.morry.boot_mvc.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JPA实体
 * @author lenovo
 *
 */
@Entity
@Table(name = "task_info")
public class TaskInfo implements Serializable{
	
	public TaskInfo() {
		
	}
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "task_id")
	private String taskId;
	
	@Column(name = "task_name")
	private String taskName;
	
	@Column(name = "task_type")
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
