package com.shop.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.shop.dto.CustomerReqDto;
import com.shop.dto.CustomerRespDto;
import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	RestTemplate restTemplate;

	@Override
	public String addCustomer(CustomerReqDto reqDto) {
		
		 try {
		        HttpHeaders headers = new HttpHeaders();
		        headers.setContentType(MediaType.APPLICATION_JSON);

		        HttpEntity<CustomerReqDto> req = new HttpEntity<>(reqDto, headers);
		        String url = "http://localhost:7172/addCustomer";

		        String response = restTemplate.postForObject(url, req, String.class);
		        return response;

		    } catch (HttpServerErrorException e) {
		        System.err.println("500 Internal Server Error: " + e.getResponseBodyAsString());
		        return "Error: Internal server error at vendor API";
		    } catch (Exception e) {
		        System.err.println("Exception: " + e.getMessage());
		        return "Error: Could not connect to vendor API";
		    }
	}

	@Override
	public List<CustomerRespDto> getAllCustomers() {
		String url = "http://localhost:7172/getAllList"; // Must match backend

		CustomerRespDto[] productArray = restTemplate.getForObject(url, CustomerRespDto[].class);

		return Arrays.asList(productArray);
	}

	@Override
	public CustomerRespDto fetchCustomer(int id) {
		String url = "http://localhost:7172/fetchCustomerData/" + id;

		return restTemplate.getForObject(url, CustomerRespDto.class);
	}

	@Override
	public boolean updateCustomer(CustomerReqDto reqDto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<CustomerReqDto> req = new HttpEntity<>(reqDto, headers);
		String url = "http://localhost:7172/updateCustomer";

		try {
			restTemplate.postForObject(url, req, CustomerRespDto.class);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
