package com.workfusion.learning;
public class Simple{
	public static void main(String args[]) {
		MyThread my=new MyThread();
		my.run();
		MyThread1 m=new MyThread1();
		m.run();
	}
}
