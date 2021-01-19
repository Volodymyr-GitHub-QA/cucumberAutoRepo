package com.basic.hooksSD;

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

public class HooksStepDef {
	
	
	WebDriver driver = null;
	
	@Before(order=1)
	public void beforeSetup1() {
		System.out.println("in before1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VTurskyi\\Documents\\Work\\AutomationTesting\\source\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before(order=2)
	public void beforeSetup2() {
		System.out.println("in before2");
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
	
//	@Then("^close browser$")
//	public void close_browser() {
//		driver.quit();
//		driver= null;
//	}
	
	@After(order=2)
	public void tearDown1() {
		System.out.println("in after1");
		driver.quit();
		driver= null;
	
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("in after2");
	}
		
}


