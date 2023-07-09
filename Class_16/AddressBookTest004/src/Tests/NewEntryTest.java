package Tests;

import java.util.Map;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewEntryTest {
	
	WebDriver driver;
	
	void selectDropDown ( String elemId, String option ) {
		// for drop-down elements
		WebElement entryType = driver.findElement(By.id(elemId));
		Select entryTypeSel = new Select ( entryType );
		entryTypeSel.selectByVisibleText ( option );
	}
	
	void writeInInputField ( String elemId, String text ) {
		WebElement firstName = driver.findElement(By.id( elemId ) );
		firstName.sendKeys( text );
	}
	
	@Test
	public void test () {
		System.setProperty( "webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver ();
		
		driver.get( "http://localhost/addressbook/newEntry.php" );
		
		Map<String,String> dropdownStuff = new HashMap<>();
		
		dropdownStuff.put ( "addr_type", "Family" );
		dropdownStuff.put ( "addr_phone_1_type", "Home" );
		dropdownStuff.put ( "addr_phone_2_type", "Work" );
		dropdownStuff.put ( "addr_phone_3_type", "Mobile" );
		
		for ( Map.Entry<String, String> item : dropdownStuff.entrySet() ) {
			selectDropDown ( item.getKey(), item.getValue() );
		}
		
		Map<String,String> InputStuff = new HashMap<>();
		
		InputStuff.put ( "addr_first_name", "A First Name" );
		InputStuff.put ( "addr_business", "A Business Name" );
		InputStuff.put ( "addr_email_1", "amail@gmail.com");
		InputStuff.put ( "addr_phone_1", "018945747478" );
		InputStuff.put ( "addr_web_url_1", "https://www.google.com/" );
		
		for ( Map.Entry<String, String> item : InputStuff.entrySet() ) {
			writeInInputField ( item.getKey(), item.getValue() );
		}
		
		WebElement submit = driver.findElement(By.id("submit_button"));
		submit.click();
		
		try {
			WebElement reslt = driver.findElement(By.xpath("//h2[contains(., 'The new address book entry was added successfully')]"));
		} catch ( Exception e ) {
			Assert.assertEquals(12, 10);
		}
	}
}
