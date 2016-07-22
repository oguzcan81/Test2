package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/oguzcan.ozkara/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.yahoo.com");
		
		driver.manage().window().maximize();
		//açýlan sayfayý max size yap.
				System.out.println(driver.getTitle());
			
				
					Assert.assertTrue(driver.getTitle().contains("Yahoo"));
		//Site isminin doðrulamasý yapýldý.
		
					
					System.out.println("Web Site Title is TRUE");
					
		//	WebElement element=driver.findElement(By.name("uh-search-box"));
			
					//driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
				// id ile arama
					
					
				driver.findElement(By.cssSelector("#uh-search-box")).sendKeys("Selenium");
						
						//driver.findElement(By.id("uh-search-button")).click();
				
				driver.findElement(By.xpath("//*[@id='uh-search-button']")).click();
						
						
						
			
					Thread.sleep(3000);
					
					driver.quit();
				
	}

}
