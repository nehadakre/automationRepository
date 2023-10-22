package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-reoob373/login.do");
	
	//take a url of login page
	String urlOfLoginPage = driver.getCurrentUrl();
	System.out.println(urlOfLoginPage);
	Thread.sleep(2000);

	}

}
