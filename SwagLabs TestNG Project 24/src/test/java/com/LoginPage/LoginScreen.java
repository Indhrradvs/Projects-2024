package com.LoginPage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScreen {
	
	WebDriver SauceDemo;

	@Test
	public void Login() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		SauceDemo = new ChromeDriver();

		SauceDemo.manage().window().maximize();

		SauceDemo.get("https://www.saucedemo.com/");

		// SauceDemo.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Thread.sleep(3000);

		SauceDemo.findElement(By.id("user-name")).sendKeys("standard_user");

		SauceDemo.findElement(By.id("password")).sendKeys("secret_sauce");

		SauceDemo.findElement(By.name("login-button")).click();

		Thread.sleep(3000);
		
	}
	
	@Test
	public void cart() throws InterruptedException {
		

		// Adding to Cart

		SauceDemo.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

		Thread.sleep(3000);

		SauceDemo.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

		Thread.sleep(3000);

		SauceDemo.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		Thread.sleep(3000);

		// Moving to Cart

		SauceDemo.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		Thread.sleep(3000);

		// Removing Item from Cart

		SauceDemo.findElement(By.id("remove-sauce-labs-bike-light")).click();

		Thread.sleep(3000);

		// Moving Back to previous screen

		SauceDemo.findElement(By.name("continue-shopping")).click();

		Thread.sleep(3000);

		// Adding new item to cart

		SauceDemo.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

		Thread.sleep(3000);

		// Moving to Cart again

		SauceDemo.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		Thread.sleep(3000);
		
	}
	
	@Test	
	public void checkout() throws InterruptedException {

		// Check Out

		SauceDemo.findElement(By.id("checkout")).click();

		// Entering Customer Information

		String CustInfo = SauceDemo.findElement(By.xpath("//span[text()='Checkout: Your Information']")).getText();

		System.out.println(CustInfo);

		SauceDemo.findElement(By.id("first-name")).sendKeys("Frank");
		SauceDemo.findElement(By.name("lastName")).sendKeys("Martin");
		SauceDemo.findElement(By.id("postal-code")).sendKeys("22031");

		// Thread.sleep(3000);

		SauceDemo.findElement(By.id("continue")).click();

		String Checkout = SauceDemo.findElement(By.xpath("//span[text()='Checkout: Overview']")).getText();

		System.out.println(Checkout);

		String payment = SauceDemo.findElement(By.xpath("//div[@class='summary_info']")).getText();

		System.out.println(payment);

		Thread.sleep(3000);
		
		// Finishing Order

		SauceDemo.findElement(By.name("finish")).click();
		
		String confirmation = SauceDemo.findElement(By.xpath("//div[@id='checkout_complete_container']")).getText();

		System.out.println(confirmation);

        Thread.sleep(3000);

		SauceDemo.quit();
		
	}

}



