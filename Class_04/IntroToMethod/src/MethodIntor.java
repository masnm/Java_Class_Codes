import java.util.Scanner;

public class MethodIntor {
	
	public static void FillArray ( int [][] InputArray ) {
		for ( int i = 0; i < InputArray.length; i++ ) {
			for ( int j = 0; j < InputArray[i].length; j++ ) {
				InputArray[i][j] = (int)(Math.random() * ( 6 - 2 ) + 2 + 1 );
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		
		System.out.print ( "Enter row and column number : " );
		int row = scanner.nextInt ();
		int col = scanner.nextInt();
		
		int [][] FirstArray = new int[row][col], SecondArray = new int[row][col];
		
		FillArray ( FirstArray );
		FillArray ( SecondArray );
		
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
