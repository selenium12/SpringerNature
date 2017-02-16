package com.springerNature.selenium.pkg;

import java.awt.AWTException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
	public static class Bookingflow {
		// static WebDriver driver = new ChromeDriver();

		public static  WebDriver driver;
		protected static String tP_URL;

		@Test
		public void tpRegressionSuite() throws InterruptedException, AWTException,
				FileNotFoundException, UnsupportedEncodingException {
			
			//System.out.println("ABOUT US PAGE");
			// OPEN BROWSER

			driver = new FirefoxDriver();
			driver.get("http://link.springer.com/");
			driver.manage().window().maximize();

			// Output file is created
			String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss")
					.format(new Date());
			File file = new File(
					"P:\\Documentation\\Output\\Output"
							+ idForTxtFile + ".txt");
			PrintWriter printWriter = new PrintWriter(file, "UTF-8");
			printWriter.println("Output File");
			try{			
			
			//Page_Home.pagetest(printWriter);
				printWriter.close();
				driver.quit();
				}
				catch (Exception e){
					
					printWriter.close();
					
					
				}
	
  
		}}}
