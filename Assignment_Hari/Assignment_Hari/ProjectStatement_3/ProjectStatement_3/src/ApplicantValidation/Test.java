package ApplicantValidation;

public class Test {

	public static void main(String[] agrs) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException
	{
		Applicant App = new Applicant("Kiran","Clerk",30);
		Validator valid = new Validator();
		valid.validate(App);
		
	}
}
