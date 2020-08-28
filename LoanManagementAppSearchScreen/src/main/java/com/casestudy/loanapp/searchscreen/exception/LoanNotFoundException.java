package com.casestudy.loanapp.searchscreen.exception;

public class LoanNotFoundException extends RuntimeException {

	public LoanNotFoundException(String meassage, Throwable cause) {
		super(meassage, cause);
	}

	public LoanNotFoundException(String meassage) {
		super(meassage);
	}

	public LoanNotFoundException(Throwable cause) {
		super(cause);
	}

	
	
}
