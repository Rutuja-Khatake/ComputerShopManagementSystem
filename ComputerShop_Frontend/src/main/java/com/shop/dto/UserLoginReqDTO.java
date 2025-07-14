package com.shop.dto;

import lombok.Data;

@Data

public class UserLoginReqDTO {
	private String username;
	private String password;

	// Required: Default constructor
	public UserLoginReqDTO() {
	}

	// Optional: constructor with fields
	public UserLoginReqDTO(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Required: Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
