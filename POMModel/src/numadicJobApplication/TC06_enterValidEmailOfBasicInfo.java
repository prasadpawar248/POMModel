package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC06_enterValidEmailOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterValidEmailOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterEmail("akshay123@gmail.com");
		
		boolean val=true;
		try{
		 val=jap.emailPopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		Assert.assertFalse(val,"popup message is displayed");

	}
	
}
