package com.example;

import org.testng.*;
import org.testng.annotations.Test;

public class ThreadlocalTestclass extends Threadlocaltest {
	
	
	@Test
	public void test1() {
		System.out.println( get()+ "1z--------" +Thread.currentThread().getId() );
		System.out.println("Test for git plugin");
		System.out.println("Test for git plugintest branch");
		System.out.println("Test for git plugintest branch");
		System.out.println("Test for git plugintest branch");
		System.out.println("Test for git plugintest branch");
		
		System.out.println("Test for git plugintest branch");
	}
	
	@Test
	public void test2() {
		System.out.println(get()+ "2------------"+Thread.currentThread().getId() );
	}
	@Test
	public void test3() {
		System.out.println(get()+ "3-------------"+Thread.currentThread().getId() );
	}
	@Test
	public void test4() {
		System.out.println(get()+ "4--------------"+Thread.currentThread().getId() );
	}
	@Test
	public void test5() {
		System.out.println(get()+ "5-----------------"+Thread.currentThread().getId() );
	}
	
	@Test
	public void test6() {
		System.out.println(get()+ "6-----------------"+Thread.currentThread().getId() );
	}
	

}
