package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Selectingcaterogy {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("User on nopCommerce homepage")
	public void user_on_nop_commerce_homepage() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);   
	    
	}
	@When("Click on Apperals from below categories")
	public void click_on_apperals_from_below_categories() throws InterruptedException {
		pg.navToApparel();
		Thread.sleep(2000);  
	}

	@When("Click on shoes it is showing shoes are not")
	public void click_on_shoes_it_is_showing_shoes_are_not() throws InterruptedException {
		pg.clickShoes();
		Thread.sleep(2000);
	}

	@Then("products related to shoes are displayed successfully.")
	public void products_related_to_shoes_are_displayed_successfully() {
	   driver.close();
	}
}
