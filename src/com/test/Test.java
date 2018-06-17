package com.test;
import java.io.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     System.out.println("Hello World");
     WebDriver drivers = null;
     String path = "Driver\\chromedriver.exe";
     //E:\\Software\\Java\\chromedriver_win32\\chromedriver.exe
     try 
     {
    	
 	 System.setProperty("webdriver.chrome.driver",path);
     drivers = new  ChromeDriver();
     
     drivers.get("http://google.com");
    
		Thread.sleep(1000);
		if (drivers.getTitle().equalsIgnoreCase("Google"))
		{
			System.out.println(drivers.getClass().toString());
			String expected = "Google";
			String actual = drivers.getTitle();
			Assert.assertEquals(expected, actual);
		}
		else
			System.out.println(drivers.getTitle());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
     finally
     {
    	 drivers.quit();
     }
		
	}

}
