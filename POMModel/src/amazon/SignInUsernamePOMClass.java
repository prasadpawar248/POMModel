package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInUsernamePOMClass {

	protected WebDriver driver;
	
	public SignInUsernamePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='ap_email']")WebElement username;
	public void enterUsername()
	{
		username.sendKeys("prasadpawar248@gmail.com");
		System.out.println("entered username");
	}
	
	@FindBy(xpath="//input[@id='continue']")WebElement contBtn;
	public void clickedOnContBtn()
	{
		contBtn.click();
		System.out.println("clicked on continue button");
	}
	
	
}
