package organization;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateOrganization_Test {

	@Test
	public void createOrganization_Test()
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
	    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	    String organisation="Hello"+rannum;
	    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(organisation);
	    WebElement dd = driver.findElement(By.xpath("//select[@name='industry']"));
	    Select sel=new Select(dd);
	    sel.selectByVisibleText("Engineering");
	    WebElement dd1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
	    Select sel1=new Select(dd1);
	    sel1.selectByVisibleText("Partner");
	    driver.findElement(By.xpath("//input[@name='button']")).click();
	    String text = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	    if(text.contains(organisation))
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println(("fail"));
	    }
	    WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele).perform();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    
	    
	}
}
