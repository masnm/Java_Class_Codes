
public class MergeSort {
	
	/*
	 *                  { 4, 1, 5, 8, 2, 3, 9, 0 }
	 *                  
	 *       { 4, 1, 5, 8 }                    { 2, 3, 9, 0 }
	 *         0  1  2  3                        4  5  6  7
	 *    { 4, 1 }        { 5, 8 }         { 2, 3 }     { 9, 0 }
	 *  
	 *  { 4 } { 1 }   { 5 }    { 8 }     { 2 } { 3 }    { 9 }  { 0 }
	 *    |        |       |     |           |   |        |         |
	 *  { 1, 4 }       { 5, 8 }             { 2, 3 }      { 0, 9 }
	 *          |        |                          |          |
	 *        { 1, 4, 5, 8 }                     { 0, 2, 3, 9 }
	 *                                                      |
	 */
	/*
	start = 4, end = 7
    count = 7 - 3 + 1 = 4
    middle = 4 / 2 = 2
    */
	
	public static void printAr ( int[] Ar ) {
		for ( int i = 0; i < Ar.length; i++ ) {
			System.out.print( Ar[i] + " " );
		}
		System.out.println ();
	}
	
	public static void mergeSort ( int [] Array, int start, int end ) {
		int count = end - start + 1;
		if ( count == 1 ) return;
		int middle = count / 2;
		mergeSort ( Array, start, start + middle - 1 ); // first half
		mergeSort ( Array, start + middle, end ); // second half
		// now merging those two parts
		int [] newlist = new int [count];
		int nlistindex = 0;
		int firstIndex = start, secondIndex = start + middle;
		while ( firstIndex <= start + middle - 1 && secondIndex <= end ) {
			if ( Array[firstIndex] < Array[secondIndex] ) {
				// add first index value to new list
				newlist[nlistindex] = Array[firstIndex];
				firstIndex++;
				nlistindex++;
			} else {
				// add second index value to new list
				newlist[nlistindex] = Array[secondIndex];
				secondIndex++;
				nlistindex++;
			}
		}
		// now adding next few elements manually
		while ( firstIndex <= start + middle - 1 ) {
			newlist[nlistindex] = Array[firstIndex];
			nlistindex++;
			firstIndex++;
		}
		while ( secondIndex <= end ) {
			newlist[nlistindex] = Array[secondIndex];
			nlistindex++;
			secondIndex++;
		}
		for ( int i = 0; i < newlist.length; i++ ) {
			Array[i + start] = newlist[i];
		}
	}

	public static void main(String[] args) {
		
		int[] Ar = { 4, 1, 5, 8, 2, 3, 9, 0 };
		mergeSort ( Ar, 0, Ar.length - 1 );
		printAr ( Ar );

	}

}
