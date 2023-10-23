package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsMethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://www.flipkart.com/");
		//handle the pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//search for laptop in search box
		driver.findElement(By.name("q")).sendKeys("laptop");
		//click on search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		//click on brand and select hp
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
		//click on core i7 processor
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Processor')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		//select on os and select window 11
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(2000);
		//identify name of laptop*/
		
		
		
		
		
		
	}

}
