package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Threadlocaltest {
	
	public static ThreadLocal<String> st = new ThreadLocal<String>();
	public String str;
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Methode");
		st.set("hello");
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Aftermethode");
	} 
	
	public String get() {
		
		return str;
	}
	
	private void set(String abc) {
		str=abc;
	}

}
