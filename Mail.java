


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Mail {

	
	
public static	   WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Desktop\\chromedriver.exe");
	driver=new  ChromeDriver();
	 
	 driver.get("https://www.gmail.com");
			 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

 
	 
	 
	
	 
	@Test
	public void sendmail() throws AWTException, InterruptedException
	{    driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("vkas9910");
	driver.findElement(By.xpath("//*[@class=\"CwaK9\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("vikas9910"+Keys.ENTER);
	Thread.sleep(5000);

	    Robot v=new Robot();
		 driver.findElement(By.xpath("//*[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//*[@class=\"vO\"]")).sendKeys("vtest9910@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class=\"aoT\"]")).sendKeys("Resume");
		 driver.findElement(By.xpath("//*[@class=\"Am Al editable LW-avf\"]")).sendKeys("Automation project");
		
		 
		 
		 driver.findElement(By.xpath("//*[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")).click();
		 Thread.sleep(5000);
	}
@AfterMethod
public void teardown()
{
driver.quit();
}


}