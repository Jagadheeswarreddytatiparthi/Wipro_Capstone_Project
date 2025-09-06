package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Removefromcart {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("nopCommerce HOme page")
	public void nop_commerce_h_ome_page() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	}

	
	@When("Click on search box")
	public void click_on_search_box() {
	   pg.clickonsearchbox();
	}

	@When("Enter a search item")
	public void enter_a_search_item() {
	   pg.entersearchitem("Apple icam");
	}

	@When("click on search button")
	public void click_on_search_button() {
	   pg.clickSearchBtn();
	}

	@When("Click on addtocart button")
	public void click_on_addtocart_button() throws InterruptedException {
	   pg.addToCart();
	   Thread.sleep(2000);
	   //pg.Popupclose();
	}

	@When("Click on Shopping cart")
	public void click_on_shopping_cart() throws InterruptedException {
		
	  pg.navigateToShoppingCart();
	  Thread.sleep(2000);
	}

	@When("click on remove from cart")
	public void click_on_remove_from_cart() {
	    pg.deleteitemfromCart();
	}

	@Then("item is removed from cart")
	public void item_is_removed_from_cart() {
	  driver.close();
	}




}
