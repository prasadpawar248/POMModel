package sauceDemoHomePage;

import org.testng.annotations.Test;

import sauceDemoLoginPage.BaseClass;
import sauceDemoLoginPage.LoginPagePOMClass;

public class TC04_VerifyAboutLink extends BaseClass
{

	@Test
	public  void VerifyAboutLink() {
		
		openBrowser();
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.loginBtn();
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickOnMainMenu();
		hp.clickOnAboutLink();
		String expectedTitle=driver.getTitle();
		String actualTitle ="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("About link test case passed");
		}
		else
		{
			System.out.println("About link test case failed");
		}
		
		closeBrowser();
		
	}
}
