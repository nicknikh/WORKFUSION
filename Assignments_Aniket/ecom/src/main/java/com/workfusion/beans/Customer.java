package com.workfusion.beans;

public class Customer {

	private int customerId;
	private String customerName;
	private long customerPhone;
	private String customerUsername;
	private String customerPassword;
	private Address address;
	
	
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		if(customerName !=null && Character.isUpperCase(customerName.charAt(0)))
		{
			this.customerName = customerName; // Validation.
		}
		else
		{
			//throw exception
		}
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) 
	{
		String str = Long.toString(customerPhone); // Validation
		if(str.length() == 10 && (str.charAt(0)>5))
			this.customerPhone = customerPhone;
		else
		{
			//Invalid Phone-Number exception
		}
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
}
