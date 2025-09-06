package StepDefinition;
	 
	import java.time.Duration;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
public class Checkout_page {
	    WebDriver driver;
	    nopCommercePageclass pg;
	 
	    @Given("user on homepage")
	    public void user_on_homepage() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://demo.nopcommerce.com/");
	        pg = new nopCommercePageclass(driver);
	    }
	 
	    @When("search a product and add to cart")
	    public void search_a_product_and_add_to_cart() {
	        pg.entersearchitem("Apple iCam");
	        pg.clickSearchBtn();
	        pg.addToCart();
	    }
	 
	    @And("Navigate to shopping cart")
	    public void navigate_to_shopping_cart() {
	        pg.navigateToShoppingCart();
	    }
	 
	    @And("click on agree terms")
	    public void click_on_agree_terms() {
	        pg.clickAgreeTerms();
	    }
	 
	    @And("click on checkout button")
	    public void click_on_checkout_button() {
	        pg.checkoutClick();
	    }
	 
	    @And("click on checkout as guest button")
	    public void click_on_checkout_as_guest_button() {
	        pg.guestCheckoutClick();
	    }
	 
	    @And("enter billing details")
	    public void enter_billing_details() {
	        pg.billingAddress();
	    }
	 
	    @And("click on continue button")
	    public void click_on_continue_button() {
	        pg.clickBillContinue();
	    }
	 
	    @And("select shipping method and click continue button")
	    public void select_shipping_method_and_click_continue_button() {
	        pg.shippingMethodBtnClick();
	    }
	 
	    @And("select payment method and click continue button")
	    public void select_payment_method_and_click_continue_button() {
	        pg.paymentContinueClick();
	    }
	 
	    @And("click continue for payment information")
	    public void click_continue_for_payment_information() {
	        pg.paymentInfoContinueClick();
	    }
	 
	    @And("click on confirm button")
	    public void click_on_confirm_button() {
	        pg.confirmOrderClick();
	    }
	    
	    @Then("Placed order successfully.")
	    public void placed_order_successfully() {
	        System.out.println("✅ Placed order successfully");
	        driver.close();
	    }
}

