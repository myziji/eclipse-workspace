/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.junk;

import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;

public interface UserDAO {

	public SessionFactory getSess();

	public Iterator listUserDetailIter();

	public List<Customer> listUser1(int firstResult, int maxResults);

	public void saveUser(int userId, String firstName, String lastName);

	public void updUserD(String st, String st1, String st2, String st3);

	// @Transactional
	public void updUserDet(String st, String st1);

	public void updUserDet1(String st, String st1);

	// public List<Customer> listUser(String st) ;
	public List<Object[]> listUser(String st);

	public List<Client> listClient();

	public List<Object[]> listUserDetail();

	// @Transactional(readOnly = true,propagation = Propagation.REQUIRED)
	public void updUserDetail(String st, String st1);

	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updUserDetail1(String st);
}
