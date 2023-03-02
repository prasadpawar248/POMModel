package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	protected WebDriver driver;
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement username;
	@FindBy(xpath="//input[@id='pass']") WebElement password;
	@FindBy(xpath="//button[@id='loginbutton']") WebElement loginBtn;
	@FindBy(xpath="//a[text()='Forgotten account?']") WebElement forgottenAccountLink;
	@FindBy(xpath="//a[text()='Sign up for Facebook']") WebElement signUpLink;
	@FindBy(xpath="//div[text()='Log in to Facebook']") WebElement heading;
	@FindBy(xpath="//a[@class='_97w4']") WebElement forgottenPassword;
	@FindBy(xpath="//div[@class='_9ay7']") WebElement usernamePasswordPop;
	
	
	public void clickOnUsername(String u)
	{
		username.sendKeys(u);
		System.out.println("entered username");
	}
	
	public void clickOnPassword(String p)
	{
		password.sendKeys(p);
		System.out.println("entered password");
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
		System.out.println("clicked on login button");
	}
	
	public void clickOnForgottenAccountLink()
	{
		forgottenAccountLink.click();
		System.out.println("clicked on forgotten account link");
	}
	
	public void clickOnSignUpLink()
	{
		signUpLink.click();
		System.out.println("clicked on sign up link");
	}
	
	public String captureHeadingText()
	{
		String a=heading.getText();
		System.out.println("captured heading text");
		return a;
	}
	
	public void clickedOnForgottenPasswordLink()
	{
		forgottenPassword.click();
		System.out.println("clicked on forgotten password link");
	}
	
	public String capturePopupMessage()
	{
		String b=usernamePasswordPop.getText();
		System.out.println("captured popup message");
		return b;
	}
	
	
	
	
}
