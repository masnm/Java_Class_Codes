
public class Circle {
	
	private double radius;
	private static String color;
	
	// constructor must have the same name as the class
	// and must not have any return type.
	
	public Circle ( double radius ) {
		this.radius = radius;
	}
	
	public Circle ( double radius, String color ) {
		this.radius = radius;
		Circle.color = color;
	}
	
	public double calculateArea () {
		return Math.PI * radius * radius;
	}
	
	public void setColor ( String c ) {
		Circle.color = c;
	}
}
