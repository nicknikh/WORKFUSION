package ApplicantValidation;

public class Test {

	public static void main(String[] agrs) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException
	{
		Applicant a1 = new Applicant("Kavya","Clerk",26);
		Applicant a2 = new Applicant("Veera","Officer",22);
		Validator val = new Validator();
		val.validate(a1);
		val.validate(a2);
	}
}
