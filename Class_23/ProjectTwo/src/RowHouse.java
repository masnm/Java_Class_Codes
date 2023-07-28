
public class RowHouse extends Building {
	
	private int numUnits;
	private int numBeds;
	private int numBaths;
	
	public RowHouse ( double length, double width, int floors,
			int unit, int beds, int baths ) {
		
		super ( "RowHouse", length, width, floors );
		
		this.numUnits = unit;
		this.numBeds = beds;
		this.numBaths = baths;
	}
	
	protected RowHouse ( String type, double length, double width, int floors,
			int unit, int beds, int baths ) {
		
		super ( type, length, width, floors );
		
		this.numUnits = unit;
		this.numBeds = beds;
		this.numBaths = baths;
	}

	public int getNumUnits() {
		return numUnits;
	}

	public void setNumUnits(int numUnits) {
		this.numUnits = numUnits;
	}

	public int getNumBeds() {
		return numBeds;
	}

	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	public int getNumBaths() {
		return numBaths;
	}

	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}

	@Override
	public void getBuildingDetails() {
		String s = "Building Type : " + this.getType() + " which has " + this.getNumUnits() + " living units on one level.\n"
				+ "Unit Area : " + this.getArea() + " Square feet on " + this.getNumFloors() + " floor(s)\n"
				+ "Total area of all units on one floor is " + this.getArea() * (double)this.getNumUnits() + " square feet.\n"
				+ "Number of bedrooms: " + this.getNumBeds() + ". Number of bathrooms: " + this.getNumBaths() + ".";
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
				+ "Number of units: " + this.getNumUnits() + "\n";
		return s;
	}
	
}
