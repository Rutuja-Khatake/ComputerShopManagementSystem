package com.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.dto.ProductRespDto;
import com.shop.dto.PurchaseReqDto;
import com.shop.dto.PurchaseRespDto;
import com.shop.dto.VendorRespDto;

@Service
public interface PurchaseService {

	List<PurchaseRespDto> updatePurchasePage(PurchaseReqDto purchaseReqDto);

	List<VendorRespDto> getAllVendors();

	List<ProductRespDto> getAllProducts();

}
