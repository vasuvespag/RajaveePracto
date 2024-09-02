package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTime {
	WebDriver driver;
	public SelectTime (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//div[@class='pure-u-1-3 c-day-label c-day-label--selected']//span[contains(text(),'28 slots available')]")
	WebElement Date;
	public void Date() {
		Date.click();
	}
	
	@FindBy(xpath="//span[normalize-space()='04:00 PM']")
	WebElement Time;
	public void Time() {
		Time.click();
	}

}
