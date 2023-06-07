
import java.util.Scanner;

public class SumArrayUpdate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		System.out.print ( "Enter row and column number : " );
		int row = scanner.nextInt ();
		int col = scanner.nextInt();
		
		int [][] FirstArray = new int[row][col], SecondArray = new int[row][col];
		
		// filling the FirstArray with random number from 2 to 6
		for ( int i = 0; i < FirstArray.length; i++ ) {
			for ( int j = 0; j < FirstArray[i].length; j++ ) {
				FirstArray[i][j] = (int)(Math.random() * ( 6 - 2 ) + 2 + 1 );
			}
		}
		
		// filling the secondArray with random number from 5 to 9
		for ( int i = 0; i < SecondArray.length; i++ ) {
			for ( int j = 0; j < SecondArray[i].length; j++ ) {
				SecondArray[i][j] = (int)(Math.random() * ( 9 - 5 ) + 5 + 1 );
			}
		}
		
		int [][] SumArray = new int[row][col];
		// adding the two matrix / 2D array and saving them into SumArray
		for ( int i = 0; i < SumArray.length; i++ ) {
			for ( int j = 0; j < SumArray[i].length; j++ ) {
				SumArray[i][j] = FirstArray[i][j] + SecondArray[i][j];
			}
		}
		
		// Print the Sum Array
		for ( int i = 0; i < SumArray.length; i++ ) {
			for ( int j = 0; j < SumArray[i].length; j++ ) {
				System.out.print( SumArray[i][j] + " " );
			}
			System.out.println ( "" );
		}
		

	}

}
