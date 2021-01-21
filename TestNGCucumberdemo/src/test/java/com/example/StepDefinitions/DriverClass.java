package com.example.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
	
	public static ThreadLocal<ChromeDriver> dr = new ThreadLocal<>();
	
	public WebDriver getDriver() {
		return dr.get();
	}
	
	
	public void setdriver() {
		 System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	        dr.set(new ChromeDriver());	   
	}
	
	
	public void chromeClosure() {
		getDriver().close();
	}

}
