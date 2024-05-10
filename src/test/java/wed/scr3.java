package wed;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scr3 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File tmp = tss.getScreenshotAs(OutputType.FILE);
		File pmt = new File("photos/defect.png");
		FileHandler.copy(tmp, pmt);
		
	
}
}
