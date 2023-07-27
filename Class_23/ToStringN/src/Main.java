
public class Main {
	
	// some instance variable
	private final int count = 25;
	
	@Override
	public String toString () {
		// variable name + value
		return "Class Name : Main\n" + "Count : " + count;
	}
	
	public static void main ( String [] args ) {
		Main main = new Main ();
		System.out.println ( main );
	}

}
