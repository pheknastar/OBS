package browser;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wind {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("browserLink1")).click();
		Thread.sleep(2000);
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		for(String s:all_id)
		{
			if(!s.equals(p_id))
			{
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.id("email")).sendKeys("sahanss@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("saha@123");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("saha@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
