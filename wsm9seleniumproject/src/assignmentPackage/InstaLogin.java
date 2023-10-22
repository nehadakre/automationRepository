package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	//identify Username Textbox and pass input
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("n_e_h_a_2205");
	
	//identfy password textbox and pass input
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123neha");
	
	//Identify login button using Attribute and click
	driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
	
	//Identify Login Button using Text and click
	driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
