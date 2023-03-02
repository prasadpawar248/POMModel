package numadicCareerPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC01_VearifyHeaderText extends TestBaseClass
{	
	
	@Test
	public void vearifyHeaderText()
	{
		CareerPagePOMClass cp=new CareerPagePOMClass(driver);
		String expectedHeadingText="JOIN OUR CREW";
		System.out.println(expectedHeadingText);
		String actualHeadingText=cp.captureHeading();
		System.out.println(actualHeadingText);
		Assert.assertEquals(expectedHeadingText, actualHeadingText,"Heading is mismatch");
	}
	
		
	

}
