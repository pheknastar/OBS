package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpPage {

	@FindBy(xpath = "//label[@class='OTP_msg']") private WebElement otp;
	@FindBy(name = "otpcode") private WebElement otpPin;
	@FindBy(name = "verify-btn") private WebElement otpVerify;
	
	public OtpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getOtpPin(String pin) {
		otpPin.sendKeys(pin);
		return otpPin;
	}

	public WebElement getOtpVerify() {
		otpVerify.click();
		return otpVerify;
	}
	
	//Business Logic
	public void otpVerification(String pin) {
		otpPin.sendKeys(pin);
		otpVerify.click();
	}
}
