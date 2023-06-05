
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		System.out.print( "Enter a Number : " );
		int InputNumber = scanner.nextInt();
		
		/*
		int DivisorCount = 0;
		for ( int i = 1 ; i <= InputNumber ; i++ ) {
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
		}
		*/
		
		/*
		int DivisorCount = 0;
		int i = 1;
		while ( i <= InputNumber ) {
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
			i++;
		}
		*/
		int DivisorCount = 0;
		int i = 1;
		do {
			System.out.print( "Loop Body Executed " );
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
			i++;
		} while ( i <= InputNumber );
		System.out.println ( "Divisor Count is " + DivisorCount );
		
		// do while loop
		/*
		 * [initialization]
		 * do {
		 *    [update]
		 *    // codes goes here
		 *    [update]
		 * } while ( [condition] );
		 */


	}

}
