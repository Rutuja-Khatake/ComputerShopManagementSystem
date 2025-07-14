package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.CustomerReqDto;
import com.shop.dto.CustomerRespDto;
import com.shop.dto.ProductReqDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerservice;

	@RequestMapping("/addCustomers")
	public String addCustomerPage() {
		return "addCustomer";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(CustomerReqDto reqDto) {
		customerservice.addCustomer(reqDto);
		return null;
	}
	
	@RequestMapping("/showAllListCustomer")
	public String showAllList(Model model) {
		List<CustomerRespDto> list = customerservice.getAllCustomers();
		model.addAttribute("list", list);
		return "selectCustomer";
	}
	
	@RequestMapping("/fetchCustomerForm")
	public String fetchCustomer(@RequestParam int id,Model model) {
	CustomerRespDto dto=	customerservice.fetchCustomer(id);
	model.addAttribute("data", dto);
	return "updateCustomer";
	}
	@PostMapping("/updateCustomerData")
	public String updateForm(CustomerReqDto reqDto) {
		boolean isData = customerservice.updateCustomer(reqDto);
		if (isData) {

			return "redirect:/showAllListCustomer";
		}
		return null;
	}
	

}
