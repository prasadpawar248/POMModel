package amazonSamsungProductPage;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSamsungFridgePagePOMClass 
{
	protected WebDriver driver;
	protected Actions act;
	
	public AmazonSamsungFridgePagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
//buy now button
	
	@FindBy(xpath="//input[@id='buy-now-button']") WebElement BuyNowBtn;
	public void clickOnBuyNowButton()
	{
		BuyNowBtn.click();
		System.out.println("clicked on buy now button");
	}
	
//cart quantity 
	
	@FindBy(xpath="//span[@id='nav-cart-count']")WebElement cartQuantity;
	public String captureCartQty()
	{
		String a=cartQuantity.getText();
		return a;
	}
	
//quantity drop down 
	
	@FindBy(xpath="//select[@id='quantity']")WebElement quantityDropDown;
	public void selectQuantityDropdown(int a)
	{
		Select sc=new Select(quantityDropDown);
		String b=Integer.toString(a);
		sc.selectByValue(b);
	}
	
//Add to cart button
	
		@FindBy(xpath="//input[@id='add-to-cart-button']")WebElement addToCartBtn;
		public void clickOnAddToCartBtn()
		{
			addToCartBtn.click();
			System.out.println("clicked on add to cart button");
		}
		
//after click on add to cart button elements of child alert
		
	//Added to cart message
		
		@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")WebElement addedToCart;
		
		public String captureAddedToCartText()
		{
			return addedToCart.getText();
		}
		
	//quntity text
		
		@FindBy(xpath="//span[@id='attach-accessory-cart-total-string']")WebElement quantityText;
		public Integer captureQuantityText()
		{
			String qty=quantityText.getText();
			qty=qty.substring((qty.indexOf('(')+1),qty.indexOf('i'));
			qty=qty.trim();
			int p=Integer.parseInt(qty);
			return p;
		}

	//price
		@FindBy(xpath="//span[@id='attach-accessory-cart-subtotal']")WebElement price;
		public int capturePrice()
		{
			String pr=price.getText();
			pr=pr.substring(1).replace(",", "");
			int p=Integer.parseInt(pr);
			return p;
		}
	
	//close button
		
		@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")WebElement cliseButton;
		public void clickOnCloseButton()
		{
			cliseButton.click();
			System.out.println("clicked on close buttons");
		}
		
		
	//cart button
		@FindBy(xpath="/html/body/div[4]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")WebElement cartBtn;
		public void clickOnCartBtn()
		{
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement a=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")));
			
			act.click(cartBtn).perform();
			System.out.println("clicked on cart button");
		}
		
		
		
//one Year Extended Warranty Checkbox
	
	@FindBy(xpath="//input[@id='mbb-offeringID-1']")WebElement oneYearExtendedWarrantyCheckbox;
	public void clickOnOneYearExtendedWarrantyCheckbox()
	{
		oneYearExtendedWarrantyCheckbox.click();
		System.out.println("clicked on one year extended warranty checkbox");
	}
	
//offers-bank offers
	
	@FindBy(xpath="//a[contains(text(),'4 offers')]")WebElement bank4Offers;
	public void clickOnBank4Offers()
	{
		bank4Offers.click();
		System.out.println("clicked on bank 4 offers");
	}
	
//bank offer text
	
	@FindBy(xpath="//div[@id='InstantBankDiscount-sideSheet']/header/h2")WebElement bankOfferText;
	public String capturebankOfferText()
	{
		String a=bankOfferText.getText();
		a=a.trim();
		return a;
	}
	
//4 bank offer
	
	@FindBy(xpath="//div[@id='InstantBankDiscount-sideSheet']/div/div/h1")
	List<WebElement> multipleBankOffer;
	public List<String> captureFourBankOfferText()
	{
		List<String>listBankOffer=new LinkedList<String>();
		for(WebElement singleBankOffer:multipleBankOffer)
		{
		String sbo=singleBankOffer.getText();
		sbo=sbo.trim();
		listBankOffer.add(sbo);
		}
		return listBankOffer;
	}
	
//5 luxe brown item
	
	@FindBy(xpath="//p[text()='189 L- Luxe Brown- Base Stand with Drawer']")WebElement luxeBrownBaseStandWithDrawer;
	public void clickOnLuxeBrown()
	{
		luxeBrownBaseStandWithDrawer.click();
		System.out.println("clicked on luxe brown prodcut item");
	}
	
//pruduct discription after click on above element
	
	@FindBy(xpath="//h1[@class='a-size-large a-spacing-none']")WebElement productDiscription;
	public void clickOnProductDiscription()
	{
		productDiscription.click();
		System.out.println("clicked on product discription");
	}
	
	
}
