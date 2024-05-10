package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sfra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		//driver.findElement(By.id("enterimg")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
		Thread.sleep(2000);
	}
}
