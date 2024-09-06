package stepdefinition;
import pages.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	FindDoc Doc;
	@Given("User is on Practo home page")
	public void user_is_on_practo_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.practo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Doc = new FindDoc(driver);   
	}

	@When("User clicks on Find Doctors")
	public void user_clicks_on_find_doctors() {
		Doc.FindDr();
	    
	}

	@When("User selects a location")
	public void user_selects_a_location() {
	    Doc.Loc();
	}

	@When("User chooses Clinics as <{string}>")
	public void user_chooses_clinics_as(String Dt) throws InterruptedException {
		Doc.SearchDoc(Dt);
	    
	}


	@When("User selects a specific location")
	public void user_selects_a_specific_location() {
		Doc.SLoc();
	    
	}

	@When("User select a gender")
	public void user_select_a_gender() {
		Doc.Gender();
	    
	}
	@When("User Selects Male")
	public void user_selects_male() {
	    Doc.GenderS();
	}

	@When("User selects on book clinic visits")
	public void user_selects_on_book_clinic_visits() {
		Doc.BookVisit();
	    
	}

	@When("User selects a date")
	public void user_selects_a_date() throws InterruptedException {
		Doc.Date();
	    
	}

	@When("User selects a time slot")
	public void user_selects_a_time_slot() {
		Doc.Time();
	   
	}

	@When("User enters phone number")
	public void user_enters_phone_number() {
		Doc.PhoneN();
	    
	}

	@Then("the time slot should be successfully selected")
	public void the_time_slot_should_be_successfully_selected() {
		Doc.Submit();
	   
	}
}