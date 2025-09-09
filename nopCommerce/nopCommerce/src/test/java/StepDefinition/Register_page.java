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

	@When("Fill firstname as {string}")
	public void fill_firstname_as(String firstname) throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.enterFirstName(firstname);
		
	   
	}

	@When("fill lastname as {string}")
	public void fill_lastname_as(String lastname) throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
	    pg.enterLastName(lastname);
	}

	@When("fill email as {string}")
	public void fill_email_as(String email) throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.enterEmail(email);
	   
	}

	@When("fill companyName as {string}")
	public void fill_company_name_as(String companyName) throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.entercompanyname(companyName);
	   
	}

	@When("fill password  and confirmpassword as {string}")
	public void fill_password_and_confirmpassword_as(String password) throws InterruptedException {
		nopCommercePageclass pg=new nopCommercePageclass(driver);
		pg.setPasswordAndConfirm(password);
	   
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
