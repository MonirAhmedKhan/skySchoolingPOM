package pages;

import org.openqa.selenium.By;

import base.Base;
import base.Hooks;

public class Employee_login_functionalities_Page extends Hooks {
 By empLoginPage = By.xpath("//div//h1");
 By userID = By.name("mailuid");
 By pass = By.name("pwd");
 By emploginbtn = By.name("login-submit");
 By empHomePage = By.xpath("//h2[text()='Welcome Test ']");
 
 
 public String Emp_Login_Page() {
	 return getText(empLoginPage);
 }
 public void enter_User_Id(String id) {
		//enterUserId.sendKeys(id);
		sendKeys(userID,id);
	}
 public void enter_User_pass(String password) {
		//enterUserId.sendKeys(id);
		sendKeys(pass,password);
	}
 public void click_Emp_Login_Btn() {
		click(emploginbtn);
	}
 public String Emp_Home_Page() {
	 return getText(empHomePage);
 }
}
