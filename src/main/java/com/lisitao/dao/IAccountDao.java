package com.lisitao.dao;

import com.lisitao.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Solitude
 * @Data: 2021/11/15 09:22
 * @Description:
 */
@Repository
public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Select("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);

}
