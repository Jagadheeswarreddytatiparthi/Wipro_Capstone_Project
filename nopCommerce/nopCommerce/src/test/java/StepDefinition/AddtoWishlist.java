package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoWishlist {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("USER on home page")
	public void user_on_home_page() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	    
	}

	@When("User search for item by entering item name by clicking search box")
	public void user_search_for_item_by_entering_item_name_by_clicking_search_box() {
		pg.clickonsearchbox();
		pg.entersearchitem("Apple icam");
		pg.clickSearchBtn();
		pg.selectFirstProduct();
		pg.getFirstProductName();
	}

	@When("Click on the add to wishlist button")
	public void click_on_the_add_to_wishlist_button() {
		pg.addToWishlist();
	   
	}

	@Then("Item is added to wishlist successfully.")
	public void item_is_added_to_wishlist_successfully() {
	   driver.close();
	}




}
