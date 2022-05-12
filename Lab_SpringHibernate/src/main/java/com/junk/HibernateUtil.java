package com.junk;

import org.hibernate.SessionFactory;

public class HibernateUtil {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;

    }
}