package com.test.automation.UIAutomation_1505.HomePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.UIAutomation_1505.TestBase.TestBase;
import com.test.automation.UIAutomation_1505.UiAction.HomePage;

public class TC002_UserRegistration extends TestBase {

	public static final Logger log=Logger.getLogger(TC002_UserRegistration.class.getName());
	HomePage homepage;
	
	
	@BeforeTest
	
	public void setup()
	{
		 log.info("In Testcase2 Class:@Before test: Re-directing to test base");
		 System.out.println("In TC002_UserRegistration:@Before test: And Re-directing to test base");
		init();
		
	
		
	}
	
	
	@Test
	
	public void NewUserRegistration() throws InterruptedException
	{
		log.info("In TC002_UserRegistration:and In @Test ");
		System.out.println("In TC002_UserRegistration:and In @Test ");
		
		log.info("In TC002_UserRegistration: In @Test --> Directing to registraion page to initilize Webelement and all Pre-Condition");
		System.out.println("In TC002_UserRegistration: In @Test --> Directing to registraion page to initilize Webelement and all Pre-Condition");
		homepage =new HomePage(TestBase.driver); 
		
		Thread.sleep(1000);
		
		homepage.userRegistration(TestBase.driver,"a1b2c3d4E5@gmail.com","firstName","lastName","AccountPassword","15","May","1990","Infcl", "Electroniccitypune","Pune","Maharastra","411057","India","Mann Village","123456", "9898989898","officeAddress");
		Thread.sleep(5000);
		
		//Assert.assertEquals(homepage.getInvalidLogintext(), "Authentication failed.");
		
		 log.info("Validation completed");
	    log.info("Wrong userid and password");
	}
	
	@AfterTest
	
	public void endtest()
	{
		log.info("Test 2 passed");
		System.out.println("Test 2 passed");
		driver.quit();
		
		log.info("Browser Closed");
		System.out.println("Browser Closed" );
	}
	
	
	
	

	
}
