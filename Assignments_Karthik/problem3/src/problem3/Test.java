package problem3;

public class Test {

	public static void main(String[] args) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
		Applicant a=new Applicant("Bob","Karthik",2);
		Validator v = new Validator();
		v.validate(a);
	}

}
