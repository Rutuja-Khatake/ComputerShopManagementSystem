package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.VendorReqDto;
import com.shop.dto.VendorRespDto;
import com.shop.service.VendorService;

@Controller
public class VendorController {
	@Autowired
	VendorService vendorService;
	@RequestMapping("/vendorDetails")
	public String vendorDetails() {
		
		return "addVendor";
	}
	
	@RequestMapping("/addVendor")
	public String addVendor(VendorReqDto dto) {
		return vendorService.addVendors(dto);
	}
	
	@RequestMapping("/getAllVendors")
	public String getAllVendors(Model model) {
		List<VendorRespDto> list = vendorService.getAllVendors();
		model.addAttribute("vendorList", list);
		return "selectVendor";
	}
	
	@GetMapping("/fetchVendorForm")
	public String fetchVendor(@RequestParam int id, Model model) {
	VendorRespDto dto=	vendorService.fetchVendorData(id);
	model.addAttribute("data",dto);
		return "updateVendor";
	}
	

	@PostMapping("/updateVendor")
	public String updateForm(VendorRespDto reqDto) {
		boolean isData = vendorService.updateVendor(reqDto);
		if (isData) {

			return "redirect:/getAllVendors";
		}
		return null;
	}
}
