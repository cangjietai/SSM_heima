package com.lisitao.service.impl;

import com.lisitao.dao.IAccountDao;
import com.lisitao.domain.Account;
import com.lisitao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 09:23
 * @Description:
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("Service层：查询全部账户。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存账户。。。。");
        accountDao.saveAccount(account);
    }
}
