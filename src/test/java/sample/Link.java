package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0&scenario=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
	  System.out.println(ele.size());
	  for(int i=0;i<ele.size();i++)
	  {
		  System.out.println(ele.get(i).getText());
		  Thread.sleep(2000);
	  }
	}

}

