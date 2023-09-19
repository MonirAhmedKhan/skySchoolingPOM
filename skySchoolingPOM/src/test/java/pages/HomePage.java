package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator for login button
	//By LoginBtn = By.xpath("//a[@href='elogin.php']");
	@FindBy(xpath="//a[@href='elogin.php']")
	WebElement LoginBtn;
	
	
	//Method to click login button
	public void clickLogin() {
		LoginBtn.click();
		//driver.findElement(LoginBtn).click();
	}
}