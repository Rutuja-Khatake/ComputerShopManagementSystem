package com.shop.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.shop.dto.ProductRespDto;
import com.shop.dto.PurchaseReqDto;
import com.shop.dto.PurchaseRespDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    RestTemplate restTemplate;

//	    @Override
//	    public List<PurchaseRespDto> updatePurchasePage(PurchaseReqDto purchaseReqDto) {
//	    	System.out.println(purchaseReqDto);
//	        HttpHeaders headers = new HttpHeaders();
//	        headers.setContentType(MediaType.APPLICATION_JSON);
//	
//	        HttpEntity<PurchaseReqDto> request = new HttpEntity<>(purchaseReqDto, headers);
//	
//	        String url = "http://localhost:7172/api/updatePurchase";
//	
//	        PurchaseRespDto purchaseArray = restTemplate.postForObject(url, request, PurchaseRespDto.class);
//	        return Arrays.asList(purchaseArray);
//	    }
    
    @Override
    public List<PurchaseRespDto> updatePurchasePage(PurchaseReqDto purchaseReqDto) {
//        System.out.println("Sending request: " + purchaseReqDto);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PurchaseReqDto> request = new HttpEntity<>(purchaseReqDto, headers);
        String url = "http://localhost:7172/api/addPurchase";

        try {
        	  System.out.println("Sending request: " + purchaseReqDto);
            PurchaseRespDto purchaseResp = restTemplate.postForObject(url, request, PurchaseRespDto.class);
//            System.out.println("Sending request: " + purchaseReqDto);
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

        ResponseEntity<List<VendorRespDto>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<VendorRespDto>>() {}
        );
        return response.getBody();
    }

    @Override
    public List<ProductRespDto> getAllProducts() {
        String url = "http://localhost:7172/product/showAllList";

        ResponseEntity<List<ProductRespDto>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ProductRespDto>>() {}
        );
        return response.getBody();
    }
}