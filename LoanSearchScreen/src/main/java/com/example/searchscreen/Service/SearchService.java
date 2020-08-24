package com.example.searchscreen.Service;

import com.example.searchscreen.Entity.LoanInformation;

public interface SearchService {
	
	// Search by Loan number
	public LoanInformation findById(int loanId);
	
	// Search by Loan Amount
	public LoanInformation findByAmount(double amount);
	
	// Search by Borrower name
	public LoanInformation findByBorrowerName(String borrowerName);

}