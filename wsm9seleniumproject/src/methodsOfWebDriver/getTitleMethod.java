package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	driver=new ChromeDriver();
		//Maximaze the chrome browser
		driver.manage().window().maximize();
		//luanch the webapplication
		driver.get("https://www.flipkart.com/");
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
