package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_VerifyCustomerReview4Star extends TestBaseClass
{
	@Test
	public void VerifyCustomerReview4Star()
	{
		ahp.clickOncustomerReviewStar();
		for(String s:ahp.captureProductStar())
		{
			boolean val=false;
			System.out.println(s);
			if(s.contains("4") ||s.contains("4.5"))
			{
				val=true;
			}
			Assert.assertTrue(val,"4 or 4.5 star are found in "+s);
		}
		
		String a=driver.findElement(By.xpath("//div[@class='a-row a-size-small']/span/span[3]/a/i/span")).getText();
		System.out.println(a);
	}
	

}
