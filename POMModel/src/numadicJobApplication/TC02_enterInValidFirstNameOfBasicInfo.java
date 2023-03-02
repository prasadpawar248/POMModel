package numadicJobApplication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC02_enterInValidFirstNameOfBasicInfo extends TestBaseClass
{
	@Test
	public void enterInValidFirstNameOfBasicInfo() throws IOException
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.enterFirstName("1111111111111111111111111111111111111111111111111111111111111111111111111111");
		
		boolean val=true;
		try{
		 val=jap.firstNamePopup.isDisplayed();
		}
		catch(Exception e)
		{
			val=false;
		}
		UtilityClass.screenshot(driver,"enterInValidFirstNameOfBasicInfo");
		Assert.assertTrue(val,"popupMessage is not displayed");

	}
	
}
