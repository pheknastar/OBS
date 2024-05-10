package wed;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scr10 {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=2");
	
	driver.findElement(By.id("email")).click();
	Robot r=new Robot();
	String s="sahana@gmail.com";
	char[] c=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		int key=KeyEvent.getExtendedKeyCodeForChar(c[i]);
		r.keyPress(key);
		r.keyRelease(key);
	}
	
}
}
