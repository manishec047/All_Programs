package com.test.automation.UIAutomation_1505.HomePage;

import java.io.BufferedReader;
import java.io.FileReader;
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

public class HCL extends TestBase{
	 public static void main (String args[]) throws Exception {
//Count no. Of words and sentence in notepad
	       System.out.println ("Counting Words");       
	       FileReader fr = new FileReader ("c:\\Customer1.txt");        
	       BufferedReader br = new BufferedReader (fr);     
	       String line = br.readLine ();
	       int count = 0;
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = br.readLine();
	       }         
	       System.out.println(count);
	    }
}
	 
	 /*
	 
	 File file = new File("sample.txt");
	 try(Scanner sc = new Scanner(new FileInputStream(file))){
	     int count=0;
	     while(sc.hasNext()){
	         sc.next();
	         count++;
	     }
	 System.out.println("Number of words: " + count);
	 }
	 */
	 
//-------------------------------------------	 
	 /*
	  import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
 
class NumberWords {
public static void main(String[] args) throws Exception {
FileReader fr = new FileReader("c:/test.txt");
BufferedReader br = new BufferedReader(fr);
String line = "", str = "";
int a = 0;
int b = 0;
while ((line = br.readLine()) != null) {
str += line + " ";
b++;
}
System.out.println("Totally " + b + " lines");
 
System.out.println(str);
 
StringTokenizer st = new StringTokenizer(str);
while (st.hasMoreTokens()) {
String s = st.nextToken();
a++;
}
System.out.println("File has " + a + " words are in the file");
}
 
}
	   
	   
	  */
