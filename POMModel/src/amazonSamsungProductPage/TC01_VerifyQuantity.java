package amazonSamsungProductPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyQuantity extends TestBaseClass
{
	@Test
	public void VerifyQuantity()
	{
		login();
		searchProductAndSwithOn();
		
		AmazonSamsungFridgePagePOMClass asfp=new AmazonSamsungFridgePagePOMClass(driver);
		asfp.selectQuantityDropdown(1);
		asfp.clickOnAddToCartBtn();
		
		String actualText=asfp.captureAddedToCartText();
		String expectedText="Added to Cart";
		Assert.assertEquals(actualText, expectedText);
		asfp.clickOnCloseButton();
		
	}

}
