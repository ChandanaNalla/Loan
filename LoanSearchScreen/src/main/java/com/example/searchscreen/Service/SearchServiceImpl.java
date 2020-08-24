package com.example.searchscreen.Service;

import com.example.searchscreen.Entity.LoanInformation;
import com.example.searchscreen.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchRepository searchrepository;
	
	

	@Override
	public LoanInformation findById(int loanId) {
		return searchrepository.findById(loanId);
	}

	@Override
	public LoanInformation findByAmount(double amount) {
		return searchrepository.findByAmount(amount);
	}

	
	 @Override
	 public LoanInformation findByBorrowerName(String borrowerName) {
	    return searchrepository.findByBorrowerName(borrowerName); 
	    }
	 

}
