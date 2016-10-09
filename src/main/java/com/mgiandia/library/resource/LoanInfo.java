package com.mgiandia.library.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoanInfo {
	
	private int itemId;
	private int borrowerNo;

	public LoanInfo() {
	}
	
	public LoanInfo(int itemId, int borrowerNo) {
		
		this.itemId = itemId;
		this.borrowerNo = borrowerNo;
		
	}
	
	public int getBorrowerNo() {
		return borrowerNo;
	}
	
	public void setBorrowerNo(int borrowerNo) {
		this.borrowerNo = borrowerNo;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}