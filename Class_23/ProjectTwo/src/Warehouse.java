
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
		String s = "Building Type : " + this.getType() + "\n"
				+ "Unit Area : " + this.getArea() + " Square feet on " + this.getNumFloors() + " floor(s)\n"
				+ "Number of Rooms : " + this.getRooms() + " Rooms with storage accounting for " + this.getPercentStorage() * 100.0 + " percent space";
		System.out.println ( s );
		System.out.println ( "" );
	}
	
	@Override
	public String toString () {
		String s = "Type of building : " + this.getType() + "\n"
				+ "Unit length : " + this.getLength() + "\n"
				+ "Unit width : " + this.getWidth() + "\n"
				+ "Number of floors : " + this.getNumFloors() + "\n"
				+ "Area of this unit : " + this.getArea() + "\n"
				+ "Number of rooms in this unit : " + this.getRooms() + "\n"
				+ "Storage space in this unit : " + this.getPercentStorage() * 100.0 + "\n";
		return s;
	}

}
