package org.mql.ws.restws.models;

public class Cart {
	private String cardNumber;
	private String expirationDate;
	private String cvc;

	public Cart() {
	}

	public Cart(String cardNumber, String expirationDate, String cvc) {
		super();
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvc = cvc;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	@Override
	public String toString() {
		return "Cart [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + ", cvc=" + cvc + "]";
	}

}
