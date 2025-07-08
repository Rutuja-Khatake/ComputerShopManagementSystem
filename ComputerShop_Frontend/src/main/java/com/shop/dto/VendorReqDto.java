package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorReqDto {

	private int id;
	private String vendorName;
	private String mobileNumber;
	private String address;
}
