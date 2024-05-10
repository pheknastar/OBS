package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			 WebElement ele = driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/following-sibling::button"));
			Actions act=new Actions(driver);
			act.contextClick(ele).perform();
			
			
		}
}
