package com.selenium.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.BreakIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Robot_class_exmpl {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement best_seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		best_seller.click();
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions h = new Actions(driver);
		
		h.contextClick(mobile).build().perform();
		
		Robot u = new Robot();
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement fashion = driver.findElement(By.xpath("//a[text() = 'Fashion']"));
		h.contextClick(fashion).build().perform();
		
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement new_release = driver.findElement(By.xpath("//a[text() = 'New Releases']"));
		h.contextClick(new_release).build().perform();
		
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electr = driver.findElement(By.xpath("//a[text() = ' Electronics ']"));
		h.contextClick(electr).build().perform();
		
		u.keyPress(KeyEvent.VK_DOWN);
		u.keyRelease(KeyEvent.VK_DOWN);
		
		u.keyPress(KeyEvent.VK_ENTER);
		u.keyRelease(KeyEvent.VK_ENTER);
		
		String parent_id = driver.getWindowHandle();
		String pt_url = driver.switchTo().window(parent_id).getCurrentUrl();
		System.out.println(pt_url);
		
        Set<String> all_Tab_id = driver.getWindowHandles();
        
        for (String pt_url1 : all_Tab_id) {
			
        String currentUrl = driver.switchTo().window(pt_url1).getCurrentUrl();
       	System.out.println(currentUrl);
       	
		}
		
		String actual_url = "https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f";
		
		for (String pt_url1 : all_Tab_id) {
			
			if (driver.switchTo().window(pt_url1).getCurrentUrl().equals(actual_url)
					) {
				
			WebElement Elec_Btn = driver.findElement(By.xpath("//img[@alt='Electronics']"));
			Elec_Btn.click();
			
				
				break;
				
				
			

			}
			
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
