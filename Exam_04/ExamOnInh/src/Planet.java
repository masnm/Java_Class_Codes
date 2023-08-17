
/*
 * Author: Bidushi kabir
 * Class : Planet
 * Details : this is also an public concrete class which is a child
 *           class of the HeavenlyObject
 *           so it has everything in the parent class and in addition
 *           a variable supportLife
 */

public class Planet extends HeavenlyObject {
	
	// instance variables
	private boolean supportLife;
	
	// an tow argument constructor for this class
	public Planet(double radius, boolean supportLife) {
		super ( "plant", radius );
		this.supportLife = supportLife;
	}
	
	// an three argument constructor for this class
	public Planet(double radius, String name, boolean supportLife) {
		super ( "plant", radius, name );
		this.supportLife = supportLife;
	}

	// getter for supportLife variable
	public boolean getSupportLife() {
		return this.supportLife;
	}

	// setter for supportingLife variable
	public void setSupportLife(boolean supportLife) {
		this.supportLife = supportLife;
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
	public String toString( ) {
		return super.toString()
				+ "\nit is " + this.supportLife
				+ " that this planet supports human life.";
	}

	
}
