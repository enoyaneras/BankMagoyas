package com.magoya.bank.dominio;


public class AccountEvent {


private String eventType;
private double amount;



public AccountEvent( String eventType, double amount) {
	super();
	
	this.eventType = eventType;
	this.amount = amount;
}


public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}	
	




}
