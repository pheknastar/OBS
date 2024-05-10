package wed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class src8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Log in']"));
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		String text=(String)jss.executeScript("return arguments[0].innerText;",ele);
		System.out.println(text);
	}
}
