package flipcart;

import org.testng.annotations.Test;

public class TC01_Verify5Arrivals extends TestBaseClass
{
//	@Test
	public void Verify5Arrivals()
	{
		FlipcartHomePagePOMClass fhp=new FlipcartHomePagePOMClass(driver);
		
		for(int i=0;i<5;i++)
		{
			String a=fhp.captureImageSRC(1+i);
			System.out.println(a);
			fhp.clickOnRightArrow(i);
		}
		
	}
}
