
public class BookCruise {
	
	private static void printShip ( CruiseShip ship, String name ) {
		System.out.println( name + " Line: " + ship.getCruiseLine() );
		System.out.println( name + " Name : " + ship.getName() );
		System.out.println( name + " Capacity : " + ship.getCapacity() );
		System.out.println ();
	}

	public static void main(String[] args) {
		
		CruiseShip cruiseOne = new CruiseShip ();
		CruiseShip cruiseTwo = new CruiseShip ( "Norwegian Dawn", "Norwegian Dawn" );
		CruiseShip cruiseThree = new CruiseShip ( "Royal Carribean", "Navigator of the Seas", 2750 );

		printShip ( cruiseTwo, "cruiseTwo" );
		
		cruiseTwo.setCruiseLine ( "Costa" );
		cruiseTwo.setName( "Jewel" );
		cruiseTwo.setCapacity( 2565 );
		
		printShip ( cruiseTwo, "cruiseTwo" );
		
	}

}
