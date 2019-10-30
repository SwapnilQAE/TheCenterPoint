package com.tcp.tcpController;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TCPController {
	
	@RequestMapping(value = "/getOTP", method = RequestMethod.GET)
	public void getOTPforUser(@RequestParam(name = "mobileNumber", required = true) long mobileNumber) {
		int otp=0;
		// TODO: Check if the OTP is available in Cache Memory if yes then use the same 
		
		// TODO: Check if the OTP is available in Cache Memory if No then Check the OTP in User DB and if available then use the same
		
		// TODO: Check if the OTP is available in Cache Memory if No then Check the OTP in User DB and if not available then generate the OTP
		SecureRandom random = new SecureRandom(); 
        otp = random.nextInt(10000)*random.nextInt(10000)/random.nextInt(10000);
        
        //TODO:Saving the OTP in Cache and Pushing an Kafaka event So the In-box service can Message the OTP to user
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public Map<String, String> getAllNearByShops(@RequestParam String lat, @RequestParam String lng){
		Map<String, String> shopMap=new HashMap<String, String>();
		shopMap.put("Shop1", "My First Shop");
		shopMap.put("Shop2", "My Second Shop");
		shopMap.put("Lat", lat);
		shopMap.put("lng", lng);
		return shopMap;	
	}     
	
	@RequestMapping(value = "/signIN", method = RequestMethod.POST)
	public String getShopDetails(@RequestParam long shopID) {
		return "The shpo name is Shop zxcv and ShopID is "+ shopID;
	}
}
