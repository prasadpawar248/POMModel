package sauceDemoHomePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass {
	
	
	public WebDriver driver;
	
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Open Menu']") WebElement openMenuBtn;
	@FindBy(xpath="//a[text()='About']") WebElement aboutLink;
	@FindBy(xpath="//a[text()='Logout']") WebElement logoutLink;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]") WebElement addToCartBtn;
	@FindBy(xpath="//button[text()='Add to cart']") List<WebElement> multipleAddToCartBtn;
	@FindBy(xpath="//button[text()='Remove']") WebElement removeBtn;
	@FindBy(xpath="//select[@class='product_sort_container']") WebElement filter;
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cartBtn;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") WebElement cartBtnQuntity;
	
	public void clickOnMainMenu()
	{
		openMenuBtn.click();
		System.out.println("Clicked on main menu button");
	}
	
	public void clickOnAboutLink()
	{
		aboutLink.click();
		System.out.println("clicked on about link");
	}
	
	public void clickOnLogoutButton()
	{
		logoutLink.click();
		System.out.println("clicked on logout button");
	}
	
	public void clickOnAddToCartButton()
	{
		addToCartBtn.click();
		System.out.println("clicked on add to cart button");
	}
	
	public void clickOnAllAddToCartButton()
	{
		for(WebElement singleProduct:multipleAddToCartBtn)
		{
			singleProduct.click();
		}
		System.out.println("clicked on all add to cart button");
	}
	
	public void clickOnRemoveButton()
	{
		removeBtn.click();
		System.out.println("clicked on remove button");
	}
	
	public void clickOnFilterButton()
	{
		filter.click();
		System.out.println("clicked on filter button");
	}
	
	public void clickOnCartButton()
	{
		cartBtn.click();
		System.out.println("clicked on cart button");
	}
	
	public int captureCartQuntity()
	{
		String qty=cartBtnQuntity.getText();
		int a=Integer.parseInt(qty);
		return a;
	}
	
	
	

}
