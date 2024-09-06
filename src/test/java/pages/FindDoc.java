package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindDoc {
	WebDriver driver;
	Actions action;
	Robot robo;
	
	public FindDoc (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//div[@class='product-tab__title'][normalize-space()='Find Doctors']")
	WebElement FindDr;
	public void FindDr() {
		action = new Actions(driver);
		FindDr.click();
	}
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement Loc;
	public void Loc() {
		Loc.click();
		
	}
	@FindBy(xpath="//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement SearchDoc;
	public void SearchDoc(String Dt) throws InterruptedException {
		SearchDoc.click();
		SearchDoc.sendKeys(Dt);
	    action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	}
	
	@FindBy(xpath="//button[normalize-space()='hsr layout']")
	WebElement SLoc;
	public void SLoc() {
		SLoc.click();
	}
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='container']/div[contains(@class,'container-content')]/div[contains(@class,'sticky-outer-wrapper u-cushion--medium-top u-white-bg')]/div[contains(@class,'sticky-inner-wrapper')]/div/header[contains(@class,'c-filter')]/div[contains(@class,'c-filter__top')]/div[contains(@class,'c-filter__top__wrapper')]/div[1]")
	WebElement Gender;
	public void Gender() {
		Gender.click();
	}
	
	@FindBy(xpath="//li[contains(@aria-label,'Male Doctor')]")
	WebElement GenderS;
	public void GenderS() {
		GenderS.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[2]/div[1]/div[2]/div/div/button")
	WebElement BookVisit;
	public void BookVisit() {
		BookVisit.click();
	}
	
	@FindBy(xpath= "//*[@id=\\\"container\\\"]/div/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div[2]/span")
	WebElement Date;
	public void Date() throws InterruptedException {
		Actions action= new Actions(driver);
		Date.click();
		Thread.sleep(2000);
	    action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	    Thread.sleep(2000);
	    try {
			Robot robo = new Robot();
			robo.delay(1000);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			} catch (AWTException e) {
			e.printStackTrace();
			}
		Thread.sleep(1000);
	}
	
	@FindBy(css="#container > div > div.c-listing-wrapper > div > div.pure-u-17-24.c-listing__left > div > div:nth-child(3) > div.pure-g.c-list-card__cta-block > div > div > div > div > div:nth-child(2) > div.c-day-slot > div:nth-child(3) > div.c-day-session__body.pure-g > div:nth-child(1) > span")
	WebElement Time;
	public void Time() {
		Time.click();
	}
	@FindBy(xpath="//*[@id=\\\"container\\\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/input")
	WebElement Phone;
	public void Phone() {
		Phone.click();
	}
	
	@FindBy(xpath="//*[@id=\\\"container\\\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/input")
	WebElement PhoneN;
	public void PhoneN() {
		PhoneN.click();
	}
	
	@FindBy(xpath="//*[@id=\\\"container\\\"]/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/input")
	WebElement Submit;
	public void Submit() {
		Submit.click();
	}
	
	
	
	
	

}
