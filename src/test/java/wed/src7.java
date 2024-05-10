package wed;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class src7 {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://www.amazon.in";
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("window.location=arguments[0]", url);
		
		//scroll till bottom of the page
		jss.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//scroll to top from bottom
		
		Thread.sleep(2000);
		jss.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
}
