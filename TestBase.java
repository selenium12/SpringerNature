package com.springerNature.selenium.pkg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	WebDriver driver = new FirefoxDriver();
	String currenturl = null;
	@BeforeTest
	public void setUp(){
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://link.springer.com");	
	}
	 @AfterTest
	  public void tearDown(){
		  driver.quit(); 
	  }
}