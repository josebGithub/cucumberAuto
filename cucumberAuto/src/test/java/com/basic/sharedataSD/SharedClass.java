package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver","/Users/josephinebut/Library/Preferences/PyCharmEdu2018.2/scratches/chromedriver");
        driver = new ChromeDriver();
	}
		return driver;

 }
	
	@After
	public void tearDown() {
			driver.quit();
			driver=null;
		}
	}
