package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Absolute_Xpath_2 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("weddriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
		
		driver.manage().window().maximize();
		
		WebElement Iphone_8plus = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[15]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		
		Iphone_8plus.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(Iphone_8plus));
		
		WebElement Iphone_12mini = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[11]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		
		Iphone_12mini.click();
		
        Thread.sleep(3000);
		
		WebElement Iphone_11 = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[16]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		
		Iphone_11.click();  
		
		driver.close();
		
		

	}
}