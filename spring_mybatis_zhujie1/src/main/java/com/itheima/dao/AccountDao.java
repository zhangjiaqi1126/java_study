package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {

    public void save(Account account);

    public void update(Account account);

    public void delete(Integer id);

    public Account findById(Integer id);

    public List<Account> findAll();

}
