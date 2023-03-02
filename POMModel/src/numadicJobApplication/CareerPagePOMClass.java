package numadicJobApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CareerPagePOMClass 
{
	private WebDriver driver;
	
	public CareerPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[@data-zrqa='cw-bg2-stitle']") WebElement heading;
	@FindBy(xpath="//div[@class='lyteDummyEventContainer']") WebElement filter;
	@FindBy(xpath="//*[@data-value='Engineering']")WebElement dept;
	@FindBy(xpath="//a[text()='QA Engineer']") WebElement qaEngineer;
	
	public String captureHeading()
	{
		String text=heading.getText();
		System.out.println("captured heading text");
		return text;
	}
	
	public void clickOnFilter()
	{
		filter.click();
		System.out.println("clicked on filter");
	}
	
	public void clickonDept()
	{
		dept.click();
		System.out.println("clicked on engineering option");
	}
	
	public void clickOnJob()
	{
		qaEngineer.click();
		System.out.println("clicked on QA Engineer job");
	}

}
