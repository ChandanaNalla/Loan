package com.example.user.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
public String home() {
	return "Welcome";
}
	@GetMapping("/user")
	public String userlogin() {
		return "user login successful";
	}
	@GetMapping("/admin")
	public String adminlogin() {
		return "admin login successful";
	}
}
