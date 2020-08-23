package com.example.searchscreen.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

	@GetMapping("/search")
	public String search() {
		return "Welcome to search screen";
	}
}
