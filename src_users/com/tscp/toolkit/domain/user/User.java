package com.tscp.toolkit.domain.user;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tscp.toolkit.domain.authority.Authority;


@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = -6398259652301626438L;
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="hint_id")
	private String hindId;
	
	@Column(name="hint_answer")
    private String hintAnswer;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="date_enabled")
	private Date dateEnabled;
	
	@Column(name="date_disabled")
	private Date dateDisabled;
			
	@OneToMany(fetch=FetchType.EAGER, mappedBy="user")
	private Collection<Authority> authorities = new HashSet<Authority>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHindId() {
		return hindId;
	}

	public void setHindId(String hindId) {
		this.hindId = hindId;
	}

	public String getHintAnswer() {
		return hintAnswer;
	}

	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getDateEnabled() {
		return dateEnabled;
	}

	public void setDateEnabled(Date dateEnabled) {
		this.dateEnabled = dateEnabled;
	}

	public Date getDateDisabled() {
		return dateDisabled;
	}

	public void setDateDisabled(Date dateDisabled) {
		this.dateDisabled = dateDisabled;
	}
	

	public Collection<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<Authority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", hindId=" + hindId
				+ ", hintAnswer=" + hintAnswer + ", enabled=" + enabled
				+ ", dateEnabled=" + dateEnabled + ", dateDisabled="
				+ dateDisabled + ", authorities=" + authorities + "]";
	}
	
	
	
}
