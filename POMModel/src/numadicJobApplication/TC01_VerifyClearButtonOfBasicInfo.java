package numadicJobApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC01_VerifyClearButtonOfBasicInfo extends TestBaseClass
{
	@Test
	public void VerifyClearButtonOfBasicInfo()
	{
		JobApplicationPagePOMClass jap=new JobApplicationPagePOMClass(driver);
		jap.clickOnDropDown();
		jap.enterFirstName("prasad");
		jap.enterLastName("pawar");
		jap.enterEmail("prasadpawar123@gmail.com");
		jap.enterMobile("9960585418");
		jap.clickOnClearBasicInfo();
		
		Assert.assertEquals(jap.captureFirstNamePopup(),"First Name cannot be empty.","first name popup message missmatched");
		Assert.assertEquals(jap.captureLastNamePopup(), "Last Name cannot be empty.","last name popup message mismatched");
		Assert.assertEquals(jap.captureEmailPopup(), "Email cannot be empty.","email popup message mismatched");
		Assert.assertEquals(jap.captureMobilePopup(), "Mobile cannot be empty.","mobile popup message mismatched");
		
	}
	
}
