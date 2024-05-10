package assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class p1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.kayak.co.in/flights");
    driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("Ben");
    driver.findElement(By.xpath("//span[text()='Bengaluru, Karnataka, India']")).click();
    driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("che");
    driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu, India']")).click();
}
}


