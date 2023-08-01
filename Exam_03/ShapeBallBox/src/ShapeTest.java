
public class ShapeTest {
	
	public static <T> void print ( T t ) {
		System.out.print ( t );
	}
	
	public static <T> void println ( T t ) {
		System.out.println ( t );
	}
	
	public static void main ( String [] args ) {
		
		Ball ball = new Ball ( 6.6, "Green" );
		Box box = new Box ( 12.0, 16.0, 21.3, "White" );
		
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
		
		System.out.println ( ball );
		System.out.println ( box );
		println ( "" );
		
		box.setColor ( "Rainbow" );
		
		
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
		
		println ( "Box area : " + box.calculateArea() );
		println ( "Ball Area : " + ball.calculateArea() );
	}
}
