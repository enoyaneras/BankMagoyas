package com.magoya.bank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.magoya.bank.dominio.AccountEvent;

public interface AccountEventRepository extends  MongoRepository<AccountEvent, String> {

}
