package com.example.searchscreen.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.searchscreen.Entity.LoanInformation;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface SearchRepository extends CrudRepository<LoanInformation, Integer> {

	public LoanInformation findById(int id);
	
	@Query("select L from LoanInformation L where L.loanAmount = :amount")
	public LoanInformation findByAmount(double amount);
	
	@Query("select L from LoanInformation L inner join BorrowerInformation B "
			+ " on L.borrower = B.id where B.borrowerName = :borrowerName")
	public LoanInformation findByBorrowerName(String borrowerName); 
}

