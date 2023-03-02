package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPagePOMClass 
{
	protected WebDriver driver;
	protected Actions act;
	
	public AmazonPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")WebElement signInAccLink;
	
	public void clickOnSignInAccountLink()
	{
		act.moveToElement(signInAccLink).perform();
		System.out.println("Mouse Hovered on sign in account link");
	}
	
	@FindBy(xpath="//span[text()='Sign in']") WebElement signInButton;
	public void clickOnSignInButton()
	{
		signInButton.click();
		System.out.println("clicked on sign in button");
	}
	

}
