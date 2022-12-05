package com.workfusion.spring.orderJDBC;

public interface OrderService {
	void createOrder(Customer c);
	//void editOrder();
	void deleteOrder(Customer c);
	void displayOrder();
	void displayPreviousOrders(Customer c);

}
