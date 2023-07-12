
public class CruiseShip {
	
	private String cruiseLine;
	private String name;
	private int capacity;
	
	public CruiseShip () {
		this.cruiseLine = "Carnival";
		this.name = "Miracle";
		this.capacity = 2200;
	}
	
	public CruiseShip ( String cruiseLine, String name ) {
		this.cruiseLine = cruiseLine;
		this.name = name;
		this.capacity = defaultCapacity();
	}
	
	public CruiseShip ( String cruiseLine, String name, int capacity ) {
		this.cruiseLine = cruiseLine;
		this.name = name;
		this.capacity = capacity;
	}
	
	private int defaultCapacity () {
		double min = 900.0, max = 2800.0;
		return (int)((Math.random() * ( max - min + 1 ) ) + min);
	}

	public String getCruiseLine() {
		return this.cruiseLine;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCapacity() {
		return this.capacity;
	}

	public void setCruiseLine(String cruiseLine) {
		this.cruiseLine = cruiseLine;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
