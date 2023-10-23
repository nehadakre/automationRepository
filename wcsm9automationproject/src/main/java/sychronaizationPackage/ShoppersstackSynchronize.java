package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersstackSynchronize {
	
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//implicite wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://shoppersstack.com/");
	driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
	driver.quit();
	
	
	
	
	}

}
