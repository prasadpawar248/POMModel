package amazonShoppingCart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {

	protected WebDriver driver;
	WebDriverWait wait;
	
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	
	
//shopping cart title
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")WebElement shoppingCartTitle;
	
	public String getShoppingCartText()
	{
		return (shoppingCartTitle.getText());
	}
	
//product discription
	
	@FindBy(xpath="//span[text()='Samsung 189 L 5 Star Inverter Direct-Cool Single Door Refrigerator (RR21C2…']")WebElement productDiscription;
	
	public String getProductDiscription()
	{
		return (productDiscription.getText());
	}
	
//qty drop down
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']") WebElement qtyDropDown;
	
//select qty in qty drop down
	
	@FindBy(xpath="//li[@class='a-dropdown-item quantity-option']/a")List<WebElement> selectQty;
		
//total price
	
	@FindBy(xpath="//span[@id='sc-subtotal-amount-activecart']/span")WebElement totalPrice;
	
public int selectQtyINdropDown(int a)
	{
		String totalPr="";
		WebElement qtyd=wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//span[@class='a-button-text a-declarative']")));
		qtyd.click();
		String b=Integer.toString(a);
		for(WebElement qty:selectQty)
		{	
			if(qty.getText().equals(b))
			{
				qty.click();
				
				totalPr=totalPrice.getText();
				break;
			}
		}
		int tp=(int)(Double.parseDouble(totalPr.substring(1).replace(",", "")));
		return tp;
	}

}
