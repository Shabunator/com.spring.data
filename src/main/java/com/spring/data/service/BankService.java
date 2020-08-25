package com.spring.data.service;

import com.spring.data.entity.Bank;

import java.util.List;

public interface BankService {

    Bank addBank(Bank bank);

    void delete(long id);

    Bank getByName(String name);

    Bank editBank(Bank bank);

    List<Bank> getAll();
}
