package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindDoc {
	WebDriver driver;
	public FindDoc (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement Loc;
	public void Loc() {
		Loc.click();
	}
	@FindBy(xpath="//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement SearchDoc;
	public void SearchDoc() {
		SearchDoc.click();
	}
	@FindBy(xpath="//div[normalize-space()='Dentist']")
	WebElement Clinic;
	public void Clinic() {
		Clinic.click();
	}
	
	
	
	

}
