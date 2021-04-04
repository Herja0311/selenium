package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Others {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		
		boolean enabled = mail.isEnabled();
		System.out.println("Enabled or Not :"+enabled);
		
		boolean displayed = mail.isDisplayed();
		System.out.println("Displayed or Not :"+displayed);
		
		mail.sendKeys("fduf@gmail.com");
		
		
		
	 
		
		
		
		
	}
}
