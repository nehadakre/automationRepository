package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultipleMethod {
	
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']"));
	
	
	//single select dropdown
	
	select sel=new Select(dropdown1);
	
	
	
	//multiselect dropdown
	
	}

}
