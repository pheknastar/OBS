package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conf 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.sendKeys("yes");
		Thread.sleep(2000);
		alt.accept();
		WebElement ele = driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
		String str = ele.getText();
		if(str.equalsIgnoreCase("You selected yes"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}	
	}

}
