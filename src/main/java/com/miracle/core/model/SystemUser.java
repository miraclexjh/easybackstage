package com.miracle.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @title SysUser
 * @author Miracle.XJH
 * @description 系统用户
 * @date 2015年12月18日 下午7:37:18
 * @version 1.0
 */
@Entity
@Table(name = "SYSTEM_USER")
public class SystemUser extends BaseModel {

	private static final long serialVersionUID = 6275151675357567708L;

	/**
	 * 真实姓名
	 */
	private String realName = "未设置";
	/**
	 * 昵称
	 */
	private String nickName = "未设置";
	/**
	 * 账号
	 */
	private String account;
	/**
	 * 密码
	 */
	private String password = "123456";

	@Column(name = "REAL_NAME")
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Column(name = "NICK_NAME")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "ACCOUNT", unique = true, nullable = false)
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "PASSWORD", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
