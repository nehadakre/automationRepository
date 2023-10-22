package assignmentPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVIstara {
	public static void main(String[] args) throws InterruptedException {
		//handle notification popup in chrome browser
    ChromeOptions	co=new ChromeOptions();	
    co.addArguments("--disable-notifications");
    
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.airvistara.com/in/en");
	
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	
	}

}
