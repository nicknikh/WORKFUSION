package com.workfusion.problemstatement3;

public class Validator {
	public boolean validateName(String name)
	{
		if(name == null || name.length() ==0)
		{
			return false;
		}
		return true;
	}
	public boolean validateJobProfile(String jobProfile)
	{
		if(jobProfile.equalsIgnoreCase("Associate") || jobProfile.equalsIgnoreCase("Clerk") || jobProfile.equalsIgnoreCase("Executive") || jobProfile.equalsIgnoreCase("Officer"))
		{
			return true;
		}
		return false;
	}
	public boolean validateAge(int age)
	{
		if(age >= 18 && age <= 30)
		{
			return true;
		}
		return false;
	}
	public void valdiateApplicant(Applicant applicant)
	{
		try
		{
			if(!validateName(applicant.getName()))
			{
				throw new InvalidNameException("name is invalid"); 
			}
			else if(!validateAge(applicant.getAge()))
			{
				throw new InvalidAgeException("age is invalid");
			}
			else if(!validateJobProfile(applicant.getJobProfile()))
			{
				throw new InvalidJobProfileException("profile is invalid");
			}
			else
			{
				System.out.println("valid");
			}
		}
//		catch(Exception exp)
//		{
//			System.out.println(exp.getMessage());
//		}
		catch(InvalidNameException exp )
		{
			System.out.println(exp.getMessage());
		}
		catch(InvalidJobProfileException exp)
		{
			System.out.println(exp.getMessage());
		}
		catch(InvalidAgeException exp)
		{
			System.out.println(exp.getMessage());
		}
	}
	
}



