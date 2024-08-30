package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseSteps {
	public static WebDriver driver;
	@Given("I am on Practo home page")
	public void i_am_on_practo_home_page() {
		 driver = new ChromeDriver();
		 driver.get("https://www.practo.com/");
		 driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I click on Login")
	public void i_click_on_login() {
		driver.findElement(By.xpath("//a[text()='Login / Signup']")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}


	@When("I enter valid Username")
	public void i_enter_valid_username() {
		driver.findElement(By.id("username")).sendKeys("7358396634");
		
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid Password")
	public void i_enter_valid_password() {
		driver.findElement(By.id("password")).sendKeys("123456nag@");
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("login")).click();
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("I am successfully logged in")
	public void i_am_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}
