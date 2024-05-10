package organization;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Campaigns_Test {
	@Test
	public void campaigns_Test()
	{
     Random ran=new Random();		
	 int rannum=ran.nextInt(1000);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://rmgtestingserver:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
    driver.findElement(By.id("submitButton")).click();
    Actions act=new Actions(driver);
    WebElement ele = driver.findElement(By.xpath("//a[text()='More']"));
    act.moveToElement(ele).perform();
    driver.findElement(By.name("Campaigns")).click();
    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
    String name="hello"+rannum;
    driver.findElement(By.name("campaignname")).sendKeys(name);
    WebElement dd = driver.findElement(By.xpath("//select[@name='campaigntype']"));
    Select sel=new Select(dd);
    sel.selectByIndex(1);
    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	 String camp = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(camp.contains(name))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	
	
	}
}
