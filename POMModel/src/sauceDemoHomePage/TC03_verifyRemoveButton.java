package sauceDemoHomePage;

import org.testng.annotations.Test;

import sauceDemoLoginPage.BaseClass;
import sauceDemoLoginPage.LoginPagePOMClass;

public class TC03_verifyRemoveButton extends BaseClass
{
	@Test
public  void verifyRemoveButton() 
{
	
	openBrowser();
	
	LoginPagePOMClass lp=new LoginPagePOMClass(driver);
	lp.enterUsername("standard_user");
	lp.enterPassword("secret_sauce");
	lp.loginBtn();
	
	HomePagePOMClass hp=new HomePagePOMClass(driver);
	hp.clickOnAddToCartButton();
	if(hp.captureCartQuntity()==1)
	{
		System.out.println("1 product added to cart");
	}
	else
	{
		System.out.println("prodcut is not added to cart");
	}

	hp.clickOnRemoveButton();
	try {
	hp.captureCartQuntity();
	System.out.println("After clicked remove btn still product found from cart");
	System.out.println("remove button test case is failed");
	}
	catch(Exception e)
	{
		System.out.println("After clicked remove btn product is removed from cart");
		System.out.println("remove button test case is passed");
	}
	
	closeBrowser();
		
	
}
}
