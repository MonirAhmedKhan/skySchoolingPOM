package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import base.Hooks;

public class DashboardPage extends Hooks {
	

	// Locators for the page title and the logout button
	
	By heading = By.xpath("//h2[text()='Welcome Test ']");
	By logoutBtn = By.xpath("//a[@href='elogin.php']");

	//pageFactory
	//@FindBy(xpath="//h2[text()='Welcome Test ']")
	//WebElement wlText;
	
	//@FindBy(xpath="//a[@href='elogin.php']")
	//WebElement elogin;
	
	
	// Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement( heading  ).getText();
		return head;
		
		//return wlText.getText();
	}

	// Method to click on Logout button
	public void clickLogout() {
		click(logoutBtn);
		//driver.findElement(logoutBtn).click();
		//elogin.click();
	}
	
}
