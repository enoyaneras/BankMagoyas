package com.magoya.bank.Controller;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.magoya.bank.command.AccountCommandHandler;
import com.magoya.bank.command.CreateAccountCommand;
import com.magoya.bank.command.OperationMoneyCommand;






@RestController
@RequestMapping("/accounts")
public class AccountController {

	 private final AccountCommandHandler accountCommandHandler;

	
	 public AccountController(AccountCommandHandler accountCommandHandler) {
	        this.accountCommandHandler = accountCommandHandler;
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public ResponseEntity<String>   createAccount(@RequestBody CreateAccountCommand command) {
	        accountCommandHandler.handles(command);
	    	return ResponseEntity.ok().body("Account id created:" + command.getAccountId());
	    }

	    @PostMapping("/deposit/{amount}")
	    @ResponseStatus(HttpStatus.OK)
	    public ResponseEntity<String> depositMoney(@PathVariable Double amount, @RequestBody OperationMoneyCommand command) {
	    command.setAccountId(command.getAccountId());
	    command.setAmount(amount);
	    accountCommandHandler.handle(command,"Deposit");
	    return ResponseEntity.ok().body("It has been deposited successfully:"+ " " + command.getAmount() + "in the account:" + command.getAccountId());
	    
	    
	    }	
	
	    @PostMapping("/withdraw/{amount}")
	    @ResponseStatus(HttpStatus.OK)
	    public ResponseEntity<String> withdrawmoney(@PathVariable Double amount, @RequestBody OperationMoneyCommand command) {
	    command.setAccountId(command.getAccountId());
	    command.setAmount(amount);
	    accountCommandHandler.handle(command,"withdraw");
	    return ResponseEntity.ok().body("It has been withdraw successfully:"+ " " + command.getAmount() + "in the account:" + command.getAccountId());
	    
	    }	
	
	
	
}
