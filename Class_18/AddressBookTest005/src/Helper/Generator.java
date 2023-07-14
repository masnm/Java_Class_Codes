package Helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Generator {
	
	public String getRandomString ( String [] input ) {
		return input [ (int)(Math.random() * input.length) ];
	}
	
	public void generate ( final int totalLines ) {
		
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
			writer.append ( "addr_addr_line_1,addr_addr_line_2,addr_addr_line_3,addr_country,"
					+ "addr_first_name,addr_last_name,addr_business,addr_email_1,addr_email_2,"
					+ "addr_email_3,addr_phone_1,addr_phone_2,addr_phone_3,addr_web_url_1,"
					+ "addr_web_url_2,addr_web_url_3,addr_city" );
			
			String [] adrlineone = {
					"462-2337",
					"296-5795",
					"429-4989",
					"345-0319",
					"275-0034",
					"593-3805",
					"534-1928",
					"307-7938",
					"501-0693"
			};
			String [] adrlinetwo = {
					"12 11th St W",
					"4725 Maple City Hwy",
					"145 Broadway",
					"8516 SE 137th Ln",
					"30 Elm St #C6",
					"12 Hudson Ave",
					"6791 Main St",
					"1940 Clark Ave",
					"254 Artist Lake Dr"
			};
			String [] adrlinethree = {
					"Salisbury Massachusetts(MA) 01952",
					"Interlochen Michigan(MI) 49643",
					"Lynbrook New York(NY) 11563",
					"Summerfield Florida(FL) 34491",
					"Bergenfield New Jersey(NJ) 07621",
					"Haverstraw New York(NY) 10927",
					"Billings Montana(MT) 59102",
					"Middle Island New York(NY) 11953",
					"Cherry Creek New York(NY) 14723"
			};
			String [] cityes = {
					"Hectorn", "Loosund", "Allarie", "Gendonee", "Lumellia",
					"Filian", "Rivonal", "Morralle", "Oremere", "Penanagar",
					"Wavertow", "Maliet", "Terton", "Mooread", "Giffing",
					"Ruinvale", "Roberson", "Pendomina", "Pointe", "Burrange",
					"Bademouth"
			};
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
			String [] countryes = {
					"Bahrain", "Bangladesh", "Barbados", "Belarus",
					"Belgium", "Belize", "Benin", "Bhutan", "Bolivia",
					"Bosnia", "Botswana", "Brazil", "Brunei", "Bulgaria",
					"Burkina", "Burundi", "Cote", "Cabo", "Cambodia",
					"Cameroon", "Canada"
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
				writer.append( getRandomString ( adrlineone ) );
				writer.append(',');
				writer.append( getRandomString ( adrlinetwo ) );
				writer.append(',');
				writer.append( getRandomString ( adrlinethree ) );
				writer.append(',');
				writer.append( getRandomString ( countryes ) );
				writer.append(',');
				writer.append( getRandomString ( names ) );
				writer.append(',');
				writer.append( getRandomString ( names ) );
				writer.append(',');
				writer.append(getRandomString(businesses));
				writer.append(',');
				writer.append(getRandomString(emails));
				writer.append(',');
				writer.append(getRandomString(emails));
				writer.append(',');
				writer.append(getRandomString(emails));
				writer.append(',');
				writer.append(getRandomString(numbers));
				writer.append(',');
				writer.append(getRandomString(numbers));
				writer.append(',');
				writer.append(getRandomString(numbers));
				writer.append(',');
				writer.append(getRandomString(urls));
				writer.append(',');
				writer.append(getRandomString(urls));
				writer.append(',');
				writer.append(getRandomString(urls));
				writer.append(',');
				writer.append(getRandomString(cityes));
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
}
