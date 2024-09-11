package com.Automation.AutomationPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class WebPagePracticeTestNG {
	
	@Test
	public void webPage()throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Basic Info

		String BaseURL = "https://seleniumelements.blogspot.com/";

		driver.get(BaseURL);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		// Retrieving URL and Title of the Page

		String pageTitle = driver.getTitle();

		System.out.println(" Title of the Page is: " + pageTitle);

		String pageURL = driver.getCurrentUrl();

		System.out.println(" Current Page URL is: " + pageURL);

		// Text Fields

		WebElement fName = driver.findElement(By.id("name"));

		fName.sendKeys("Frank");

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("frank@test.com");

		WebElement phone = driver.findElement(By.id("phone"));

		phone.sendKeys("1234567890");

		WebElement Address = driver.findElement(By.id("textarea"));

		Address.sendKeys("Washington D.C");

		// Radio buttons & Check Boxes

		WebElement gender = driver.findElement(By.name("gender"));

		gender.click();

		// Handling multiple checkboxes

		List<WebElement> daysCheckBox = driver.findElements(By.className("form-check-input"));

		// traverse through the list and select all check boxes if they are enabled and
		// displayed.

		for (int i = 0; i < daysCheckBox.size(); i++) {

			if (daysCheckBox.get(i).isDisplayed() && daysCheckBox.get(i).isEnabled()) {

				System.out.println(" Checkbox is displayed at index: " + i + " Clicking on it now");

				daysCheckBox.get(i).click();
			}

		}

		// Handling DropDowns

		List<WebElement> country = driver.findElements(By.id("country"));

		for (WebElement c : country) {

			String values = c.getText();

			System.out.println(" List of values in the Country: " + values);
		}

		WebElement cntry = driver.findElement(By.id("country"));

		Select countrySelect = new Select(cntry);

		countrySelect.selectByValue("japan");

		// Handling DropDowns

		List<WebElement> colors = driver.findElements(By.id("colors"));

		for (WebElement clr : colors) {

			String colorSelect = clr.getText();

			System.out.println("List of Colors are: " + colorSelect);

		}

		WebElement clrSelect = driver.findElement(By.id("colors"));

		Select selclr = new Select(clrSelect);

		selclr.selectByValue("white");

		// Date field

		WebElement date = driver.findElement(By.id("datepicker"));

		date.sendKeys("07/02/2024");

		//Thread.sleep(3000);

		// Handling WebTable - Verifying COLUMNs

		List<WebElement> allTblHdrs = driver.findElements(By.xpath("//table[@name='BookTable']//th"));

		System.out.println("Total headers size is: " + allTblHdrs.size()); // Returns total size of the headers

		Assert.assertEquals(allTblHdrs.size(), 4); // Verifying the size using Assertions

		boolean status = false;

		for (WebElement ele : allTblHdrs) {

			String value = ele.getText();

			System.out.println(value);

			if (value.contains("Subject")) {

				status = true;
			}

		}

		// Above "If" condition TRUE then Assert wont show any. If it fails then print
		// below statement

		Assert.assertTrue("Header is not found! ", status);

		/*
		 * Similarly we can Perform validations for ROWS & ALL the Data in the WebTable.
		 * Just change the Xpath and WebElement Name
		 */

		// Handing Wiki Search Bar

		WebElement wiki = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));

		wiki.sendKeys("Acura");

		WebElement wikiSearch = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));

		wikiSearch.click();

		// New Browser Tab

		String parentWindow = driver.getWindowHandle(); // Current window location store into Parent Window string.

		System.out.println("Current/Parent Window is: " + parentWindow);

		WebElement newBrowser = driver.findElement(By.xpath("//button[text()='New Browser Window']"));

		newBrowser.click();

		// Store newly open window into Child Window using getWindowHandles.

		for (String childWindow : driver.getWindowHandles()) {

			System.out.println("Child Window is: " + childWindow);

			driver.switchTo().window(childWindow); // Switch to Newly open window using switchTo()

		}

	//	Thread.sleep(3000);

		driver.switchTo().window(parentWindow); // Switch to Parent window using switchTo().

	//	Thread.sleep(3000);

		// Handling Alerts

		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert']"));

		alert.click();

	//	Thread.sleep(3000);

		driver.switchTo().alert().accept();

	//	Thread.sleep(3000);

		// Confirm Box

		WebElement confirmBox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));

		confirmBox.click();

	//	Thread.sleep(3000);

		driver.switchTo().alert().dismiss();

		// Retrieving Confirmation Message

		List<WebElement> message = driver.findElements(By.xpath("//p[@id='demo']"));

		for (WebElement msg : message) {

			String txt = msg.getText();

			System.out.println("Displayed Message is: " + txt);

		}

	//	Thread.sleep(3000);

		// Prompt Box

		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));

		prompt.click();

		Alert promptAlert = driver.switchTo().alert();

		promptAlert.sendKeys("Frank Martin");

	//	Thread.sleep(3000);

		promptAlert.accept();

		// Retrieving Confirmation Message

		WebElement promptmsg = driver.findElement(By.xpath("//p[@id='demo']"));

		String pmtMsg = promptmsg.getText();

		System.out.println("Displayed Message is: " + pmtMsg);

		// Double Click

		WebElement doubleClick = driver.findElement(By.id("field1"));

		doubleClick.sendKeys("Johnny!");

		Actions action = new Actions(driver);

		WebElement dblClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		action.doubleClick(dblClick).perform();

	//	Thread.sleep(3000);

		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));

		String fieldTxt = field2.getAttribute("value"); // Retrieve the text from field

		System.out.println("Copied text in Field 2: " + fieldTxt);

	//	Thread.sleep(3000);

		// Page Scroll Down

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(0, 450); ");

//		Thread.sleep(3000);

		// Drag and Drop

		Actions drgNdrp = new Actions(driver);

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		drgNdrp.dragAndDrop(drag, drop).build().perform();

		WebElement dropMsg = driver.findElement(By.xpath("//div[@id='droppable']/p"));

		String drpMsg = dropMsg.getText();

		System.out.println("Drag and " + drpMsg + " Successfully.");

//		Thread.sleep(4000);

		// Handling slider

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));

		Actions sliderAction = new Actions(driver);

		sliderAction.dragAndDropBy(slider, 100, 150).build().perform();

//		Thread.sleep(3000);

		// Handling iFrames

		WebElement iframe = driver.findElement(By.id("myIframe"));

		driver.switchTo().frame(iframe);

		WebElement iName = driver.findElement(By.name("name"));

		iName.sendKeys("Trump");

		WebElement iGender = driver.findElement(By.id("male"));

		iGender.click();

		WebElement iDob = driver.findElement(By.name("dob"));

		iDob.sendKeys("01/01/1960");

		WebElement iSubmit = driver.findElement(By.xpath("//input[@value='Submit']"));
		iSubmit.click();

//		Thread.sleep(3000);

		// Handling Submission Popup

		Alert submitAlert = driver.switchTo().alert();

		String subTxt = submitAlert.getText();

		System.out.println(subTxt);

		submitAlert.accept();

//		Thread.sleep(3000);

		driver.quit();

	}

}
