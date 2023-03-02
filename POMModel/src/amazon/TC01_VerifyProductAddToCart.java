package amazon;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class TC01_VerifyProductAddToCart extends TestBaseClass
{
	
//	@Test
	public void VerifyProductAddToCart()
	{
		AmazonHomePOMClass2 ahp=new AmazonHomePOMClass2(driver);
		ahp.enterSearchTextBox();
		ahp.clickSearchButton();
		ahp.clickOnSamsungFridge();
		
		List<String> windowIds=new LinkedList<String> (driver.getWindowHandles());
		String secondWindoId=windowIds.get(1);
		driver.switchTo().window(secondWindoId);
		
	}
	
	

	

	

}
