package com.dicka.springcloudoauth2resourceserver;

public class Account {

	private int accNo;
	private String accType;
	private String accHolderName;
	private String accBankName;
	
	public Account(){
		
	}
	
	public Account(int accNo, String accType, String accHolderName, String accBankName){
		this.accNo = accNo;
		this.accType = accType;
		this.accHolderName = accHolderName;
		this.accBankName = accBankName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccBankName() {
		return accBankName;
	}

	public void setAccBankName(String accBankName) {
		this.accBankName = accBankName;
	}
	
	
}
