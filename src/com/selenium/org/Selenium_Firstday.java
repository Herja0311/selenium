package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Firstday {
	
  public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium_Newclass\\Driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();  // upcasting method
	  
	  driver.get("https://www.facebook.com/");
	 
	  driver.manage().window().maximize();
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  driver.navigate().to("https://www.amazon.in/");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  driver.quit();
	  
	  
	  
	  
	  
	  
	
	  
	  
}

}
