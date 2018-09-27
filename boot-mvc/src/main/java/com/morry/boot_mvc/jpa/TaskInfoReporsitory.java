package com.morry.boot_mvc.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * jpa操作接口
 * @author lenovo
 *
 */
public interface TaskInfoReporsitory extends Repository<TaskInfo, Long>{
	
	Page<TaskInfo> findAll(Pageable pageAble);
	
	TaskInfo findById(Long id);
	
	TaskInfo save(TaskInfo task);

}
