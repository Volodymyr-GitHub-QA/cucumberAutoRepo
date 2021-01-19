package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share){
		driver = share.setup();
	}
	
	@Given("^User need to be on login Facebook page$")
	public void user_need_to_be_on_login_Facebook_page() {
		driver.get("https://www.facebook.com");
	}
	
	@When("^User enters \"([^\"]*)\" user email$")
	public void user_enters_user_email(String userEmail) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userEmail);
		Thread.sleep(1000);
	}
	
	@And("^User enters \"([^\"]*)\" user password$")
	public void user_enters_user_password(String userPassword) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(userPassword);
		Thread.sleep(1000);
	}

	
}


