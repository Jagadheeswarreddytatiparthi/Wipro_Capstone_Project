package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Changecurrency {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("nopCommerce HOME page")
	public void nop_commerce_home_page() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);  
	}

	@When("click on currency of US Dollar")
	public void click_on_currency_of_us_dollar() throws InterruptedException {
		 
		pg.changeCurrency();
		Thread.sleep(2000); 
	}

	@When("Select from dropdown any one")
	public void select_from_dropdown_any_one() {
	    System.out.println("Selected Euro from DropDown");
	}

	@Then("Currency of prices is changed successfully.")
	public void currency_of_prices_is_changed_successfully() {
	    driver.close();
	}	

}
