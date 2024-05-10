package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedmulti 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(2000);
		WebElement frm = driver.findElement(By.xpath("///iframe[@class='w-full h-96']"));
//		driver.switchTo().frame(driver,frm);
		driver.switchTo().frame(0);
		
	}

}
