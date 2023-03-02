package amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_VerifyDiscount25Off extends TestBaseClass
{
	@Test
	public void VerifyDiscount25Off()
	{
		ahp.clickOnDicount25Off();
		
		for(int i:ahp.captureDiscount())
		{
			boolean val=false;
			if(i>=25)
			{
				val=true;
			}
			Assert.assertTrue(val,"discount value was found less than 25% "+i);
		}
	}

}
