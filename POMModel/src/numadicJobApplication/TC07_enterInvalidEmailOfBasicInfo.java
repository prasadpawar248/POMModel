package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC07_enterInvalidEmailOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterInvalidEmailOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterEmail("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		boolean val=true;
		try{
		 val=jap.emailPopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		Assert.assertTrue(val,"popup message is not displayed");

	}
	
}
