package com.miracle.core.service;

import com.miracle.core.model.SystemUser;

/**
 * @title SystemUserService
 * @author Miracle.XJH
 * @description 描述说明
 * @date 2015年12月18日 下午9:33:09
 * @version 1.0
 */
public interface SystemUserService {
	public SystemUser findByAccount(String account);
	public SystemUser findById(String id);
}
