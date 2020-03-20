package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.loginservice.DashBoardProxy;

@RestController
public class LoginPageController {
	
	@Autowired
	DashBoardProxy proxy;

	
	@GetMapping(value={"/", "/index"})
    public String getHomePage(){

        return "index";
    }
	
	@GetMapping("/login")
	public String getLoginLanding() {
		return "Hello from Login Landing Page";
	}
	
	@GetMapping("/forgetPassword")
	public String forgetPassword() {
		return "Hello from Forget Password Page";
	}
	
	@GetMapping("/resetpassword")
	public String resetPassword() {
		return "Hello from Reset Password";
	}
	
	@GetMapping("/changepassword")
	public String changePassword() {
		return "Hello from Change Password";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "LOGGING OUT";
	}
	
	
	
	@GetMapping("/fromother")
	public String getMyAccount() {
		return "d:"+proxy.getDashboard();
	}
}
