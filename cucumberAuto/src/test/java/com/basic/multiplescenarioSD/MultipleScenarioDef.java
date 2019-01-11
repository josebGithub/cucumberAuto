package com.basic.multiplescenarioSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenarioDef{
	
	WebDriver driver;
	final String user="John Doe";
	final String pwd = "ThisIsNotAPassword";
	
		@Given("^User need to be on Katalon Demo login page$")
		public void user_need_to_be_on_Katalon_Demo_login_page() {
			System.setProperty("webdriver.chrome.driver","/Users/josephinebut/Library/Preferences/PyCharmEdu2018.2/scratches/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("http://katalon-demo-cura.herokuapp.com/profile.php#login");
		}
		
		@When("^User enters the username$")
		public void  user_enters_the_username( ) throws InterruptedException {
			driver.findElement(By.id("txt-username")).sendKeys(user);
			Thread.sleep(1000);
		}
		

		@And("^User enters the password$")
		public void user_enters_the_password() throws InterruptedException {
			driver.findElement(By.id("txt-password")).sendKeys(pwd);
			Thread.sleep(1000);
		}
		
		@Then("^User checks user username is present$")
		public void user_checks_user_username_is_present() {
			String actualUserName=driver.findElement(By.id("txt-username")).getAttribute("value");
	        Assert.assertEquals(user, actualUserName);
		}
		
		
		@And("^User checks user password is present$")
		public void user_checks_user_password_is_present() {
			String actualUserPwd=driver.findElement(By.id("txt-password")).getAttribute("value");
			System.out.print(actualUserPwd);
			Assert.assertEquals(pwd, actualUserPwd);
		}
		@Then("^close brower$")
		public void close_brower(){
			driver.quit();
			driver=null;
		}
}
