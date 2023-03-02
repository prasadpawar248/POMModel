package sauceDemoLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC05_LoginWith_blank_U_Valid_P extends BaseClass
{
	@Test
	public static void LoginWith_blank_U_Valid_P() throws InterruptedException
	{
		openBrowser();
		
		LoginPagePOMClass obj=new LoginPagePOMClass(driver); //with POM
		
		obj.enterUsername("standard");
//		obj.enterPassword("secret_sauce");
		obj.loginBtn();
		
		String expectedPopup="Epic sadface: Password is required";
		String actualPopup=obj.popupMsg();
		System.out.println(actualPopup);
		if(expectedPopup.equals(actualPopup))  
			System.out.println("Login with valid username and blank password test case passed");
		else
			System.out.println("Login with valid username and blank password test case failed");
		
		closeBrowser();
		
	}

}
