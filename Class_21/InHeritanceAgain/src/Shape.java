
public abstract class Shape {
	
	protected String color;
	
	protected Shape ( String color ) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString () {
		return  "Class: Shape\n"
				+ "Color: " + this.color;
	}
	
	public abstract void saveInfo ();

}
