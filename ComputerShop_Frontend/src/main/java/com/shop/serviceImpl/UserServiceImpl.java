package com.shop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shop.dto.UserLoginReqDTO;
import com.shop.dto.UserRequestDTO;
import com.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String loginPage(UserLoginReqDTO reqdto	) {

//        if ("Admin".equals(username) && "sam@123".equals(password)) {
//            return "Admin";
//        } else if ("User".equals(username) && "Ram@123".equals(password)) {
//            return "User";
//        }
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<UserLoginReqDTO> req = new HttpEntity<UserLoginReqDTO>(reqdto ,headers);
		String url = "http://localhost:7172/username";
		
		String isGetting = restTemplate.postForObject(url, req, String.class);
		
		return isGetting;
	}

//			@Override
//			public boolean registerSignUp(UserRequestDTO dto) {
//				HttpHeaders headers = new HttpHeaders();
//				headers.setContentType(MediaType.APPLICATION_JSON);
//		
//				HttpEntity<UserRequestDTO> request = new HttpEntity<>(dto, headers);
//				String url = "http://localhost:7172/addUser";
//		
//				String response = restTemplate.postForObject(url, request, String.class);
//				System.out.println("Response: " + response);		
//				return Boolean.TRUE.equals(isAdded);
//			}

			
	@Override
	public String registerSignUp(UserRequestDTO dto) {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);

	    HttpEntity<UserRequestDTO> request = new HttpEntity<>(dto, headers);
	    String url = "http://localhost:7172/addUserSignUp";

	   String isAdded = restTemplate.postForObject(url, request, String.class);
	    return "login";
	}

	
}
