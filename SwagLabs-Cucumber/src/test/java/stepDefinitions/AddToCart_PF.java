package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import pageFactory.AddItemsToCart_PF;

public class AddToCart_PF extends AbstractPageSetup {

	WebDriver driver = getDriver();

	loginSteps_PF swagslogin;

	AddItemsToCart_PF itemsAdd = new AddItemsToCart_PF(driver);

	@When("select the items to the cart")
	public void select_the_items_to_the_cart() throws InterruptedException {

		System.out.println("-- I'M in AddToCart_PF class ");

		Thread.sleep(3000);

		// Adding to Cart

		itemsAdd = new AddItemsToCart_PF(driver);

		itemsAdd.additems();

		Thread.sleep(3000);

	}

	@Then("move to the cart")
	public void Move_to_the_cart() throws InterruptedException {

		// Moving to Cart

		itemsAdd.Goto_Cart();

		Thread.sleep(3000);

	}

	@And("remove some item from the cart")
	public void remove_some_item_from_the_cart() throws InterruptedException {

		// Removing Item from Cart

		itemsAdd.removeitem();

		Thread.sleep(3000);

	}

	@Then("Move back to Previous page")
	public void move_back_to_previous_page() throws InterruptedException {

		// Moving Back to previous screen

		itemsAdd.Goto_prevPg();

		Thread.sleep(3000);
	}

	@Then("Add another item to the cart")
	public void add_another_item_to_the_cart() throws InterruptedException {

		// Adding new item to cart

		itemsAdd.Add_Newitem();

		Thread.sleep(3000);

	}

	@Then("Move to cart Again")
	public void move_to_cart_again() throws InterruptedException {

		// Moving to Cart again

		itemsAdd.Goto_cart();

		Thread.sleep(3000);

	}

	@Then("Click on Checkout button")
	public void click_on_checkout_button() {

		// Check Out

		itemsAdd.click_checkout();

	}

	@Then("Enter customer details")
	public void enter_customer_details(DataTable dataTable) throws InterruptedException {

		
		// Entering Customer Information

		String CustInfo = driver.findElement(By.xpath("//span[text()='Checkout: Your Information']")).getText();

		System.out.println(CustInfo);
		
		List<List<String>> custData = dataTable.asLists(String.class);
		
		//Verifying the data is printing on console
		for(List<String> e: custData) {
			
			System.out.println(e);
		}
		
		itemsAdd.FirstName(custData.get(0).get(0));
		
		itemsAdd.LastName(custData.get(0).get(1));
        
		itemsAdd.PinCode(custData.get(0).get(2));

		Thread.sleep(3000);

		itemsAdd.Continue();

		String Checkout = driver.findElement(By.xpath("//span[text()='Checkout: Overview']")).getText();

		System.out.println(Checkout);

		String payment = driver.findElement(By.xpath("//div[@class='summary_info']")).getText();

		System.out.println(payment);

		Thread.sleep(3000);
	}

	@Then("Finish order and capture the confirmation")
	public void Finish_order_and_capture_the_confirmation() throws InterruptedException {

		// Finishing Order

		itemsAdd.FinishOrder();

		String confirmation = driver.findElement(By.xpath("//div[@id='checkout_complete_container']")).getText();

		System.out.println(confirmation);

		Thread.sleep(3000);

		driver.quit();
	}

}
