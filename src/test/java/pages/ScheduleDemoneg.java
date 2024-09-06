package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleDemoneg {
	WebDriver driver;
	public ScheduleDemoneg (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//span[@class='nav-interact']")
	WebElement ForCorp;
	public void ForCorp() {
		ForCorp.click();
	}
	@FindBy(xpath="//a[normalize-space()='Health & Wellness Plans']")
	WebElement HnW;
	public void HnW() {
		HnW.click();
	}
	@FindBy(xpath="//header[@id='header']//input[@id='name']")
	WebElement name;
	public void name() {
		name.sendKeys();
	}
	@FindBy(xpath="//header[@id='header']//input[@id='organizationName']")
	WebElement Oname;
	public void Oname() {
		Oname.sendKeys();
	}
	@FindBy(xpath="//header[@id='header']//input[@id='contactNumber']")
	WebElement num;
	public void num() {
		num.sendKeys();
	}
	@FindBy(xpath="//header[@id='header']//input[@id='officialEmailId']")
	WebElement mail;
	public void mail() {
		mail.sendKeys();
	}
	@FindBy(xpath="//header[@id='header']//select[@id='organizationSize']")
	WebElement Osize;
	public void Osize() {
		Osize.click();
	}
	@FindBy(xpath="//*[text()='10001+']")
	WebElement size;
	public void size() {
		size.click();
	}
	@FindBy(xpath="//header[@id='header']//div[@class='corporate-form__select-wrapper u-m-b--10 u-d-flex ']")
	WebElement interest;
	public void interest() {
		interest.click();
	}
	@FindBy(xpath="//*[text()='Taking a demo']")
	WebElement interestS;
	public void interestS() {
		interestS.click();
	}

}
