package Entry;

import Helper.Generator;
import Helper.Pair;
import Helper.ResultSaver;

import org.junit.runner.Result;

import java.io.FileReader;
import java.io.File;
import com.opencsv.CSVReader;
import java.util.ArrayList;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import Tests.NewEntryTest;

public class Main extends Generator {
	
	public static void resultReport(Result result) {
	    System.out.println("Finished. Result: Failures: " +
	    		result.getFailureCount() + ". Ignored: " +
	    		result.getIgnoreCount() + ". Tests run: " +
	    		result.getRunCount() + ". Time: " +
	    		result.getRunTime() + "ms."
	    );
	}

	public static void main ( String[] args ) {
		
		Generator generator = new Generator ();
		generator.generate ( 5 );
		
		CSVReader reader, reader2;
		try {
			File fl = new File ( "dropDownOptions.csv" );
			File f2 = new File ( "fieldOptions.csv" );
			
			fl.createNewFile();
			f2.createNewFile();
			
			FileReader fr = new FileReader ( fl ), fr2 = new FileReader ( f2 );
			reader = new CSVReader ( fr );
			reader2 = new CSVReader ( fr2 );
		
			String [] tokens0, tokens;
			String [] tkn0, tkns;
			
			ArrayList<Pair<String,String>> list = new ArrayList<>();
			ArrayList<Pair<String,String>> list2 = new ArrayList<>();
			
			tokens0 = reader.readNext();
			tkn0 = reader2.readNext();
			
			int testCounter = 1;
			
			while ( (tokens = reader.readNext()) != null ) {
				
				list.clear();
				for ( int i = 0; i < tokens.length; i++ ) {
					list.add( new Pair<String,String>( tokens0[i], tokens[i] ) );
				}
				NewEntryTest.saveDropDownList( list );
				
				tkns = reader2.readNext();
				System.out.println ( tkn0.length );
				list2.clear();
				for ( int i = 0; i < tkns.length; i++ ) {
					list2.add( new Pair<String,String> ( tkn0[i], tkns[i] ) );
				}
				
				NewEntryTest.saveFieldList ( list2 );
				
				NewEntryTest.testNumber = "Test " + testCounter + " ";
				
				JUnitCore junit = new JUnitCore();
				junit.addListener(new TextListener(System.out));

				Result result = junit.run ( NewEntryTest.class );

				ResultSaver.saveResult( NewEntryTest.testNumber, result );
				System.out.println("result of test "+ testCounter +" : ");
				resultReport(result);
				
				testCounter++;
			}
		
		} catch ( Exception ex ) {
			System.out.println ( ex );
			ex.printStackTrace();
		}
		
	}

}
  