
import java.util.Scanner;

public class Generic {
	
	/*
	 * When we don't know which type to work with we use generic method
	 * <access modifier> {<generic one, generic two, ..>} return type name ( ) {
	 * }
	 * 
	 * generic just implements a copy of the generic method for each caller
	 * using which data types it's giving as input and delete the generic one
	 */
	
	public static <T> void print ( T something ) {
		System.out.print( something );
	}
	
	
	public static void main ( String[] args ) {
		print ( "A message" );
		print ( 123 );
		print ( 12.45 );
	}
}
