package com.example.searchscreen.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.searchscreen.Entity.LoanInformation;
import com.example.searchscreen.Service.SearchServiceImpl;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	// default constructor
	public SearchController() {
	}
	
	@Autowired
	private SearchServiceImpl searchService;


	// Search Loan by loan number
	@GetMapping("/loan/{id}")
	public LoanInformation findById(@PathVariable("id") int loanId) {
		
		return searchService.findById(loanId);
		
	}
	
	// Search Loan by loan amount
	@GetMapping("/loanByAmount/{amount}")
	public LoanInformation findByAmount(@PathVariable("amount") double amount) {
		
		return searchService.findByAmount(amount);
		
	}
	
	// Search Loan by borrower name
	@GetMapping("/loanByBorrowerName/{borrowerName}")
	public LoanInformation findByBorrowerName(@PathVariable("borrowerName") String borrowerName) {
			
		return searchService.findByBorrowerName(borrowerName);
			
	}

}
