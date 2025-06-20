package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.Entity.ProductManager;
import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;

@Service
public interface ProductService {

	String addProduct(ProductReqDto reqDto);


	List<ProductRespDto> showAllProduct();

}
