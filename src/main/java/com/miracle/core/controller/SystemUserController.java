package com.miracle.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.core.model.SystemUser;
import com.miracle.core.service.SystemUserService;

/**
 * @title SystemUserController
 * @author Miracle.XJH
 * @description 系统用户控制器
 * @date 2015年12月18日 下午10:25:35
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/system/user")
public class SystemUserController {
	
	@Autowired
	private SystemUserService systemUserService;

	@RequestMapping(value = "/get/{systemUserId}")
	public SystemUser get(@PathVariable String systemUserId){
		return systemUserService.findById(systemUserId);
	}
}
