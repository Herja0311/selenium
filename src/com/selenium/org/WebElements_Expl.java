package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Expl {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium_Newclass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("abfur@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("jhjb");
		
		WebElement login_Btn = driver.findElement(By.name("login"));
		login_Btn.click();
		
		driver.quit();
		
		
		
		
		
		
	}

}
