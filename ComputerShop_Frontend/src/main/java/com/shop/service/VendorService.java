package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.ProductReqDto;
import com.shop.dto.VendorReqDto;
import com.shop.dto.VendorRespDto;

@Service
public interface VendorService {

	String addVendors(VendorReqDto dto);

	List getAllVendors();

	VendorRespDto fetchVendorData(int id);
	
    boolean updateVendor(VendorRespDto reqDto);

	
}
