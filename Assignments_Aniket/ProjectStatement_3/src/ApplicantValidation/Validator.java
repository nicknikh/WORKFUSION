package ApplicantValidation;

public class Validator {

	public boolean validateName(String name)
	{
		if(name!=null)
			return true;
		else
			return false;
	}
	
	public boolean validateJobProfile(String jobProfile)
	{
		if("Associate".equalsIgnoreCase(jobProfile))
			return true;
		else if("Clerk".equalsIgnoreCase(jobProfile))
			return true;
		else if("Excecutive".equalsIgnoreCase(jobProfile))
			return true;
		else if("Officer".equalsIgnoreCase(jobProfile))
			return true;
		else
			return false;
	}
	
	public boolean validateAge(int age)
	{
		if(age>=18 && age<=30)
			return true;
		else
			return false;
	}
	
	public void validate(Applicant applicant)
	{
		try{
			if(validateName(applicant.getName())==false)
				throw new InvalidNameException("Invalid Name");
		}
		catch(InvalidNameException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try
		{
			if(validateJobProfile(applicant.getJobProfile())==false)
				throw new InvalidJobProfileException("Invalid Job Profile");
		}
		catch(InvalidJobProfileException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try
		{
			if(validateAge(applicant.getAge())==false)
				throw new InvalidAgeException("Invalid Age");
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("application submitted successfully");
	}
}
