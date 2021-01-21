package com.example.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverClass {
	
 
	
	@Before
	public void getdriverInstance() {
		setdriver();
	}
	
	
	
	@After
	public void closeChrome() {
		chromeClosure();
	}

}
