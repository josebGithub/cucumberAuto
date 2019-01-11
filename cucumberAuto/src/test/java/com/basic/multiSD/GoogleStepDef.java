package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	WebDriver driver=null;

		@Given("^User need to be on google page$")
		public void user_need_to_be_on_google_page() {
			System.setProperty("webdriver.chrome.driver","/Users/josephinebut/Library/Preferences/PyCharmEdu2018.2/scratches/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("http://www.google.com");
		}
		
		
		@When("^User enters search$")
		public void  user_enters_search() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium");
			Thread.sleep(1000);
			
		}
		


}
