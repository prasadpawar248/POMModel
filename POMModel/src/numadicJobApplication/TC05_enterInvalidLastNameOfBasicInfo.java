package numadicJobApplication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC05_enterInvalidLastNameOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterInvalidLastNameOfBasicInfo() throws IOException
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterLastName("-----------------------------------------------------------------------------");
		
		boolean val=true;
		try{
		 val=jap.lastNamePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		UtilityClass.screenshot(driver,"enterInvalidLastNameOfBasicInfo");
		Assert.assertTrue(val,"popup message is not displayed");

	}
	
}
