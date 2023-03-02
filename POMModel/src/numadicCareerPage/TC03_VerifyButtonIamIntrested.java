package numadicCareerPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC03_VerifyButtonIamIntrested extends TestBaseClass
{

	
	@Test
	public void VerifyPageTitleOfQAEngineer()
	{
		CareerPagePOMClass cp=new CareerPagePOMClass(driver);
		cp.clickOnFilter();
		cp.clickonDept();
		cp.clickOnJob();
		
		QAEngineerPagePOMClass qap=new QAEngineerPagePOMClass(driver);
		boolean actualVal=qap.verifyButton();
		Assert.assertTrue(actualVal,"I am intrested button is not found");
		qap.clickOnIAmIntrestedButton();
		boolean afterClickVal = true;
		try {
		qap.verifyButton();
		}
		catch(Exception e)
		{
			afterClickVal=false;
		}
		Assert.assertFalse(afterClickVal,"I am intrested button is not clickabled");
	}
	
	

	
}
