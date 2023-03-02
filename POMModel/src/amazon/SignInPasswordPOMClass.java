package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPasswordPOMClass {

	protected WebDriver driver;
	
	public SignInPasswordPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='ap_password']")WebElement password;
	public void enterPassword()
	{
		password.sendKeys("Aprasad248@");
		System.out.println("entered password");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")WebElement signBtn;
	public void clickOnSignBtn()
	{
		signBtn.click();
		System.out.println("clicked on signIn button");
	}
	
	
}
