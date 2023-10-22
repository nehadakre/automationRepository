package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("view-source:http://laptop-reoob373/login.do");
		
		//take a Source code of login Page
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		
		Thread.sleep(2000);
		
		
	}

}
