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

import com.eca.hibernate.Account;

@SuppressWarnings("deprecation")
public class AccountDAOHibernate implements AccountDAO {

	static Logger logger = Logger.getLogger(AccountDAOHibernate.class);

	private static SessionFactory sessionFactory = null;

	public AccountDAOHibernate() {
		logger.debug("AccountDAOHibernate");
		Configuration cfg = null;
		try {
			cfg = new Configuration().configure();
		} catch (MappingException e) {
			e.printStackTrace();
		}

		try {
			sessionFactory = cfg.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.openSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return session;
	}

	public Account getRecord(Long id) {
		Session session = this.getSession();
		Account record = null;
		try {
			record = (Account) session.get(Account.class, id);
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

	public List<Account> getRecords() {
		final Session session = this.getSession();
		List list = null;
		try {
			logger.debug("Get Account list");
			final Query query = extracted(session);
			list = query.list();
			if (list != null)
				logger.debug("list2=" + list.size());
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

	private Query<Account> extracted(final Session session) {
		Query<Account> query = session.createQuery("from com.eca.hibernate.Account");
		return query;
	}

	public void saveRecord(Account record) {
		Session session = this.getSession();
		try {
			logger.debug("***** AccountDAOHibernate: saveRecord()1");
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(record);
			// session.save(record);
			tx.commit();
			session.flush();
			logger.debug("***** AccountDAOHibernate: saveRecord()2");
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
			Account record = (Account) session.load(Account.class, id);
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
