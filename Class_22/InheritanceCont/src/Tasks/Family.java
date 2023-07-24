package Tasks;
/**
   Filename: Family.java
     Author: Shelley Lapkowski
       Date: Mar 27, 2023 3:44:15 p.m.
Description: This class will be abstract and will hold properties common to all 
 	           of the subclasses that inherit from it
 */
public abstract class Family
{
	private String firstName;
	private String lastName;
	private int yearBorn;
	
	//constructor
	public Family(String first, String last, int year)
	{
		this.firstName = first;
		this.lastName = last;
		this.yearBorn = year;
	}
	
	//accessors (getters)
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getYearBorn()
	{
		return this.yearBorn;
	}

	//mutators (setters)
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setYearBorn(int yearBorn)
	{
		this.yearBorn = yearBorn;
	}

}
