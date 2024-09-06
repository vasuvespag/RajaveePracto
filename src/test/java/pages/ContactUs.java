package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	WebDriver driver;
	public ContactUs (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//span[normalize-space()='Security & help']")
	WebElement SH;
	public void SH() {
		SH.click();
	}
	@FindBy(xpath="//a[@event='Nav Bar:Interacted:Practo security']")
	WebElement Security;
	public void Security() {
		Security.click();
	}
	@FindBy(xpath="//div[contains(text(),'For Providers')]")
	WebElement FProv;
	public void FProv() {
		FProv.click();
	}
	@FindBy(xpath="//a[contains(@href,'https://help.practo.com/practo/empowering-patient-experience-with-digital-healthcare/')]")
	WebElement More;
	public void More() {
		More.click();
	}
	@FindBy(xpath="//a[@href=' https://help.practo.com/contact-us/contact-us/']//img")
	WebElement Contact;
	public void Contact() {
		Contact.click();
	}
	@FindBy(xpath="//input[@id='Field1']")
	WebElement Name;
	public void Name() {
		Name.sendKeys();
	}
	@FindBy(xpath="//input[@id='Field2']")
	WebElement Number;
	public void Number() {
		Number.sendKeys();
	}
	@FindBy(xpath="//input[@id='Field15']")
	WebElement Email;
	public void Email() {
		Email.sendKeys();
	}
	@FindBy(xpath="//select[@id='Field20']")
	WebElement Country;
	public void Country() {
		Country.click();
	}
	@FindBy(xpath="//*[@id=\"Field20\"]/option[2]")
	WebElement SCountry;
	public void SCountry() {
		SCountry.click();
	}
	@FindBy(xpath="//input[@id='Field13']")
	WebElement City;
	public void City() {
		City.sendKeys();
	}
	@FindBy(xpath="//select[@id='Field7']")
	WebElement IIn;
	public void IIn() {
		IIn.click();
	}
	@FindBy(xpath="//*[@id=\"Field7\"]/option[2]")
	WebElement SIIn;
	public void SIIn() {
		SIIn.click();
	}
	@FindBy(xpath="//*[@id=\"Field22\"]")
	WebElement YClinic;
	public void YClinic() {
		YClinic.click();
	}
	@FindBy(xpath="//*[@id=\"Field22\"]/option[1]")
	WebElement SYClinic;
	public void SYClinic() {
		SYClinic.click();
	}
	@FindBy(xpath="//select[@id='Field24']")
	WebElement IAm;
	public void IAm() {
		IAm.click();
	}
	@FindBy(xpath="//*[@id=\"Field24\"]/option[2]")
	WebElement IAmP;
	public void IAmP() {
		IAmP.click();
	}
	@FindBy(xpath="//textarea[@id='Field9']")
	WebElement Mes;
	public void Mes() {
		Mes.sendKeys();
	}
	
	
	
}
