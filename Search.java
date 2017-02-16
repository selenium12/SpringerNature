package com.springerNature.selenium.pkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Search extends TestBase { 
	protected static WebElement result;
	
	@Test
	public void searchResult(){

         String search = "red";
         driver.findElement(By.id("query")).sendKeys(search);

         driver.findElement(By.id("search")).click();

         result = driver.findElement(By.className("number-of-search-results-and-search-terms"));
         String test = result.getText();
         System.out.println(test);
         System.out.println("Search results found");
   
	}
	@Test
	public void noResult(){

         String search = "++++";
         driver.findElement(By.id("query")).sendKeys(search);

         driver.findElement(By.id("search")).click();

         result = driver.findElement(By.id("no-results-message"));
         String test = result.getText();
         System.out.println(test);
         System.out.println("No results found");
         

	}
	}
