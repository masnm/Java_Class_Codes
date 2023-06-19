
import java.util.Scanner;

public class MethodIntro {
	
	// inputs: Type name
	// inputs: Type name, Type name, Type name....
	
	// <access modifier> <return type> <method name> ( <inputs> ) {
	//      method body
	//      return <object>
	// }
	
	public static void print ( String message ) {
		System.out.print ( message );
	}

	public static char getNextChar ( Scanner sc ) {
		String operator = sc.next();
		char op = operator.charAt ( 0 );
		return op;
	}
	
	public static int add ( int numberOne, int numberTwo ) {
		int result = 0;
		result = numberOne + numberTwo;
		return result;
	}
	
	public static int sub ( int numberOne, int numberTwo ) {
		int result = 0;
		result = numberOne - numberTwo;
		return result;
	}
	
	public static int calculate ( int numOne, int numTwo, char op ) {
		int result = 0;
		switch ( op ) {
		case '+':
			result = add ( numOne, numTwo );
			break;
		case '-':
			result = sub ( numOne, numTwo );
			break;
		case '*':
			result = numOne * numTwo;
			break;
		case '/':
			result = numOne / numTwo;
			break;
		default:
			print ( "Invalid Input." );
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		
		// <number> <number> <operator>
		// 12 15 +  output 27
		
		print ( "Please Enter two numbers and an operator : " );
		int numberOne, numberTwo;
		char operator;
		
		// <Class Name> <object name> = new <Class Name>
		Scanner sc = new Scanner ( System.in );
		
		numberOne = sc.nextInt ();
		numberTwo = sc.nextInt ();
		operator = getNextChar ( sc );
		
		int ans = calculate ( numberOne, numberTwo, operator );
		
		System.out.print ( "Ans is : " + ans );
		
		/*
		System.out.println ( numberOne );
		System.out.println ( numberTwo );
		System.out.println ( operator );
		*/

	}
	/*
	 * String name = "ABCD";
	 * char[4] arr = [A] [B] [C] [D]
	 * arr[0]
	 * 
	 * String operator = "+"
	 * char[1] arr = [+]
	 * arr[0]
	 * operator.charAt(0)
	 */

}
