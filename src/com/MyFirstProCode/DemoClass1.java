package com.MyFirstProCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		// driver.get("https://www.flipcart.com");
		 driver.manage().window().maximize();
		  Thread.sleep(1000);
			
			
			
		
		
		
		
		
		
	}

}
