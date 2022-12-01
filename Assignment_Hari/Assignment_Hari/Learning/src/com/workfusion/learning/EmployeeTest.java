package com.workfusion.learning;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc = new Scanner(System.in);
		Employee E = new Employee();
		E.setEmp_id(1);
		E.setEmp_name("Hari");
		E.setEmp_sal(60000);
		System.out.println(E.getEmp_id()+" "+E.getEmp_name()+ " " + E.getEmp_sal());
		
		Owner O = new Owner();
		O.setEmp_name("Kumar");
		O.setS("Director");
		System.out.println(O.getEmp_name()+" "+ O.getS());
		
		Emp e1=new Emp();
		e1.setI(10);
		e1.setJ(20);
		System.out.println(e1.getI()+e1.getJ());
		
		Emp e2=new Emp(2,3);
		System.out.println(e2.m+e2.n);
	}

}
