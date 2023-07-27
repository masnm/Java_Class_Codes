
public class Apartment extends RowHouse {
	
	private int numLevels;
	private int parkingSpaces;
	
	public Apartment ( double length, double width, int floors,
			int unit, int beds, int baths, int levels, int ps ) {
		
		super ( "Apartment", length, width, floors, unit, beds, baths );
		
		this.numLevels = levels;
		this.parkingSpaces = ps;
	}

	public int getNumLevels() {
		return numLevels;
	}

	public void setNumLevels(int numLevels) {
		this.numLevels = numLevels;
	}

	public int getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(int parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}
	
	@Override
	public void getBuildingDetails () {
		super.getBuildingDetails();
	}

}
