
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileInputOutput {
	
	public static void inputOutputConsole () {
		Scanner scanner = new Scanner ( System.in );
		
		// input for terminal / console / cmd/ bash
		String s = scanner.nextLine ();
		
		// printing to all the above mentioned
		System.out.println ( s );
	}
	
	public static void inputFromFileOutputToConsole () {
		try {
			
			String filename = "inputFile.txt";
			File input = new File ( filename );
			input.createNewFile();
			Scanner scanner = new Scanner ( input );
			
			// for (  ; scanner.hasNextLine();  ) {
			while ( scanner.hasNextLine() ) {
				String line = scanner.nextLine();
				System.out.println ( line );
			}
			
		} catch ( Exception ex ) {
			System.out.println ( ex );
			ex.printStackTrace();
		}
	}
	
	public static void inputFromFileOutputToFile () {
		try {
			
			String inputFileName = "inputFile.txt";
			String outputFileName = "outputFile.txt";
			
			File input = new File ( inputFileName );
			File output = new File ( outputFileName );
			
			// expected the input file is already there
			output.createNewFile();
			
			// to take input from input file using scanner
			Scanner scanner = new Scanner ( input );
			
			// to write string to output file using fileWriter
			FileWriter fw = new FileWriter ( output );
			BufferedWriter br = new BufferedWriter ( fw );
			
			// reading and writing
			while ( scanner.hasNextLine() ) {
				String line = scanner.nextLine();
				System.out.println ( line );
				br.write(line);
				br.newLine();
			}
			br.close();
			
		} catch ( Exception ex ) {
			System.out.println ( ex );
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		// inputOutputConsole ();
		// inputFromFileOutputToConsole ();
		inputFromFileOutputToFile ();

	}

}
