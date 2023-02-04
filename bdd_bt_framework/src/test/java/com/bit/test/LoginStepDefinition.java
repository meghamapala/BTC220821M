package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "");
		dr=new ChromeDriver();
	 
	}

	@Given("^go to facebook\\.com$")
	public void go_to_facebook_com() throws Throwable {
	   dr.get("http://www.facebook.com/");
	}

	@When("^user type valid userId in username textbox$")
	public void user_type_valid_userId_in_username_textbox() throws Throwable {
	  dr.findElement(By.id("")).sendKeys("");
	}

	@When("^user type valid password in password textbox$")
	public void user_type_valid_password_in_password_textbox() throws Throwable {
	    dr.findElement(By.id("")).sendKeys("");
	}

	@When("^user click in Login button$")
	public void user_click_in_Login_button() throws Throwable {
		dr.findElement(By.id("")).click();
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
		if(dr.findElement(By.id("profileLogo")).isDisplayed()) {
			System.out.println("profile is verified successfully");
		}
	   
	}

	@When("^user type \"([^\"]*)\" in username textbox$")
	public void user_type_in_username_textbox(String arg1) throws Throwable {
		dr.findElement(By.id("")).sendKeys(arg1);
	   
	}

	@When("^user type \"([^\"]*)\" in password textbox$")
	public void user_type_in_password_textbox(String arg1) throws Throwable {
		dr.findElement(By.id("")).sendKeys(arg1);
    }

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
	  
	}

}
