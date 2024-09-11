package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.AbstractPageSetup;

public class AddItemsToCart_PF extends AbstractPageSetup {

	/*
	 * Creating CONSTRUCTOR to get DRIVER INSTANCE and
	 * 
	 * initialize ELEMENTS using initElements Method
	 */

	WebDriver AddItemsDriver = getDriver();

	public AddItemsToCart_PF(WebDriver driver) {

		AddItemsDriver = driver;

		PageFactory.initElements(driver, this);

	}

	// Creating Locators for all objects on the WebPage

	// Adding items to cart

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement item1;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement item2;

	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	WebElement item3;

	// Click on Cart Button

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement btn_cart;

	// Delete item
	@FindBy(id = "remove-sauce-labs-bike-light")
	WebElement del_cart;

	// Moving to Previous page
	@FindBy(name = "continue-shopping")
	WebElement PrevPage;

	// Add new item to cart
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement add_newitem;

	// Going to cart
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement move2_cart;

	// Goto CheckOut
	@FindBy(id = "checkout")
	WebElement btn_checkout;

	// Adding customer information

	@FindBy(id = "first-name")
	WebElement Fname;

	@FindBy(name = "lastName")
	WebElement Lname;

	@FindBy(id = "postal-code")
	WebElement zipcode;

	// Click on Continue button

	@FindBy(id = "continue")
	WebElement btn_continue;

	// Retrieving Check out Overview data

	@FindBy(xpath = "//span[text()='Checkout: Overview']")
	WebElement checkout_Info;

	// Retrieving Payment information

	@FindBy(xpath = "//div[@class='summary_info']")
	WebElement payment_Info;

	// Finish Order

	@FindBy(name = "finish")
	WebElement btn_finish;

	// Printing Confirmation

	@FindBy(xpath = "//div[@id='checkout_complete_container']")
	WebElement confirm_Info;

	/* Creating Functions/Methods */

	public void additems() {

		item1.click();
		item2.click();
		item3.click();
	}

	public void Goto_Cart() {

		btn_cart.click();

	}

	public void removeitem() {
		del_cart.click();

	}

	public void Goto_prevPg() {

		PrevPage.click();

	}

	public void Add_Newitem() {

		add_newitem.click();
	}

	public void Goto_cart() {

		move2_cart.click();

	}

	public void click_checkout() {

		btn_checkout.click();
	}
	
	/*
	 * public void consumerInfo(String Firstname, String Lastname, String Zipcode) {
	 * 
	 * Fname.sendKeys(Firstname); Lname.sendKeys(Lastname);
	 * zipcode.sendKeys(Zipcode);
	 * 
	 * }
	 */

	public void FirstName(String Firstname) {

		Fname.sendKeys(Firstname);

	}
	
	public void LastName(String Lastname) {

		Lname.sendKeys(Lastname);

	}
	public void PinCode(String Zipcode) {

		zipcode.sendKeys(Zipcode);

	}

	public void Continue() {

		btn_continue.click();
	}

	public void FinishOrder() {

		btn_finish.click();
	}

}
