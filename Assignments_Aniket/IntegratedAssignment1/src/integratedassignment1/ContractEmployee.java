//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class ContractEmployee extends Employee{
	//Implement your code here

	private double wagePerHour;
	
	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	
	ContractEmployee(String employeeName,double wagePerHour)
	{
		super(employeeName);
		this.wagePerHour = wagePerHour;
		int tempId = super.getContractIdCounter();
		StringBuffer sb = new StringBuffer("C");
		this.setEmployeeId(sb.append(Integer.toString(tempId)).toString());
		super.setContractIdCounter(tempId);
	}
	
	void calculateSalary(float hoursWorked)
	{
		double Salary;
		if(hoursWorked >= 190)
			Salary = hoursWorked*wagePerHour;
		else
		{
			Salary = hoursWorked*wagePerHour - (190-hoursWorked)*(wagePerHour/2);
		}
		this.setSalary(Math.round(Salary));	
	}
	
	//Do not modify the code given below
	@Override 
	public String toString() { 
	  	return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour(); 
	}
}