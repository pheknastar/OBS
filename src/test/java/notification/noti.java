package notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class noti {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--Disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
	driver.findElement(By.id("browNotButton")).click();
	
	
}
}
