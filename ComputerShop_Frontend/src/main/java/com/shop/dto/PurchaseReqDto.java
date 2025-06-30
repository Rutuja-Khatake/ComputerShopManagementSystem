package com.shop.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReqDto {
	
	    int purchaseId;       
	    String vendorName;
	    int productId;       
	    int quantity;
	    BigDecimal rate;
	    BigDecimal total;
	    LocalDate purchaseDate;
	

}
