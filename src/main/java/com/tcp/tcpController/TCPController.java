package com.tcp.tcpController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcp.servicesStore.ShopWithoutMenu;

@RestController
public class TCPController {
	
	@RequestMapping(value = "/getOTP", method = RequestMethod.GET)
	public String getOTPforUser(@RequestParam(name = "mn", required = true) long mobileNumber) {
		return "Ur mobile no is "+ mobileNumber +" And OTP is " +1234;
	}

	@RequestMapping(value = "/getNearByShops", method = RequestMethod.GET)
	public Map<String, String> getAllNearByShops(@RequestParam String lat, @RequestParam String lng){
		Map<String, String> shopMap=new HashMap<String, String>();
		shopMap.put("Shop1", "My First Shop");
		shopMap.put("Shop2", "My Second Shop");
		shopMap.put("Lat", lat);
		shopMap.put("lng", lng);
		return shopMap;	
	}
	
	@RequestMapping(value = "/getShop", method = RequestMethod.GET)
	public String getShopDetails(@RequestParam long shopID) {
		return "The shpo name is Shop zxcv and ShopID is "+ shopID;
	}
	
	//@RequestMapping(value = "/createShop", method = RequestMethod.POST)
	//public Map<String, String> createShopWithoutMenu(@RequestBody ShopWithoutMenu swom){
		
	//}
}
