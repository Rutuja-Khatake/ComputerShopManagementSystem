package com.shop.Entity;

public class Vendor {

	private int id;
	private String vendorName;
	private String mobileNumber;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Vendor(int id, String vendorName, String mobileNumber, String address) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public Vendor() {

	}
}
