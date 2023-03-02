package amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_VerifyEnergy2Star extends TestBaseClass 
{

	@Test
	public void VerifyEnergy5Star()
	{
		ahp.clickOnEnergyStar();
		for(String p:ahp.captureProductDiscriptions())
		{
			boolean val=false;
			if(p.contains("2 Star"))
			{
				val=true;
			}
			Assert.assertTrue(val,"2 Star is not found in product discription");
		}
	}
	
}
