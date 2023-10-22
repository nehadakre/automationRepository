package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	//handle properties of browser such as
	//maximize
	//minimize
	//fullscreen
	//set position
	//set position
	
	//maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//minize the browser
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
	//full screen;
	//driver.manage().window().fullscreen();
	
	//set the size of browser
Dimension 	tagetsize=new Dimension(350, 450);
	driver.manage().window().setSize(tagetsize);
	Thread.sleep(2000);
	//set position
Point	targetPosition=new Point(350, 250);
	driver.manage().window().setPosition(targetPosition);
	

	}

}
