package Methods;

public class Adder {
	
	/*
	[ access modifier ]  [ return type ]  [ name ]  ( [ inputs ] ) {
		// codes
	}
	*/
	
	public static final int number = 5;
	
	public int secondNumber = 10;
	
	public static int addInt ( int l, int r ) {
		return l + r;
	}
	
	public double addDbl ( double l, double r ) {
		return l + r;
	}
	
	public void showSum ( int a, int b ) {
		System.out.println ( a + b );
	}
	
	// call by value
	public void getInt ( int x ) {
		x = 25;
	}
	
	// call by reference
	public void getString ( String s ) {
		s = new String ( "A new String");
	}
	
	public void getNum ( Number n ) {
		n.num = 125;
	}
	
}
