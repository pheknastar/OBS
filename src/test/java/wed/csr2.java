package wed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class csr2 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	//wait.until(ExpectedConditions.elementToBeClickable(ele));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("twotabsearchtextbox"))));
	
}
	
	
}
