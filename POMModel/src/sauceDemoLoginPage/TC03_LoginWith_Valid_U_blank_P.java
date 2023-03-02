package sauceDemoLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03_LoginWith_Valid_U_blank_P extends BaseClass
{
	@Test
	public static void LoginWith_Valid_U_blank_P() throws InterruptedException
	{
		openBrowser();
		
		LoginPagePOMClass obj=new LoginPagePOMClass(driver); //with POM
		
//		obj.enterUsername("standard");
//		obj.enterPassword("secret_sauce");
		obj.loginBtn();
		
		String expectedPopup="Epic sadface: Username is required";
		String actualPopup=obj.popupMsg();
		System.out.println(actualPopup);
		if(expectedPopup.equals(actualPopup))  
			System.out.println("Login with blank username and blank password test case passed");
		else
			System.out.println("Login with blank username and blank password test case failed");
		
		closeBrowser();
		
	}

}
