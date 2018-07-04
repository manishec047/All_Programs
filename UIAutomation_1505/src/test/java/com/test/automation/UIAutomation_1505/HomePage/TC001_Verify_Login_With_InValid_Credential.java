package com.test.automation.UIAutomation_1505.HomePage;

import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation_1505.TestBase.TestBase;
import com.test.automation.UIAutomation_1505.UiAction.HomePage;

//import sun.security.krb5.internal.crypto.crc32;

public class TC001_Verify_Login_With_InValid_Credential extends TestBase{
	
	public static final Logger log=Logger.getLogger(TC001_Verify_Login_With_InValid_Credential.class.getName());
// Make reference of Interface, because you can't create Object of interface.
//	Not required As we have already initialized driver in parent class and as we are using inheritance.
	//****WebDriver driver;
//Make a reference of home page of UiAction(src/main/java
	HomePage homepage;

	

@BeforeTest
	public void setup()
	{
	/* Set The Path of Jeco driver for FireFox Here -System.getProperty("user.dir"): set the path Till the project
	 *  root Location and from there it will fetch driver at this location(/drivers/geckodriver.exe)*/
	
	//AS WE CAN'T HARDCODE BROSWER SO WILL DEFINE IN TESTBASE CLASS IN SRC/MAIN/JAVA
	//-----------------------------------FIREFOX----------------------------------------------------
	//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
	//driver = new FirefoxDriver();
	//-----------------------------------------chrome driver----------------------------------------------------------------------------------
	//ChromeOptions option=new ChromeOptions();
	//option.addArguments("disable-infobars");
	//option.setExperimentalOption("exclusionSwitches", Collections.singletonList("enable-automationX"));
	 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
	//-----------------------------------------------INTERNET EXPLORE------------------------------------------------------------------------------------------
	// System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "/drivers/IEDriverServer.exe");
	//Driver = new InternetExplorerDriver();
//driver = new ChromeDriver();
//driver.get("http://automationpractice.com/index.php");
	 
	// WILL SET BROWSER AND GET URL FROM TEST BASE AS WE TEST BASE IS PARENT FOR ALL TEST 
	//CASE TO SET TEST INIIAL CONDITION
	  
	 log.info("In Testcase1 Class:@Before test: Re-directing to test base");
	 System.out.println("In Testcase1 Class:@Before test: Re-directing to test base");
	init(); 
	
	
	}
	
//* Method LoginWithInValidCredentail where we perform our login operation check */
@Test
	public void loginWithInValidCredentail() throws InterruptedException
	{
	log.info("in @test of tc1");
	System.out.println("in @test of TC1");
	
	log.info("Directing to Home page to initilize Webelement and all Pre-Condition");
	System.out.println("Directing to Home page to initilize Webelement and all Pre-Condition");
	
	homepage =new HomePage(driver); 
	
	Thread.sleep(5000);
	/*Driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	Driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@gmail.com");
	Driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("password");
	Driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
	*/
	//Remove this by Page Factory approach
	homepage.logintoApplication("test@gamil.com", "password123");
	Thread.sleep(5000);
	//Assert.assertEquals(Driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText(), "Authentication failed.");
	Assert.assertEquals(homepage.getInvalidLogintext(), "Authentication failed.");
   log.info("Validation completed");
	log.info("Wrong userid and password");
	}
	
@AfterTest
	/*End of Test */
	public void endTest()
	{
	log.info("test passed");
		driver.quit();
		
		log.info("Browser Closed");
	}
}
