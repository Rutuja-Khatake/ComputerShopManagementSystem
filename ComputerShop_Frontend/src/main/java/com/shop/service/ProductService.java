package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;

@Service
public interface ProductService {

	String addProduct(ProductReqDto reqDto);


	List<ProductRespDto> showAllProduct();


	ProductRespDto fetchData(int id);


	boolean updateProduct(ProductReqDto reqDto);


	ProductRespDto deleteProduct(int id);

}
