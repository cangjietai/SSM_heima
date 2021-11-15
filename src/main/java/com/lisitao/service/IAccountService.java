package com.lisitao.service;

import com.lisitao.domain.Account;

import java.util.List;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 09:22
 * @Description:
 */
public interface IAccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
