package ApplicantValidation;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String agemsg)
	{
		super(agemsg);
	}
}
