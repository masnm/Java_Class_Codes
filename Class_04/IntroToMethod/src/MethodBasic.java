
import java.util.Scanner;

public class MethodBasic {
	
	/*
	 * [access modifier] [return type] [name] ( [argument list] ) {
	 *     // some codes
	 *     // if any return
	 * }
	 */
	// public : Access Modifier Public means everyone can access
	// int : return type as we are returning an int variable so it's int
	// two arguments or inputs those are int's
	/*
	public static int AddNumbers ( int First = 12, int S = 4 ) {
		int Sum = First + S = 16;
		return Sum = 16;
	}
	*/
	
	public String Concatanate ( String a, String b, String c ) {
		String all = a + " " + b + " " + c;
		return all;
	}

	public static void main ( String[] args ) {
		
		Scanner scanner = new Scanner ( System.in );
//		
//		System.out.print( "Enter two numbers : " );
//		int FirstNum = scanner.nextInt (), SecondNum = scanner.nextInt ();
//		
//		int Summation = AddNumbers ( FirstNum, SecondNum );
//		
//		System.out.print( "Summation is : " + Summation );
//		
		System.out.print( "Enter three names : " );
		String FirstName = scanner.nextLine ();
		String SecondName = scanner.nextLine ();
		String ThirdName = scanner.nextLine ();
		
		String AllNames = Concatanate ( FirstName, SecondName, ThirdName );
		
		System.out.print( "All names together is : " + AllNames );

	}

}
