package Helper;

import java.io.File;
import java.io.FileWriter;

import org.junit.runner.Result;

import java.io.BufferedWriter;

public class ResultSaver {
	
	public final static String FOLDERNAME = "Results";
	
	public static void saveResult ( String testNumber, Result result ) {
		try {
			File file = new File ( FOLDERNAME );
			file.mkdir();
			file = new File ( FOLDERNAME + "/" + testNumber + "result.txt" );
			file.createNewFile();
			FileWriter fileWriter = new FileWriter ( file );
			BufferedWriter writer = new BufferedWriter ( fileWriter );
			writer.append( "Result Passed : " + result.wasSuccessful() );
			writer.newLine();
			writer.append( "Result Runtime : " + result.getRunTime() );
			writer.flush();
			writer.close();
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
