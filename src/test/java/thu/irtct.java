package thu;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irtct {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/");
	driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
	Thread.sleep(3000);
	Set<String> all_id = driver.getWindowHandles();
	ArrayList<String> ar=new ArrayList<String>(all_id);
	String id = ar.get(1);
	driver.switchTo().window(id);
	Thread.sleep(1000);
	driver.findElement(By.id("departFrom")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
	Thread.sleep(500);
	driver.findElement(By.id("goingTo")).sendKeys("Chennai");
	driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	driver.findElement(By.id("departDate")).click();
	driver.findElement(By.xpath("//a[text()='2']")).click();
	driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
	driver.findElement(By.xpath("//label[text()='After 6 pm']")).click();
	driver.findElement(By.xpath("//button[text()='Select Seat']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@rel='tooltip'])[1]")).click();
	driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	driver.findElement(By.xpath("(//input[@name='debordTime'])[1]")).click();
	driver.findElement(By.xpath("//button[text()='Proceed to Book']")).click();
	driver.findElement(By.xpath("//a[text()='Guest User Login ']")).click();
	driver.findElement(By.xpath("//input[@name='emailLogin']")).sendKeys("sa@gmail.com",Keys.TAB,"9876543216",Keys.TAB,Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[text()='Continue to Book ']")).click();
}
}
