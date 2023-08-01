
public class Ball extends Shape {
	
	private double radius;
	
	public Ball () {
		super( "Orange" );
		this.radius = 1.85;
	}
	
	public Ball ( double radius, String color ) {
		super ( color );
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString () {
		return super.toString() + "the radius of this "
				+ this.radius + "here is area " + this.calculateArea();
	}

	@Override
	public double calculateArea() {
		return 4.0 * Math.PI * Math.pow( radius, 2.0 );
	}


}
