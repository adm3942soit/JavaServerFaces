package com.customer.bo.impl;
 
import java.util.List;
 
import com.customer.bo.CustomerBo;
import com.customer.dao.CustomerDao;
import com.customer.model.Customer;
 
public class CustomerBoImpl implements CustomerBo{
 
	CustomerDao customerDao;
 
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
 
	public void addCustomer(Customer customer){
 
		customerDao.addCustomer(customer);
 
	}
 
	public List<Customer> findAllCustomer(){
 
		return customerDao.findAllCustomer();
	}
}