package Tasks;

public class TestFamilyMembers {

	public static void main(String[] args) {
		
		Dad dad = new Dad ( "Engineer", "Dad First Name", "Dad Last Name", 1945);
		System.out.println ( dad );
		
		Son son = new Son ( "CS-GO", "Engineer", "Son First Name", "Son Last Name", 2001 );
		System.out.println ( son );
		
		// Family family = new Family ( "A First Name", "A Last Name", 1989 );
		// can't create Family object cause it's an abstract class
		
		System.out.println ( "Son name is "
				+ son.getFirstName()
				+ " " + son.getLastName()
				);
		
		son.printGames();
		son.addGame("A New Game");
		son.printGames();
		son.removeGame("Call of Duty");
		son.printGames();
	}

}
