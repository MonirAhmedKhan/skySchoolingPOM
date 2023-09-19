package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends Base {
	
	protected static WebDriver driver;
	
	@Before
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);                   
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@After
	public void tearDown(Scenario scenario) {
		
		try {
			String screenshotName= scenario.getName().replace (" ", "");
			System.out.println("<"+screenshotName+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			if(scenario.isFailed()) {
				scenario.log("this is my failure message 555");
				TakesScreenshot ts = (TakesScreenshot)driver;
				byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
			
//			if (scenario.isFailed()) {
//				TakesScreenshot ts = (TakesScreenshot)driver;
//				byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(src, "image/png", "screenshot");
//				scenario.log("this is my failed test case screenshot");
//				scenario.log("Scenario: " + scenario.getName() );
//			}

//			if (driver!=null)
//				driver.close();
//			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = browser.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}

	public static void submit(By by){
		driver.findElement(by).submit();
	}
	public static void navigateURL(String url) {
		driver.get( url );
	}
	
}
