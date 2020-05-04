package com.evolvus.springsecurityjwt.domain;

import java.io.Serializable;

public class AuthenticationRequest  implements Serializable{

	private static final long serialVersionUID = 1030568362751966289L;
	private String userName;
	private String password;
	
	public AuthenticationRequest() {
	}
	
	public AuthenticationRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
