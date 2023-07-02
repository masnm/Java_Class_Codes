
import java.util.Scanner;

public class Exceptions {
	
	public static int calculate ( int l, int r, char op ) throws Exception {
		if ( op == '+' ) {
			return l + r;
		} else if ( op == '-' ) {
			return l - r;
		} else if ( op == '*' ) {
			return l * r;
		} else if ( op == '/' ) {
			return l / r;
		} else {
			throw new Exception("Unknown operation");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		
		try {
			int ans = calculate ( a, b, c );
			System.out.printf( " = %d\n", ans );
		} catch ( ArithmeticException e ) {
			System.out.println ( "First : " + e );
		} catch ( Exception e ) {
			System.out.println ( "Second : " + e );
		}

	}

}
