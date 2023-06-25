
public class Main {
	
	public static <T> void print ( T some ) {
		System.out.println ( some );
	}

	public static void main(String[] args) {
		
		MyNumber mn = new MyNumber ( 12 );

		print ( "Factorial " + mn.getFactorial () );
		// print ( "SeriesSum " + mn.getSeriesSum () );
		print ( "In Binary " + mn.getInBinaryRecursive() );
		
		
		System.out.println ( mn );
	}

}
