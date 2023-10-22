package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobile {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	//hidden division pop up
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//search Box
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
	Thread.sleep(2000);
	//identify search icon and click
	driver.findElement(By.xpath("//button[contains(@aria-label,'Brands and More')]")).click();
	//price of 2nd option
      //WebElement price = driver.findElement(By.xpath(""));
	driver.close();
	
	
	}

	
}

