package com.WorkFusion.bank;

public class Validator {
	public String name;
	public String jobProfile;
	public int age;
	boolean validateName(String name) {
		if (name== null)  {
			return false;
		} else {
			return true;
		}
	}

	boolean validateAge(int age) {
		if (age >= 18 && age <= 30) {
			return true;
		} else {
			return false;
		}
	}

	boolean validateJobProfile(String jobProfile) {
		if (jobProfile.equalsIgnoreCase("Clerk") || jobProfile.equalsIgnoreCase("Associate")
				|| jobProfile.equalsIgnoreCase("Officer")
				|| jobProfile.equalsIgnoreCase("Executive")) {
			return true;
		} else {
			return false;
		}
	}
	public void validate(Applicant a) {
		try 
		{
			if (!validateAge(a.getAge()))
				throw new InvalidAgeException("Invalid age");
			else if(!validateJobProfile(a.getJobProfile()))
				throw new InvalidProfieException("Invalid Profile");
			else if ( !validateName(a.getName()))
				throw new InvalidNameException("Invalid name");
			else 
				System.out.println("Application submitted successfully");
		}
		catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidProfieException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}