package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DebitCardDetailsPage {

	@FindBy(name = "holder_name") private WebElement dName;
	@FindBy(name = "dob") private WebElement dDob;
	@FindBy(name = "pan") private WebElement dPan;
	@FindBy(name = "mob") private WebElement dMobile;
	@FindBy(name = "acc_no") private WebElement dAccount;
	@FindBy(name = "dbt_crd_submit") private WebElement dSubmit;
	
	public DebitCardDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Apply for Debit Card
	public void debName(String Hname) {
		dName.sendKeys(Hname);
	}
	public void debDob(String Dob1) {
		dDob.click();
		dDob.sendKeys(Dob1);
	}
	public void debPan(String pan1) {
		dPan.sendKeys(pan1);
	}
	public void debMobile(String MobileNo1) {
		dMobile.sendKeys(MobileNo1);
	}
	public void debAccount(String accountNo1) {
		dAccount.sendKeys(accountNo1);
	}
	public void debSubmit() {
		dSubmit.click();
	}
	
	//Business Logic
	public void applyDebitCard(String Hname, String Dob1, String pan1, String MobileNo1, String accountNo1) {
		dName.sendKeys(Hname);
		dDob.click();
		dDob.sendKeys(Dob1);
		dPan.sendKeys(pan1);
		dMobile.sendKeys(MobileNo1);
		dAccount.sendKeys(accountNo1);
		dSubmit.click();
	}
}
