
public class Warehouse extends Building {
	
	private double percentStorage;
	private int numRooms;
	
	public Warehouse ( double length, double width, int numFloors, double pStorage, int rooms ) {
		super ( "WareHouse", length, width, numFloors );
		this.percentStorage = pStorage;
		this.numRooms = rooms;
	}
	
	protected Warehouse ( String type, double length, double width, int numFloors, double pStorage, int rooms ) {
		super ( type, length, width, numFloors );
		this.percentStorage = pStorage;
		this.numRooms = rooms;
	}

	public double getPercentStorage() {
		return percentStorage;
	}

	public void setPercentStorage(double percentStorage) {
		this.percentStorage = percentStorage;
	}

	// for unknown reason the doc wanter this name to be this.
	public int getRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	@Override
	public void getBuildingDetails() {
		System.out.println ( "Class : Wearhouse" );
		System.out.println ( "Building Type : Wearhouse" );
		System.out.println ( "Percent Storage : " + this.getPercentStorage() );
		System.out.println ( "Rooms : " + this.getRooms() );
		System.out.println ( "" );
	}
	
}
