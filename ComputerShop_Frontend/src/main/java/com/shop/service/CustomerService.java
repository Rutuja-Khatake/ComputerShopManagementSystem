package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.CustomerReqDto;
import com.shop.dto.CustomerRespDto;
@Service
public interface CustomerService {

	String addCustomer(CustomerReqDto reqDto);

	List<CustomerRespDto> getAllCustomers();

	CustomerRespDto fetchCustomer(int id);

	boolean updateCustomer(CustomerReqDto reqDto);

}
