package ClassCode;

public class ZeroOrNegativeRadiusException extends Exception
{

	public ZeroOrNegativeRadiusException(double radius)
	{
		super("Sorry, you have entered an invalid radius of " + radius);
	}

}
