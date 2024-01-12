package com.magoya.bank.command;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class OperationMoneyCommand {
private String accountId;
private double amount;

public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}	
	
	
	
}
