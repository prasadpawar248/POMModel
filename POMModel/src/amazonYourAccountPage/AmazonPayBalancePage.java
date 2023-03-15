package amazonYourAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPayBalancePage {

	protected WebDriver driver;
	protected Actions act;
	
	
	public AmazonPayBalancePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
//element amount text box
	
	@FindBy(xpath="//input[@id='gc-asv-manual-reload-amount']")
	WebElement enterAmount;
	
	public void enterAmountInAmountTextBox(String value)
	{
		enterAmount.sendKeys(value);
	}
	
//element continue button
	
	@FindBy(xpath="//button[@id='form-submit-button']")WebElement continueBtn;
	public void clickOnContinueBtn()
	{
		continueBtn.click();
	}

}
