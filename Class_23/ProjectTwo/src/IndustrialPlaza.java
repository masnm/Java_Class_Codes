
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
		System.out.println ( "Class : IndustrialPlaza" );
		System.out.println ( "Building Type : IndustrialPlaza" );
		System.out.println ( "Total Area : " + 
								this.getArea() * (double)this.numUnits );
		System.out.println ( "Num units : " + this.getNumUnits () );
		System.out.println ( "Usage : " + this.getUsage() );
		System.out.println ( "Percent Storage : " + this.getPercentStorage() );
		System.out.println ( "Rooms : " + this.getRooms() );
		System.out.println ( "" );
	}
	
}
