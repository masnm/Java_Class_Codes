
public class TestCircleTwo {
	
	public static void print ( String s ) {
		System.out.println ( s );
	}

	public static void main(String[] args) {
		
		CircleTwo myCircleTwo = new CircleTwo ( 25, "sand drift beige" );
		
		// we can't access via the object cause the members are private
		// double radius = myCircleTwo.radius;
		// String color = myCircleTwo.circleColor;
		
		print ( "MyCircleTwo radius : " + myCircleTwo.getRadius() );
		print ( "MyCircleTwo color : " + myCircleTwo.getCircleColor() );
		
		myCircleTwo.setRadius ( 50 );
		myCircleTwo.setCircleColor ( "madison green" );
		
		print ( "MyCircleTwo radius : " + myCircleTwo.getRadius() );
		print ( "MyCircleTwo color : " + myCircleTwo.getCircleColor() );
		
	}

}
