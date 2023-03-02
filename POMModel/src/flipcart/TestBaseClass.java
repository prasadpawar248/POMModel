package flipcart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestBaseClass 
{
	protected WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\D\\Software testing\\My docs\\Selenium\\driver file\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser opened");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		System.out.println("URL Opened");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}

}
