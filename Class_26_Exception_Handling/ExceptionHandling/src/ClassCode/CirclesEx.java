package ClassCode;

public class CirclesEx 
{
	private double radius;
	private String color;
	
	public CirclesEx(double rad, String col) throws ZeroOrNegativeRadiusException
	{
		if (rad <= 0)
		{
			throw new ZeroOrNegativeRadiusException(rad);
		}
		else
			{
			this.radius = rad;
			}
		this.color = col;		
	}
	
		//accessor and mutator methods
		public String getColor()
		{
			return this.color;
		}
		public double getRadius()
		{
			return this.radius;
		}

		public void setColor(String col)
		{
			this.color = col;
		}
		
		public void setRadius(double rad) throws ZeroOrNegativeRadiusException
		{
			if (rad <= 0)
			{
				throw new ZeroOrNegativeRadiusException(rad);
			}
			else
			{
				this.radius = rad;
			}
		}
}
