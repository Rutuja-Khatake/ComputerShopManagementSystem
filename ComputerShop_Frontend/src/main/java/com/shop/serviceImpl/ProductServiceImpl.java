package com.shop.serviceImpl;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shop.Entity.ProductManager;
import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public String addProduct(ProductReqDto reqDto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<ProductReqDto> req = new HttpEntity<ProductReqDto>(reqDto ,headers);
		String url = "http://localhost:7172/product/addAllProduct";
		
		String isadded = restTemplate.postForObject(url, req, String.class);
		
		return null;
	}



	@Override
	public List<ProductRespDto> showAllProduct() {
	    String url = "http://localhost:7172/product/showAllList";  // Must match backend

	    RestTemplate restTemplate = new RestTemplate();

	    ProductRespDto[] productArray = restTemplate.getForObject(url, ProductRespDto[].class);

	    return Arrays.asList(productArray); 
	}


	

}
