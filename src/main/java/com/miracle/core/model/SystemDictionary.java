package com.miracle.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @title SystemDictionary
 * @author Miracle.XJH
 * @description 系统数据字典
 * @date 2015年12月18日 下午9:24:56
 * @version 1.0
 */
@Entity
@Table(name = "SYSTEM_DICTIONARY")
public class SystemDictionary extends BaseModel {

	private static final long serialVersionUID = -6305334475241455531L;

	/**
	 * 字典名称
	 */
	private String name;
	/**
	 * 字典编码
	 */
	private String code;

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CODE", nullable = false, unique = true)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
