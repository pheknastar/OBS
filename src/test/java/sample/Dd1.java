package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("select3"));
		Select sel=new Select(dd);
		Thread.sleep(3000);
		sel.selectByIndex(5);
		Thread.sleep(3000);
		List<WebElement> opt = sel.getOptions();
		for(WebElement op:opt)
		{
				System.out.println(op.getText());
		}
		driver.close();
	}
	
}
