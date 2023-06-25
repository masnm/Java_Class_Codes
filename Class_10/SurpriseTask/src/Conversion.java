
public class Conversion {
	/*
	[] [] [] [] [] [] [] [] []
	0  1  2  . . .  |ArrayIndex 
	                |
	             | 
	*/
	public static <T> void print ( T something ) {
		System.out.print ( something );
	}
	
	public static void toBinaryRecursive ( int number ) {
		print ( "Called with : " + number + " \n" );
		// base case
		if ( number == 0 ) return;
		// recursion
		else {
			int base = 2;
			int ans = number / base;
			int remainder = number % base;
			
			toBinaryRecursive ( ans );
			
			print ( "Rem : " + remainder + " \n" );
			
		}
	}
	
	public static void toBinary ( int number ) {
		int [] digits = new int [100];
		int ArrayIndex = 0;
		
		int base = 2;
		while ( number != 0 ) {
			int ans = number / base;
			int remainder = number % base;
			
			digits[ArrayIndex] = remainder;
			ArrayIndex++;
			
			number = ans;
		}
		for ( int i = ArrayIndex - 1; i > -1 ; i-- ) {
			print ( digits[i] );
		}
	}

	public static void main(String[] args) {
		
		int number = 4;
		
		for ( int i = 31; i > -1 ; --i ) {
			if ( (number & ( 1 << i )) == 0 ) {
				print ( 0 );
			} else {
				print ( 1 );
			}
		}
		//toBinary ( number );
		//toBinaryRecursive ( number );

	}
}
