package com.basic.FirstFeatureFile;
import javax.print.DocFlavor.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	final String user="John Doe";
	
		@Given("^User need to be on Katalon Demo login page$")
		public void user_need_to_be_on_Katalon_Demo_login_page() {
			System.setProperty("webdriver.chrome.driver","/Users/josephinebut/Library/Preferences/PyCharmEdu2018.2/scratches/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("http://katalon-demo-cura.herokuapp.com/profile.php#login");
	        System.out.println("To open URL...");
		}
		
		@When("^User enters the username$")
		public void  user_enters_the_username( ) {
			driver.findElement(By.id("txt-username")).sendKeys(user);
		}
		
		@Then("^User checks user username is present$")
		public void user_checks_user_username_is_present() {
			String actualUserName=driver.findElement(By.id("txt-username")).getAttribute("value");
	        Assert.assertEquals(user, actualUserName);
		}
}
