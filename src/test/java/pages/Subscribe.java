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
	@FindBy(xpath="//span[@class='nav-interact']")
	WebElement ForCorp;
	public void ForCorp() {
		ForCorp.click();
	}

}
