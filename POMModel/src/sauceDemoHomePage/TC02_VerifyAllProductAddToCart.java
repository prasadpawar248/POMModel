package sauceDemoHomePage;

import org.testng.annotations.Test;

import sauceDemoLoginPage.BaseClass;
import sauceDemoLoginPage.LoginPagePOMClass;

public class TC02_VerifyAllProductAddToCart extends BaseClass
{
	@Test
	public  void VerifyAllProductAddToCart()
	{
		
		openBrowser();
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.loginBtn();
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickOnAllAddToCartButton();
		int a=hp.captureCartQuntity();
		System.out.println(a);
		if(a==6)
		{
			System.out.println("All product add to cart test case passed");
		}
		else
		{
			System.out.println("All product add to cart test case failed");
		}
		
		closeBrowser();
		
	}

}
