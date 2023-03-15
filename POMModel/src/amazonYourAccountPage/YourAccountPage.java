package amazonYourAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newrelic.api.agent.Logger;

public class YourAccountPage {

	protected WebDriver driver;
	protected Actions act;

	public YourAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}


	
//clicked on element "Your Addresses"
	
	@FindBy(xpath="//div[@class='a-section ya-personalized']/div[3]/div[1]/a/div/div")
	WebElement yourAddresses;
	
	public void clickedOnYourAddresses()
	{
		yourAddresses.click();
		System.out.println("clicked on your addresses");
	}

//clicked on element "Amazon Pay balance"

	@FindBy(xpath = "//div[@class='a-section ya-personalized']/div[3]//div[3]/a/div/div")
	WebElement amazonPayBalance;

	public void clickOnAmazonPayBalanceLink() {
		amazonPayBalance.click();
		System.out.println("Clicked on amazon pay balance link");
	}
	
	

}
