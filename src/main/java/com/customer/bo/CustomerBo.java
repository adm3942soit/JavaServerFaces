package com.customer.bo;
 
import java.util.List;
 
import com.customer.model.Customer;
 
public interface CustomerBo{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}