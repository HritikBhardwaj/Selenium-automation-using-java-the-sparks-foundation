

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Download {
	public static WebDriver driver;
	
	
	
		
		@BeforeMethod
		public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	    driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	

	 @Test
	 public void ss() throws InterruptedException, AWTException
	 {
		 driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("ab de villiers"+Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class=\"q qs\"])[2]")).click();
		 Actions a=new Actions(driver);
		 Thread.sleep(2000);
	
 for(int i=10;i<=30;i++)
 {
	Thread.sleep(1000);
	WebElement s=	driver.findElement(By.xpath("(//*[@class=\"rg_ic rg_i\"])["+i+"]"));
	Thread.sleep(1000);
	  a.contextClick(s).build().perform();
	  Thread.sleep(1000);
	   Robot q=new Robot();
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_DOWN);
	   q.keyRelease(KeyEvent.VK_DOWN);
	   q.keyPress(KeyEvent.VK_ENTER);
	   q.keyPress(KeyEvent.VK_ENTER);
	   
	   
	    
 }    
	 }
	    
	
		

	
@AfterMethod
	public void teardown() {
		driver.quit();
	}

	}


