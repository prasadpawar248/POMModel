package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC08_enterValidMobileOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterValidMobileOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterMobile("9960585418");
		
		boolean val=true;
		try{
		 val=jap.mobilePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		Assert.assertFalse(val,"popup message is displayed");

	}
	
}
