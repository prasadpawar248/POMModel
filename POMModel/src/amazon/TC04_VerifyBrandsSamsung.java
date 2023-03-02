package amazon;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_VerifyBrandsSamsung extends TestBaseClass
{
	@Test
	public void VerifyBrandsSamsung()
	{
		ahp.clickOnbrandSamsungCheckBox();
		
		List<String> allproductDisc=ahp.captureProductDiscriptions();
		
		for(String singleProdDisc:allproductDisc)
		{
			boolean val=false;
			if(singleProdDisc.contains("Samsung"))
					{
					val=true;
					}
			Assert.assertTrue(val,"Samsung word is not found in "+singleProdDisc);
		}
	}
}
