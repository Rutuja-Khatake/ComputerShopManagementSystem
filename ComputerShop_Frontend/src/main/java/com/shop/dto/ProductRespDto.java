package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRespDto {

	private int productId;
	private String productName;
	private String category;
	private String brand;
	private Float purchase_rate;
	private Float selling_rate;
    private int stock;
}
