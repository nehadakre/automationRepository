package sychronaizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	//identify
	driver.findElement(By.name("username")).sendKeys("admin123");
	//
	driver.findElement(By.name("password")).sendKeys("admin426");
	//identify login button
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	
	
	}

}
