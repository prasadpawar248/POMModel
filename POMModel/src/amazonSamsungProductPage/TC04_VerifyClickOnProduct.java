package amazonSamsungProductPage;

import org.testng.annotations.Test;

public class TC04_VerifyClickOnProduct extends TestBaseClass
{
	@Test
	public void verifyClickOnProduct()
	{
		login();
		searchProductAndSwithOn();
		
		AmazonSamsungFridgePagePOMClass asp=new AmazonSamsungFridgePagePOMClass(driver);

	}

}
