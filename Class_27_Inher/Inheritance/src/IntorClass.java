

public class IntorClass {
	
	private class abc {
	}
	
	public static void main ( String[] args ) {
		
		System.out.println ( "Hello World!" );
		
		// abc x = new abc();
		
		IntorClass ic = new IntorClass();
		abc a = ic.new abc();
		
	}
	
}
