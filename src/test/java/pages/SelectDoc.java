package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDoc {
	WebDriver driver;
	public SelectDoc (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//button[normalize-space()='anna nagar']")
	WebElement SLoc;
	public void SLoc() {
		SLoc.click();
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='container']/div[contains(@class,'container-content')]/div[contains(@class,'sticky-outer-wrapper u-cushion--medium-top u-white-bg active')]/div[contains(@class,'sticky-inner-wrapper')]/div/header[contains(@class,'c-filter')]/div[contains(@class,'c-filter__top')]/div[contains(@class,'c-filter__top__wrapper')]/div[1]")
	WebElement Gender;
	public void Gender() {
		Gender.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='Female Doctor']")
	WebElement GenderS;
	public void GenderS() {
		GenderS.click();
	}
	
	
	@FindBy(xpath="//div[contains(@class,'c-listing-wrapper')]//div[4]//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//button[1]//div[1]")
	WebElement BookVisit;
	public void BookVisit() {
		BookVisit.click();
	}
	
	
	
	

}
