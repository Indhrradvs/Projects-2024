package com.bdd.pages;

import static com.bdd.utils.SeleniumReusableFunctions.Click;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.bdd.utils.WebDriverUtils.*;

public class HomePage {

	public static void clickStoreOption() {

		// maintaining webElements by creating reference variables

		By storeLink = By.xpath("//a[text()='Store']");

		Click(storeLink);

		// gdriver.findElement(By.xpath("//a[text()='Store']")).click();
	}

	public static void verifyStoreText() {

		String ActualTitle = driver.getTitle();

		System.out.println("Title of Store Page is: " + ActualTitle);

		String ExpectedTitle = "Google Store for Google Made Devices & Accessories";

		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}

	public static void watches() throws InterruptedException {

		By watchOption = By.xpath("//a[text()='Watches & Trackers']");

		Click(watchOption);
		
		Thread.sleep(3000);

		By ShopOffers = By.xpath("//span[text()='Shop offers']");

		Click(ShopOffers);

	}
}
