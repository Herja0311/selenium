package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath_Exmpl {
	
	public static void main(String[] args) throws Throwable {
	
		System.setProperty("weddriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
		
		driver.manage().window().maximize();
		
		WebElement Iphone_7 = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span/div[2]/div[5]/div/span/div/div/div/div[2]/div/div/div/span/a/div/img"));
		
		Iphone_7.click();
		
		Thread.sleep(2000);
		
		WebElement Iphone_12pro = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span/div[2]/div[6]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		
		Iphone_12pro.click();
		
		driver.close();
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
