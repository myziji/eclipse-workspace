package com.eca.hibernate.dao;

import com.eca.hibernate.MyRecord;

import java.util.List;

public interface MyRecordDAO {
    public MyRecord getRecord(Long id);

    public List getRecords();

    public void saveRecord(MyRecord record);

    public void removeRecord(Long id);
}
