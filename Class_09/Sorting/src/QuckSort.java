
public class QuckSort {
	
	/*
	 * { 4, 1, 5, 8, 2, 3, 9, 0 }
	 *   ^                    ^
	 *   |                      |
	 *      |                 |
	 *      1 < 4 so move
	 *         |
	 *         5 >= 4 so no move
	 *                      
	 *                        |
	 *                        0 < 4 so no move
	 *  
	 * { 4, 1, 5, 8, 2, 3, 9, 0 }
	 *   ^     |              |
	 *             swapping 0 & 5
	 * { 4, 1, 0, 8, 2, 3, 9, 5 }
	 *   ^     |              |
	 *         0<4 so move
	 *            |
	 *            
	 *                        |
	 *                        5 > 4 so move
	 *                      |
	 *                      9 > 4 so move
	 *                   |
	 *                   3 < 4 so no move
	 * 
	 * { 4, 1, 0, 8, 2, 3, 9, 5 }
	 *   ^        |     |
	 *          swap 8 & 3
	 * 
	 * { 4, 1, 0, 3, 2, 8, 9, 5 }
	 *   ^        |     |
	 *            3 < 4 so move
	 *               |
	 *               2 < 4 so move
	 *                  |
	 *                  8 > 4 so no move
	 *                  
	 *                  |
	 *                  8 > 4 so move
	 *               | 2 < 4 so no move
	 * 
	 *  as right is now on the left side of left so stop swapping and swap right
	 *  with the pivot
	 *  
	 * { 4, 1, 0, 3, 2, 8, 9, 5 }
	 *   ^           |  |
	 *          (right) (left)
	 *          
	 * { 2, 1, 0, 3, 4, 8, 9, 5 }
	 *  <--------->     <------>
	 *  
	 * { 2, 1, 0, 3 }
	 *   ^     |  |
	 * { 0, 1, 2, 3 }
	 *  <---->   <->
	 *  
	 *  { 0, 1 }
	 *    ^  ||
	 * 
	 *  { 0, 1 }
	 *    ^
	 *    |     |
	 *       |
	 *       |
	 *    |
	 *   {pivot,right}, left
	 *  
	 *  { 4, 0, 0, 0, 0, 0 }
	 *    ^  |           |
	 *          |
	 *             |
	 *                 |
	 *                    |
	 *                        |
	 */
	
	public static void printAr ( int[] Ar ) {
		for ( int i = 0; i < Ar.length; i++ ) {
			System.out.print( Ar[i] + " " );
		}
		System.out.println ();
	}
	
	public static void quickSort ( int[] Array, int start, int end ) {
		if ( start >= end ) return;
		
		int pivot = start, left = start, right = end + 1;
		while ( left < right ) {
			// moving left towards right
			do {
				left++;
			} while ( left < end && Array[left] < Array[pivot] );
			// moving right towards left
			do {
				right--;
			} while ( right > start && Array[right] > Array[pivot] );
			// swapping left positions value with right positions value
			if ( left < right ) {
			    int temp = Array[right];
			    Array[right] = Array[left];
		        Array[left] = temp;
			}
		}
		int temp = Array[pivot];
		Array[pivot] = Array[right];
		Array[right] = temp;
		
		quickSort ( Array, start, right - 1); // call for left part
		quickSort ( Array, right + 1, end); // call for right part
	}

	public static void main(String[] args) {
		
		int[] Ar = { 4, 1, 5, 8, 2, 3, 9, 0 };
		quickSort ( Ar, 0, Ar.length - 1 );
		printAr ( Ar );

	}

}
