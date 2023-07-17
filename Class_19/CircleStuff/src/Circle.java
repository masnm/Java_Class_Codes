
public class Circle {
	
	// class variable can be accessed via class directly
	public static double PI = 3.14159;
	
	// instance variable can only be accesses via instance of a class
	private double radious;
	
	public Circle () {
		System.out.println ( "circle object created!" );
	}
	
	public Circle ( double radious ) {
		System.out.println ( "Second constructor called" );
		this.radious = radious;
	}
	
	public double getRadious () {
		return this.radious;
	}
	
	public void setRadious ( double radious ) {
		this.radious = radious;
	}
	
	public double getArea () {
		return Circle.PI * Math.pow ( this.radious, 2 );
	}
	
	public void scaleCircle ( double scale ) {
		this.radious *= scale;
	}
	
}
