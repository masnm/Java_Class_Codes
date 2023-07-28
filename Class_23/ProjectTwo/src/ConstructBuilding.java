
public class ConstructBuilding {
	
	public static void printBuildingArray ( Building [] buildingArray ) {
		for ( int i = 0; i < buildingArray.length; ++i ) {
			// buildingArray[i].getBuildingDetails();
			Building b = buildingArray[i];
			b.getBuildingDetails();
		}
	}
	
	public static void main ( String [] args ) {
		
		System.out.println ( "\t\t\tMy Building Empire" );
		System.out.println ( "\t\t\t******************\n\n" );
		
		Building [] buildingArray = new Building [ 4 ];
		
		buildingArray[0] = 
				new Warehouse ( 120, 80, 5, .30, 3 );
		
		buildingArray[1] =
				new IndustrialPlaza ( 220, 130, 8, .40, 7, 25, "Shopping Mall" );
		
		buildingArray[2] =
				new RowHouse ( 210, 110, 6, 21, 3, 2 );
		
		buildingArray[3] =
				new Apartment ( 230, 170, 10, 37, 3, 1, 9, 10 );
		
		printBuildingArray ( buildingArray );
		
		int index = -1;
		for ( int i = 0; i < buildingArray.length; ++i ) {
			if ( buildingArray[i].getClass().getName().equals ( "Apartment" ) )
				index = i;
		}
		if ( index != -1 ) {
			System.out.println ( "Mutating the Apartment object: \n" );
			changeApartment ( (Apartment)buildingArray[index] );
			Building b = buildingArray[index];
			b.getBuildingDetails();
		} else {
			System.out.println ( "No Apartment object found in the Array.");
		}
		
		// printBuildingArray ( buildingArray );
		for ( Building item : buildingArray ) {
			System.out.println ( item );
		}
		
	}
	
	public static int getRandom ( int low, int high ) {
		double range = high - low;
		range = Math.random() * range;
		return (int)( range + low );
	}
	
	public static void changeApartment ( Apartment ap ) {
		ap.setLength( getRandom ( 190, 250 ) );
		ap.setWidth ( getRandom ( 120, 180 ) );
		ap.setNumBaths ( getRandom ( 2, 5 ) );
		ap.setNumBeds( getRandom ( 3, 6 ) );
		ap.setNumFloors ( getRandom ( 50, 70 ) );
		ap.setNumLevels( getRandom ( 8, 12 ));
		ap.setNumUnits( getRandom ( 40, 50 ) );
		ap.setParkingSpaces( getRandom ( 12, 18 ) );
	}
	
}
