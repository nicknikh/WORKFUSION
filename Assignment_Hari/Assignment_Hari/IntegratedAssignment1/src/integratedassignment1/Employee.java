//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public abstract class Employee {
	
	//Implement your code here
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	private String EmployeeId;
	protected String EmployeeName;
	protected double Salary;
	private static int ContractIdCounter,PermenantIdCounter;
	static {
		ContractIdCounter=10000;
		PermenantIdCounter=10000;
	}
	Employee(String EmployeeName){
		this.EmployeeName=EmployeeName;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public static int getContractIdCounter() {
		return ContractIdCounter;
	}
	public void setContractIdCounter(int ContractIdCounter) {
		Employee.ContractIdCounter=ContractIdCounter;
	}
	public static int getPermenantIdCounter() {
		return PermenantIdCounter;
	}
	public static void setPermenantIdCounter(int PermenantIdCounter) {
		Employee.PermenantIdCounter=PermenantIdCounter;
	}
	abstract void CalculateSalary(float salaryFactor);
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}
	
}