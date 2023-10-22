package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PertialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new EdgeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("file:///C:/Users/HP/OneDrive/Desktop/htmll%20files/link.html");
    	 //identify link by using partialLink Locator
    	 //here we pass partial text still its works
    	 driver.findElement(By.partialLinkText("selenium")).click();
    	 Thread.sleep(2000);
    	

	}

}
