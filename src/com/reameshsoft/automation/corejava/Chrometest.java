package com.reameshsoft.automation.corejava;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrometest {
	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver","D:\\jan237am batch\\janbatch12023\\Drivers\\chromedriver.exe" );
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
	    //ChromeDriver driver = new ChromeDriver();
        //RemoteWebDriver driver = new ChromeDriver();
        SearchContext sc = new ChromeDriver();
        
		Thread.sleep(5000);
		//sc.close();
		
	}

}
