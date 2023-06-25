
public class MyNumber {
	// storages/ memory/ variables
	private int number;
	// constructor
	public MyNumber () {
	}
	
	public MyNumber ( int num ) {
		this.number = num;
	}
	// getter/setters
	public int getNumber () {
		return this.number;
	}
	public void setNumber ( int number ) {
		this.number = number;
	}
	// whatever method we need to provide
	public int getFactorial () {
		int fact = 1;
		for ( int i = 1; i <= this.number; i++ ) {
			fact *= i;
		}
		return fact;
	}
	public int getSeriesSum () {
		
	}
	private int toBinaryRecursive ( int number ) {
		// base case
		if ( number == 0 ) return 0;
		// recursion
		else {
			int base = 2;
			int ans = number / base;
			int remainder = number % base;
			int got = toBinaryRecursive ( ans );
			return ( got * 10 + remainder );
		}
	}
	public int getInBinaryRecursive () {
		return toBinaryRecursive ( this.number );
	}
	public int getInBinary () {
		
	}
	public int getInOctalRecursive () {
		
	}
	public int getInOctal () {
		
	}
	public String getInHexadecimal () {
		
	}
	// toString()
	public String toString () {
		return "My Number is : " + this.number;
	}
}