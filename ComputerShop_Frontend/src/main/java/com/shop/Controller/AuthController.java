package com.shop.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.UserLoginReqDTO;
import com.shop.dto.UserRequestDTO;
import com.shop.service.UserService;
import com.shop.serviceImpl.UserServiceImpl;

@Controller
public class AuthController {

	@Autowired
	private UserService userservice;

	@GetMapping("/")
	public String show() {
		return "login";
	}

	@PostMapping("/loginForm")
	public String loginPage(UserLoginReqDTO reqDto,
			Model model,HttpSession session) {
		//System.out.println(username);
		String role = userservice.loginPage(reqDto);
		if(role!=null) {
			session.setAttribute("username", reqDto.getUsername());
			session.setAttribute("role", role);
			return "index";
		}
		
			return "login";		
					
		}
	
	

	@GetMapping("/sign_Up")
	public String signUpPage() {
		return "sign_up";
	}

	@PostMapping("/signUp")
	public String showSignUp(@ModelAttribute UserRequestDTO dto) {
	  
	System.out.println(dto.getRole());
		return 	userservice.registerSignUp(dto);
		
		
	}

}
