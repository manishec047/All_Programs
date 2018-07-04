package com.test.automation.UIAutomation_1505.TestBase;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	//public static final Logger log=Logger.getLogger(TestBase.class.getName());
// As We can't hard code the script like selecting browser and application url etc 	
	public static WebDriver driver;
	
	String url="http://automationpractice.com/index.php";
	String browser="chrome";
	
	public void init()
	{
		System.out.println(" In Test base: in init method");
		//log.info("Test base: in init method");
		selectbrowser(browser);
		getUrl(url);
		
		//Logger class
		//D:\\manish\\Self training\\selenium\\Manish\\src\\DAY20\\UIAutomation_1505\\
		String log4jconfipath="log4j.properties";
		org.apache.log4j.PropertyConfigurator.configure(log4jconfipath);
		
		
		
	}
	
	public void selectbrowser(String browser)
	{
		//log.info("In Test base: Selecting Browser to Be used:");
		System.out.println("In Test base: Selecting Browser to Be used:");
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			//-----------------------------------------chrome driver----------------------------------------------------------------------------------
			ChromeOptions option=new ChromeOptions();
			option.addArguments("disable-infobars");
			option.setExperimentalOption("exclusionSwitches", Collections.singletonList("enable-automationX"));
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			//-----------------------------------------------INTERNET EXPLORE------------------------------------------------------------------------------------------
			 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "/drivers/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else
			{
			System.out.println("select any one of chrome,firefox,IE browser");
			}

		driver.manage().window().maximize();
		//log.info("In Test base: Browser Selected and initilized and browser is :"+browser);
		System.out.println("In Test base: Browser Selected and initilized and browser is :"+browser);
	}
	
	public void getUrl(String url)
	{
	
		driver.get(url);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//log.info("url fetched and opened and page loaded ");
	System.out.println("In Test base: In GetUrl Method: url fetched and opened, page loaded and url is: "+url);
	}

}
