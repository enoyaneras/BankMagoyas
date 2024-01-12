package com.magoya.bank.command;



import org.springframework.stereotype.Component;

import com.magoya.bank.dominio.AccountAggregate;
import com.magoya.bank.dominio.AccountEvent;
import com.magoya.bank.repository.AccountAggregateRepository;

/**
 * Commands represent actions that can be performed on the system. In our case, 
 * we’ll have a CreateAccountCommand to create a new account and a OperationMoneyCommand 
 * to deposit money and withraw into an existing account
 * @author Blejer Alberto Raul
 * 
 */

@Component
public class AccountCommandHandler {

	private final AccountAggregateRepository accountAggregateRepository;

    public AccountCommandHandler(AccountAggregateRepository accountAggregateRepository) {
        this.accountAggregateRepository = accountAggregateRepository;
    }

    public void handles(CreateAccountCommand command) {
        AccountAggregate accountAggregate = new AccountAggregate(command.getAccountId());
        accountAggregate.setAcccountName(command.getAccountHolder());
        accountAggregateRepository.save(accountAggregate);
    }

   
    
     public void handle(OperationMoneyCommand command,String Operation) {
        AccountAggregate accountAggregate = accountAggregateRepository.findById(command.getAccountId()).orElseThrow(
                () -> new RuntimeException("Account not found")
        );

    	
    	
        accountAggregate.setAcccountName(accountAggregate.getAcccountName());
        
        accountAggregate.getEvents().add(new AccountEvent(Operation, command.getAmount()));
        
        if (Operation.equals("Deposit")) {
        	
        accountAggregate.setBalance(accountAggregate.getBalance() + command.getAmount());
        }else {
        accountAggregate.setBalance(accountAggregate.getBalance() - command.getAmount());	
        	
        }
        
        accountAggregateRepository.save(accountAggregate);
    }
	
	
   
    
    
    
    
	
	
}
