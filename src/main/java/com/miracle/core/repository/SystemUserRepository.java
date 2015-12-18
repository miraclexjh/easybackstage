package com.miracle.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miracle.core.model.SystemUser;

/**
 * @title SysUserRepository
 * @author Miracle.XJH
 * @description 系统用户数据仓库
 * @date 2015年12月18日 下午7:54:32
 * @version 1.0
 */
public interface SystemUserRepository extends JpaRepository<SystemUser, Serializable> {
	
	/**
	 * @title findByAccount
	 * @author Miracle.XJH
	 * @description 根据用户账号查询用户信息
	 * @date 2015年12月18日 下午7:56:18
	 * @version 1.0
	 * @param account 账号
	 * @return SystemUser
	 */
	public SystemUser findByAccount(String account);
	
	/**
	 * @title findByAccountAndPassword
	 * @author Miracle.XJH
	 * @description 根据用户账号和密码查询用户信息
	 * @date 2015年12月18日 下午7:57:27
	 * @version 1.0
	 * @param account 账号
	 * @param password 密码
	 * @return SystemUser
	 */
	public SystemUser findByAccountAndPassword(String account, String password);
}
