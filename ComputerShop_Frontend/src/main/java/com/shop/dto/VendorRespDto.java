package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorRespDto {

	private int vendorId;
	private String vendorName;
	private String mobileNumber;
	private String address;
}
