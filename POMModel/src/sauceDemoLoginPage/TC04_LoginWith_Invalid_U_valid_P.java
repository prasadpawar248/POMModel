package sauceDemoLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04_LoginWith_Invalid_U_valid_P {
	
	@Test
	public static void LoginWith_Invalid_U_valid_P() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url opened");
		
		LoginPagePOMClass obj=new LoginPagePOMClass(driver); //with POM
		
		obj.enterUsername("standard");
		obj.enterPassword("secret_sauce");
		obj.loginBtn();
		
		String expectedPopup="Epic sadface: Username and password do not match any user in this service";
		
		String actualPopup=obj.popupMsg();
	
		System.out.println(actualPopup);
		if(expectedPopup.equals(actualPopup))  
			System.out.println("Login with invalid username and valid password test case passed");
		else
			System.out.println("Login with invalid username and valid password test case failed");
		
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}

}
