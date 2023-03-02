package sauceDemoLoginPage;

import org.testng.annotations.Test;

import sauceDemoHomePage.HomePagePOMClass;

public class TC07_VerifyLogout extends BaseClass
{
	@Test
	public void VerifyLogout() {
		
		openBrowser();
		
		LoginPagePOMClass lp=new LoginPagePOMClass(driver);
		
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.loginBtn();
		
		HomePagePOMClass hp=new HomePagePOMClass(driver);
		hp.clickOnMainMenu();
		hp.clickOnLogoutButton();
		
		boolean value=lp.username.isDisplayed();
		if(value==true)
		{
			System.out.println("Logout test case passed.");
		}
		else
		{
			System.out.println("logout test case failed");
		}
		
		closeBrowser();
		
	}


}
