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

import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.dto.VendorReqDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.VendorService;
@Service
public class VendorServiceImpl implements VendorService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public String addVendors(VendorReqDto dto) {
	    try {
	        HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);

	        HttpEntity<VendorReqDto> req = new HttpEntity<>(dto, headers);
	        String url = "http://localhost:7172/vendorApi/addVendors";

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
	public List getAllVendors() {
	String url = "http://localhost:7172/vendorApi/getAllvendors"; // Must match backend

		VendorRespDto[] productArray = restTemplate.getForObject(url, VendorRespDto[].class);

		return Arrays.asList(productArray);
	}


	@Override
	public VendorRespDto fetchVendorData(int id) {
		String url = "http://localhost:7172/vendorApi/fetchData/" + id;

		return restTemplate.getForObject(url, VendorRespDto.class);
	}


	@Override
	public boolean updateVendor(VendorRespDto reqDto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<VendorRespDto> req = new HttpEntity<>(reqDto, headers);
		String url = "http://localhost:7172/vendorApi/updateVendor";

		try {
			restTemplate.postForObject(url, req, VendorRespDto.class);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


}
