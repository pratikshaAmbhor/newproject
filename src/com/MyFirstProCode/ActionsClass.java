package com.MyFirstProCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Web driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		WebElement user = driver.findElement(By.name("email"));
		act.click();
		act.scrollToElement(user);
		 user.sendKeys("9689782459");
		Thread.sleep(500);
		 WebElement user2 = driver.findElement(By.xpath(("(//input[@name='pass'])")));
		 act.click();
		 Thread.sleep(500);
		 user2.sendKeys("pratiksha");
		 act.scrollToElement(user2);
		Thread.sleep(1000);
	
		
		driver.close();
		
		

	}

}
