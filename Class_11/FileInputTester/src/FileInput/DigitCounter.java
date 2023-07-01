package FileInput;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DigitCounter {
	
	// add check for negative number also;
	public static Boolean isNumber ( String inp ) {
		// "1234" "-09abd" "askldjf"
		for ( int i = 0; i < inp.length(); i++ ) {
			char current = inp.charAt(i);
			if ( i == 0 && current == '-' ) {
				// ok
			} else if ( current >= '0' && current <= '9' ) {
				// ok
			} else {
				// wrong not in range 0<->9
				return false;
			}
		}
		return true;
	}
	
	public static int digitCount ( String word ) {
		int count = 0;
		for ( int i = 0; i < word.length(); i++ ) {
			char current = word.charAt( i );
			if ( current >= '0' && current <= '9' ) {
				count++;
			}
		}
		return count;
	}
	
	public static int smallLetterCount ( String word ) {
		int count = 0;
		for ( int i = 0; i < word.length(); i++ ) {
			char current = word.charAt( i );
			if ( current >= 'a' && current <= 'z' ) {
				count++;
			}
		}
		return count;
	}
	
	public static int spaceCount ( String word ) {
		int count = 0;
		for ( int i = 0; i < word.length(); i++ ) {
			char current = word.charAt ( i );
			if ( current == ' ' ) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		File input = new File ( "input_file.txt" );
		try {
			
			String Total = "";
			
			Scanner sc = new Scanner ( input );
			int numDigits = 0, numLowerCase = 0, numWhiteSpaces = 0;
			while ( sc.hasNextLine() == true ) {
				String line = sc.nextLine ();
				numDigits += digitCount ( line );
				numLowerCase += smallLetterCount ( line );
//				System.out.println ( word + " " + numDigits + " " + numLowerCase );
				numWhiteSpaces += spaceCount ( line );
				Total += (line + "\n");
			}
			
			// Display results
			System.out.println("The content of my file was: \n\n" + Total + "\n" );
			System.out.println("Analysis of File");
			System.out.println("****************");
			// System.out.println("# of Letters is " + numLetters);
			System.out.println("# of LowerCase Letters is " + numLowerCase);
			System.out.println("# of Digits is " + numDigits);
			System.out.println("# of Whitespace is " + numWhiteSpaces);
			
		} catch ( FileNotFoundException problem ) {
			System.out.println ( "File Not Found " + problem );
		}

	}

}
