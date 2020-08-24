package com.example.searchscreen.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="borrower_info")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" , "loans"})
public class BorrowerInformation {
	@Id
	@Column(name="borrower_id")
private int id;
	@Column(name="borrower_name")
private String borrowerName;
@OneToMany(mappedBy="borrower",cascade=CascadeType.ALL)
private List<LoanInformation> loans;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBorrowerName() {
	return borrowerName;
}
public void setBorrowerName(String borrowerName) {
	this.borrowerName = borrowerName;
}
public List<LoanInformation> getLoans() {
	return loans;
}
public void setLoans(List<LoanInformation> loans) {
	this.loans = loans;
}
public BorrowerInformation() {
	
}
public BorrowerInformation(String borrowerName, List<LoanInformation> loans) {
	
	this.borrowerName = borrowerName;
	this.loans = loans;
}

public void addLoan(LoanInformation loan) {
	if(loans==null) {
		loans=new ArrayList<>();
	}
	loans.add(loan);
	((LoanInformation) loans).setBorrower(this);
}
}
