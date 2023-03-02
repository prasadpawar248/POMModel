package amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08_VerifyPageTitleAfterClickOnSamsungFridge extends TestBaseClass 
{
	@Test
	public void VerifyPageTitleAfterClickOnSamsungFridge()
	{
		ahp.clickOnSamsungFridge();
		String expectedTitle="Samsung 198 L 4 Star Digital Inverter Single Door "
				+ "Refrigerator (RT21A2D2XUT/HL, Digi-Touch Cool, Base Stand with "
				+ "Drawer, Pebble Blue, Medium, 2022 Model) : Amazon.in: Home &amp; Kitchen";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle,"Title is mismatched");
	}
	
}
