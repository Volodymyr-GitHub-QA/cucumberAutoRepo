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

public class ShareDataStepDef1 {
	
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass share){
		driver = share.setup();
	}
	
	@Then("^User checks \"([^\"]*)\" user email is present$")
	public void user_checks_user_first_name_is_present(String userEmail){
		
		String userEmailActual = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		Assert.assertEquals(userEmail, userEmailActual);
	}
	
	@And("^User checks \"([^\"]*)\" user password is present$")
	public void user_checks_user_password_is_present(String userPassword) {
		
		String userPasswordActual = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("value");
		Assert.assertEquals("12345", userPasswordActual);
		
	}
	
	
}


