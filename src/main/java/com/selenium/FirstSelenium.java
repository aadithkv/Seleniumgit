 package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");

	}

}
