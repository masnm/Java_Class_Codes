package HomeWord;

public class TestCar {
	
	public static <T> void print ( T some ) {
		System.out.print( some );
	}
	public static <T> void println ( T some ) {
		System.out.println( some );
	}

	public static void main(String[] args) {
		
		Car myCar = new Car ();
		println ( "Initially car running : " + myCar.getIsRunning() );
		println ( "Initially car speed : " + myCar.getCurrentSpeed() );
		println ( "" );
		
		myCar.startCar();
		
		myCar.changeSpeed( 102 );
		
		println ( "After car started : " + myCar.getIsRunning() );
		println ( "Arger car started : " + myCar.getCurrentSpeed() );
		println ("");
		
		myCar.stopCar();
		
		println ( "After car stopped : " + myCar.getIsRunning() );
		println ( "After car stopped : " + myCar.getCurrentSpeed() );
	}

}
