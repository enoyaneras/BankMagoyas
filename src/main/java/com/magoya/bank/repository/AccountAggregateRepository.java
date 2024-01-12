package com.magoya.bank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.magoya.bank.dominio.AccountAggregate;


public interface AccountAggregateRepository   extends  MongoRepository<AccountAggregate, String>  {

}
