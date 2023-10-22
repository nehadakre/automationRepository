package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=chandler+bing&oq=chandler+Bing&aqs=chrome.0.0i131i433i512j0i433i512j0i512l8.8930j0j7&sourceid=chrome&ie=UTF-8#cobssid=s");
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		
		
	}

}
