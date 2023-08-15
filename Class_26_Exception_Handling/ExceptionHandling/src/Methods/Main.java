package Methods;

public class Main {

	public static void main ( String[] args ) {
		
		double d = Math.PI;
		
		int number = Adder.number;
		
		Adder ad = new Adder ();
		number = ad.secondNumber;
		
		// System.out.println  ( Adder.addInt( 12, 13 ) );
		
		// System.out.println  ( ad.addDbl( 12.2, 13.1 ) );
		
		int value = 100;
		// String name = new String ( "ABCD" );
		Number num = new Number ( 25 );
		
		ad.getInt( value );
		// ad.getString( name );
		ad.getNum( num );
		
		System.out.println ( value );
		// System.out.println ( name );
		System.out.println ( num.num );

	}
	
	/*
	 *        value     x                                num        n
	 *  [] [] [100] [] [25] [] [] [ num = 125 ] [] [] [] [100005]  [100005]
	 *                              100005-6
	 * 
	 */

}
