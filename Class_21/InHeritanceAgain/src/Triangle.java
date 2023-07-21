
public class Triangle extends Shape {
	
	// instance variables
	
	public Triangle ( String color ) {
		super ( color );
	}
	
	public String toString () {
		return  "Class: Triagle\n"
				+ "Parent: \n"
				+ "{\n" + super.toString() + "\n}\n"
				+ "Color: " + this.color;
	}

	@Override
	public void saveInfo() {
		
		
	}
	
}
