
/**
 * Filename: Ball.java
 * Author: Bidushi Kabir
 * Date: 2023-08-01
 * Description: This class represents a Ball, which is a subclass of the Shape class.
 */


public class Ball extends Shape {
	
	private double radius;
	 /**
   * Default constructor for Ball class.
   * It sets the color to "Orange" and the radius to 1.85.
   */
	
	public Ball () {
		super( "Orange" );
		this.radius = 1.85;
	}
	/**
   * Parameterized constructor for Ball class.
   *
   * @param radius The radius of the ball.
   * @param color The color of the ball.
   */
	
	public Ball ( double radius, String color ) {
		super ( color );
		this.radius = radius;
	}
	 /**
   * Get the radius of the ball.
   *
   * @return The radius of the ball.
   */
	public double getRadius() {
		return this.radius;
	}

	 /**
   * Set the radius of the ball.
   *
   * @return The radius of the ball.
   */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString () {
		return super.toString() + "the radius of this "
				+ this.radius + "here is area " + this.calculateArea();
	}

	 /**
   * Calculate the area of the ball.
   *
   * @return The area of the ball.
   */
	@Override
	public double calculateArea() {
		return 4.0 * Math.PI * Math.pow( radius, 2.0 );
	}


}
