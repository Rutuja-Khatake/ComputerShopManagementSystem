package com.nt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.ProductRepo;
import com.nt.Repository.UserRepo;
import com.nt.dto.ProductReqDto;
import com.nt.dto.ProductRespDto;
import com.nt.entity.Product;
import com.nt.entity.User;
import com.nt.mapper.ProductMapper;
import com.nt.mapper.UserMapper;
import com.nt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public String addproduct(ProductReqDto reqDto) {
		Product product = productMapper.toEntity(reqDto);
		
		
		Product productAdded = productRepo.save(product);

		return null;
	}

	@Override
	public List<ProductRespDto> showAllProduct() {
		
		List<Product> list = productRepo.findAll();
		
		return productMapper.toDto(list);
		
		
	}

	



}
