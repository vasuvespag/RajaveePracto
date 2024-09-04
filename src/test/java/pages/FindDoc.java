package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ch.qos.logback.core.joran.action.Action;

public class FindDoc {
	WebDriver driver;
	Actions action= new Actions(driver);
	public FindDoc (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement Loc;
	public void Loc(String loc) {
		Loc.click();
		Loc.clear();
		Loc.sendKeys(loc);
	}
	@FindBy(xpath="//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement SearchDoc;
	public void SearchDoc(String Gp) {
		SearchDoc.click();
		SearchDoc.sendKeys(Gp);
	    action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	
	
	
	

}
