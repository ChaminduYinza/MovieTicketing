package com.it15000118.ds.rest.MovieSystem.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "DialogEzCash")
public class DialogEzCashModel {

	@Id
	private String Id;
	private String mobileNumber;
	private String pinNumber;
	private String amount;

	public DialogEzCashModel() {

	}

	public DialogEzCashModel(String mobileNumber, String pinNumber, String amount) {
		super();
		this.mobileNumber = mobileNumber;
		this.pinNumber = pinNumber;
		this.amount = amount;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}
