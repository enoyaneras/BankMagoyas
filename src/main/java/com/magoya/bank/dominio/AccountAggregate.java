package com.magoya.bank.dominio;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;





@Document(collection = "account_aggregate")
public class AccountAggregate {

	  @Id
	   private String accountId;
	   private String AcccountName;
	   private double balance;
	   
	   private List<AccountEvent> events;
	   
	   
	    public String getAcccountName() {
			return AcccountName;
		}

		public void setAcccountName(String acccountName) {
			AcccountName = acccountName;
		}

		
		

		@PersistenceConstructor
	    public AccountAggregate(String accountId) {
	        this.accountId = accountId;
	        this.AcccountName=this.getAcccountName();
	        
	        this.balance = 0.0;
	        this.events = new ArrayList<>();
	    }

		public String getAccountId() {
			return accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public List<AccountEvent> getEvents() {
			return events;
		}

		public void setEvents(List<AccountEvent> events) {
			this.events = events;
		}

		
	
	
	
	
	
}
