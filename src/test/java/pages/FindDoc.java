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
	@FindBy(xpath="//body/div[@id='root']/div[@id='container']/div[@class='c-home']/div[@class='c-jumbo']/div[@class='c-jumbo__banner']/div[@class='c-jumbo__omni_container']/div[@class='c-omni-wrapper']/div[@id='c-omni-container']/div[@class='c-omni u-clearfix']/div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--keyword']/div[@class='c-omni-suggestion-list']/div[@class='c-omni-suggestion-group']/div[4]/span[1]\r\n")
	WebElement Clinic;
	public void Clinic() {
		Clinic.click();
	}
	
	
	
	

}
