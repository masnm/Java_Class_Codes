package HomeWord;

public class Car {
	private String color;
	private String make;
	private String model;
	private int currentSpeed;
	private Boolean isRunning;
	
	public Car () {
		this.color = "Magenta";
		this.make = "Hondai";
		this.model = "Corolla";
		this.currentSpeed = 0;
		this.isRunning = false;
	}
	
	public int getCurrentSpeed () {
		return this.currentSpeed;
	}
	
	public Boolean getIsRunning () {
		return this.isRunning;
	}
	
	public void setIsRunning ( Boolean isRunning ) {
		this.isRunning = isRunning;
	}
	
	public void startCar () {
		this.isRunning = true;
	}
	
	public void stopCar () {
		this.isRunning = false;
		this.currentSpeed = 0;
	}
	
	public void changeSpeed ( int speed ) {
		if ( this.isRunning == true ) {
			this.currentSpeed = speed;
		}
	}
	
}
