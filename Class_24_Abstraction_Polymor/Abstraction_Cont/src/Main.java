
public class Main {
	
	public static void canNoise ( NoiseMakeExt lt ) {
		System.out.println ( lt.canMakeNoise() );
	}

	public static void main(String[] args) {
		
		// for permeative data types variable is variable
		// for not preemptive data types variable is object
		// LivingThing lt = new LivingThing( "unknown" );
		// lt.age = 25;
		// lt.name = new String ( "A new living thing" );
		// System.out.println ( lt.getName() );
		
		Cat cat = new Cat ();
		Anymal anymal = new Anymal ( true );
		
		canNoise ( cat );
		canNoise ( anymal );
		canNoise ( new BigCat () );

	}
	/* parent class & child class has same methods with same i then this is called method overriding
	 * if parent class & child class has same methods with different i then it's method overloading
	 */

}
