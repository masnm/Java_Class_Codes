
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in );
		
		int a = 5;
		String name = new String ( "A Name" );
		
		User userOne = new User ();
		
		// userOne.setFirstName ( "Abc" );
		// userOne.setLastName ( "Def" );
		// userOne.setAge ( 13 );
		/*
		userOne.firstName = "Abc";
		userOne.lastName = "Def";
		userOne.age = 10;
		*/
		// userOne.ShowName ();
		//String fullName = userOne.getFullName ();
		//System.out.println ( fullName );
		
		userOne.ShowInformation();
		System.out.print ( userOne.getLastName () );

	}

}
