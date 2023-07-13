package Entry;

import Helper.Pair;

import org.junit.runner.Result;

import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import com.opencsv.CSVReader;
import java.util.ArrayList;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import Tests.NewEntryTest;

public class Main {
	
	public static void resultReport(Result result) {
	    System.out.println("Finished. Result: Failures: " +
	    		result.getFailureCount() + ". Ignored: " +
	    		result.getIgnoreCount() + ". Tests run: " +
	    		result.getRunCount() + ". Time: " +
	    		result.getRunTime() + "ms."
	    );
	}
	
	public static String getRandomString ( String [] input ) {
		return input [ (int)(Math.random() * input.length) ];
	}
	
	public static void generator () {
		
		final int totalLines = 10;
		
		try {
			// if file exists, then delete it
			File dropFile = new File ( "dropDownOptions.csv" );
			dropFile.delete();
			// create new file
			dropFile.createNewFile();
			// write the header
			FileWriter wri = new FileWriter ( dropFile );
			BufferedWriter writer = new BufferedWriter ( wri );
			writer.append ( "addr_type,addr_phone_1_type,addr_phone_2_type,addr_phone_3_type" );
			
			String [] ar1 = { "Family", "Friend", "Business", "Other" };
			String [] ar2 = { "Home", "Home Fax", "Work", "Work Fax", "Mobile" };
			for ( int rep = 0; rep < totalLines; rep++ ) {
				writer.newLine();
				writer.append ( getRandomString(ar1 ) );
				for ( int i = 0; i < 3; i++ ) {
					writer.append( ',' );
					writer.append ( getRandomString(ar2) );
				}
			}
			
			writer.flush();
			// generate new options for all the option
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
		
		try {
			// if file exists, then delete it
			File dropFile = new File ( "fieldOptions.csv" );
			dropFile.delete();
			// create new file
			dropFile.createNewFile();
			// write the header
			FileWriter wri = new FileWriter ( dropFile );
			BufferedWriter writer = new BufferedWriter ( wri );
			writer.append ( "addr_first_name,addr_business,addr_email_1,addr_phone_1,addr_web_url_1" );
			String [] names = {
					"Gabrielle Petersen", "Samson Hahn", "Fallon Wood",
					"Carson Khan", "Mabel Whitehead", "Zayd Rosario",
					"Louisa Ramos", "Angel Rangel", "Gloria Beasley",
					"Stanley Cardenas", "Raven Allison", "Dennis Merritt",
					"Kaisley Serrano", "Milan Hart", "Gemma Grimes",
					"Harlan Lucas", "Phoenix Whitney"
			};
			String [] businesses = {
					"Puzzle Huddle", "7Eleven", "Hobby Lobby",
					"The Knickknack Shack", "Los Amigos Taqueria",
					"Plan4Demand", "Chic Boutique Consignments",
					"ElemenOPillows", "Groupon", "Influitive",
					"Spinfluence", "Intellivision", "Omnilert",
					"Technologent", "Securiteam", "Innometrics"
			};
			String [] emails = {
					"speeves@outlook.com", "rnelson@comcast.net", "fglock@yahoo.com",
					"vganesh@gmail.com", "fluffy@me.com", "gboss@mac.com",
					"pgottsch@yahoo.ca", "muadip@me.com", "louise@verizon.net",
					"arnold@aol.com", "carcus@sbcglobal.net", "kspiteri@yahoo.com"
			};
			String [] numbers = {
					"6087769896", "8653129961", "8162000665",
					"5074745912", "6106598606", "5303693754",
					"6788618114", "7405929799", "7205895855",
					"4043997267", "4232448323", "8169883451",
					"2082990684", "8034563392", "7315955165"
			};
			String [] urls = {
					"http://www.360.cn", "http://www.sohu.com", "http://www.amazon.co.jp",
					"http://www.pinterest.com", "http://www.netflix.com",
					"http://www.google.it", "http://www.google.ru", "http://www.microsoft.com",
					"http://www.google.es", "http://www.wordpress.com", "http://www.gmw.cn",
					"http://www.tumblr.com", "http://www.paypal.com",
					"http://www.blogspot.com", "http://www.imgur.com",
					"http://www.stackoverflow.com", "http://www.aliexpress.com"
			};
			for ( int rep = 0; rep < totalLines; rep++ ) {
				writer.newLine();
				writer.append( getRandomString ( names ) );
				writer.append(',');
				writer.append(getRandomString(businesses));
				writer.append(',');
				writer.append(getRandomString(emails));
				writer.append(',');
				writer.append(getRandomString(numbers));
				writer.append(',');
				writer.append(getRandomString(urls));
			}
			writer.flush();
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
		// if file exists, then delete it
		// create new file
		// write the header
		
		
		// generate new options for all the option
	}

	public static void main ( String[] args ) {
		generator ();
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
			
			while ( (tokens = reader.readNext()) != null ) {
				
				list.clear();
				for ( int i = 0; i < tokens.length; i++ ) {
					list.add( new Pair<String,String>( tokens0[i], tokens[i] ) );
				}
				NewEntryTest.saveDropDownList( list );
				
				tkns = reader2.readNext();
				list2.clear();
				for ( int i = 0; i < tkns.length; i++ ) {
					list2.add( new Pair<String,String> ( tkn0[i], tkns[i] ) );
				}
				NewEntryTest.saveFieldList ( list2 );
				
				JUnitCore junit = new JUnitCore();
				junit.addListener(new TextListener(System.out));

				Result result = junit.run ( NewEntryTest.class );

				resultReport(result);
			}
		
		} catch ( Exception ex ) {
			System.out.println ( ex );
			ex.printStackTrace();
		}
		/*
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));

		Result result = junit.run ( NewEntryTest.class );

		resultReport(result);
		*/
	}

}
  