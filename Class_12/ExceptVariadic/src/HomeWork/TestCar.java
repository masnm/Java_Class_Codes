package HomeWork;

public class TestCar {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.showInfo();
		
		car.startCar ();
		car.showInfo();
		
		car.changeSpeed (12);
		car.showInfo();
		
		car.changeSpeed (35);
		car.showInfo();
		
		car.stopCar ();
		car.showInfo();

	}

}
