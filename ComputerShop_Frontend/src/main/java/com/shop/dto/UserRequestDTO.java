package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {

	private String username;
	private String emailaddress;
	private String password;
	private String role;
	
	
}
