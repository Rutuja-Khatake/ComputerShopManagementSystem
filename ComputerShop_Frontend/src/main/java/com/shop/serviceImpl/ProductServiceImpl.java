package com.shop.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private	RestTemplate restTemplate;

	@Override
	public String addProduct(ProductReqDto reqDto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<ProductReqDto> req = new HttpEntity<ProductReqDto>(reqDto, headers);
		String url = "http://localhost:7172/product/addAllProduct";

		String isadded = restTemplate.postForObject(url, req, String.class);

		return null;
	}

	@Override
	public List<ProductRespDto> showAllProduct() {
		String url = "http://localhost:7172/product/showAllList"; // Must match backend

		

		ProductRespDto[] productArray = restTemplate.getForObject(url, ProductRespDto[].class);

		return Arrays.asList(productArray);
	}

	@Override
	public ProductRespDto fetchData(int id) {
		String url = "http://localhost:7172/product/fetchData/" + id;

		return restTemplate.getForObject(url, ProductRespDto.class);

	}

//	@Override
//	public boolean updateProduct(ProductReqDto reqDto) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//
//		HttpEntity<ProductReqDto> req = new HttpEntity<ProductReqDto>(reqDto, headers);
//		String url = "http://localhost:7172/product/updateProduct";
//
//		ProductRespDto isUpdate = restTemplate.postForObject(url, req, ProductRespDto.class);
//
//		return true;
//	}

	@Override
	public boolean updateProduct(ProductReqDto reqDto) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<ProductReqDto> req = new HttpEntity<>(reqDto, headers);
		String url = "http://localhost:7172/product/updateProduct";

		try {
			restTemplate.postForObject(url, req, ProductRespDto.class);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProductRespDto deleteProduct(int id) {
		String url = "http://localhost:7172/product/deleteData/" + id;

		return restTemplate.getForObject(url, ProductRespDto.class);
	}

}
