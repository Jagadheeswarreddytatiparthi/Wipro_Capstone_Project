package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;


public class Register_page {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("nopCommerce home page")
	public void nop_commerce_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	   
	}

	@When("click on Register")
	public void click_on_register() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.clickRegisterLink();
		
	    
	}

	@When("Select gender")
	public void select_gender() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.selectGender("male");
	   
	}

	@When("Fill firstname")
	public void fill_firstname() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.enterFirstName("Jagadheeswarreddy");
		
	   
	}

	@When("fill last name")
	public void fill_last_name() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
	    pg.enterLastName("Tatiparthi");
	}

	@When("fill email")
	public void fill_email() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.enterEmail("tatiparthijr2001@gmail.com");
	   
	}

	@When("fill companyname")
	public void fill_companyname() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.entercompanyname("Wipro");
	   
	}

	@When("fill password and confirm password")
	public void fill_password_and_confirm_password() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.setPasswordAndConfirm("Reddy@7125");
	   
	}

	@When("click on register button")
	public void click_on_register_button() throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
	    pg.clickRegisterButton();
	}

	@Then("registration is successfull")
	public void registration_is_successfull() {
	    driver.close();
	}




}
