import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Circle myCircle = new Circle ();
		
		// System.out.println ( Circle.PI );
		
		Circle myCircle = new Circle ( 123.0 );
		
		System.out.println ( myCircle.getRadious() );
		
		myCircle.setRadious( 120.0 );
		
		System.out.println ( myCircle.getRadious() );
		
		myCircle.scaleCircle( 1.0/3.0 );
		
		System.out.println ( myCircle.getArea() );
		
		/*
		int [] arr = new int[10];
		ArrayList<Integer> arr = new ArrayList ();
		arr.get (0);
		arr.add (123);
		*/
	}

}
