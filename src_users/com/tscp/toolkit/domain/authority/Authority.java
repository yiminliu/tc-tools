package com.tscp.toolkit.domain.authority;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tscp.toolkit.domain.user.User;

@Entity
@Table(name="authorities")
public class Authority implements Serializable {
	private static final long serialVersionUID = -6398259652301626438L;

	
	@Id
	@Column(name="authority")
	@Enumerated(EnumType.STRING)
	private ROLE role;
	
	@Id
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id", nullable = false)
	private User user;

	
	public Authority() {
		super();
	}

	public Authority(ROLE role, User user) {
		super();
		this.role = role;
		this.user = user;
	}

	public ROLE getRole() {
		return role;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
