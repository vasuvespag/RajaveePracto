package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscribe {
	WebDriver driver;
	public Subscribe (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//i[@class='tab-icon c-icon__img icon-ic_read']")
	WebElement ReadArt;
	public void ReadArt() {
		ReadArt.click();
	}
	@FindBy(xpath="//span[normalize-space()='Healthy Hair']")
	WebElement HHair;
	public void HHair() {
		HHair.click();
	}
	@FindBy(xpath="//input[@placeholder='Your Email Address']")
	WebElement Mail;
	public void Mail() {
		Mail.click();
	}
	@FindBy(xpath="//i[@class='fit-feed-icon icon-ic_back']")
	WebElement Arrow;
	public void Arrow() {
		Arrow.click();
	}
	

}
