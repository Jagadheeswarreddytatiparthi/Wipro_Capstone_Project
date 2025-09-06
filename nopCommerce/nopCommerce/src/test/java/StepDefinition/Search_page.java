package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_page {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("nopCommerce home Page")
	public void nop_commerce_home_page() {
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	}


	@When("Click on Search box")
	public void click_on_search_box() throws InterruptedException {
		pg.clickonsearchbox();
		Thread.sleep(2000);
		
	   
	}

	@When("Enter an item name to search")
	public void enter_an_item_name_to_search() throws InterruptedException {
		 pg.entersearchitem("Apple icam");
		 Thread.sleep(2000);
	    
	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		pg.clickSearchBtn();
		Thread.sleep(2000);
	}

	@Then("searched items showed successfully.")
	public void searched_items_showed_successfully() {
	    driver.close();
	}



}
