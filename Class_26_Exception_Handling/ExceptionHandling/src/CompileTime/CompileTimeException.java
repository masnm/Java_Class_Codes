package CompileTime;

import java.io.File;
import java.io.IOException;

public class CompileTimeException {
	
	public static void optionOne () throws IOException, ArithmeticException, MyException {
		throw new MyException ( 15 );
		/* throw new MyException ( "Throwing my own exception" );
		// throw new ArithmeticException ( "An io exception is thorwn!" );
		File f = new File ( "A New File.txt" );
		f.createNewFile();
		*/
	}

	public static void main(String[] args) {
		try {
			int x = 25 / 0;
		} catch ( Exception ex ) {
			
		}
		try {
			optionOne ();
		} catch ( IOException ex ) {
			ex.printStackTrace();
			System.out.println ( "IO Error message: " + ex.getMessage() );
			// any kind of code
		} catch ( ArithmeticException ex ) {
			ex.printStackTrace();
			System.out.println ( "AE Error message: " + ex.getMessage() );
		} catch ( MyException ex ) {
			ex.printStackTrace();
			System.out.println ( "ME Error message: " + ex.getMessage() );
		} catch ( Exception ex ) {
			ex.printStackTrace();
			System.out.println ( "Ex Error message: " + ex.getMessage() );
		} finally {
			System.out.println ( "From Finally! " );
		}
		
	}

}
