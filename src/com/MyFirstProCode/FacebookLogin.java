package com.MyFirstProCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

           System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Test case1
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pratikshambhore95@gmail.com");
		Thread.sleep(3000);
		//TestCase2
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("p9689782459");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@id='u_0_5_kf']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
