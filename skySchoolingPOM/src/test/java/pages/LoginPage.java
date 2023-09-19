 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base {

	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locator for username field
	By uName = By.name("mailuid");

	// Locator for password field
	By pswd = By.name("pwd");

	// Locator for login button
	By loginBtn = By.name("login-submit");

	
	//PageFactory
//	
//		@FindBy(name="mailuid")
//		WebElement uName;
//		
//		@FindBy(name="pwd")
//		WebElement passwrd;
//		
//	    @FindBy(name="pwd")
//		WebElement loginBtn;
			
	
	// Method to enter username
	public void enterUsername(String user) {
		sendKeys(uName, user);
		// driver.findElement(uName).sendKeys(user);
		//uName.sendKeys(user);
	}

	// Method to enter password
	public void enterPassword(String pass) {
           sendKeys(pswd, pass);
		//sendKeys(Keys.ENTER);
		// driver.findElement(pswd).sendKeys(pass);
		//passwrd.sendKeys(pass);
	}

	// Method to click on Login button
	public void clickLogin() {
		click(loginBtn);
		//driver.findElement(loginBtn).click();
		//loginBtn.click();
	}
}