package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_expl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("hdfg@gmail.com");
		
		WebElement create_txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_txt.getText();
		System.out.println("Text :"+text);
		
		 WebElement fbk_text = driver.findElement(By.xpath("//h2[contains(text(),' helps')]"));
		 
		 String text2 = fbk_text.getText();
         System.out.println("Text :"+text2);
         
         WebElement login_Btn = driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]"));
         login_Btn.click();
         
         driver.quit();
         
		 
		
		
		
	}
}
