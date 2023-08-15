
 /** Filename: ShapeTest.java 
       Author: Bidushi Kabir 
         Date: 2023-08-01
Description:   This is the main test class to demonstrate the functionality of the Shape, Ball, and Box classes.*/

//

public class ShapeTest {
	
	/**
   * Generic method to print the given object without a newline at the end.
   *
   * @param t The object to be printed.
   * @param <T> The type of the object.
   */
	public static <T> void print ( T t ) {
		System.out.print ( t );
	}
	 /**
   * Generic method to print the given object with a newline at the end.
   *
   * @param t The object to be printed.
   * @param <T> The type of the object.
   */
	
	
	public static <T> void println ( T t ) {
		System.out.println ( t );
	}
	
	public static void main ( String [] args ) {
	
		
	// Creating a Ball object with a radius of 6.6 and color "Green"
		Ball ball = new Ball ( 6.6, "Green" );
		
		 // Creating a Box object with dimensions 12.0 (length) x 16.0 (width) x 21.3 (height) and color "White"
		Box box = new Box ( 12.0, 16.0, 21.3, "White" );
		
		
		 // Printing the properties of the Ball object
		println ( "ball Type : " + ball.getType() );
		println ( "ball color : " + ball.getColor() );
		println ( "ball radius : " + ball.getRadius() );
		println ( "" );
		
		println ( "box Type : " + box.getType() );
		println ( "box color : " + box.getColor() );
		println ( "box length : " + box.getLength() );
		println ( "box width : " + box.getWidth() );
		println ( "box height : " + box.getHeight() );
		println ( "" );
		 // Using the default toString() method to print the Ball and Box objects
    System.out.println(ball);
		System.out.println ( ball );
		System.out.println ( box );
		println ( "" );
		 // Changing the color of the Box to "Rainbow"
		box.setColor ( "Rainbow" );
		
	  // Printing the properties of the Ball object after the color change
		println ( "ball Type : " + ball.getType() );
		println ( "ball color : " + ball.getColor() );
		println ( "ball radius : " + ball.getRadius() );
		println ( "" );
	// Printing the properties of the Box object after the color change
		println ( "box Type : " + box.getType() );
		println ( "box color : " + box.getColor() );
		println ( "box length : " + box.getLength() );
		println ( "box width : " + box.getWidth() );
		println ( "box height : " + box.getHeight() );
		println ( "" );
		
	// Calculating and printing the area of the Box and Ball objects
		println ( "Box area : " + box.calculateArea() );
		println ( "Ball Area : " + ball.calculateArea() );
	}
}
