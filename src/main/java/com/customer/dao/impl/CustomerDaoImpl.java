package com.customer.dao.impl;
 

import java.util.Date;
import java.util.List;
 
import com.customer.dao.CustomerDao;
import com.customer.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void addCustomer(Customer customer){
 
		customer.setCreatedDate(new Date());
		sessionFactory.getCurrentSession().save(customer);
 
	}

	/*public List<Customer> findAllCustomer(){
		List<Customer> list=new ArrayList<Customer>();
		return (List<Customer>)getHibernateTemplate().find("from Customer");
				//find("from Customer");
 
	}*/
	public List<Customer> findAllCustomer(){

		List<Customer> list = sessionFactory.
				getCurrentSession().
				createQuery("from Customer").
				list();
		return list;

	}
	public void removeCustomer(Integer id) {
		Customer contact = (Customer) sessionFactory.getCurrentSession().load(
				Customer.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().
					delete(contact);
		}

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}