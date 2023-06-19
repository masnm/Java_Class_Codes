
import java.util.Scanner;

public class MethodOverloading {
	
	// inputs: Type name
	// inputs: Type name, Type name, Type name....
		
	// <access modifier> <return type> <method name> ( <inputs> ) {
	//      method body
	//      return <object>
	// }
	
	// overloading
	// if inputs count is one then they must be different types
	// if more that one then there must be one data type miss-mass
	
	//  method 1:   int int String double
	//  method 2:   int char String double
	
	/* print ( int, int )
	 * print ( int )
	 * print ( String )
	 */
	public static void print ( int numberOne, int numberTwo ) {
		System.out.print( numberOne + " " + numberTwo );
	}
	
	public static void print ( int number ) {
		System.out.print( number );
	}
	
	public static void print ( String msg ) {
		System.out.print( msg );
	}
	
	
	public static int sub ( int numA, int numB ) {
		return (numA - numB);
	}
	
	public static double sub ( double numA, double numB ) {
		return (numA - numB);
	}

	public static void main(String[] args) {
		
		int value = 125;
		
		print ( "Hi there." + "How are you" );
		print ( value );
		
		sub ( 1, 5 );
		sub ( 9.0, 1.4 );

	}

}
