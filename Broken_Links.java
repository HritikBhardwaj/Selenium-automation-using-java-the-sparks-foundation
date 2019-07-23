

	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	
	public class Broken_Links {
		
	public static WebDriver driver;
		@BeforeMethod
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Desktop\\chromedriver.exe");
		
		driver=new  ChromeDriver();
		driver.get("https://www.guru99.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		@Test
		public void connect()
		{

		HttpURLConnection con=null;
		String url;
		int response=200;
		
		List<WebElement>l=driver.findElements(By.tagName("a"));
		Iterator<WebElement>f=l.iterator();
		while(f.hasNext())
		{
		url=f.next().getAttribute("href");
		System.out.println(url);
		if(url==null||url.isEmpty())
		{System.out.println("url not exist");
		}
		else if(!url.startsWith("Homepage"))
		{
		System.out.println("Not associated with the desired page");
		}
		try{
		con=(HttpURLConnection)(new URL(url).openConnection());
		con.setRequestMethod("Head");
		con.connect();
		if(response>=400)
		System.out.println("broken links");
		else{
		System.out.println("valid links");
		}
		}
		catch(Exception e)
		{e.printStackTrace();
		}
		}
		}
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
	}



