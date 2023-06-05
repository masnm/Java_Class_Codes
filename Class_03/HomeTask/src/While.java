
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// while loop
		/*
		 * [initialization]
		 * while ( [condition] ) {
		 *    [update]
		 *    // codes goes here
		 *    [update]
		 * }
		 */
		/*
		long LongVariable = 1;
		while ( LongVariable <= 10 ) {
			System.out.print( LongVariable + " " );
			LongVariable++;
		}
		*/
		
		// take a number from the user and find it's divisors using while loop
		Scanner scanner = new Scanner ( System.in );
		System.out.print( "Please Enter a Number : " );
		long InputNumber = scanner.nextLong();
		
		// initialization
		long LoopVariable = 1, Summation = 0;
		// condition
		while ( LoopVariable <= InputNumber ) {
			if ( InputNumber % LoopVariable == 0 ) {
				System.out.print( LoopVariable + " " );
				Summation += LoopVariable;
			}
			// update
			LoopVariable++;
		}
		System.out.println ( "\nSummation : " + Summation );
		
		
		// convert a for loop into a while loop
		int DivisorCount = 0;
		for ( int i = 1 ; i <= InputNumber ; i++ ) {
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
		}
		
		DivisorCount = 0;
		int i = 1 ;
		while ( i <= InputNumber ) {
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
			i++;
		}
		
		System.out.print ( DivisorCount );
	}

}
