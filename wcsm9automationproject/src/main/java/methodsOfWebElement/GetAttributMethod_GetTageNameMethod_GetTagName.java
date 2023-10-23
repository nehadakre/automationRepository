package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributMethod_GetTageNameMethod_GetTagName {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get attribute valeue of usdername tB i.e name attribute 
		WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String attributeValue = usnTB.getAttribute("class");
		System.out.println(attributeValue);
		
		//get cssValue property of username TB i.e color
		String cssValue = usnTB.getCssValue("width");
		System.out.println(cssValue);
		
		//get the tagName of username TB
		String tag = usnTB.getTagName();
		System.out.println(tag);
		

	}

}
