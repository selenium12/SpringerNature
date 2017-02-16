package com.springerNature.selenium.pkg;

	
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Homepage extends TestBase {

public static void pagetest(PrintWriter printWriter) throws InterruptedException	
{
	WebDriver driver = new FirefoxDriver();

	driver.get("http://link.springer.com/");
	String Search = "Research";
	//AutoSearch Feature
	try{
	WebDriverWait waitst = new WebDriverWait(driver, 0);
    waitst.until(ExpectedConditions.visibilityOfElementLocated(By.id("query")));

    WebElement sourceTitle = driver.findElement(By.id("query"));
    
    sourceTitle.sendKeys(Search); 
    Thread.sleep(5000);
    sourceTitle.sendKeys(Keys.ARROW_DOWN);
    //Thread.sleep(5000);
    
    sourceTitle.sendKeys(Keys.ENTER);
    
    if(driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div[2]/h1/span")).getText().toLowerCase().contains(Search))
    	printWriter.println("Search successful for : " +Search + ". Displayed: " +driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div[2]/h1/span")).getText() +" page");
    else
    	printWriter.println("Search string not found: " +Search);
    return;
}
catch (Exception e)
{
	printWriter.println("Issue"+e);
	return;
}
}}
