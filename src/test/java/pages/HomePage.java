package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//div[@class='product-tab__title'][normalize-space()='Find Doctors']")
	WebElement FindDoc;
	public void FindDoc() {
		FindDoc.click();
	}
	
	

}
