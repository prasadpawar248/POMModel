package amazon;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_VerifyCapacity121200 extends TestBaseClass
{
	
	@Test
	public void VerifyCapacity121200()
	{
		AmazonHomePOMClass2 ahp=new AmazonHomePOMClass2(driver);
		ahp.enterSearchTextBox();
		ahp.clickSearchButton();
		ahp.clickOnCapcity121200();
		
		List<String> allProductsDisc=new LinkedList<String> (ahp.captureProductDiscriptions());
		
		for(String singleProductDisc:allProductsDisc)
		{
			boolean val=false;
			String S="",R="";
			for(int i=121;i<=200;i++)
			{
				S="";R="";
			S=S+Integer.toString(i)+" L";
			R=R+Integer.toString(i)+" liters";
			
				if(singleProductDisc.contains(S) || singleProductDisc.contains(R))
				{
					val=true;
					break;
				}
			}
		Assert.assertTrue(val,S+" or "+R+" This value is not found "+singleProductDisc);
		
		}
		
		
		
	}

}
