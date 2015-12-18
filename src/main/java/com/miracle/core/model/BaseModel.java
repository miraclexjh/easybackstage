package com.miracle.core.model;

import static com.miracle.core.enums.Status.NORMAL;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.miracle.core.enums.Status;

/**
 * @title BaseModel
 * @author Miracle.XJH
 * @description 描述说明
 * @date 2015年12月18日 下午7:37:50
 * @version 1.0
 */
@MappedSuperclass
public class BaseModel implements Serializable {

	private static final long serialVersionUID = 5775458015193601136L;

	private String id;

	/**
	 * 创建时间，默认为当前系统时间
	 */
	private Date createTime = new Date();

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * 状态，默认为正常(Status.NORMAL)
	 */
	private Status status = NORMAL;

	@Id
	@Column(name = "ID", length = 32)
	@GenericGenerator(name = "sys.uuid", strategy = "uuid")
	@GeneratedValue(generator = "sys.uuid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", updatable = false, nullable = false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false)
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
