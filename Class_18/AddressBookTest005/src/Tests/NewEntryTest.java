package Tests;

import Helper.Pair;
import Helper.ResultSaver;

import org.apache.commons.io.FileUtils;

import java.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewEntryTest {
	
	private WebDriver driver;
	
	public static String testNumber;
	private static ArrayList<Pair<String,String>> dropDownList, fieldList;
	
	public static void saveDropDownList ( ArrayList<Pair<String,String>> input ) {
		dropDownList = new ArrayList<>();
		for ( int i = 0; i < input.size(); i++ ) {
			dropDownList.add( input.get ( i ).getNew () );
		}
	}
	
	public static void saveFieldList ( ArrayList<Pair<String,String>> input ) {
		fieldList = new ArrayList<>();
		for ( int i = 0; i < input.size(); i++ ) {
			fieldList.add( input.get ( i ).getNew() );
		}
	}
	
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
	
	@Before
    public void setUp() throws Exception {
		System.setProperty( "webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver ();
    }
	
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
	
	void saveScreenShot ( String testNumber, String extra ) {
		try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File ( ResultSaver.FOLDERNAME + "/" + testNumber + extra + ".png" ));
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void test () throws Exception {
		
		driver.get( "http://localhost/addressbook/newEntry.php" );
		
		for ( int i = 0; i < NewEntryTest.dropDownList.size(); i++ ) {
			Pair<String,String> item = NewEntryTest.dropDownList.get(i);
			selectDropDown ( item.getT(), item.getU() );
		}
		
		for ( int i = 0; i < NewEntryTest.fieldList.size(); i++ ) {
			Pair<String,String> item = NewEntryTest.fieldList.get(i);
			writeInInputField ( item.getT(), item.getU() );
		}
		
		saveScreenShot ( NewEntryTest.testNumber, "input" );
		
		WebElement submit = driver.findElement(By.id("submit_button"));
		submit.click();
		
		saveScreenShot ( NewEntryTest.testNumber, "output" );
		
		try {
			WebElement reslt = driver.findElement(By.xpath("//h2[contains(., 'The new address book entry was added successfully')]"));
		} catch ( Exception e ) {
			Assert.assertEquals(12, 10);
		}
	}
	
	@After
    public void tearDown() throws Exception {
		driver.close();
    }  
  
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }  

}
