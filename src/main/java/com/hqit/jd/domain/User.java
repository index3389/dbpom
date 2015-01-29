package com.hqit.jd.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ly
 *
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @Column
	private Integer uid;
	
	@Column
	private String account;
	
	@Column
	private String nick;
	
	@Column
	private Integer status;
	
	@Column(name = "create_at")
	private Date createAt;
	
	@Column(name = "update_at")
	private Date updateAt;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}
