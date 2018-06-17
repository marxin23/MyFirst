package com.test;


import java.io.*;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class first {

	public static void main(String[] args) throws Exception {
		 System.out.println("Hello");
		 WebDriver driver = null;
		 String expectedvalue = "Google";
		 
		 String actual = "";
		 PrintWriter ps = new PrintWriter(System.out,true);
		Properties prop = new Properties();
		try
		{
			FileInputStream fs = new FileInputStream("src\\config\\config.properties");
			prop.load(fs);
			System.setProperty("webdriver.chrome.driver",prop.getProperty("path"));
			driver = new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			Thread.sleep(1000);
			actual = driver.getTitle();
			if (actual.contentEquals(expectedvalue))
				System.out.println("Pass");
			else System.out.println("Fail");
			
		System.exit(0);
		}
		catch (Exception e)
		{
			ps.println(e.getMessage());
		}
		finally
		{
			System.out.println("Into Finally Block");
			driver.quit();
		}
		
		// TODO Auto-generated method stub

	}

}
