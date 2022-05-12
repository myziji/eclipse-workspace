package com.eca.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.eca.hibernate.MyRecord;

public class MyRecordDAOHibernate implements MyRecordDAO {

	static	Logger logger =Logger.getLogger(MyRecordDAOHibernate.class) ;

	private static SessionFactory sessionFactory = null;

    public MyRecordDAOHibernate() {
    	logger.debug("########## MyRecordDAOHibernate");
        Configuration cfg = null;
        try {
        	cfg = new Configuration().configure();
        } catch (MappingException e) {
            e.printStackTrace();
        }

        try {
            sessionFactory = cfg.buildSessionFactory();
           	logger.debug("########## MyRecordDAOHibernate sessionFactory" + sessionFactory);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    private Session getSession() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return session;
    }

    public MyRecord getRecord(Long id) {
        Session session = this.getSession();
        MyRecord record = null;
        try {
            record = (MyRecord) session.load(MyRecord.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e) {
                    e.printStackTrace();
                }
            }
        }

        return record;
    }

    public List<MyRecord> getRecords() {
        final Session session = this.getSession();
        List list = null;
        try {
        	logger.debug("Get MyRecord list");
            final Query query = extracted(session);
            list = query.list();
            if (list != null)
            	logger.debug("list2="+list.size());
            else
            	logger.debug("list3=null");
            
        } catch (final HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (final HibernateException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

	private Query extracted(final Session session) {
		final Query query = session.createQuery("select myrecord from com.eca.hibernate.MyRecord as myrecord");
		return query;
	}

    public void saveRecord(MyRecord record) {
        Session session = this.getSession();
        try {
           	logger.debug("***** MyRecordDAOHibernate: saveRecord()1");
			Transaction tx = session.beginTransaction();
           	session.saveOrUpdate(record);
            //session.save(record);
           	tx.commit();
            session.flush();
           	logger.debug("***** MyRecordDAOHibernate: saveRecord()2");
       } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void removeRecord(Long id) {
        Session session = this.getSession();
        try {
            MyRecord record = (MyRecord) session.load(MyRecord.class, id);
            session.delete(record);
            session.flush();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
