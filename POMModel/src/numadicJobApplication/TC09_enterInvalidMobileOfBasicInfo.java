package numadicJobApplication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC09_enterInvalidMobileOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterInvalidMobileOfBasicInfo() throws IOException
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterMobile("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		boolean val=true;
		try{
		 val=jap.mobilePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		
		UtilityClass.screenshot(driver,"enterInvalidMobileOfBasicInfo");
		Assert.assertTrue(val,"popup message is not displayed");
		
		
	}
	
}
