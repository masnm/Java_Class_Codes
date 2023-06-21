
import java.util.Scanner;

public class RecursiveMethod {
	
	public static <T> void print ( T something ) {
		System.out.print( something );
	}
	
	// base case fib ( 0 ) = 0
	// base case fib ( 1 ) = 1
	// recursion fib ( n ) = fib ( n - 1 ) + fib ( n - 2 )
	
	public static int fib ( int input ) {
		if ( input == 0 ) return 0;
		else if ( input == 1 ) return 1;
		else return fib ( input - 1 ) + fib ( input - 2 );
	}
	
	public static int fact ( int something ) {
		if ( something == 1 ) return 1;
		else return fact ( something - 1 ) * something;
	}
	
	public static int recursiveSum ( int n ) {
		int ans = 0;
		if ( n == 0 ) {
			ans = 0;
		} else {
			ans = recursiveSum ( n - 1 ) + n;
		}
		return ans;
	}
	
	public static int getSeriesSum ( int limit ) {
		int sum = 0;
		for ( int i = 0; i <= limit; i++ ) {
			sum += i;
		}
		return sum;
	}
	
	public static void main ( String[] args ) {
		
		Scanner sc = new Scanner ( System.in );
		
		print ( "Enter the limit : " );
		int limit = sc.nextInt();
		int sum = recursiveSum ( limit );
		
		// print ( "Summation is : " + sum );
		print ( fib ( 6 ) );
	}
	
	/*
	 * seriessum ( 5 ) -> 0 + 1 + 2 + 3 + 4 + 5
	 * seriessum ( n ) -> 0 + 1 + 2 + ... + (n-2) + (n-1) + n
	 * 
	 * seriessum ( n = 4 ) -> 0 + 1 + ... + (n-1) + n
	 *                     -> 0 + 1 + ... + (4-1) + 4
	 *                     -> 0 + 1 + 2 + 3 + 4
	 * seriessum( n = 0 ) -> 0
	 * 
	 * seriessum ( n ) -> 0 + 1 + 2 + ... + (n-2) + (n-1) + n
	 * seriessum ( n ) -> seriessum ( n - 1 ) + n
	 * 
	 * 1. Base Case
	 * 2. Recursion case
	 * 
	 * base case ( for input 0 output 0 )
	 * recuresion case ( for any other input recur ( input - 1 ) + input )
	 * 
	 * seriessum ( n = 0 ) = 0
	 * seriessum ( n ) = seriessum ( n - 1 ) + n
	 * 
	 * 
	 * seriessum ( 5 ) -> seriessum ( 5 -1 ) + 5
	 *                 -> seriessum ( 4 ) + 5
	 *                 -> seriessum ( 4 - 1 ) + 4 + 5
	 *                 -> seriessum ( 3 ) + 4 + 5
	 *                 -> seriessum ( 3 - 1 ) + 3 + 4 + 5
	 *                 -> seriessum ( 2 ) + 3 + 4 + 5
	 *                 ...
	 *                 -> seriessum ( 0 ) + 1 + 2 + 3 + 4 + 5
	 *                 -> 0 + 1 + 2 + 3 + 4 + 5
	 * 
	 * fact ( 4 ) -> 1 * 2 * 3 * 4
	 * fact ( n ) -> 1 * 2 * .... * (n-1) * n
	 * fact ( 1 ) -> 1
	 * 
	 * base case -> fact ( 1 ) -> 1
	 * recursion -> fact ( n ) -> fact ( n - 1 ) * n
	 *
	 */

}
