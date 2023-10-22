package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to launch the firefox browser create the object of firefox Driver(c)
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is open");
		Thread.sleep(2000);
		
		driver.close();
		System.out.println(" Close");
	}

}
