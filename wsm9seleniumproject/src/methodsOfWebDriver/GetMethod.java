package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// To Lunch the chrome Browser
		
	WebDriver	driver=new ChromeDriver();
	//Maximaze the chrome browser
	driver.manage().window().maximize();
	//luanch the webapplication
	driver.get("http://omayo.blogspot.com/");
	//stop the execution of script for 2 sec
	Thread.sleep(2000);
	//click on open a pop window link..
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Thread.sleep(2000);
	//close browser
	driver.close();

	}

}

