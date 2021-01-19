package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDef {
	
	
	WebDriver driver = null;
	
	@Given("^User need to be on login Facebook page$")
	public void user_need_to_be_on_login_Facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VTurskyi\\Documents\\Work\\AutomationTesting\\source\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
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
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		driver= null;
	}
	
	@When("Enter following data")
	public void enter_following_data(DataTable table) {
		
		List<List<String>> data = table.raw();
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		//String values3 = data.get(0).get(2);
		

		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		//String values6 = data.get(1).get(2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(values4);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(values5);
	}
		
		
}


