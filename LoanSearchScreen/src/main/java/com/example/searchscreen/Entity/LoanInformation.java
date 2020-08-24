package com.example.searchscreen.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
@Entity
@Table(name="loan_info")
public class LoanInformation {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="loan_id")
	private int loanId;
	@Column(name="loan_type")
	private String loanType;
	@Column(name="loan_term")
	private String loanTerm;
	@Column(name="loan_amount")
	private double loanAmount;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="borrower_id")
	private BorrowerInformation borrower;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BorrowerInformation getBorrower() {
		return borrower;
	}

	public void setBorrower(BorrowerInformation borrower) {
		this.borrower = borrower;
	}
	public LoanInformation() {
		
	}
		
	// constructor using fields
	public LoanInformation(int loanId, String loanType, String loanTerm, double loanAmount) {
			this.loanId = loanId;
			this.loanType = loanType;
			this.loanTerm = loanTerm;
			this.loanAmount = loanAmount;
	}
	
	
}
