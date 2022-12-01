//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class PermanentEmployee extends Employee{
	//Implement your code here 
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	private double basicPay;
	private String[] salaryComponents=new String[10];
	private float experience;
	private Asset[] assets=new Asset[10];
	int bonusAmount;
	PermanentEmployee(String EmployeeName,double basicPay,String[] salaryComponents,Asset[] assets) {
		super(EmployeeName);
		this.basicPay=basicPay;
		this.salaryComponents=salaryComponents;
		this.assets=assets;
	}
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
	public Asset[] getAssetsByDate(String lastDate) {
		
		return assets;
	}
	
	public void calculateBonus(float experience) {
		if(experience>=2.5 && experience<4) {
			bonusAmount=2550;
		}
		else if(experience>=4 && experience<8) {
			bonusAmount=5000;
		}
		else if(experience>=8 && experience<12) {
			bonusAmount=8750;
		}
		else if(experience>=12) {
			bonusAmount=13000;
		}
		else
		{
			bonusAmount=0;
			new InvalidExperienceException("Invalid");
		}
	}
	public void calculateSalary(float experience) {
		String t=(salaryComponents[0].charAt(3)+""+ salaryComponents[0].charAt(4));
		String l=(salaryComponents[1].charAt(4)+""+ salaryComponents[0].charAt(5));
		int i=Integer.parseInt(t);
		int j=Integer.parseInt(l);
		double DAComponent=basicPay*(i/100),HRAComponent=basicPay*(j/100);
		calculateBonus(experience);
		Salary = basicPay + DAComponent+HRAComponent+bonusAmount;
		System.out.println(Math.round(Salary));
	}
	
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
	@Override
	void CalculateSalary(float salaryFactor) {
		// TODO Auto-generated method stub
		
	}
}