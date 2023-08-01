
public class Box extends Shape {
	
	private double length;
	private double width;
	private double height;
	
	public Box () {
		super ( "Blue" );
		this.length = 5.5;
		this.width = 3.5;
		this.height = 7.8;
	}
	
	public Box ( double length, double width, double height, String color ) {
		super ( color );
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calculateArea () {
		return (2.0 * this.length * this.width)
				+ (2.0 * this.length * this.height)
				+ (2.0 * this.width * this.height);
	}
	
	public String toString () {
		return super.toString() + "the area of this is type "
		+ this.calculateArea() + " Object is " + this.getClass();
	}

}
