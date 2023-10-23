package sychronaizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEndToEnd {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Smart Watch");
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	//get the address of parent window
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]")).click();
	
	
	
	
	}

}
