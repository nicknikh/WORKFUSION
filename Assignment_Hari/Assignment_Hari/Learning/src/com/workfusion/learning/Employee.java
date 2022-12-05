package com.workfusion.learning;

// private can be inherited within the class

public class Employee {
		protected int Emp_id;
		protected String Emp_name;
		protected int Emp_sal;
		private int i;
		public int getEmp_id() {
			return Emp_id;
		}
		public void setEmp_id(int emp_id) {
			Emp_id = emp_id;
		}
		public String getEmp_name() {
			return Emp_name;
		}
		public void setEmp_name(String emp_name) {
			Emp_name = emp_name;
		}
		public int getEmp_sal() {
			return Emp_sal;
		}
		public void setEmp_sal(int emp_sal) {
			Emp_sal = emp_sal;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		
}
class Emp extends Employee{
	protected int m,n;
	
	// Non-parameter
	Emp(){
		
	}
	//Parameters
	Emp(int m,int n){
		this.m=m;
		this.n=n;		
	}
	
	private int j;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
}
