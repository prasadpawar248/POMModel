package amazonSamsungProductPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyAmountAsPerQuantity extends TestBaseClass
{
	@Test
	public void VerifyAmountAsPerQuantity()
	{
		login();
		searchProductAndSwithOn();
		
		AmazonSamsungFridgePagePOMClass asp=new AmazonSamsungFridgePagePOMClass(driver);
		int expectedPrice=0,a=0;
		for(int i=1;i<=5;i++)
		{
			asp.selectQuantityDropdown(i);
			asp.clickOnAddToCartBtn();
			int actualPrice=asp.capturePrice();
			expectedPrice=expectedPrice+(17990*i);
			Assert.assertEquals(actualPrice,expectedPrice,"price is found mismatch");
			asp.clickOnCloseButton();
			a=a+i;
			String actualCartQty=asp.captureCartQty();
			String expectedCartQty=Integer.toString(a);
			Assert.assertEquals(actualCartQty, expectedCartQty,"cart qty found mismatch");
		}
	}
}
