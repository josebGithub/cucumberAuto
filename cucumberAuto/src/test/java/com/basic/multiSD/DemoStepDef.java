package com.basic.multiSD;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {
	WebDriver driver=null;

	@Given("^User need to be on demo automation testing page$")
	public void user_need_to_be_on_demo_automation_testing_page() {
		System.setProperty("webdriver.chrome.driver","/Users/josephinebut/Library/Preferences/PyCharmEdu2018.2/scratches/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	
	@When("^User enters first name$")
	public void  user_enters_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello");
		Thread.sleep(1000);
		
	}

	
	@When("^User enters last name$")
	public void  user_enters_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Last");
		Thread.sleep(1000);
		
	}
	
	
	
}
