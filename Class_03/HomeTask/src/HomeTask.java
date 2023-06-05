
import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {
		
		// for loop Syntax
		// for ( [initialization] ; [condition] ; [update] ) {
		//     // codes goes here
		// }
		
		// for loop working procedure
		/*
		 * [initialization] 
		 * [condition] -> true
		 * {}
		 * [update]
		 * [condition] -> true
		 * {}
		 * [update]
		 * .....
		 * [condition] -> False
		 * loop ends
		 */
		
		Scanner scanner = new Scanner ( System.in );
		System.out.print( "Please Enter a number : " );
		int InputNumber = scanner.nextInt ();
		int [] DivisorsArray;
		
		// count how many divisores Input Number has and save it in DivisorCount
		int DivisorCount = 0;
		for ( int i = 1 ; i <= InputNumber ; i++ ) {
			if ( InputNumber % i == 0 ) {
				DivisorCount++;
			}
		}
		// Create the array with exactly DivisorCount size
		// DivisorCont -> number of divisors Input number has]
		DivisorsArray = new int[DivisorCount];
		
		// save the divisors of InputNumber in the array
		int IndexVariable = 0;
		for ( int i = 1 ; i <= InputNumber ; i++ ) {
			if ( InputNumber % i == 0 ) {
				DivisorsArray[IndexVariable] = i;
				IndexVariable++;
			}
		}
		
		// now printing the array
		/*
		System.out.print ( DivisorsArray[0] );
		System.out.print ( DivisorsArray[1] );
		System.out.print ( DivisorsArray[2] );
		System.out.print ( DivisorsArray[3] );
		System.out.print ( DivisorsArray[4] );
		System.out.print ( DivisorsArray[5] );
		*/
		
		
		// for ( int i = 0 ; i < DivisorCount ; i++ ) {
		System.out.print ( "Divisors are : " );
		for ( int i = 0 ; i < DivisorsArray.length ; i++ ) {
			System.out.print( DivisorsArray[i] + " " );
		}
		
		System.out.println ( "" );
		int Summation = 0;
		for ( int i = 0 ; i < DivisorsArray.length ; i++ ) {
			Summation += DivisorsArray[i];
		}
		System.out.print( "Summation is : " + Summation );
		/*
		for ( int ANumber : DivisorsArray ) {
			System.out.print ( ANumber + " " );
		}
		*/
		
		
		// System.out.println ( "Count is : " + DivisorCount );
		
		// % modulus -> A % B -> remainder of the division of A by B
		// 5 % 2 = 1
		// 8 % 3 = 2
		//  3 | 8  | 2
		//      6
		//  ----------
		//      2
		
		// int [] array = new int[5];
		// int int int int int
		
		// array[0] = 10
		// array[2] = 31
		//  0   1   2   3   4   5
		// [1] [2] [3] [4] [6] [12]
		
	}

}