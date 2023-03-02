package sauceDemoLoginPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	protected static WebDriver driver;

	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\D\\Software testing\\My docs\\Selenium\\driver file\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url opened");
		
	}

	public static void closeBrowser() {
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}

}










/*switch (browser) {
case ("chrome"):
	System.setProperty("Webdriver.chrome.driver",
			"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
	driver = new ChromeDriver();
	
case ("firefox"):
	System.setProperty("Webdriver.gecko.driver",
			"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
	driver = new FirefoxDriver();
	
case ("ie"):
	System.setProperty("Webdriver.ie.driver",
			"C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
	driver = new InternetExplorerDriver();
}
	System.out.println("Browser opened");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/






