
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
		System.out.println ( "Class : " + this.getClass().getName() );
		System.out.println ( "Type : "  + this.getClass().getName() );
		System.out.println ( "Total Area : " + this.getArea() * (double)this.numUnits );
		System.out.println ( "Units : " + this.getNumUnits() );
		System.out.println ( "Beds : " + this.getNumBeds() );
		System.out.println ( "Bath : " + this.getNumBaths() );
		System.out.println ( "" );
	}
	
	
	
}
