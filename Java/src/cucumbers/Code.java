package cucumbers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Code {
	public WebDriver driver;
	@Given("^User Launch Application$")
	public void User_Launch_Application() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://facebook.com");
	    driver.manage().window().maximize();}
	@When("^User Enter UID and PWD and CLick on Login$")
	public void User_Enter_UID_and_PWD_and_CLick_on_Login() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("sdfsdf");
	   driver.findElement(By.id("pass")).sendKeys("sdfsd");	}
	@Then("^User able to Login$")
	public void User_able_to_Login() throws Throwable {
	    System.out.println(driver.getTitle());
	    driver.close();	}
	@When("^User Enter Invalid UID and PWD and click on Login$")
	public void User_Enter_Invalid_UID_and_PWD_and_click_on_Login() throws Throwable {
	   System.out.println(driver.getCurrentUrl());	}
	@Then("^User unable to login$")
	public void User_unable_to_login() throws Throwable {
	   driver.close();	}
}
