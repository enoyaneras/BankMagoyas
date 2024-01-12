package com.magoya.bank.Service;
import org.springframework.stereotype.Service;

import com.magoya.bank.dominio.AccountAggregate;
import com.magoya.bank.repository.AccountAggregateRepository;


@Service
public class AccountQueryService {

	  private final AccountAggregateRepository accountAggregateRepository;

	    public AccountQueryService(AccountAggregateRepository accountAggregateRepository) {
	        this.accountAggregateRepository = accountAggregateRepository;
	    }

	    public AccountAggregate getAccount(String accountId) {
	        return accountAggregateRepository.findById(accountId).orElse(null);
	    }	
	
	
	
}
