
public class CircleTwo {
	
	private double radius;
	private String circleColor;
	
	public CircleTwo () {
		this.radius = 0.0;
		this.circleColor = "Unknown";
	}
	
	public CircleTwo ( double radius, String circleColor ) {
		this.radius = radius;
		this.circleColor = circleColor;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getCircleColor() {
		return circleColor;
	}
	public void setCircleColor(String circleColor) {
		this.circleColor = circleColor;
	}

}
