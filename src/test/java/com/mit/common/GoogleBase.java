package com.mit.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	
	public WebDriver driver;
	
	public void launchBrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.close();
		
	}

}
