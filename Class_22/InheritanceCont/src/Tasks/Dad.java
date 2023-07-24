package Tasks;
/*
   Filename: Dad.java
     Author: Shelley Lapkowski
       Date: Mar 27, 2023 3:53:58 p.m.
Description: This defines the Dad class and inherits directly from Family 
 */
public class Dad extends Family
{
	private String education;
	
	//constructor
	public Dad(String educate, String first, String last, int year)
	{
		super(first, last, year);
		this.education = educate;
	}
	
	public String getEducation()
	{
		return this.education;
	}
	
	public void setEducation(String education)
	{
		this.education = education;
	}
	
	/*
	 * Method Name: toString
	 *     Purpose: to describe the object
	 *     Accepts: nothing
	 *     Returns: String 
	 */
	public String toString()
	{
		String s = "Name : " + this.getFirstName() + " " + this.getLastName() + "\n";
		s += "Education : " + this.getEducation() + "\n";
		s += "YearBorn : " + this.getYearBorn() + "\n";
		s += "This toString method is being invoked by the " + this.getClass().getName() +
				   " class and overrides the toString method of the Object class";
		return s;
	}
}
