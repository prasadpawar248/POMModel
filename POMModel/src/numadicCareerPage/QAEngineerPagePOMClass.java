package numadicCareerPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAEngineerPagePOMClass 
{
	private WebDriver driver;
	
	public QAEngineerPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess'])[1]") WebElement IamIntrestedBtn;
	@FindBy(xpath="//button[@class='lyte-button lyteColorBtn']") WebElement referFriendBtn;
	@FindBy(xpath="//h1[text()='QA Engineer']") WebElement heading;
	
	public boolean verifyButton()
	{
		boolean val=IamIntrestedBtn.isDisplayed();
		return val;
	}
	
	public void clickOnIAmIntrestedButton()
	{
		IamIntrestedBtn.click();
		System.out.println("clicked on I am intrested button");
	}
}
