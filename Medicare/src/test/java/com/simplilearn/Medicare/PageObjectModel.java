package com.simplilearn.Medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel {
	WebDriver driver;
	
	public By GoToLoginPage() {
		return By.xpath("//*[@id=\"login\"]/a");
	}
	
	public By GetUsernameField() {
		return By.xpath("//*[@id=\"username\"]");
	}
	public By GetPasswordField() {
		return By.xpath("//*[@id=\"password\"]");
	}
	public By GetLoginButton() {
		return By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]");
	}
	
	public By GetMedicineViewButton() {
		return By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div/a");
	}
	public By GetAddtoCartButton() {
		return By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/a[1]");
	}
	
	public By GetCheckoutButton() {
		return By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a");
	}
	
	public By GetAddressLine1() {
		return By.xpath("//*[@id=\"addressLineOne\"]");
	}
	public By GetAddressLine2() {
		return By.xpath("//*[@id=\"addressLineTwo\"]");
	}
	public By GetAddressCity() {
		return By.xpath("//*[@id=\"city\"]");
	}
	public By GetAddressPostalCode() {
		return By.xpath("//*[@id=\"postalCode\"]");
	}
	public By GetAddressState() {
		return By.xpath("//*[@id=\"state\"]");
	}
	public By GetAddressCountry() {
		return By.xpath("//*[@id=\"country\"]");
	}
	public By GetAddAddressButton() {
		return By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button");
	}
	
	public By GetCardNumber() {
		return By.xpath("//*[@id=\"cardNumber\"]");
	}
	public By GetCardMonth() {
		return By.xpath("//*[@id=\"expityMonth\"]");
	}
	public By GetCardYear() {
		return By.xpath("//*[@id=\"expityYear\"]");
	}
	public By GetCardCV() {
		return By.xpath("//*[@id=\"cvCode\"]");
	}
	public By GetPayButton() {
		return By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/a");
	}	
	
	public By BackHome() {
		return By.xpath("/html/body/div/nav/div/div/a");
	}
}