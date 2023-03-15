package amazonSamsungProductPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazon.AmazonHomePOMClass2;
import amazon.AmazonPagePOMClass;
import amazon.SignInPasswordPOMClass;
import amazon.SignInUsernamePOMClass;

public class TestBaseClass 
{
	protected WebDriver driver;
	AmazonPagePOMClass ap;
	AmazonHomePOMClass2 ahp;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("Webdriver.chrome.driver", "D\\Software testing\\My docs\\Selenium\\driver file\\chromedriver.exe");
		driver=new ChromeDriver();
		
//		System.setProperty("Webdriver.gecko.driver", "F:\\D\\Software testing\\My docs\\Selenium\\driver file\\geckodriver.exe");
//		driver=new FirefoxDriver();
		
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		System.out.println("Url Opened");
	}

	public  void login()
	{
		ap=new AmazonPagePOMClass(driver);
		ap.clickOnSignInAccountLink();
		ap.clickOnSignInButton();
		
		SignInUsernamePOMClass siu=new SignInUsernamePOMClass(driver);
		siu.enterUsername();
		siu.clickedOnContBtn();
		
		SignInPasswordPOMClass sip=new SignInPasswordPOMClass(driver);
		sip.enterPassword();
		sip.clickOnSignBtn();
	}
	
	public void searchProductAndSwithOn()
	{
		ahp=new AmazonHomePOMClass2(driver);
		ahp.enterSearchTextBox();
		ahp.clickSearchButton();
		ahp.clickOnSamsungFridge();
		
		List<String>WindowIds=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(WindowIds.get(1));
		System.out.println("Switched to second window");
	}

//	@AfterMethod
	public void tearDown()
	{
		ap.clickOnSignInAccountLink();
		AmazonHomePOMClass2 ahp=new AmazonHomePOMClass2(driver);
		ahp.clickOnLogoutBtn();
		
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}
}
