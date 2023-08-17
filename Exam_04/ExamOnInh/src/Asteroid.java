
/*
 * Author: Bidushi kabir
 * Class : Asteroid
 * Details : this is also an public concrete class which is a child
 *           class of the HeavenlyObject
 *           so it has everything in the parent class and in addition
 *           a variable travelSpeed
 */

public class Asteroid extends HeavenlyObject {
	
	// object / instance variable
	private int travelSpeed;
	
	// two argument constructor
	public Asteroid(double radius, int travelSpeed) {
		super ( "asteroid", radius );
		this.travelSpeed = travelSpeed;
	}
	
	// theree argument constructor for this class
	public Asteroid(double radius, String name, int travelSpeed) {
		super ( "asteroid", radius, name );
		this.travelSpeed = travelSpeed;
	}
	
	// getter for the travelSpeed variable
	public int getTravelSpeed() {
		return this.travelSpeed;
	}

	// setter for the travelSpeed variable
	public void setTravelSpeed(int travelSpeed) {
		this.travelSpeed = travelSpeed;
	}

	// this overrides the abstract method in the parent class HeavenlyObject
	// this calculates the perimeter of this object using the formula
	// c = 2 * PI * radius
	@Override
	public double findPerimeter() {
		double C = 2.0 * Math.PI * getRadius();
		return C;
	}

	// this overrides the abstract method in the parent class HeavenlyObject
	// this calculates the surface area of this object using the formula
	// surface area = 4 * PI * radius ^ 2
	@Override
	public double findSurfaceArea() {
		double surfaceArea = 4.0 * Math.PI * Math.pow ( getRadius(), 2.0 );
		return surfaceArea;
	}
	
	// this methods takes help of the base classes to string implementation and
	// in the end of the base classes string it add it's new information
	@Override
	public String toString () {
		return super.toString()
				+ "\nThe speed of this asteroid is " + this.travelSpeed
				+ " kilometers per hour.";
	}

}
