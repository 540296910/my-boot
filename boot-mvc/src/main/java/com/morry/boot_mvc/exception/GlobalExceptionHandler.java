package com.morry.boot_mvc.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mao 2018年9月30日
 *
 */
//@ControllerAdvice
@RestControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
	/**
	 * 所有异常报错
	 * 
	 * @param request
	 * @param exception
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	public String allExceptionHandler(HttpServletRequest request,
			Exception exception) throws Exception {
		if (exception.getClass().equals(BindException.class)) {
			BindException bindException = (BindException)exception;
			return bindException.getFieldError().getDefaultMessage();
		}
		return "服务器异常，请联系管理员！";
	}

}
