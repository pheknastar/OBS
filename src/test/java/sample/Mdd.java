
	package sample;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Mdd {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			//WebElement dd = driver.findElement(By.id("select-multiple-native"));
			WebElement dd = driver.findElement(By.xpath("//label[text()='Country']/..//select"));
			Select sel=new Select(dd);
			Thread.sleep(3000);
			sel.selectByIndex(1);
			sel.selectByIndex(4);
			Thread.sleep(3000);
			
			driver.close();
		}
		
	}

	

