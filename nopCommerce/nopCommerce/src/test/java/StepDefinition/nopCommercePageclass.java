package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class nopCommercePageclass {
	WebDriver driver;
	By Register=By.linkText("Register");
	By malegender=By.id("gender-male");
	By femalegender=By.id("gender-female");
	By Firstname=By.id("FirstName");
	By Lastname=By.id("LastName");
	By Email=By.id("Email");
	By CompanyName=By.id("Company");
	By Password=By.id("Password");
	By ConfirmPassword=By.id("ConfirmPassword");
	By RegisterButton=By.id("register-button");
	By Login=By.linkText("Log in");
	By EmailField=By.id("Email");
	By PasswordField=By.id("Password");
	By LoginBtn=By.linkText("Log in");
	By searchbox=By.id("small-searchterms");
	
	By searchBtn=By.xpath("//*[@id=\"small-search-box-form\"]/button");
	
	By cartProduct = By.cssSelector(".product-item h2 a");
	
	By addCartBtn=By.cssSelector(".button-2.product-box-add-to-cart-button");
	
	By removeButtons = By.xpath("//button[text()='Remove']");
	By naviagtetoshoppingcart=By.xpath("//a[text()=\"shopping cart\"]");
	By popupclose=By.xpath("//span[@title=\"Close\"]");
	By removeBtnLocator = By.cssSelector(".remove-from-cart input[type='checkbox']");
    By removeitembutton=By.xpath("//td[@class=\"remove-from-cart\"]");
	By updateCartBtn = By.name("updatecart");
	By wishlistBtn=By.id("add-to-wishlist-button-17");
	
	By navToCartLink=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	
	By agreeTermCheck=By.id("termsofservice");
	By checkoutBtn=By.id("checkout");
	
	By guestCheckoutBtn=By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
	
	By firstNameBilling=By.id("BillingNewAddress_FirstName");
	
	By lastNameBilling=By.id("BillingNewAddress_LastName");
	
	By mailBilling=By.id("BillingNewAddress_Email");
	
	By countryBilling=By.id("BillingNewAddress_CountryId");
	
	By stateBilling=By.id("BillingNewAddress_StateProvinceId");
	
	By cityBilling=By.id("BillingNewAddress_City");
	
	By addressBilling=By.id("BillingNewAddress_Address1");
	
	By zipCodeBilling=By.id("BillingNewAddress_ZipPostalCode");
	
	By numberBilling=By.id("BillingNewAddress_PhoneNumber");
	
	By billContinueButton=By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]");
 
	By shippingMethodBtn=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
	
	By payBtnContinue=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
	
	By paymentInfoConBtn=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
	
	By confirmOrderBtn=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
	
	By logoutBtn=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	By addToCompareBtn=By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/div[2]/button");
	
	By changeCurrencyBtn=By.id("customerCurrency");
	
	By apparelBtn=By.xpath("//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[2]/div/h2/a");
	
	By shoeBtn=By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a");
	
	public nopCommercePageclass(WebDriver driver) {
		this.driver = driver;
	}
	public void clickRegisterLink() {
	    driver.findElement(Register).click();
    }
	
	 public void selectGender(String gender) {
	        if ("male".equalsIgnoreCase(gender)) {
	            driver.findElement(malegender).click();
	        } else {
	            driver.findElement(femalegender).click();
	        }
	 }
	
	 public void enterFirstName(String firstName) {
		 WebElement fn=driver.findElement(Firstname);
	        fn.sendKeys(firstName);
	    }
	 public void enterLastName(String lastName) {
		 WebElement ln=driver.findElement(Lastname);
	        ln.sendKeys(lastName);
	    }
	
	 public void enterEmail(String email) {
	        driver.findElement(Email).sendKeys(email);
	    }
	 public void entercompanyname(String companyName ) {
		WebElement companyname=driver.findElement(CompanyName);
		companyname.sendKeys(companyName);
	 }
	
	 public void setPasswordAndConfirm(String password) {
	        driver.findElement(Password).sendKeys(password);
	       driver.findElement(ConfirmPassword).sendKeys(password);
	    }
	
	 public void clickRegisterButton() {
	        driver.findElement(RegisterButton).click();
	    }
	
	 public void loginEMail(String email) {
		 driver.findElement(Email).sendKeys(email);
		 
	 }
	 public void loginpass(String pass) {
		
		 driver.findElement(Password).sendKeys(pass);
	 }
	
	 public void loginButton() {
		 driver.findElement(LoginBtn).click();
	 }
	 
	 public void clickonsearchbox() {
		driver.findElement(searchbox).click();
	 }
	 public void entersearchitem(String string) {
		    driver.findElement(searchbox).click();
			driver.findElement(searchbox).sendKeys(string);
		 }
	 public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	 }
	
	 public String getFirstProductName() {
		    List<WebElement> productLinks = driver.findElements(cartProduct);
	        return productLinks.get(0).getText();
	 }
	
	 public void selectFirstProduct() {
		    List<WebElement> productLinks = driver.findElements(cartProduct);
	        productLinks.get(0).click();
	 }
	
	 public void addToCart() {
		 WebElement addToCartButton=driver.findElement(addCartBtn);
	     addToCartButton.click();
	 }
	 public void Popupclose() {
		 driver.findElement(popupclose).click();
	 }
	 public void PopUpnavigatetoshoppingcart() {
		 WebElement popupshoppingcartlink=driver.findElement(naviagtetoshoppingcart);
		 popupshoppingcartlink.click();
	 }
	 public void deleteitemfromCart() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    try {
		        WebElement notificationLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='bar-notification']/div/p/a")));
		        notificationLink.click();
		        wait.until(ExpectedConditions.invisibilityOf(notificationLink)); // Wait for it to disappear
		    } catch (TimeoutException | NoSuchElementException e) {
		        System.out.println("Notification not present or already closed.");
		    }

		   
               driver.findElement(removeitembutton).click();
	    List<WebElement> removeButtons = driver.findElements(removeBtnLocator);
	    if (!removeButtons.isEmpty()) {
		        for (WebElement btn : removeButtons) {
		            if (!btn.isSelected()) {
	                btn.click();
	            }
		      }
		        driver.findElement(updateCartBtn).click(); // Submit removal
	}
 
	 }
	
	 public void addToWishlist() {
		 driver.findElement(wishlistBtn).click();
	 }
	
	 public void openProduct() {
		driver.findElement(By.linkText("Apple iCam")).click();
	 }
	
	 public void navigateToShoppingCart() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='topcartlink']/a/span[1]")));

		    
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cartIcon);

		    
		    try {
		        cartIcon.click();
		    } catch (ElementClickInterceptedException e) {
		        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cartIcon);
		    }
	 }
	
	 public void clickAgreeTerms() {
		driver.findElement(agreeTermCheck).click();;
	 }
	 public void checkoutClick() {
        driver.findElement(checkoutBtn).click();		
	 }
	 public void guestCheckoutClick() {
       driver.findElement(guestCheckoutBtn).click();		
	 }
	
	 public void billingAddress() {
		driver.findElement(firstNameBilling).click();
		driver.findElement(firstNameBilling).sendKeys("Jagadheeswarreddy");
		
		driver.findElement(lastNameBilling).click();
		driver.findElement(lastNameBilling).sendKeys("Tatiparthi");
		
		driver.findElement(mailBilling).click();
		driver.findElement(mailBilling).sendKeys("tatiparthijr2001@gmail.com");
		
		WebElement country=driver.findElement(countryBilling);
		country.click();
		Select sel=new Select(country);
		sel.selectByVisibleText("India");
		
		WebElement state=driver.findElement(stateBilling);
		state.click();
		Select sel2=new Select(state);
		sel2.selectByVisibleText("Andhra Pradesh");
		
		driver.findElement(cityBilling).click();
		driver.findElement(cityBilling).sendKeys("J.panguluru");
		
		driver.findElement(addressBilling).click();
		driver.findElement(addressBilling).sendKeys("abc");
		
		driver.findElement(zipCodeBilling).click();
		driver.findElement(zipCodeBilling).sendKeys("523167");
		
		driver.findElement(numberBilling).click();
		driver.findElement(numberBilling).sendKeys("9392461113");
		
	 }
	 public void clickBillContinue() {
		driver.findElement(billContinueButton).click();
	 }
	
	 public void shippingMethodBtnClick() {
		 driver.findElement(shippingMethodBtn).click();
	 }
	
	 public void paymentContinueClick(){
		driver.findElement(payBtnContinue).click();
	 }
	
	 public void paymentInfoContinueClick() {
		 driver.findElement(paymentInfoConBtn).click();
	 }
	
	 public void confirmOrderClick() {
		 driver.findElement(confirmOrderBtn).click();
	 }
	 public void clickLogout() {
		 driver.findElement(logoutBtn).click();
		
	 }
	 public void addToCompare() {
		driver.findElement(addToCompareBtn).click();
	 }
	
	 public void changeCurrency() {
		WebElement changecurr=driver.findElement(changeCurrencyBtn);
		changecurr.click();
		Select sel=new Select(changecurr);
		sel.selectByVisibleText("Euro");
		
	 }
	 public void navToApparel() {
		driver.findElement(apparelBtn).click();
	 }
	 public void clickShoes() {
		driver.findElement(shoeBtn).click();
	 }
	
		
	
}
 


