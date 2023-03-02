package flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartHomePagePOMClass 
{
	protected WebDriver driver;
	
	public FlipcartHomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
//	@FindBy(xpath="//div[@class='_3eARKq']//div[1+"+i+"]//img[2]")WebElement image;
	public String captureImageSRC(int i)
	{
		WebElement image=driver.findElement(By.xpath("//div[@class='_3eARKq']//div["+i+"]//img[2]"));
		String imageDisc=image.getAttribute("src");
		return imageDisc;
	}
	
	@FindBy(xpath="//div[@class='_2t2dSp']")WebElement rightArrow;
	public void clickOnRightArrow(int a)
	{
		rightArrow.click();
	}
	
	
	
}
