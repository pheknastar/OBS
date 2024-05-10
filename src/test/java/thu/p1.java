package thu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://rmgtestingserver:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
    driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("qsp");
    WebElement dd = driver.findElement(By.xpath("//select[@name='industry']"));
    Select sel=new Select(dd);
    sel.selectByVisibleText("Engineering");
    WebElement dd1 = driver.findElement(By.xpath("//select[@name='accounttype']"));
    Select sel1=new Select(dd1);
    sel1.selectByVisibleText("Partner");
    driver.findElement(By.xpath("//input[@name='button']")).click();

    WebElement ele = driver.findElement(By.xpath("//span[text()='qsp']"));
    
    
    
    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
    
}
}
