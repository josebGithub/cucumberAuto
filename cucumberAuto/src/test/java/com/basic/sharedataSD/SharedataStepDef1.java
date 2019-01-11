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

public class SharedataStepDef1 {
	
	WebDriver driver;

	
	public SharedataStepDef1(SharedClass share) {
		driver = share.setup();
	}
		
		@Then("^User checks \"([^\"]*)\" user name is present$")
		public void user_checks_user_username_is_present(String userName) {
			String actualUserName=driver.findElement(By.id("txt-username")).getAttribute("value");
	        Assert.assertEquals(userName, actualUserName);
		}
		
		
		@And("^User checks \"([^\"]*)\" password is present$")
		public void user_checks_user_password_is_present(String pwd) {
			String actualUserPwd=driver.findElement(By.id("txt-password")).getAttribute("value");
			System.out.print(actualUserPwd);
			Assert.assertEquals(pwd, actualUserPwd);
		}
		

		
		
		
	
}
