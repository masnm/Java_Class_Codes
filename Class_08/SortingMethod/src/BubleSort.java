


public class BubleSort {
	
	/*
	 * { 9, 5, 2, 1 }
	 * temp = 9
	 * 
	 * { 5, 5, 2, 1 }
	 * temp = 9
	 * 
	 * { 5, 9, 2, 1 }
	 * temp = 9
	 */
	
	public static void printArr ( int[] Arr ) {
		for ( int i : Arr ) {
			System.out.print( i + " " );
		}
		System.out.println ();
	}
	
	public static void aBubleSort ( int [] Array ) {
		int Elements = Array.length;
		for ( int iteration = 0; iteration < Elements; iteration++ ) {
			
			for ( int index = 0; index < Elements - 1 - iteration; index++ ) {
				
				if ( Array[ index + 1 ] < Array[ index ] ) {
					int temp = Array[ index + 1 ];
					Array[ index + 1 ] = Array[ index ];
					Array[ index ] = temp;
				}
				printArr ( Array );
			}
		}
	}

	public static void main(String[] args) {
		
		// Ascending order  3, 6, 9, 13, 16
		// descending order 9, 6, 4, 2, 1
		// < >
		// { 1, 3, 5, 7, 8 } -> best input
		// { 9, 5, 1, 2, 0 } -> worst input
		
		/*
		Iteration 1:
			{ 9, 5, 1, 2, 0 } -> compare ( 9, 5 ) ( 5 < 9 )
			{ 5, 9, 1, 2, 0 } -> compare ( 9, 1 ) ( 1 < 9 )
			{ 5, 1, 9, 2, 0 }
			{ 5, 1, 2, 9, 0 }
			{ 5, 1, 2, 0, 9 }
		
		Iteration 2:
			{ 5, 1, 2, 0, 9 }
			
			
			
			{ 1, 2, 0, 5, 9 }
		*/
		
		int [] Numbers = { 1, 5, 9, 2, 0, 6 };
		
		aBubleSort ( Numbers );
		
		for ( int i = 0; i < Numbers.length; i++ ) {
			System.out.print( Numbers[i] + " " );
		}
		

	}

}
