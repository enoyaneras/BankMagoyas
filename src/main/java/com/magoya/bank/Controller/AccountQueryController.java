package com.magoya.bank.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magoya.bank.Service.AccountQueryService;
import com.magoya.bank.dominio.AccountAggregate;

@RestController
@RequestMapping("/accounts")
public class AccountQueryController {

    private final AccountQueryService accountQueryService;

    public AccountQueryController(AccountQueryService accountQueryService) {
        this.accountQueryService = accountQueryService;
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<AccountAggregate> getAccount(@PathVariable String accountId) {
        AccountAggregate accountAggregate = accountQueryService.getAccount(accountId);
        if (accountAggregate != null) {
            return ResponseEntity.ok(accountAggregate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}