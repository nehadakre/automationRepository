package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorActiTime {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Lunch web Application ActiTime
	driver.get("http://laptop-reoob373/login.do");
	Thread.sleep(2000);
	//identify the username input as a "admin"
	driver.findElement(By.name("username")).sendKeys("admin");
	//identify the password input as a manager
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	//click on login button
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	Thread.sleep(4000);
	driver.close();

	}

}
