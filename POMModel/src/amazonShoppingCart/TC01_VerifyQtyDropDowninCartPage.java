package amazonShoppingCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import amazonSamsungProductPage.AmazonSamsungFridgePagePOMClass;
import amazonSamsungProductPage.TestBaseClass;

public class TC01_VerifyQtyDropDowninCartPage extends TestBaseClass
{
	
	@Test
	public void verifyQtyDropDowninCartPage()
	{
		AmazonSamsungFridgePagePOMClass asf=new AmazonSamsungFridgePagePOMClass(driver);
		asf.clickOnAddToCartBtn();
		
		asf.clickOnCartBtn();
		
		ShoppingCartPage scp=new ShoppingCartPage(driver);
		int fridgePrice=0;
		for(int i=1;i<=9;i++)
		{
			fridgePrice=i*17990;
			if(fridgePrice==(scp.selectQtyINdropDown(i)))
			{
				System.out.println("Test case passed for qty "+i);
			}
			else
			{
				System.out.println("Test case failed for qty "+i);
			}
		}
	}
	

}
