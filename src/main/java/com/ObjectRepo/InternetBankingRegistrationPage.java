package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetBankingRegistrationPage {

	@FindBy(name = "holder_name")
	private WebElement ahName;
	@FindBy(name = "accnum")
	private WebElement ahAccNo;
	@FindBy(name = "dbtcard")
	private WebElement ahDebCardNo;
	@FindBy(name = "dbtpin")
	private WebElement ahDebCardPin;
	@FindBy(name = "mobile")
	private WebElement ahMobileNo;
	@FindBy(name = "pan_no")
	private WebElement ahPanNo;
	@FindBy(name = "dob")
	private WebElement ahDob;
	@FindBy(name = "last_trans")
	private WebElement ahLTransaction;
	@FindBy(name = "password")
	private WebElement ahPassword;
	@FindBy(name = "cnfrm_password")
	private WebElement ahConPassword;
	@FindBy(name = "submit")
	private WebElement ahSubmit;

	public InternetBankingRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Register for internet banking
	public void accHolderName(String HolderName) {
		ahName.sendKeys(HolderName);
	}

	public void accHolderAcno(String accountNo1) {
		ahAccNo.sendKeys(accountNo1);
	}

	public void accHolderDebCardNo(String cardNo) {
		ahDebCardNo.sendKeys(cardNo);
	}

	public void accHolderDebCardPin(String pin) {
		ahDebCardPin.sendKeys(pin);
	}

	public void accHolderMobileNo(String RegMobileNo) {
		ahMobileNo.sendKeys(RegMobileNo);
	}

	public void accHolderPanNo(String RegPan) {
		ahPanNo.sendKeys(RegPan);
	}

	public void accHolderDob(String Dob2) {
		ahDob.click();
		ahDob.sendKeys(Dob2);
	}

	public void accHolderLastTransaction(String LastTransaction) {
		ahLTransaction.sendKeys(LastTransaction);
	}

	public void accHolderPassword(String password) {
		ahPassword.sendKeys(password);
	}

	public void accHolderConPassword(String ConfirmPassword) {
		ahConPassword.sendKeys(ConfirmPassword);
	}

	public void accHolderSubmit() {
		ahSubmit.click();
	}

	// Business Logic
	public void ibRegistration(String HolderName, String accountNo1, String cardNo, String pin, String RegMobileNo,
			String RegPan, String Dob2, String LastTransaction, String password, String ConfirmPassword) {
		ahName.sendKeys(HolderName);
		ahAccNo.sendKeys(accountNo1);
		ahDebCardNo.sendKeys(cardNo);
		ahDebCardPin.sendKeys(pin);
		ahMobileNo.sendKeys(RegMobileNo);
		ahPanNo.sendKeys(RegPan);
		ahDob.click();
		ahDob.sendKeys(Dob2);
		ahLTransaction.sendKeys(LastTransaction);
		ahPassword.sendKeys(password);
		ahConPassword.sendKeys(ConfirmPassword);
		ahSubmit.click();
	}
}
