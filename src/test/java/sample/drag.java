package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		WebElement tgt = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		Thread.sleep(2000);
		WebElement dst = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(tgt, dst).perform();
		
	}
}
