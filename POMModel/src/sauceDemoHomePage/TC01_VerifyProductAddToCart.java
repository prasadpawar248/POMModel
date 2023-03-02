package sauceDemoHomePage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sauceDemoLoginPage.BaseClass;
import sauceDemoLoginPage.LoginPagePOMClass;

public class TC01_VerifyProductAddToCart extends BaseClass
{
	@Test
	public void verifyProductAddToCart()
	{
		openBrowser();
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.loginBtn();
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickOnAddToCartButton();
		int quntity=hp.captureCartQuntity();
		
		if(quntity==1)
		{
			System.out.println("Product add to cart test case passed");
		}
		else
		{
			System.out.println("Product add to cart test case failed");
		}
		
		closeBrowser();
		
		
	}

}
