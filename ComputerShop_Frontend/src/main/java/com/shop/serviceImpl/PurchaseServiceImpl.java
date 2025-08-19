package com.shop.serviceImpl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.dto.PurchaseReqDto;
import com.shop.dto.PurchaseRespDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	RestTemplate restTemplate;
	
	  @Override
	   public List<PurchaseRespDto> addPurchase(PurchaseReqDto purchaseReqDto) {


	       HttpHeaders headers = new HttpHeaders();
	       headers.setContentType(MediaType.APPLICATION_JSON);
	       HttpEntity<PurchaseReqDto> request = new HttpEntity<>(purchaseReqDto, headers);
	        String url = "http://localhost:7172/parchecs/addPurchase";

	        try {
	        	  System.out.println("Sending request: " + purchaseReqDto);
	           PurchaseRespDto purchaseResp = restTemplate.postForObject(url, request, PurchaseRespDto.class);

	           return Arrays.asList(purchaseResp);
	       } catch (HttpServerErrorException e) {
	            System.err.println("API responded with 500: " + e.getResponseBodyAsString());
	            throw new RuntimeException("Purchase update failed: " + e.getResponseBodyAsString(), e);
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException("Unexpected error while calling updatePurchase", e);
	        }
	    }
	  

		@Override
	public List<VendorRespDto> getAllVendors() {
			String url = "http://localhost:7172/vendorApi/getAllvendors";

			ResponseEntity<List<VendorRespDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<VendorRespDto>>() {
					});
			return response.getBody();
		}

		@Override
		public List<ProductRespDto> getAllProducts() {
			String url = "http://localhost:7172/product/showAllList";

		ResponseEntity<List<ProductRespDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<ProductRespDto>>() {
					});
			return response.getBody();
		}


		@Override
		public List<PurchaseRespDto> showAllPurchaseProduct() {
			
			String url = "http://localhost:7172/parchecs/showAllPurchaseList"; 

			

			PurchaseRespDto[] purchaseArray = restTemplate.getForObject(url, PurchaseRespDto[].class);

			return Arrays.asList(purchaseArray);
		}


		@Override
		public PurchaseRespDto fetchData(int purchaseId) {

			String url = "http://localhost:7172/parchecs/fetchDataApi/"	 + purchaseId;


			return restTemplate.getForObject(url, PurchaseRespDto.class);
		}

		@Override
		public boolean updatePurchase(PurchaseReqDto reqDto) {
			int q=reqDto.getQuantity();
			BigDecimal r= reqDto.getRate();
			BigDecimal total = r.multiply(BigDecimal.valueOf(q));
			reqDto.setTotal(total);
			
			
		    String url = "http://localhost:7172/parchecs/updatePurchase";

		    HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON);

		    HttpEntity<PurchaseReqDto> req = new HttpEntity<>(reqDto, headers);

		    try {
		       // System.out.println("Sending request to: " + url);
		        String response = restTemplate.postForObject(url, req, String.class);
		        System.out.println("Response received: " + response);
		        return true;
		    } catch (Exception e) {
		        e.printStackTrace();
		        throw new RuntimeException("Unexpected error while updating purchase", e);
		    }
		}

	}
		



