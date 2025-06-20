package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.dto.UserLoginReqDTO;
import com.shop.dto.UserRequestDTO;
@Service
public interface UserService {


	String registerSignUp(UserRequestDTO dto);

	String loginPage(UserLoginReqDTO reqdto);

}
