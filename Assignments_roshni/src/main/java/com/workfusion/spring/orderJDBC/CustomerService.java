package com.workfusion.spring.orderJDBC;

public interface CustomerService {

	void editCustomerDetails(Customer c,Address a) throws Exception;
	void addNewCustomer(Customer c,Address a) throws Exception ;
	int login(Customer c,Address a) throws Exception;
}
