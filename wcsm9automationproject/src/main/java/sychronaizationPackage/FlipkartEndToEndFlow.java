package sychronaizationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		//handle popup window
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//click on search icon
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Laptop");
		//click on button
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		//identify identify processor and click on 35 more
		driver.findElement(By.xpath("//span[text()='35 MORE']")).click();
		//select the processor of core i7
		driver.findElement(By.xpath("//div[@title='Core i7']")).click();
		Thread.sleep(2000);
		
		
		//identify all the suggestions
		//click on brand
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Brand']")).click();
		//select hp
		driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']/descendant::div[text()='HP']")).click();
		Thread.sleep(2000);
		
		//click operating system
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Operating System']")).click();
		//select windows 11
		driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']/descendant::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		
		//identify all the suggestions of laptop
		//List<WebElement> ListOfWebElement = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 //List<WebElement> ListOfWebElement = driver.findElements(By.xpath("//div[@class='_4rR01T' or (@class='_30jeq3 _1_WHN1')]"));
		//read all the suggestions of bike by using for loop
		Thread.sleep(2000);
		//for(WebElement op:ListOfWebElement)
		//{
		  //String options = op.getText();
		  //Thread.sleep(2000);
		  //System.out.println(options);
		}
		
		
		
	}

//}