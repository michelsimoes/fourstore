package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
	CREDIT("Cart�o de cr�dito", 1),
	DEBIT("Cart�o de d�bito", 2),
	PIX("Pagamento via pix", 3),
	PAYPAL("Pagamento via paypal", 4),
	MONEY("Pagamento em dinheiro", 5);

	String description;
	int code;
	
	PaymentMethod(String description, int code) {
		this.description = description;
		this.code = code;
		
	}
	public String getDescription() {
		return description;
	}
	public int getCode() {
		return code;
	}
}
