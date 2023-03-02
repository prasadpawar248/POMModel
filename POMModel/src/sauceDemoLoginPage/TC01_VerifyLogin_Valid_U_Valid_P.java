package sauceDemoLoginPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_VerifyLogin_Valid_U_Valid_P
{
	@Test
	public  void VerifyLogin_Valid_U_Valid_P() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url opened");
		
		LoginPagePOMClass obj=new LoginPagePOMClass(driver); //with POM
		
		
		obj.enterUsername("standard_user");
		obj.enterPassword("secret_sauce");
		obj.loginBtn();
		
		Thread.sleep(2000);
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		if((expectedTitle.equals(actualTitle))  &&  (expectedUrl.equals(actualUrl)))
			System.out.println("Login is verify");
		else
			System.out.println("Login is not verify");
		
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}

}
