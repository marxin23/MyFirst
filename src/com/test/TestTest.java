package com.test;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import java.nio.*;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class TestTest {
	public static WebDriver driver = null;
	
	String path = "E:\\Software\\Java\\chromedriver_win32\\chromedriver.exe";
	
	@Before
	public void inital() throws Exception
	{
		//String driverPath = "C:\Program Files (x86)\Google\Chrome\Application";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		
	}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		try
		{
		//String URL = "http://google.com";
			String search = "irctc";
		driver.get("http://google.com");
		//Thread.sleep(1000);
		
		WebDriverWait ws = new WebDriverWait(driver, 20);
		ws.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		driver.findElement(By.id("lst-ib")).sendKeys(search);
		driver.findElement(By.id("_fZl")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		if (driver.getTitle().equalsIgnoreCase("Google"))
		{
			System.out.println(driver.getClass().toString());
			String expected = "Google";
			String actual = driver.getTitle();
			Assert.assertEquals(expected, actual);
		}
		else
			System.out.println(driver.getTitle());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	@After
	public void exit()
	{
		driver.close();
	}
	

}
