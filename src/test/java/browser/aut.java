package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class aut {
public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String username="admin";
		String password = "admin";
		Thread.sleep(2000);
		String url="https://"+username+":"+password+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
		Thread.sleep(2000);
		driver.get(url);
		Thread.sleep(2000);
		
		
}
}
