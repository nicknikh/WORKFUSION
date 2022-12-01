package ApplicantValidation;

@SuppressWarnings("serial")
public class InvalidJobProfileException extends Exception{

	public InvalidJobProfileException(String jobProfilemsg)
	{
		super(jobProfilemsg);
	}
}
