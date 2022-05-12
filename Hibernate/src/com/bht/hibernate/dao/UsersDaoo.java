package com.bht.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bht.hibernate.bean.User;
import com.bht.hibernate.util.HibernateUtil;


public class UsersDaoo implements UsersDao{
	
	

	@Override
	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = (Transaction) session.beginTransaction();
			
			// operation 1
			Object object = session.save(user);
			
			// operation 2
			session.get(User.class, (Serializable) object);
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void insertUser() {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			String hql = "INSERT INTO Student (firstName, lastName, email) "
					+ "SELECT firstName, lastName, email FROM Student";
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			String hql = "UPDATE Student set UserName = :username ";
			Query query = session.createQuery(hql);
			
			query.setParameter("userId", 1);
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a student object
			User user = session.get(User.class, id);
			if (user != null) {
				String hql = "DELETE FROM Student " + "WHERE id = :studentId";
				Query query = session.createQuery(hql);
				query.setParameter("studentId", id);
				int result = query.executeUpdate();
				System.out.println("Rows affected: " + result);
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public User getUserById(int id) {

		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// get an student object
			String hql = " FROM Student S WHERE S.id = :studentId";
			Query query = session.createQuery(hql);
			query.setParameter("studentId", id);
			List results = query.getResultList();
			
			if (results != null && !results.isEmpty()) {
				user = (User) results.get(0);
			}
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<User> getAllStudents() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from users", User.class).list();
		}
	}

}
