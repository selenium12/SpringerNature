package com.springerNature.selenium.pkg;

	
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homepage extends TestBase {

@Test
public void test(){
	driver.get("http://link.springer.com/");
	 WebElement element = driver.findElement(By.name("query"));
	    element.sendKeys("research");
	    element.sendKeys(Keys.RETURN);
	    String itext = driver.findElement( By.cssSelector("div#resInfo-0")).getText();
	    System.out.println("Search returned '" + itext + "'.");
}
//Checking positive and no result found scenario
public static void doCheckAbsentSearchResult(String title, String testGoal) throws IOException {
    final List<WebElement> allSearchResults = driver.findElements(By
            .xpath("//*[contains(@class, 'teaser-list')]/li/article/div[2]/h3"));
    if (allSearchResults.isEmpty()) {
        final String emptyViewText = driver.findElement(By.xpath("//div[@class='view-empty']")).getText();
        if (!emptyViewText.contains("no results found")) {
            throw new RuntimeException(emptyViewText);
        }
    } else {
        for (final WebElement searchResultElement: allSearchResults) {
            if (searchResultElement.getText().contains(title)) {
                throw new RuntimeException("");
            }
        }
    }
}
}
