package com.customer.dao;
 
import java.util.List;

import com.customer.model.Customer;

public interface CustomerDao{
 
	public void addCustomer(Customer customer);
 
	public List<Customer> findAllCustomer();

	public void removeCustomer(Integer id);
 
}