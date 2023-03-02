package numadicJobApplication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{
WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\D\\Software testing\\My docs\\Selenium\\driver file\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.get("https://jobs.numadic.com/jobs/Careers");
		System.out.println("URL Opened");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		CareerPagePOMClass cp=new CareerPagePOMClass(driver);
		cp.clickOnFilter();
		cp.clickonDept();
		cp.clickOnJob();
		
		QAEngineerPagePOMClass qap=new QAEngineerPagePOMClass(driver);
		qap.clickOnIAmIntrestedButton();

//		UtilityClass.screenshot(driver,"vearifyHeaderText");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}
	

}
