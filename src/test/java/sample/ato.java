package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sahana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Dell\\Downloads\\images.jpeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Rajajinagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sahanass1997@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("912317541");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(2000);
		WebElement dd1 = driver.findElement(By.id("Skills"));
		Select sel1=new Select(dd1);
		sel1.selectByVisibleText("Java");
		Thread.sleep(2000);
		WebElement dd2 = driver.findElement(By.id("country"));
		Select sel2=new Select(dd2);
		sel2.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("yearbox"));
		Select sel=new Select(dd);
		sel.selectByValue("1997");
		Thread.sleep(2000);
		WebElement dd4 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel4=new Select(dd4);
		sel4.selectByValue("August");
		Thread.sleep(2000);
		WebElement dd5 = driver.findElement(By.id("daybox"));
		Select sel5=new Select(dd5);
		sel5.selectByValue("28");
		Thread.sleep(2000);
		driver.findElement(By.id("firstpassword")).sendKeys("Sahana@123");
		Thread.sleep(2000);
		driver.findElement(By.id("secondpassword")).sendKeys("Sahana@123");
		Thread.sleep(2000);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(2000);
		
		
		
		driver.close();
		
	}

}
