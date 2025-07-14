package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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
		List<ProductRespDto> list = productservice.showAllProduct();
		model.addAttribute("productList", list);
		return "selectProduct";
	}

	@GetMapping("/fetchForm")
	public String fetchData(@RequestParam int id, Model model) {
		ProductRespDto returndto = productservice.fetchData(id);
		model.addAttribute("data", returndto);
		return "updateProduct";

	}

	@PostMapping("/updateData")
	public String updateForm(ProductReqDto reqDto) {
		boolean isData = productservice.updateProduct(reqDto);
		if (isData) {

			return "redirect:/showAllList";
		}
		return null;
	}
	
//	@GetMapping("/deleteForm")
//	public String deleteData(@RequestParam int id) {
//		ProductRespDto isDataDelete = productservice.deleteProduct(id);
//		if (isDataDelete != null) {
//
//			return "redirect:/showAllList";
//		}
//		return null;
//		
//	}
//	
	
//	@GetMapping("/deleteForm")
//	public String deleteData(@RequestParam int id, Model model) {
//	    try {
//	        ProductRespDto isDataDelete = productservice.deleteProduct(id);
//
//	        if (isDataDelete != null) {
//	            return "redirect:/showAllList";
//	        } 
//	    } catch (Exception e) {
//	        model.addAttribute("error", "An error occurred: " + e.getMessage());
//	       
//	    }
//		return null;
//	}
//
	@GetMapping("/deleteForm")
	public String deleteData(@RequestParam int id, RedirectAttributes redirectAttributes) {
	    try {
	        ProductRespDto isDataDelete = productservice.deleteProduct(id);

	        if (isDataDelete != null) {
	            return "redirect:/showAllList";
	        } else {
	            redirectAttributes.addFlashAttribute("error", "Product not found or could not be deleted.");
	            return "redirect:/showAllList";
	        }
	    } catch (Exception e) {
	        redirectAttributes.addFlashAttribute("error", "An error occurred: " + e.getMessage());
	        return "redirect:/showAllList";
	    }
	}

}
