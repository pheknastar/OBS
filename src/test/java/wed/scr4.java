package wed;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scr4 {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		TakesScreenshot tss=(TakesScreenshot) driver;
		File scr = tss.getScreenshotAs(OutputType.FILE);
		Date dt=new Date();
		String da = dt.toString();
		String ds = da.replaceAll(":","-");
		File dst = new File("./photos/"+ ds+".png");
		FileHandler.copy(scr, dst);
		
	}

}
