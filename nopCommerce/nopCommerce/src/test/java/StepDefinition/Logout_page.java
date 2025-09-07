package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_page {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("UseR is on Home page")
	public void use_r_is_on_home_page() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	    
	}

	@When("Clicking on login button")
	public void clicking_on_login_button() {
		pg.loginButton();
	}

	@When("entering valid email and password and click on login button")
	public void entering_valid_email_and_password_and_click_on_login_button() {
		pg.loginEMail("tatiparthijr2001@gmail.com");
		pg.loginpass("Reddy@7125");
		pg.loginButton();
	}

	@When("after click on logout button")
	public void after_click_on_logout_button() {
		pg.clickLogout();
	   
	}

	@Then("You are logout from your account successfully.")
	public void you_are_logout_from_your_account_successfully() {
	   driver.close();
	}




}
