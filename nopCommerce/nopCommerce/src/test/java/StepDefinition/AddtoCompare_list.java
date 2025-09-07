package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCompare_list {
	WebDriver driver;
	nopCommercePageclass pg;
	@Given("User on nopCommerce HOME page")
	public void user_on_nop_commerce_home_page() {
		driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		pg=new nopCommercePageclass(driver);
	}

	@When("Click on search box  for searching item")
	public void click_on_search_box_for_searching_item() {
		pg.clickonsearchbox();
	   
	}

	@When("enter an item to search")
	public void enter_an_item_to_search() {
		pg.entersearchitem("Apple icam");
		pg.clickSearchBtn();
		pg.selectFirstProduct();
		pg.getFirstProductName();
	    
	}

	@When("click on addtocompare button")
	public void click_on_addtocompare_button() {
		pg.addToCompare();
	  
	}

	@Then("Item is added to addtocompare successfully.")
	public void item_is_added_to_addtocompare_successfully() {
	   driver.close();
	}



	

}
