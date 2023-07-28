
public class IndustrialPlaza extends Warehouse {
	
	private int numUnits;
	private String usage;
	
	public IndustrialPlaza ( double length, double width, int numFloors,
			double pStorage, int rooms, int units, String usage ) {
		
		super ( "IndustrialPlaza", length, width, numFloors, pStorage, rooms );
		
		this.numUnits = units;
		this.usage = usage;
	}

	public int getNumUnits() {
		return numUnits;
	}

	public void setNumUnits(int numUnits) {
		this.numUnits = numUnits;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	@Override
	public void getBuildingDetails () {
		String s = "Building Type : " + this.getType() + "\n"
				+ "Unit Area : " + this.getArea() + " Square feet on " + this.getNumFloors() + " floor(s)\n"
				+ "Number of Rooms : " + this.getRooms() + " Rooms with storage accounting for " + this.getPercentStorage() * 100.0 + " percent space\n"
				+ "We have " + this.getNumUnits() + " units with a combined total area of " + this.getArea() * (double)this.getNumUnits() + " square feet.\n"
				+ "This Industrial Plaza is designated for " + this.getUsage() + " only.";
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
				+ "Number of rooms in each unit : " + this.getRooms() + "\n"
				+ "Storage space in this unit : " + this.getPercentStorage() * 100.0 + "\n"
				+ "Number of units in this industrial plaza : " + this.getNumUnits() + "\n"
				+ "This industrila plaza is designed for " + this.getUsage() + " usage\n";
		return s;
	}
	
}
