package ClassCode;

public class TestCirclesEx
{
	public static void main(String[] args) 
	{
		try
		{
		//Create circle objects
		CirclesEx myCircle1 = new CirclesEx(0.5, "Green");
		CirclesEx myCircle2 = new CirclesEx(2.5, "Black");

		//Test all getters for all objects
		/*
		System.out.println(myCircle1.getColor());
		System.out.println(myCircle2.getColor());
		System.out.println(myCircle1.getRadius());
		System.out.println(myCircle2.getRadius());
		*/
		
		//Set circle radius to invalid value
		myCircle1.setRadius(-10);		
		}
		catch(ZeroOrNegativeRadiusException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("\nMy program has come to an end.");
		}
	}
}

