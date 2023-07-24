package familyStructure;

public class Main {
	
	public static void printChildrens ( FatherMotherProperty f ) {
		System.out.println ( f.getChildrens() );
	}

	public static void main(String[] args) {
		
		Father f = new Father ( "A new name", "Engineer", 25, 2 );
		Mother m = new Mother ( "Another new name", "Engineer", 25, 3 );
		
		printChildrens ( f );
		printChildrens ( m );
		
	}

}
