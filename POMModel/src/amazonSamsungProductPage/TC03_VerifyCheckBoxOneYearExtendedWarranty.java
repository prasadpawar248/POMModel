package amazonSamsungProductPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_VerifyCheckBoxOneYearExtendedWarranty extends TestBaseClass
{
	@Test
	public void VerifyCheckBoxOneYearExtendedWarranty()
	{
		AmazonSamsungFridgePagePOMClass asp=new AmazonSamsungFridgePagePOMClass(driver);
		asp.clickOnOneYearExtendedWarrantyCheckbox();
		asp.clickOnAddToCartBtn();
		int actualPrice=asp.capturePrice();
		int expectedPrice=18339;
		Assert.assertEquals(actualPrice,expectedPrice,"price found mismatch");
	}

}
