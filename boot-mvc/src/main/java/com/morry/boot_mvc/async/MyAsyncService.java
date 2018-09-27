package com.morry.boot_mvc.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncService {
	/**
	 * 服务方法添加async注解
	 */
	@Async
	public void testThread() {
		System.out.println("线程名称：" + Thread.currentThread().getName());
	}
}
