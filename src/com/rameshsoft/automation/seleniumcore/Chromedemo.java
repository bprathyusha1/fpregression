package com.rameshsoft.automation.seleniumcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\jan237am batch\\janbatch12023\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.gmail.com");
		
		String title = driver.getTitle();
		System.out.println("title is:"+title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url is:"+currenturl);
		
		String currentwindowhandle=driver.getWindowHandle();
		System.out.println("current window is:"+currentwindowhandle);
		
		String pagesource=driver.getPageSource();
		
		//identify the elements
		//WebElement username=driver.findElement(By.id("identifierId"));
		WebElement username=driver.findElement(By.id("identifierId"));
		
		//perform action
		username.clear();
		username .sendKeys("prathyushab119@gmail.com");
		//WebElement nxt = driver.findElement(By.id("identifiernext"));
		WebElement nxt = driver.findElement(By.id("identifiernext"));
		nxt.click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
