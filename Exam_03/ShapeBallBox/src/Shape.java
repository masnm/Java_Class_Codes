
public abstract class Shape {
	private String type;
	private String color;
	
	public Shape ( String type ) {
		this.type = type;
		this.color = "Silver";
	}
	
	public Shape ( String type, String color ) {
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double calculateArea ();
	
	public String toString () {
		return "This object’s shape is a " + this.type +
				", it’s color is " + this.color + " , and…";
	}
	
}
