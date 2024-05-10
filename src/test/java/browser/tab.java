package browser;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.id("browserButton2")).click();
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(all_id);
		String parent=ar.get(0);
		String firsttab=ar.get(1);
	    driver.switchTo().window(firsttab);
		driver.findElement(By.id("username")).sendKeys("saha");
		driver.findElement(By.id("password")).sendKeys("saha");
		Thread.sleep(2000);
		driver.switchTo().window(parent);
	     WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Before testing')]"));
		System.out.println(ele.getText());
		
	}
	
}
