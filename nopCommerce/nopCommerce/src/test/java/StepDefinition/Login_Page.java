package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("nopCommerce Home page")
	public void nop_commerce_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	    
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
		pg=new nopCommercePageclass(driver);
		pg.loginButton();
	   
	}

	@When("Fill the {string} field")
	public void fill_the__field(String email) throws InterruptedException {
	    pg=new nopCommercePageclass(driver);
		pg.loginEMail(email);
	    
	}

	@When("fill the {string} field")
	public void fill_the_field(String password) throws InterruptedException {
	    pg=new nopCommercePageclass(driver);
		pg.loginpass(password);
	   
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
	    pg=new nopCommercePageclass(driver);
		pg.loginButton();
		
	    
	}

	@Then("login is successful.")
	public void login_is_successful() {
	   driver.close();
	}
}
