package com.selenium.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_expl {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		List<WebElement> All_Price_List = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
		List<Integer> Prize = new ArrayList<Integer>();
	
		for (WebElement Price_list : All_Price_List) {
			
			String Value = Price_list.getText().replace("Rs. ", "");
			
			//System.out.println(Value);
			
			int Values = Integer.parseInt(Value);
			
			Prize.add(Values);
			
		}
		System.out.println(Prize);
		
		System.out.println("Maximum : "+Collections.max(Prize));
		System.out.println("Minimum : "+Collections.min(Prize));
		
		int size = Prize.size();
		System.out.println("Size : "+size);
		
		
	}

}
