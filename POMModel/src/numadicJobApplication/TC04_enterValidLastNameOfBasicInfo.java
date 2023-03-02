package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC04_enterValidLastNameOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterValidLastNameOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterLastName("pawar");
		
		boolean val=true;
		try{
		 val=jap.lastNamePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		Assert.assertFalse(val,"popup message is displayed");

	}
	
}
