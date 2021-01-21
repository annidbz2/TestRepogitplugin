package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepDefs extends DriverClass {

    @Given("^Launch Google Home Page$")
    public void launchGoogle(){

         getDriver().get("https://google.com");
         System.out.println("Google"+ Thread.currentThread().getId());
         getDriver().manage().window().maximize();
        Assert.assertTrue(getDriver().getTitle().equals("Google"));
        
    }
    
    
    @Given("^Launch Tesla Home Page$")
    public void launchTesls(){

    	 getDriver().get("https://tesla.com");
    	 System.out.println("Tesla"+ Thread.currentThread().getId());
         getDriver().manage().window().maximize();

    }
}