package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(2000);
		driver.findElement(By.id("enterimg")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='analystic']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(all_id);
		String child = ar.get(1);
		driver.switchTo().window(child);
		WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates')]"));
		
		System.out.println(ele.getText());
		
		
	}
}
