package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMehod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//switch the control to activeElement
		//driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Neha kakkar",Keys.ENTER);
		
		

	}

}
