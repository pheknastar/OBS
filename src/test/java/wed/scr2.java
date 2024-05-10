package wed;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class scr2 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	//	Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_T);
		//r.keyRelease(KeyEvent.VK_CONTROL);
	//	r.keyRelease(KeyEvent.VK_T);
	   driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		
		
		
	}
}
