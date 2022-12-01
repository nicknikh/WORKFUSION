//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class PermanentEmployee extends Employee{
	//Implement your code here
	
	private double basicPay;
	private String[] salaryComponents;
	private float experience;
	Asset[] assets;
	double Bonus;
	double HRA;
	double DA;
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public String[] getSalaryComponents() {
		return salaryComponents;
	}
	public void setSalaryComponents(String[] salaryComponents) {
		this.salaryComponents = salaryComponents;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public Asset[] getAssets() {
		return assets;
	}
	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}
	
	PermanentEmployee(String employeeName,double basicPay,String[] salaryComponents,Asset[] assets)
	{
		super(employeeName);
		this.basicPay = basicPay;
		this.salaryComponents = salaryComponents;
		this.assets = assets;
		int tempId = super.getPermanentIdCounter();
		StringBuffer sb = new StringBuffer("P");
		this.setEmployeeId(sb.append(Integer.toString(tempId)).toString());
		super.setPermanentIdCounter(tempId);
		calculateSalary(getExperience());
	}
	
	double calculateBonus(float experience)
	{
		if(experience>=2.5 && experience<4)
		{
			return 2550.0;
		}
		else if(experience>=4 && experience<8)
		{
			return 5000.0;
		}
		else if(experience>=8 && experience<12)
		{
			return 8750.0;
		}
		else if(experience>=12)
		{
			return 13000.0;
		} 
		else
			return 0;
	}
	
	void calculateSalary(float experience)
	{
		for(String a:getSalaryComponents()[0].split("-"))
		{
			DA=Double.parseDouble(a);
		}
		for(String a:getSalaryComponents()[1].split("-"))
		{
			HRA=Double.parseDouble(a);
		}
		double Salary = basicPay+ basicPay*(DA/100) + basicPay*(HRA/100) + calculateBonus(experience);
		setSalary(Math.round(Salary));
	}
	
	void getAssetsByDate(String lastDate)
	{
		
	}
	
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
}