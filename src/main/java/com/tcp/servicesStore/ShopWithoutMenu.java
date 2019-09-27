package com.tcp.servicesStore;

import java.util.Map;

public class ShopWithoutMenu {
	private String shopName;
	private String shopAddress;
	private String storeManagerName;
	private double shopID;
	private Map<Double, ShopWithoutMenu> allShopDetails;
	
	public String getShopName() {
		return shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public String getStoreManagerName() {
		return storeManagerName;
	}
	public double getShopID() {
		return shopID;
	}
	public Map<Double, ShopWithoutMenu> getAllShopDetails() {
		return allShopDetails;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public void setStoreManagerName(String storeManagerName) {
		this.storeManagerName = storeManagerName;
	}
	public void setShopID(double shopID) {
		this.shopID = shopID;
	}
	@Override
	public String toString() {
		return "ShopWithoutMenu [shopName=" + shopName + ", shopAddress=" + shopAddress + ", storeManagerName="
				+ storeManagerName + ", shopID=" + shopID + "]";
	}
	
	
}
