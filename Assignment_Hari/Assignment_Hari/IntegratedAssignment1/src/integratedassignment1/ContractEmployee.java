//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class ContractEmployee extends Employee {
	//Implement your code here

	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	private double wagePerHour;
	ContractEmployee(String EmployeeName, double wagePerHour){
		super(EmployeeName);
		this.wagePerHour=wagePerHour;
	}
	public double getWagePerHour() {
		return wagePerHour;
	}


	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	public void calculateSalary(float hoursWorked) {
		if(hoursWorked >= 190){
			Salary = wagePerHour*hoursWorked;
		}
		else {
			Salary = (wagePerHour*hoursWorked)/2;
		}
		System.out.println(Math.round(Salary));
	}
	@Override 
	public String toString() { 
	  	return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Wage Per Hour: "+getWagePerHour(); 
	}
	@Override
	void CalculateSalary(float salaryFactor) {
		// TODO Auto-generated method stub
		
	}
}