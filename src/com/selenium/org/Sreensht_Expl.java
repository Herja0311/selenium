package com.selenium.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sreensht_Expl {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium_Newclass\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abhh@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("hfg");
		
		WebElement login_Btn = driver.findElement(By.name("login"));
		login_Btn.click();
		
		Thread.sleep(3000);
		
		TakesScreenshot hs = (TakesScreenshot) driver;
		
		File Source = hs.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium_Newclass\\Screenshot\\snap.png");
		
		FileUtils.copyFile(Source, destination);
		
		driver.close();
		
		
	}

}
