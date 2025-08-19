package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.ProductRespDto;
import com.shop.dto.PurchaseReqDto;
import com.shop.dto.PurchaseRespDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.PurchaseService;

@Controller
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;


	@GetMapping("/addPurchaseProduct")
	public String addPurchasePage(Model model) {
		
	    List<VendorRespDto> vendorList = purchaseService.getAllVendors();
	    List<ProductRespDto> productList = purchaseService.getAllProducts();

	    model.addAttribute("vendorList", vendorList);
	    model.addAttribute("productList", productList);

	    return "addPurchase";
	}

	 
	@PostMapping("/addPurchases")
	public String addPurchaseProduct(@ModelAttribute PurchaseReqDto dto, Model model) {
		
	    purchaseService.addPurchase(dto);
	    System.out.println("Purchase DTO: " + dto);
	    List<VendorRespDto> vendorList = purchaseService.getAllVendors();
	    List<ProductRespDto> productList = purchaseService.getAllProducts();

	    model.addAttribute("vendorList", vendorList);
	    model.addAttribute("productList", productList);

	    
	    return "addPurchase";
	}
	
	@GetMapping("/showPurchaseProduct")
	public String ShowPurchase(Model model) {
		List<PurchaseRespDto> list = purchaseService.showAllPurchaseProduct();
		model.addAttribute("PurchaseList", list);
		return "selectPurchase";
	}
	
	@GetMapping("/updatePurchaseData")
	public String fetchData(@RequestParam("purchaseId") int purchaseId, Model model) {
		PurchaseRespDto returndto = purchaseService.fetchData(purchaseId);
		System.out.println("Purchase iD:"+purchaseId);
		model.addAttribute("PurchaseList", returndto);
		
		   model.addAttribute("vendorList", purchaseService.getAllVendors());
		    model.addAttribute("productList", purchaseService.getAllProducts());
		return "updatePurchase";
	}
	
	@PostMapping("/updatePurchaseProductData")
	public String updateForm(@ModelAttribute PurchaseReqDto reqDto) {
		System.out.println("hello");
		 System.out.println("DTO received in update: " + reqDto);
	    boolean isData = purchaseService.updatePurchase(reqDto);

	    if (isData) {
	        return "redirect:/showPurchaseProduct";
	    } 
	    return null;
	}


	 
}
