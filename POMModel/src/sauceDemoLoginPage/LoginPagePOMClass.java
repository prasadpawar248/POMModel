package sauceDemoLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	 WebDriver driver;
	 
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//input[@id='login-button']") WebElement loginButton;
	@FindBy(xpath="//h3[@data-test='error']") WebElement usernAndPassPopupMsg;
	
	public void enterUsername(String u)
	{
		username.sendKeys(u);
		System.out.println("Username Entered");
	}
	
	public void enterPassword(String p)
	{
		password.sendKeys(p);
		System.out.println("Password entered");
	}
	
	public void loginBtn()
	{
		loginButton.click();
		System.out.println("clicked on login button");
	}
	
	public String popupMsg()
	{
		return usernAndPassPopupMsg.getText();
	}

}
