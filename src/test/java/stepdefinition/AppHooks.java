//package stepdefinition;
//
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import DriverSetup.TestSetUp;
//import driversetup.BaseSteps;
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Scenario;
//
//public class AppHooks {
//	public BaseSteps setUp;
//	public AppHooks(BaseSteps setUp)
//	{
//		this.setUp = setUp;
//	}
//	@After
//	public void tearDown() throws IOException
//	{
//		setUp.baseStep.WebDriverManager().quit();
//	}
//	@AfterStep
//	public void addScreenshot(Scenario scenario) throws IOException
//	{
//		WebDriver driver = setUp.baseStep.WebDriverManager();
//		if(scenario.isFailed())
//		{
//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot, "image/png", "image");
//		}
//	}
//}
//
