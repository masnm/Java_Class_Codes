
public abstract class Building {
	
	// class variables
	
	// instance variables
	private String type;
	private double length;
	private double width;
	private int numFloors;
	
	// constructors
	protected Building ( String type, double length, double width, int numFloors ) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.numFloors = numFloors;
	}

	// getter setters
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public String getType() {
		return type;
	}
	
	// helper / worker methods
	
	public double getArea () {
		double fullArea = this.length * this.width * (double)this.numFloors;
		double ans = ((double)Math.round ( fullArea * 10.0 )) / 10.0;
		return ans;
		
		/*
		 * 43.958; 44
		 * 23.389 --> 23.4  233.89   234.0  23.4
		 * 23.309 --> 23.3
		 * 3.0 / 2.0 = 1.5
		 * 3 / 2 = 1
		 * int x = 5;
		 * double d = (double)x;
		*/
	}
	
	public abstract void getBuildingDetails ();

}
