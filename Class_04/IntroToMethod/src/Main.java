
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		System.out.print( "Please Enter a Number : ");
		int InputNum = scanner.nextInt ();
		
		int start = 1, factorial = 1;
		while ( start <= InputNum ) {
			factorial = factorial * start;
			start++;
		}
		
		System.out.print( "Factorial is : " + factorial );
		
		/*
		          st = 1, fac = 1
		st = 1 <= 5    fac = 1 * 1 = 1, st = 2
		st = 2 <= 5    fac = 1 * 2 = 2, st = 3
		st = 3 <= 5    fac = 2 * 3 = 6, st = 4
		st = 4 <= 5    fac = 6 * 4 = 12, st = 5
		st = 5 <= 5    fac = 12 * 5 = 120, st = 6
		st = 6 <= 5
		...
		st <= InputNum
		*/

	}

}
