package amazon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyProductPrice1000015000 extends TestBaseClass
{
	
	@Test
	public void VerifyProductAddToCart()
	{
		ahp.enterMinPrice("10000");
		ahp.enterMaxPrice("15000");
		ahp.clickOnGoBtn();
		
		List<String> originalPricesList=ahp.allProductsprice();
		System.out.println(originalPricesList);
		
		for(String p:originalPricesList)
		{
			boolean val=false;
			p=p.replace(",","");
			int q=Integer.parseInt(p);
//		if(q<=10000 || q>=15000)
//			{
//				val=false;
//			}
//		}
//		if(val==true)
//		{
//			System.out.println("Verify product price range 10000-15000 tc passed");
//		}
//		else
//		{
//			System.out.println("Verify product price range 10000-15000 tc failed");
//		}
//		Assert.assertTrue(val,"price of product is less than 10000 or greater than 15000");
		
			if(q>10000 && q<15000)
			{
				val=true;
			}
			
			Assert.assertTrue(val,"price of product is found less than 10000 or greater than 15000");
		}
		
		
		
	}
	

}
