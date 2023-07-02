package HomeWork;

public class Car {
	private String color, make, model;
	private int currentSpeed;
	private boolean isRunning;
	
	public void showInfo () {
		System.out.println ( "Color = " + this.color );
		System.out.println ( "Make = " + this.make );
		System.out.println ( "Model = " + this.model );
		System.out.println ( "CurrentSpeed = " + this.currentSpeed );
		System.out.println ( "isRunning = " + this.isRunning );
		System.out.println();
	}
	
	public Car () {
		this.color = "Red";
		this.make = "Harley";
		this.model = "ABC";
		this.currentSpeed = 0;
		this.isRunning = false;
	}
	
	public void startCar () {
		this.isRunning = true;
	}
	
	public void stopCar () {
		this.isRunning = false;
		this.currentSpeed = 0;
	}
	
	public void changeSpeed ( int speed ) {
		if ( this.isRunning ) {
			this.currentSpeed = speed;
		}
	}
}


