package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abslt_expl {
	public static void main(String[] args) {

		System.setProperty("weddriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().window().maximize();
		
		WebElement mens_wear_img = driver.findElement(By.xpath("//div[@id='desktopSearchResults']/div[2]/section/ul/li/a/div/div/div/div/picture/img"));
	
		mens_wear_img.click();
		
	}
	

}
