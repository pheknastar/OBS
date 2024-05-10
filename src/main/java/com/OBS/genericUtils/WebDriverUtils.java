package com.OBS.genericUtils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	/**
	 * maximize the web page
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * minimize the web page
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * wait till web page loaded
	 * @param driver
	 * @param sec
	 */
	public void Wait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	/**
	 * web driver wait
	 * @param driver
	 * @param sec
	 * @return
	 */
	public WebDriverWait webDriverWaitObj(WebDriver driver, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait;
	}
	
	public void visibilityOfElement(WebDriver driver, int sec, WebElement element) {
		webDriverWaitObj(driver, sec).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void elementToBeClickable(WebDriver driver, int sec, WebElement element) {
		webDriverWaitObj(driver, sec).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilAlertToBepresent(WebDriver driver, int sec) {
		webDriverWaitObj(driver, sec).until(ExpectedConditions.alertIsPresent());
	}
	
	/**
	 * drop down
	 * @param element
	 * @return
	 */
	public Select dropDownObj(WebElement element) {
		Select sel = new Select(element);
		return sel;
	}
	
	public void handelDropDown(WebElement element, int index) {
		dropDownObj(element).selectByIndex(index);
	}
	
	public void handelDropDown(WebElement element, String value) {
		dropDownObj(element).selectByValue(value);
	}
	
	public void handelDropDown(String text, WebElement element) {
		dropDownObj(element).selectByVisibleText(text);
	}
	
	/**
	 * Action class for mouse actions
	 * @param driver
	 * @return
	 */
	public Actions actionsObj(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}
	
	public void mouseOver(WebDriver driver, WebElement element) {
		actionsObj(driver).moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement desc) {
		actionsObj(driver).dragAndDrop(src, desc).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement element) {
		actionsObj(driver).doubleClick(element).perform();;
	}
	
	public void doubleClick(WebDriver driver) {
		actionsObj(driver).doubleClick().perform();;
	}
	
	public void rightClick(WebDriver driver) {
		actionsObj(driver).contextClick().perform();
	}
	
	public void rightClick(WebDriver driver, WebElement element) {
		actionsObj(driver).contextClick(element).perform();
	}
	
	public void scrollByAmount(WebDriver driver) {
		actionsObj(driver).scrollByAmount(0, 500).perform();
	}
	
	/**
	 * robot object
	 * @return
	 * @throws Throwable
	 */
	public Robot robotObj() throws Throwable {
		Robot r = new Robot();
		return r;
	}
	
	public void enterKey() throws Throwable {
		robotObj().keyPress(KeyEvent.VK_ENTER);
	}
	
	public void releaseKey() throws Throwable {
		robotObj().keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * Handle alert popup
	 * @param driver
	 * @return 
	 */
	public Alert alertPopUp(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		return alt;
	}
	
	public void acceptAlert(WebDriver driver) {
		alertPopUp(driver).accept();
	}
	
	public void dismissAlert(WebDriver driver) {
		alertPopUp(driver).dismiss();
	}
	
	public String getTextFromAlert(WebDriver driver) {
		return alertPopUp(driver).getText();
	}
	
	/**
	 * change frame based on index
	 * @param driver
	 * @param index
	 */
	public void frame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * change frame based on name or id
	 * @param driver
	 * @param index
	 */
	public void frame(WebDriver driver, String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * change frame based on webElement
	 * @param driver
	 * @param index
	 */
	public void frame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * switch to windows using window handles
	 * @param d
	 * @param partialTitle
	 */
	public void handelWindow(WebDriver d, String partialWindow) {
		Set<String> ids = d.getWindowHandles();
		for (String id : ids) {
			String currentWindow = d.switchTo().window(id).getTitle();
			if(currentWindow.contains(partialWindow)) {
				break;
			}
		}
	}
	
	/**
	 * it will take the screeShot and store that in screenshot folder
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws Throwable
	 */
	public static String getScreenShot(WebDriver driver, String screenShotName) throws Throwable {
		
		 JavaUtils jLib = new JavaUtils();
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 String path = "./screenshot/"+screenShotName+" "+jLib.getSystemDateInFormat()+".png";
		 File dst = new File(path);
		 String scrPath = dst.getAbsolutePath();
		 FileUtils.copyFile(src, dst);
		 return scrPath;
	}
	
	/**
	 * window scrolling using java script executor
	 * @param driver
	 */
	public void scrollAction(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
}
