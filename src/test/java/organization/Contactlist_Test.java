package organization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Contactlist_Test {
@Test
public void contactlist_Test()
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
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
    WebElement dd = driver.findElement(By.xpath("//select[@name='salutationtype']"));
  Select sel=new Select(dd);
  sel.selectByVisibleText("Ms.");
  String fname="honey"+rannum;
  String lname="bee"+rannum;
  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
   driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
   String p_id = driver.getWindowHandle();
   Set<String> all_id = driver.getWindowHandles();
   ArrayList<String> arr=new ArrayList<String>(all_id);
   String child = arr.get(1);
   driver.switchTo().window(child);
   driver.findElement(By.xpath("//a[text()='Hello672']")).click();
   driver.switchTo().window(p_id);
   driver.findElement(By.xpath("//input[@name='button']")).click();
   String namef = driver.findElement(By.xpath("//span[@class='dvtCellLabel']")).getText();
   
   
   if(namef.contains(fname)&&namef.contains(lname))
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
