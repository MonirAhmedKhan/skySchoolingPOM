package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class TestCase_Login_Functionalies extends Base {
	// Creating object of home page
	HomePage home = new HomePage(driver);
	// Creating object of Login page
	LoginPage login = new LoginPage(driver);
	// Creating object of DashboardPage
	DashboardPage dashboard = new DashboardPage(driver);

	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		driver.get("https://sit.skyschooling.com/microtech");
	}
	

	@When("I click on Longin Button Menu")
	public void i_click_on_Longin_Button_Menu() {
		// Click on Login button
		home.clickLogin();
	}

	@Then("I enter user Id")
	public void i_enter_user_Id() {
		// Enter username & password
		login.enterUsername("testpilot@gmail.com");
	}

	@And("I enter Password")
	public void i_enter_Password() {
		login.enterPassword("1234");
	}

	@And("Click Login Button")
	public void click_Login_Button() throws InterruptedException {
		// Click on login button
		login.clickLogin();
		Thread.sleep(3000);
	}

	@Then("Dashboard Page will appear")
	public void dashboard_Page_will_appear() throws InterruptedException {
		assertEquals("Welcome TestS", dashboard.getHeading());
		// Click on Logout button
		dashboard.clickLogout();
		// Close browser instance
		Thread.sleep(3000);
		driver.quit();
	}

}
