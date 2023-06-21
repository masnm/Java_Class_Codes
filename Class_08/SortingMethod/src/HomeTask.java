
import java.util.Scanner;

public class HomeTask {
	
	public static void print ( String something ) {
		System.out.print( something );
	}
	
	public static void BubbleSort ( int[] Arr ) {
		for ( int i = 0; i < Arr.length; i++ ) {
			for ( int j = 0; j < Arr.length - 1 - i; j++ ) {
				if ( Arr[j + 1] < Arr[j] ) {
					int temp = Arr[j + 1];
					Arr[j + 1] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
	}
	
	public static void BubbleSort ( double[] Arr ) {
		for ( int i = 0; i < Arr.length; i++ ) {
			for ( int j = 0; j < Arr.length - 1 - i; j++ ) {
				if ( Arr[j + 1] < Arr[j] ) {
					double temp = Arr[j + 1];
					Arr[j + 1] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		 // Ask the user which data type variable he want to sort { int, double }
		System.out.print( "Which data type you want to sort : " );
		String type = scanner.nextLine ();
		
		if ( type.equals( "int" ) ) {
			
			print ( "Enter how many Elements to sort : " );
			int elements = scanner.nextInt ();
			int [] Array = new int[ elements ];
			
			print ( "Enter " + elements + " Integers : " );
			// for ( int i = 0; i < elements; i++ ) {
			for ( int i = 0; i < Array.length; i++ ) {
				Array[i] = scanner.nextInt ();
			}
			
			BubbleSort ( Array );
			
			print ( "After Sorting : " );
			for ( int i = 0; i < Array.length; i++ ) {
				System.out.print( Array[i] + " " );
			}
			
		} else if ( type.equals( "double" ) ) {
			
			print ( "Enter how many Elements to sort : " );
			int elements = scanner.nextInt ();
			double [] Array = new double[ elements ];
			
			print ( "Enter " + elements + " Doubles : " );
			// for ( int i = 0; i < elements; i++ ) {
			for ( int i = 0; i < Array.length; i++ ) {
				Array[i] = scanner.nextDouble ();
			}
			
			BubbleSort ( Array );
			
			print ( "After Sorting : " );
			for ( int i = 0; i < Array.length; i++ ) {
				System.out.print( Array[i] + " " );
			}
			
		} else {
			System.out.println ( "Unknown data type!" );
		}
		 // then take the array input
		 // do boubble sort with method overloading
		 // show the result

	}

}
