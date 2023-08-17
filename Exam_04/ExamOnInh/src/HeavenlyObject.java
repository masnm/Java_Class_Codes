
/*
 * Author: Bidushi kabir
 * Class : HeavenlyObject
 * Details : this is an public base class which happens to be abstract
 *           so it's object can't be created but it can hold it's childs
 *           object and help use get the Object Oriented Programmigs features
 *           which makes this program modern and provides good maintainability.
 */

public abstract class HeavenlyObject {
	
	// data members to hold the infrommations
	private String type;
	private double radius;
	private String name;
	
	// an two argumented constructor for this class
	public HeavenlyObject( String type, double radius) {
		this.type = type;
		this.radius = radius;
		this.name = "unknown";
	}
	
	// an three argummented constructor for this class to populate all the instance variables
	public HeavenlyObject(String type, double radius, String name) {
		this.type = type;
		this.radius = radius;
		this.name = name;
	}
	
	// getter for radius variable
	public double getRadius() {
		return this.radius;
	}

	// setter for radius variable
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// getter for name variable
	public String getName() {
		return this.name;
	}

	// setter for name variable
	public void setName(String name) {
		this.name = name;
	}

	// getter for type variable
	public String getType() {
		return this.type;
	}

	// an abstract method for the child class to implement which will return an double
	abstract public double findPerimeter( );
	
	// an abstract method for the child class to implement which will return an double
	abstract public double findSurfaceArea( );
	
	// an override to the mother Object classes method toString
	// for this class it will show the information about this classes object
	@Override
	public String toString() {
		return "This heavenly object’s is a(n) " + this.type
				+ " , and it’s name is " + this.name
				+ ".\nThe radius of this " + this.type + " is "
				+ this.radius + " kilometers.";
	}

}
