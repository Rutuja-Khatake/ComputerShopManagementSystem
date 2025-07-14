package com.shop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/addUser")
	public String addUser() {
		return "User/userProduct";
	}
}
