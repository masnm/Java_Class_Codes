
import java.util.Scanner;

public class SortingBasic {
	
	/*
	 * [A] [B] []
	 * [A] [B] [A]
	 * [B] [B] [A]
	 * [B] [A] [A]
	 */
	
	public static void bubbleSort ( int[] Arr ) {
		int size = Arr.length;
		for ( int i = 0; i < size; i++ ) {
			
			for ( int j = 0; j < size - 1; j++ ) {
				if ( Arr[j+1] < Arr[j] ) {
					int third = Arr[j+1];
					Arr[j+1] = Arr[j];
					Arr[j] = third;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		// take input from user
		Scanner sc = new Scanner ( System.in );
		System.out.print( "How many numbers you want to sort : " );
		int ArraySize = sc.nextInt();
		
		int[] Array = new int[ArraySize];
		System.out.print( "Enter " + ArraySize + " Numbers : " );
		for ( int i = 0; i < ArraySize; i++ ) {
			Array[i] = sc.nextInt();
		}
		
		// do bubble sort
		bubbleSort ( Array );
		
		// show the output
		System.out.print( "After Sorted Values Are : " );
		for ( int i = 0; i < Array.length; i++ ) {
			System.out.print( Array[i] + " " );
		}
		
		/*
		{ 4, 6, 1, 0, 2 }
		
		iteration 1:
			{ 4, 6, 1, 0, 2 }
			{ 4, 1, 6, 0, 2 }
			{ 4, 1, 0, 6, 2 }
			{ 4, 1, 0, 2, 6 }
			
		iteration 2:
			{ 4, 1, 0, 2, 6 }
			{ 1, 4, 0, 2, 6 }
			{ 1, 0, 4, 2, 6 }
			{ 1, 0, 2, 4, 6 }
		
		*/
		
		/*
		// 10000000
		// 1000000 ->   -10^9  <->  10^9
		long [] array = new long[1000000];
		// loop and input in array
		// 10^5
		// 12348978 -> { Yes, No }
		
		suppose given numbers are
		{ 5, 1, 2, 6, 0, 9, 7, 2, 1 }
		
		checks are { 4, 7, 12, 24 }
		
		after sorting :
		{ 0, 1, 1, 2, 2, 5, 6, 7, 9 }
		                 ^        ^
		now check for 4
		*/

	}

}
