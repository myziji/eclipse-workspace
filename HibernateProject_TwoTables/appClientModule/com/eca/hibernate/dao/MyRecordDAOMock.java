package com.eca.hibernate.dao;

import com.eca.hibernate.MyRecord;

import java.util.List;

/**
 * To change this template use File | Settings | File Templates.
 */
public class MyRecordDAOMock implements MyRecordDAO {
    private MyRecord rec = new MyRecord();

    public MyRecordDAOMock() {
        rec.setId(new Long(223));
        rec.setFirstName("Joe");
        rec.setLastName("Smith");
    }

    public MyRecord getRecord(Long id) {
        return rec;
    }

    public List getRecords() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void saveRecord(MyRecord record) {
        rec.setFirstName(record.getFirstName());
    }

    public void removeRecord(Long id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
