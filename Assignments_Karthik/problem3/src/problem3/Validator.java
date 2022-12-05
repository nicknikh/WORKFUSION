package problem3;

public class Validator {



	public Validator() {
		// TODO Auto-generated constructor stub
	}

	void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
	try {
			if (!validateName(applicant.getName())) {
				throw new InvalidNameException("Invalid Name");
				} 
			
	
			if (!validateJobProfile(applicant.getJobProfile())) {
				
			throw new InvalidJobProfileException("Invalid Job Profile");
				
			}
			if (!validateAge(applicant.getAge())) {
			
					throw new InvalidAgeException("Invalid Age");
				
			}
			System.out.println("Application Submitted Successfully");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
			
		}
	
			


	boolean validateName(String name)  {
		
		if ((name == null) || (name == "empty")) {
			return false;
		}
		return true;
	}

	boolean validateJobProfile(String jobprofile) {
	
		if ((jobprofile.equalsIgnoreCase("Associate")) || (jobprofile .equalsIgnoreCase("Clerk")) || (jobprofile.equalsIgnoreCase("Executive"))| (jobprofile.equalsIgnoreCase("Officer"))) {
			return true;
		}
		return false;
	}

	boolean validateAge(int age) {
		if ((age >= 18) && (age <= 30)) {
			return true;
		}
		return false;
	}

}
