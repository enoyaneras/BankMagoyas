package com.magoya.bank.command;


import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CreateAccountCommand {
private String accountId;
private String accountHolder;
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
	
	




}
