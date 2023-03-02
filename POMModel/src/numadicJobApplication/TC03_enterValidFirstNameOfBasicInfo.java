package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC03_enterValidFirstNameOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterInvalidFirstNameOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterFirstName("prasad");
		
		boolean val=true;
		try{
		 val=jap.firstNamePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		
		Assert.assertFalse(val,"popup is displayed");

	}
	
}
