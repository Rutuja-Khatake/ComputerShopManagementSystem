package com.shop.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Purchases {

	private int purchaseId; // Primary Key
    private String vendorName;
	private int productId; // Foreign Key to Product
	private int quantity;
	private BigDecimal rate;
	private BigDecimal total;
	private LocalDate purchaseDate;
	
	public Purchases(int purchaseId, String vendorName, int productId, int quantity, BigDecimal rate, BigDecimal total,
			LocalDate purchaseDate) {
		super();
		this.purchaseId = purchaseId;
		this.vendorName = vendorName;
		this.productId = productId;
		this.quantity = quantity;
		this.rate = rate;
		this.total = total;
		this.purchaseDate = purchaseDate;
	}
	
	public Purchases() {
		
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	


}
