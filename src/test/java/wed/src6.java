package wed;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class src6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Point loc = ele.getLocation();
		//int x=loc.getX();
		//int y=loc.getY();
		
	    JavascriptExecutor jss=(JavascriptExecutor) driver;
	    //jss.executeScript("window.scrollBy("+x+","+y+")");
	  //  jss.executeScript("arguments[0].scrollIntoView();",ele);
	    
	    WebElement eleme = driver.findElement(By.id("twotabsearchtextbox"));
	    
	    jss.executeScript("arguments[0].value=arguments[1]",eleme,"pumashoes");
	    
	    WebElement clik = driver.findElement(By.id("nav-search-submit-button"));
	   //jss.executeScript("arguments[0].click()",clik);
	 //   jss.executeScript("document.getElementById('nav-search-submit-button').click()");
	}
}
