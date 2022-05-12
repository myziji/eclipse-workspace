package com.eca.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import com.eca.hibernate.Account;

public interface AccountDAO {
    public Account getRecord(Long id);

    public List getRecords();

    public void saveRecord(Account record);

    public void removeRecord(Long id);
    
    public Session getSession();
}
