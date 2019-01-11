package com.basic.sharedataSD;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharedataStepDef {
	
	WebDriver driver;

	public SharedataStepDef(SharedClass share) {
		driver = share.setup();
	}
		
		@Given("^User need to be on Katalon Demo login page$")
		public void user_need_to_be_on_Katalon_Demo_login_page() {
	        driver.get("http://katalon-demo-cura.herokuapp.com/profile.php#login");
		}
		
		
		@When("^User enters \"([^\"]*)\" user name$")
		public void  user_enters_the_username(String user) throws InterruptedException {
			driver.findElement(By.id("txt-username")).sendKeys(user);
			Thread.sleep(1000);
		}
		
		@And("^User enters \"([^\"]*)\" password$")
		public void user_enters_the_password(String pwd) throws InterruptedException {
			driver.findElement(By.id("txt-password")).sendKeys(pwd);
			Thread.sleep(1000);
		}
		
		
		
	
}
