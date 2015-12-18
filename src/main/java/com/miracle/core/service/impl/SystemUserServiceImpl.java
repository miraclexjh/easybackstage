package com.miracle.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miracle.core.model.SystemUser;
import com.miracle.core.repository.SystemUserRepository;
import com.miracle.core.service.SystemUserService;

/**
 * @title SystemUserServiceImpl
 * @author Miracle.XJH
 * @description 描述说明
 * @date 2015年12月18日 下午9:35:18
 * @version 1.0
 */
@Service
@Transactional
public class SystemUserServiceImpl implements SystemUserService {
	@Autowired
	SystemUserRepository userRepository;

	public SystemUser findByAccount(String account) {
		SystemUser systemUser = this.userRepository.findByAccount(account);
		return systemUser;
	}

	@Override
	public SystemUser findById(String id) {
		SystemUser findOne = this.userRepository.findOne(id);
		return findOne;
	}
}
