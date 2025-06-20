package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.dto.ProductReqDto;
import com.nt.dto.ProductRespDto;
import com.nt.entity.Product;
@Service
public interface ProductService {

	String addproduct(ProductReqDto reqDto);

	List<ProductRespDto> showAllProduct();

	
}
