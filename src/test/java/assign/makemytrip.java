package assign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
	driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
	driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Benga");
	List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//p[@class='font14 appendBottom5 blackText']"));
	System.out.println("from city list");
	for(WebElement lists:list)
	{
		String cities = lists.getText();
		
		System.out.println(cities);
	}
	driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
	
	
	driver.findElement(By.xpath("//span[text()='To']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("che");
	List<WebElement> list1 = driver.findElements(By.xpath("//div[@role='listbox']//p[@class='font14 appendBottom5 blackText']"));
	System.out.println("To city list----------------------------------------------------");
	for(WebElement lists1:list1)
	{
		String cities1 = lists1.getText();
		
		System.out.println(cities1);
	}
	driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	driver.findElement(By.xpath("//div[@aria-label='Tue Apr 23 2024']")).click();
	driver.findElement(By.xpath("//div[@aria-label='Fri May 03 2024' and @aria-disabled='false']")).click();
    driver.findElement(By.xpath("//a[text()='Search']")).click();
    
  //p[text()='Airlines']/parent::div[@class="filtersOuter"]/descendant::label[@class="checkboxContainer "]
}
}
