//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public abstract class Employee {
	//Implement your code here
	
	private String employeeId;
	private String employeeName;
	private double salary;
	private static int contractIdCounter;
	private static int permanentIdCounter;
	Employee(String employeeName)
	{
		this.employeeName = employeeName;
	}
	static {
		contractIdCounter = 1000;
		permanentIdCounter = 1000;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		String nameToSet = "";
		for(String s : employeeName.split(" ")){
				if (s.length() > 2 && Character.isUpperCase(s.charAt(0)))
				{
						nameToSet = nameToSet + s + " ";
				} 
				else return;
		}
		this.employeeName = nameToSet.trim();
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary>0)
			this.salary = salary;
		else
		{
			this.salary = 0.00;
		}
	}

	public static int getContractIdCounter() {
		return contractIdCounter;
	}


	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = ++contractIdCounter;
	}


	public static int getPermanentIdCounter() {
		return permanentIdCounter;
	}


	public static void setPermanentIdCounter(int permanentIdCounter) {
		Employee.permanentIdCounter = ++permanentIdCounter;
	}

	
	abstract void calculateSalary(float salaryFactor);
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName();
	}
}