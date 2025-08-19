package com.shop.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReqDto {

	private int purchaseId;
	 @Min(value = 1, message = "Vendor ID must not be 0")
    private int vendorId;

    private int productId;

    private int quantity;
    private BigDecimal rate;
    private BigDecimal total;
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate purchaseDate;
}
