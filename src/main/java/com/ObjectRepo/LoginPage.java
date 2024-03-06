package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// decleration
	@FindBy(name = "staff_id")
	private WebElement staffUN;

	@FindBy(name = "password")
	private WebElement staffPW;

	@FindBy(name = "staff_login-btn")
	private WebElement staffLoginButton;

	@FindBy(name = "customer_id")
	private WebElement customerUN;

	@FindBy(name = "password")
	private WebElement customerPW;

	@FindBy(name = "login-btn")
	private WebElement customerLoginButton;

	@FindBy(name = "logout_btn")
	private WebElement bothLogOut;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getStaffUN() {
		return staffUN;
	}

	public WebElement getStaffPW() {
		return staffPW;
	}

	public WebElement getStaffLoginButton() {
		return staffLoginButton;
	}

	public WebElement getCustomerUN() {
		return customerUN;
	}

	public WebElement getCustomerPW() {
		return customerPW;
	}

	public WebElement getCustomerLoginButton() {
		return customerLoginButton;
	}

	// Business logic
	public void loginAsStaff(String StaffId, String Password) {
		staffUN.sendKeys(StaffId);
		staffPW.sendKeys(Password);
		staffLoginButton.click();
	}

	public void loginAsCustomer(String CustomerId, String Password1) {
		customerUN.sendKeys(CustomerId);
		customerPW.sendKeys(Password1);
		customerLoginButton.click();
	}

	public void logOut() {
		bothLogOut.click();
	}
}
