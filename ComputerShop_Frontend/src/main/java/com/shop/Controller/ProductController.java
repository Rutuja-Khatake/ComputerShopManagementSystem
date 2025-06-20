package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.Entity.ProductManager;
import com.shop.dto.ProductReqDto;
import com.shop.dto.ProductRespDto;
import com.shop.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@GetMapping("/add")
	public String addProductPage() {
		
		return "addProduct";

	}
	
	@PostMapping("/addProduct")
	 public String showAddProduct(ProductReqDto reqDto) {
		return productservice.addProduct(reqDto);
		
	 }

	@GetMapping("/showAllList")
	public String showAllProduct(Model model) {
		  List<ProductRespDto> list=	productservice.showAllProduct();
		  System.out.println(list);

	model.addAttribute("productList",list);
		return "selectProduct";
	}
}
