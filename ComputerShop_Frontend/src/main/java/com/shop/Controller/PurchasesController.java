package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.ProductRespDto;
import com.shop.dto.PurchaseReqDto;
import com.shop.dto.PurchaseRespDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.PurchaseService;

@Controller
public class PurchasesController {
	@Autowired
	PurchaseService purchaseService;


	@RequestMapping("/updatePurchase")
	public String updatePurchase(PurchaseReqDto purchaseReqDto, Model model) {
	    List<PurchaseRespDto> purchase = purchaseService.updatePurchasePage(purchaseReqDto);
	    System.out.println(purchaseReqDto.getProductId());
	    model.addAttribute("purchase", purchase);
	    return "selectPurchase";
	}

	

	 @RequestMapping("/updateAllPurchase")
	    public String showAll(Model model) {
	        List<VendorRespDto> vendorList = purchaseService.getAllVendors();
	        List<ProductRespDto> productList = purchaseService.getAllProducts();

	        
	        model.addAttribute("vendorList", vendorList);
	        model.addAttribute("productList", productList);

	        return "updatePurchase";  
	    }
}
