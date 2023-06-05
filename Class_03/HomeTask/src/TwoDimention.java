
import java.util.Scanner;

public class TwoDimention {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		/*
		// for ( int i = 0; i < Array.length(); i++ ) Array[i]
		int [] Array = new int[8];
		for ( int i = 0; i < Array.length; i++ ) {
			Array[i] = (int)(Math.random() * ( 12 - 6 ) + 6 + 1 );
		}
		for ( int i = 0; i < Array.length; i++ ) {
			System.out.print ( Array[i] + " " );
		}
		*/
		// Array[3] = 10
		// 0  1  2  3    4
		// [] [] [] [10] []
		
		/*
		
		int [][] TwoDimantionArray = new int[4][3];
		for ( int row = 0; row < TwoDimantionArray.length ; row++ ) {
			for ( int col = 0; col < TwoDimantionArray[row].length; col++ ) {
				TwoDimantionArray[row][col] = (int)(Math.random() * 11 );
			}
		}
		
		for ( int i = 0; i < TwoDimantionArray.length; i++ ) {
			for ( int j = 0; j < TwoDimantionArray[i].length ; j++ ) {
				System.out.print( TwoDimantionArray[i][j] + " " );
			}
			System.out.println ( "" );
		}
		
		*/
		//
		//
		// [ [0,0]  [0,1]  [0,2] ]
		// [ [1,0]  [1,1]  [1,2] ]
		// [ [2,0]  [2,1]  [2,2] ]
		// [ [3,0]  [3,1]  [3,2] ]
		// TwoDimantionArray[1][0] = -1;
		
		/*
		// Math.random() -> 0.0000..00001  <->  0.999999...99999
		for ( int i = 0; i < 10; i++ ) {
			// System.out.println ( (long)(Math.random() * 21) );
			// System.out.println ( (long)(Math.random() * ( Max_Value - Min_Value ) + Min_Value + 1 ));
			System.out.println ( (long)(Math.random() * ( 11 - 3 ) + 3 + 1 ));
		}
		*/
		
		/*
		 * [ [] [] ]
		 * [ [] ]
		 * [ [] [] [] [] ]
		 */
		int [][] RagArray = new int[3][];
		RagArray[0] = new int[2];
		RagArray[1] = new int[1];
		RagArray[2] = new int[4];
		
		for ( int row = 0; row < RagArray.length ; row++ ) {
			for ( int col = 0; col < RagArray[row].length; col++ ) {
				RagArray[row][col] = (int)(Math.random() * 11 );
			}
		}
		
		for ( int i = 0; i < RagArray.length; i++ ) {
			for ( int j = 0; j < RagArray[i].length ; j++ ) {
				System.out.print( RagArray[i][j] + " " );
			}
			System.out.println ( "" );
		}
		

	}

}
