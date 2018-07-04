package com.test.automation.UIAutomation_1505.UiAction;

import java.util.List;

import org.apache.log4j.Logger;
//import org.apache.xmlbeans.impl.common.IdentityConstraint.SelectorState;
//import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.sun.org.apache.bcel.internal.generic.Select;
//import com.test.automation.UIAutomation_1505.HomePage.TC001_Verify_Login_With_InValid_Credential;

import com.test.automation.UIAutomation_1505.TestBase.TestBase;

//This Class is to design page factory approach by converting driver.findelement(by.xxx("")) t0
//@FindBy(xpath=".//*[@id='email']") WebElement Username;

public class HomePage extends TestBase {
	
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	// Make a reference of webdriver

	//private static final com.sun.org.apache.bcel.internal.generic.Select New = null;
	
	WebDriver driver;
//=====WEBELEMTS FOR LOGIN PAGE======================================================
	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(xpath = ".//*[@id='email']")
	WebElement Username;

	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement Password;

	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	WebElement Submit;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authentication_failed;
// And Then define a method where we will call all these WebElement for performing operation on it.
// Since this is page factory create a constructor of a class and will always takes argument as webdriver
//since we need to initialize the webElement is retrun type of driver.findelement so it need to be initialized 
//==============ENDS====================================================
//==========================FOR REGISTRATION PAGE==================================
	@FindBy(id="email_create")
	//@FindBy(css="#email_create")
	WebElement signInEmailAddress;
	
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement createAccountButton;
	
	@FindBy(xpath=".//*[@id='id_gender1']")
	WebElement maleRadioButton;
	
	@FindBy(xpath=".//*[@id='customer_firstname']")
	WebElement cusfirstName;
	
	@FindBy(xpath=".//*[@id='customer_lastname']")
	WebElement cusLastName;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement RegistrationEmailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='days']")
	WebElement dobday;
	
	@FindBy(xpath=".//*[@id='months']")
	WebElement dobMonth;
	
	String monthXpath=".//*[@id='months']";
	
	
	@FindBy(xpath=".//*[@id='years']")
	WebElement dobYear;
	
	@FindBy(xpath=".//*[@id='newsletter']")
	WebElement newsletterCheckBox;
	
	@FindBy(xpath=".//*[@id='optin']")
	WebElement offercheckBox;
	
	@FindBy(xpath=".//*[@id='firstname']")
	WebElement addfirstName ;
	
	@FindBy(xpath=".//*[@id='lastname']")
	WebElement addLastName;
	
	@FindBy(xpath=".//*[@id='company']")
	WebElement addCompany;
	
	@FindBy(xpath=".//*[@id='address1']")
	WebElement addAddressLine1;
	
	@FindBy(xpath=".//*[@id='address2']")
	WebElement addAddressLine2;
	
	@FindBy(xpath=".//*[@id='city']")
	WebElement addcity;
	
	@FindBy(xpath=".//*[@id='id_state']")
	WebElement addState;
	
	@FindBy(xpath=".//*[@id='postcode']")
	WebElement addPostCode;
	
	@FindBy(xpath=".//*[@id='id_country']")
	WebElement addcountry;
	
	@FindBy(xpath=".//*[@id='other']")
	WebElement addAdditionalInfo;
	
	@FindBy(xpath=".//*[@id='phone']")
	WebElement  addHomeNumber;
	
	@FindBy(xpath=".//*[@id='phone_mobile']")
	WebElement addMobileNumber;
	
	@FindBy(xpath=".//*[@id='alias']")
	WebElement addAddressalias;
	
	@FindBy(xpath=".//*[@id='submitAccount']")
	WebElement submitButton;
	
//==================ENDS==================================================== 	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this); //This refer to current class object	
	}
	
	public void logintoApplication(String emailAddress, String password)
	{
		signIn.click();
		Username.sendKeys(emailAddress);
		Password.sendKeys(password);
		Submit.click();
		// Note: We will not write assertion method because it will work for
		// both positive and negative scenario
		// if we write for positive then it will not work for negative testing
		// and vice versa
	}
//---------------START:User registration----------------------------------------------------------------------------------
	public void userRegistration(WebDriver driver,String emailAddress,String firstName,String lastName,String accPassword,String day,String month,String year,String companyName,String Address,String city,String State,String postcode,String country ,String additionalinfo, String HomeNumber,String mobileNumber,String aliasaddress) throws InterruptedException
	{
		
		signIn.click();	
		System.out.println("clicked on Sign In Buttom on Home page");
		Thread.sleep(5000);
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://automationpractice.com/index.php?controller=authentication&back=my-account"))
	    {   //http://automationpractice.com/index.php?controller=authentication&back=my-account
			System.out.println(" In HomePage: We are on account creation page:"+driver.getCurrentUrl());
			log.info(" In HomePage: We are on account creation page:"+driver.getCurrentUrl());
		    signInEmailAddress.sendKeys(emailAddress);
		    System.out.println("Email address to create a account: " +emailAddress);
		    Thread.sleep(1000);
		    
		    createAccountButton.click();
		    System.out.println("clicked on Create account "+createAccountButton.getText()+" Button");
		    Thread.sleep(1000);
		    
		    
		    Thread.sleep(7000);
		    
		    if(driver.getCurrentUrl().equalsIgnoreCase("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"))
		    {
		    	System.out.println(" In HomePage: We are on account creation page:"+driver.getCurrentUrl());
				log.info(" In HomePage: We are on account creation page:"+driver.getCurrentUrl());
		      
		      maleRadioButton.click();
		      System.out.println("RadioButton Selected is: "+ maleRadioButton.getAttribute("text"));
		      Thread.sleep(2500);
		      
		      cusfirstName.sendKeys(firstName);
		      System.out.println("Customer first name is: "+ firstName);
		      
		      cusLastName.sendKeys(lastName);
		      System.out.println("Customer Last name  is: "+ lastName);
		      
		      Thread.sleep(2500);
		      
		     //Assert.assertEquals(signInEmailAddress.getText(), RegistrationEmailAddress.getText());
		     
		     System.out.println("Signin Email address is: "+emailAddress+" And RegistrationEmail address is: "+ RegistrationEmailAddress.getText());
		      Thread.sleep(2500);
		      
		      password.sendKeys(accPassword);
		      System.out.println("Passowrd Entered "+accPassword);
			    
		      Thread.sleep(2500);
		      
		     
		      //selectDayFromDD(day);
		      Thread.sleep(2500);
		      System.out.println("Selected Date for DOB is: "+day);
		      
		      selectMonthFromDD(month);
		      Thread.sleep(2500);
		      System.out.println("Selected Date for DOB is: "+month);
		      
		      selectYearFromDD(year);
		      Thread.sleep(2500);
		      System.out.println("Selected Date for DOB is: "+year);
		      
		      
		      newsletterCheckBox.click();
		      Thread.sleep(2500);
		      System.out.println("NewsLetterCheckBox clicked ");
		      
		      
		      offercheckBox.click();
		      Thread.sleep(2500);
		      System.out.println("offercheckBox Clicked");
		      
		      addfirstName.sendKeys(firstName);
		      Thread.sleep(2500);
		      System.out.println("First Name in Address Section is: "+firstName);
		      
		      addLastName.sendKeys(lastName);
		      Thread.sleep(2500);
		      System.out.println("last Name in Address Section is: "+lastName);
		      
		      addCompany.sendKeys(companyName);
		      Thread.sleep(2500);
		      System.out.println("company Name in Address Section is: "+companyName);
		      
		      addAddressLine1.sendKeys(Address);
		      Thread.sleep(2500);
		      System.out.println("Address FirstLine in Address Section is: "+Address);
		      
		      addAddressLine2.sendKeys("addAddressLine2");
		      Thread.sleep(2500);
		      System.out.println("Address SeconLine in Address Section is: addAddressLine2 ");
		      
		      
		      addcity.sendKeys(city);
		      Thread.sleep(2500);
		      System.out.println("City Name in Address Section is: "+city);
		      
		      selectStateFromDD(State);
		      Thread.sleep(2500);
		      System.out.println("State Name in Address Section is: "+State);
		      
		      addPostCode.sendKeys(postcode);
		      Thread.sleep(2500);
		      System.out.println("postcode Name in Address Section is: "+postcode);
		      
		      selectCountryFromDD(country);
		      Thread.sleep(1000);
		      System.out.println("country Name in Address Section is: "+country);
		      
		      addAdditionalInfo.sendKeys(additionalinfo);
		      Thread.sleep(1000);
		      System.out.println("additionalinfo in Address Section is: "+additionalinfo);
		      
		      addHomeNumber.sendKeys(HomeNumber);
		      Thread.sleep(1000);
		      System.out.println("HomeNumber in Address Section is: "+HomeNumber);
		      
		      addMobileNumber.sendKeys(HomeNumber);
		      Thread.sleep(1000);
		      System.out.println("HomeNumber in Address Section is: "+HomeNumber);
		      
		      addHomeNumber.sendKeys(aliasaddress);
		      Thread.sleep(1000);
		      System.out.println("aliasaddress in Address Section is: "+aliasaddress);
		      
		      submitButton.click();
		      Thread.sleep(1000);
		      System.out.println("clicked on Submit Button ");
		          	
		    }
		    else
		    {System.out.println("We are not on account authentication page");
		    	log.info("We are not on account authentication page");
		    	Thread.sleep(5000);
		    	driver.quit();
		    }
	    }
		else
		{System.out.println("We are not on account creation page");
			log.info("We are not on account creation page");
			Thread.sleep(5000);
	    	driver.quit();
		}
	}
//------------------------ENDS:User registration----------------------------------------------------------------------------------	
	
//---------------START: Get Invalid Login text when invalid used trying to login in-------------------------------
	public String getInvalidLogintext() 
	{return authentication_failed.getText();	
	}
	
//---------------ENDS: Get Invalid Login text when invalid used trying to login in-------------------------------

	
	public void selectDayFromDD(String day) throws InterruptedException
	{
		System.out.println("Selecting day from dropDownList");
		log.info("Selecting day in dropDownList");
		dobday.click();
		
		Thread.sleep(2000);
		
		//String Test=".//*[@id='account-creation_form']/div[1]/div[6]/div/div[1]/div[1]/select[1]/option[2]";
		//driver.findElement(By.xpath(Test)).click();
		
		   //.//*[@id='days']/option[4]
		String day1Xpath=".//*[@id='days']/option[";
		String day2Xpath="]";
		driver.findElement(By.xpath(day1Xpath+day+day2Xpath)).click();
		
		
	}
//----------------------ENDS:Method to select Day from day dropDown list by taking inputs from user ------------------------------

//----------------------START:Method to select Month from Month dropDown list by taking inputs from user ------------------------------



public void selectMonthFromDD(String month) throws InterruptedException 
   {
	System.out.println("Selecting Month in dropDownList");
	log.info("Selecting Month in dropDownList");
	dobMonth.click();
	Thread.sleep(2000);
	
	List<WebElement> monthList= driver.findElements(By.xpath(".//*[@id='months']/option[]"));
	
        for (WebElement mon:monthList) 
         {
        	if (mon.getText().trim().toLowerCase().equals(month.toLowerCase())) 
                {
			       mon.click();	
		     	}	
         }	
	
	//String day1Xpath=".//*[@id='";
	//String day2Xpath="']";
	 //Driver.findElement(By.xpath(day1Xpath+month+day2Xpath)).click();
   }	
//----------------------ENDS:Method to select Month from Month dropDown list by taking inputs from user ------------------------------

//----------------------START:Method to select Year from Year dropDown list by taking inputs from user ------------------------------

public void selectYearFromDD(String year) throws InterruptedException 
   {
	System.out.println("Selecting year in dropDownList");
	log.info("Selecting year in dropDownList");
	dobYear.click();
	Thread.sleep(2000);
	
	String day1Xpath=".//*[@id='";
	String day2Xpath="']";
	driver.findElement(By.xpath(day1Xpath+year+day2Xpath)).click();
   }
//----------------------ENDS:Method to select Year from Year dropDown list by taking inputs from user ------------------------------

//----------------------START:Method to select State from State dropDown list by taking inputs from user ------------------------------

public void selectStateFromDD(String state) throws InterruptedException 
 {
	System.out.println("Selecting state in dropDownList");
	log.info("Selecting state in dropDownList");
	addState.click();
	Thread.sleep(2000);
	
	List<WebElement> stateList= driver.findElements(By.xpath(".//*[@id='id_state']"));
	
      for (WebElement sta:stateList) 
       {
          if (sta.getText().trim().toLowerCase().equals(state.toLowerCase())) 
              {
        	  sta.click();	
		     	}	
       }	
	
 }	
//----------------------ENDS:Method to select Country from Country dropDown list by taking inputs from user ------------------------------

public void selectCountryFromDD(String Country) throws InterruptedException 
{
	System.out.println("Selecting Country in dropDownList");
	log.info("Selecting Country in dropDownList");
	addState.click();
	Thread.sleep(2000);
	
	List<WebElement> countryList= driver.findElements(By.xpath(".//*[@id='id_country']"));
	
     for (WebElement con:countryList) 
      {
         if (con.getText().trim().toLowerCase().equals(Country.toLowerCase())) 
             {
        	 con.click();	
		     	}	
      }	
	
}	
//----------------------ENDS:Method to select State from State dropDown list by taking inputs from user ------------------------------


}
