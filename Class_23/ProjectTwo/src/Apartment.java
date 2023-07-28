
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
		String s = "Building Type : " + this.getType() + " which has " + this.getNumUnits() + " living units on one level.\n"
				+ "Unit Area : " + this.getArea() + " Square feet on " + this.getNumFloors() + " floor(s)\n"
				+ "Total area of all units on one floor is " + this.getArea() * (double)this.getNumUnits() + " square feet.\n"
				+ "Number of bedrooms: " + this.getNumBeds() + ". Number of bathrooms: " + this.getNumBaths() + "."
				+ "This Apartment building has " + this.getNumLevels() + " levels for a total number of " + this.getNumUnits() + " units.\n"
				+ "This complex has " + this.getParkingSpaces() + " parking spaces available.";
		System.out.println ( s );
		System.out.println ( "" );
	}
	
	@Override
	public String toString () {
		String s = "Type of building : " + this.getType() + "\n"
				+ "Unit length : " + this.getLength() + "\n"
				+ "Unit width : " + this.getWidth() + "\n"
				+ "Number of floors in each unit : " + this.getNumFloors() + "\n"
				+ "Area of each unit : " + this.getArea() + "\n"
				+ "Number of bathrooms in each unit: " + this.getNumUnits() + "\n"
				+ "Number of bedrooms in each unit: " + this.getNumBeds() + "\n"
				+ "Number of units: " + this.getNumUnits() + "\n"
				+ "Number of levels in this apartment building : " + this.getNumLevels() + "\n"
				+ "Number of parking spaces available : " + this.getParkingSpaces() + "\n";
		return s;
	}

}
