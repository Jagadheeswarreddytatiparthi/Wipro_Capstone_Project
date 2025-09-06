package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_Page {
	WebDriver driver;
	nopCommercePageclass pg;
	
	@Given("nopCommerce home PagE")
	public void nop_commerce_home_pag_e() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	    
	}

	@When("Click on Search Box")
	public void click_on_search_box() throws InterruptedException {
		pg.clickonsearchbox();
		Thread.sleep(2000);
		
	    
	}

	@When("Enter an item name to Search")
	public void enter_an_item_name_to_search() throws InterruptedException {
		pg.entersearchitem("Apple icam");
		Thread.sleep(2000);
	    
	}

	@When("Click on search buttoN")
	public void click_on_search_butto_n() throws InterruptedException {
		pg.clickSearchBtn();
		Thread.sleep(2000);
	    
	}

	@When("Click on Addtocart button")
	public void click_on_addtocart_button() throws InterruptedException {
		pg.addToCart();
		Thread.sleep(2000);
		
	    
	}

	@Then("Item is added to cart successfully.")
	public void item_is_added_to_cart_successfully() {
	   driver.close();
	}




}
