
/*
 * Author: Bidushi kabir
 * Class : HeavenlyObjectTest
 * Details : this is an public class and the entry point of
 *           this program which also has a lot of helper and
 *           cleaner methods to make the code clean and reusable
 */

public class HeavenlyObjectTest {
	
	// just a helper method so that to print something
	// i don't have to write the long line just print is enough
	private static <T> void print ( T arg ) {
		System.out.print ( arg );
	}
	
	// just a helper method so that to print something
	// i don't have to write the long line just println is enough
	private static <T> void println ( T arg ) {
		System.out.println ( arg );
	}
	
	// this method is also an helper method to print the informations
	// of an Planet object using the getter/assessor 
	private static void printPlanet ( Planet planet ) {
		println ( "Name: " + planet.getName() );
		println ( "Radius: " + planet.getRadius() );
		println ( "Life Supporting: " + planet.getSupportLife() );
	}
	
	// this method is also an helper method to print the informations
	// of an Asteroid object using the getter/assessor
	private static void printAsteroid ( Asteroid asteroid ) {
		println ( "Name: " + asteroid.getName() );
		println ( "Radius: " + asteroid.getRadius() );
		println ( "Speed: " + asteroid.getTravelSpeed() );
	}
	
	// this is an helper method which print the message and then depending what type of
	// object is this it calls the appropriate method so that all the proper assessor
	// can be used to print all the informations
	private static void printObjectUsingGetters ( String message, HeavenlyObject obj ) {
		println ( message );
		for ( int i = 0; i < message.length() + 1 ; i++ ) {
			print ( "*" );
		}
		println ( "" );
		if ( obj instanceof Planet ) {
			printPlanet ( (Planet)obj );
		} else {
			printAsteroid ( (Asteroid)obj );
		}
		println ( "" );
	}
	
	// this is also an helper method to print the parameter and surface
	// area of an object which is done via the polymorphic behavior;
	private static void printParameterSurfaceArea ( HeavenlyObject obj ) {
		println ( "The perimeter of the " + obj.getType()
				+ " " + obj.getName() + " is " + obj.findPerimeter() );
		println ( "The surface area is " + obj.findSurfaceArea() );
		println ( "" );
	}
	
	// this is a helper method to just call and print the toString of
	// an object and a new line this is added for the new line and
	// the cleanliness of the program
	private static void printObjectsUsingToString ( HeavenlyObject obj ) {
		println ( obj );
		println ( "" );
	}

	// this is the entry point of the program form where the executio starts
	public static void main(String[] args) {
		
		// creating planet object and holding it in it's parent class HeavenlyObject
		HeavenlyObject planetOne = new Planet (  2457.36, true );
		HeavenlyObject planetTwo = new Planet (  6589.45, "Alpha Terranus", false );
		
		// creating asteroid object and holding it in it's parent class HeavenlyObject
		HeavenlyObject asteroidOne = new Asteroid ( 245.6, 326 );
		HeavenlyObject asteroidTwo = new Asteroid ( 23.95, "C6G8", 678 );
		
		// printing the created object's informations using their getters
		printObjectUsingGetters ( "Planet One", planetOne );
		printObjectUsingGetters ( "Planet Two", planetTwo );
		printObjectUsingGetters ( "Asteroid One", asteroidOne );
		printObjectUsingGetters ( "Asteroid Two", asteroidTwo );
		
		// Printing the objects toString versions using their to String methods
		printObjectsUsingToString ( planetOne );
		printObjectsUsingToString ( planetTwo );
		printObjectsUsingToString ( asteroidOne );
		printObjectsUsingToString ( asteroidTwo );
		
		// using the setter to change some property of some object
		planetOne.setName("Mikalien");
		((Asteroid)asteroidTwo).setTravelSpeed(500);
		
		// Printing the changed objects
		println ( planetOne.getName() );
		println ( ((Asteroid)asteroidTwo).getTravelSpeed() );
		println ( "" );
		
		// showing the polymorphic behhaviour using an array of the parent class
		HeavenlyObject [] heavenlyArray = new HeavenlyObject[4];
		heavenlyArray[0] = planetOne ;
		heavenlyArray[1] = planetTwo ;
		heavenlyArray[2] = asteroidOne ;
		heavenlyArray[3] = asteroidTwo ;
		
		for ( HeavenlyObject obj : heavenlyArray ) {
			printParameterSurfaceArea ( obj );
		}

	}

}
