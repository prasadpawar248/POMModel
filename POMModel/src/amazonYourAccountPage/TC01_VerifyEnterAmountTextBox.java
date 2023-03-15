package amazonYourAccountPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amazon.AmazonHomePOMClass2;
import amazon.AmazonPagePOMClass;
import amazonSamsungProductPage.TestBaseClass;

public class TC01_VerifyEnterAmountTextBox extends TestBaseClass
{
	@Test(dataProvider="readExceldata" )
	public void verifyEnterAmountTextBox(String value) {
		
		login();
		AmazonPagePOMClass ap=new AmazonPagePOMClass(driver);
		ap.clickOnSignInAccountLink();
		AmazonHomePOMClass2 ah=new AmazonHomePOMClass2(driver);
		ah.clickOnYourAccountLink();
		YourAccountPage ya=new YourAccountPage(driver);
		ya.clickOnAmazonPayBalanceLink();
		AmazonPayBalancePage apb=new AmazonPayBalancePage(driver);
	
		apb.enterAmountInAmountTextBox(value);
		apb.clickOnContinueBtn();
		
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("Select a Payment Method - Amazon.in Checkout"))
		{
			System.out.println("Ammount text box TC Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Ammount text box TC Failed");
			Assert.assertFalse(false);
		}
	}
	
	@DataProvider
	public String [] readExceldata() throws IOException
	{
		String path="F:\\D\\Software testing\\My docs\\Selenium\\Excel_files\\AmazonTestData.xlsx";
		String Sheet="Sheet1";
		
		int r=ExcelData.rowCount(path, Sheet);
		int c=ExcelData.cellCount(path, Sheet);
		
		String []val=new String[r];
		for(int i=1;i<=r;i++)
		{
			val[i-1]=ExcelData.cellValue(path, Sheet, r, c);
		}
		return val;
	}

}
