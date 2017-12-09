package com.it15000118.ds.rest.MovieSystem.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "SampathCreditCardInfo")
public class SampathCreditModel {
	@Id
	private String Id;
	private String cardNumber;
	private String customerName;
	private String cSV;
	private String amount;

	public SampathCreditModel() {

	}

	public SampathCreditModel(String cardNumber, String customerName, String cSV, String amount) {
		super();
		this.cardNumber = cardNumber;
		this.customerName = customerName;
		this.cSV = cSV;
		this.amount = amount;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcSV() {
		return cSV;
	}

	public void setcSV(String cSV) {
		this.cSV = cSV;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
