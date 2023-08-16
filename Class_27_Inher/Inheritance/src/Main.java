import java.util.ArrayList;

public class Main {
	
	/*
	[ { public, private, protected } { static } { final } ] [ { return type } { method name } ] [ ( agruments ) ] throws { exceptions types } {
		[ normal codes.. mabe one or more return types ]
	}
	*/
	
	// method signature
	// abstract public void say () throws Exception;
	
	public <T> void println ( T ... names ) {
		for ( T name : names ) {
			System.out.println ( name );
		}
	}
	
	public <T,S> void add ( T a, S b ) {
		
	}
	
	public float add ( float a, float b ) {
		return a + b;
	}

	public static void main ( String[] args ) {
		
		Main obj = new Main ();
		obj.println( "abc", "def", "ghi" );
		// obj.println( 1, 3, 5, 7, obj.add( 2, 3 ) );
		obj.add (23.4f, 12.2f);
		
		/*
		
		int [] aray;
		
		ArrayList<Integer> ar;
		
		*/
		return;

	}

}
