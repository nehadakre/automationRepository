package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver1 {

	public static void main(String[] args) throws InterruptedException {
		// to launch chrome Driver we need to create obj of chrome Driver();
		
		WebDriver driver=new ChromeDriver();
		System.out.println("open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("close");
		

	}

}

