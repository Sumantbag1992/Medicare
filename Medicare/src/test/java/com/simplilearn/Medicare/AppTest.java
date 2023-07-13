package com.simplilearn.Medicare;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	
	private ChromeDriver driver;
	private PageObjectModel page = new PageObjectModel();
	
	@BeforeClass
	public void begin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		//loads the webpage
		driver.get("http://localhost:8080/medicare/home");
		
		//clicks on login
		Thread.sleep(5000);
		driver.findElement(page.GoToLoginPage()).click();
		
		//login to the system
		Thread.sleep(3000);
		driver.findElement(page.GetUsernameField()).sendKeys("kn@gmail.com");
		driver.findElement(page.GetPasswordField()).sendKeys("12345");
		Thread.sleep(5000);
		driver.findElement(page.GetLoginButton()).click();
		
		//view and add medicine
		Thread.sleep(5000);
		driver.findElement(page.GetMedicineViewButton()).click();
		Thread.sleep(5000);
		driver.findElement(page.GetAddtoCartButton()).click();
		
		//cart checkout
		Thread.sleep(5000);
		driver.findElement(page.GetCheckoutButton()).click();
		
		//address details
		Thread.sleep(3000);
		driver.findElement(page.GetAddressLine1()).sendKeys("Saradapally");
		driver.findElement(page.GetAddressLine2()).sendKeys("Natunchati");
		driver.findElement(page.GetAddressCity()).sendKeys("Bankura");
		driver.findElement(page.GetAddressPostalCode()).sendKeys("722101");
		driver.findElement(page.GetAddressState()).sendKeys("West Bengal");
		driver.findElement(page.GetAddressCountry()).sendKeys("India");
		Thread.sleep(5000);
		driver.findElement(page.GetAddAddressButton()).click();
		
		//payment details
		Thread.sleep(3000);
		driver.findElement(page.GetCardNumber()).sendKeys("630528356825");
		driver.findElement(page.GetCardMonth()).sendKeys("02");
		driver.findElement(page.GetCardYear()).sendKeys("27");
		driver.findElement(page.GetCardCV()).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(page.GetPayButton()).click();
		
		//back to home page
		Thread.sleep(5000);
		driver.findElement(page.BackHome()).click();
	}
	
	@AfterClass
	public void end() {
		driver.quit();
	}
}