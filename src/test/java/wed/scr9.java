package wed;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scr9 {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		driver.findElement(By.id("email")).sendKeys("hi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hi@123");
		driver.findElement(By.id("confirmPassword")).sendKeys("hi@123");
		driver.findElement(By.xpath("//button[@type='submit")).click();
		
		
	}
}
