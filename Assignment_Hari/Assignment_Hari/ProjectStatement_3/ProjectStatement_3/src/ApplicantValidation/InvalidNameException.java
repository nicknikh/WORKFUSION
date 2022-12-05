package ApplicantValidation;

@SuppressWarnings("serial")
public class InvalidNameException extends Exception {

	public InvalidNameException(String namemsg)
	{
		super(namemsg);
	}
	
}
