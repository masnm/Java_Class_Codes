
public class InsertionSort {
	
	/*
	 * Insertion Sort :
	 * initial : { | 0, 3, 5, 7, 2, 1, 9 }
	 * 
	 * middle step: { 0, 3, 5, 7 | 2, 4, 1, 9 }
	 *              { 0, 3, 5, 7, 2 | 4, 1, 9 }
	 *              { 0, 3, 5, 2, 7 | 4, 1, 9 }
	 *              { 0, 3, 2, 5, 7 | 4, 1, 9 }
	 *              { 0, 2, 3, 5, 7 | 4, 1, 9 }
	 *              
	 * finally : { 0, 1, 2, 3, 4, 5, 7, 9 | }
	 * 
	 *        { 4 | 0 } 
	 *        { 4, 0 | }
	 *        { 0, 4 | }
	 *          
	 *        
	 *        
	 */
	
	public static <T> void print ( T something ) {
		System.out.print( something );
	}
	
	public static void InsertionSort ( int [] Array ) {
		for ( int i = 0; i < Array.length; i++ ) {
			// here i represents the index not the value of the array element
			int insIndex = i;
			while ( insIndex > 0 && Array[insIndex] < Array[insIndex - 1] ) {
				int temp = Array[insIndex];
				Array[insIndex] = Array[insIndex - 1];
				Array[insIndex - 1] = temp;
				insIndex--;
			}
			// for ( int insIndex = i; insIndex > 0 && Array[insIndex] < Array[insIndex - 1]; insIndex-- ) {
			//     int temp = Array[insIndex];
			//     Array[insIndex] = Array[insIndex - 1];
			//     Array[insIndex - 1] = temp;
			// }
		}
	}

	public static void main(String[] args) {
		
		int [] Arr = { 6, 1, 0, 4, 3, 9, 8 };
		InsertionSort ( Arr );
		for ( int i = 0; i < Arr.length; i++ ) {
			print ( Arr[i] + " " );
		}
	}

}
