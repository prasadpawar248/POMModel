package numadicCareerPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC02_VerifyPageTitleOfQAEngineer extends TestBaseClass
{

	@Test
	public void VerifyPageTitleOfQAEngineer()
	{
		CareerPagePOMClass cp=new CareerPagePOMClass(driver);
		cp.clickOnFilter();
		cp.clickonDept();
		cp.clickOnJob();
		String actualTitle=driver.getTitle();
		String expectedTitle="Numadic Iot Pvt. Ltd. - QA Engineer in ";
		Assert.assertEquals(actualTitle, expectedTitle,"Title is mismatched");
	}
	
	
}
