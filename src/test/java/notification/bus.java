package notification;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriverCommandExecutor;

public class bus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(2000);
		Set<String> set = driver.getWindowHandles();
		for(String string:set)
		{
			driver.switchTo().window(string);
			String title=driver.getCurrentUrl();
			if(title.contains("home"))
			{
				break;
			}
		}
		
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("goingTo")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("departDate")).click();
	}
}
