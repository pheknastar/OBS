package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Sahana");
		Thread.sleep(2000);
		alt.accept();
		WebElement ele = driver.findElement(By.id("demo1"));
		 String str = ele.getText();
		 if(str.equalsIgnoreCase("Hello Sahana How are you today"))
		 {
			 System.out.println("pass");
		 }
		 
		
	}
}
