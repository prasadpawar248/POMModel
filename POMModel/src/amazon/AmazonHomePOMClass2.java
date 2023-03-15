package amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePOMClass2 {
	protected WebDriver driver;
	protected Actions act;

	public AmazonHomePOMClass2(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

//search samsung refrigerator

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;

	public void enterSearchTextBox() {
		searchTextBox.sendKeys("Samsung refrigerator");
		System.out.println("entered samsung refrigeretor in search box");
	}

//click on search button

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchButton;

	public void clickSearchButton() {
		act.click(searchButton).perform();
		System.out.println("clicked on search button");
	}

//click on logout

	@FindBy(xpath = "//span[text()='Sign Out']")
	WebElement logout;

	public void clickOnLogoutBtn() {
		act.click(logout).perform();
		System.out.println("clicked on logout");
	}

// clicked on element "your Account"

	@FindBy(xpath = "//div[@class='nav-al-column nav-template nav-flyout-content nav-tpl-itemList nav-flyout-accessibility']/a[1]/span")
	WebElement yourAccountLink;

	public void clickOnYourAccountLink() {
		yourAccountLink.click();
		System.out.println("clicked on your account link");
	}

//click on samsung fridge 
	@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[12]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement samsungFridge;

	public void clickOnSamsungFridge() {
		act.click(samsungFridge).perform();
		System.out.println("clicked on fridge");

	}

//Price Range

	@FindBy(xpath = "//span[text()='₹10,000 - ₹15,000']")
	WebElement priceRange1000015000;

	public void clickOnPriceRange1000015000() {
		priceRange1000015000.click();
		System.out.println("clicked on price range 10000-15000");
	}

	@FindBy(xpath = "//input[@id='low-price']")
	WebElement minPrice;

	public void enterMinPrice(String minp) {
		minPrice.sendKeys(minp);
		System.out.println("Entered min price");
	}

	@FindBy(xpath = "//input[@id='high-price']")
	WebElement maxPrice;

	public void enterMaxPrice(String minp) {
		maxPrice.sendKeys(minp);
		System.out.println("Entered max price");
	}

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement goBtn;

	public void clickOnGoBtn() {
		goBtn.click();
		System.out.println("clicked on go button");
	}

//capture price data
	@FindBy(xpath = "//div[@class='a-row a-size-base a-color-base']/a/span/span[2]/span[2]")
	List<WebElement> samsungProductsPrice;

	public List<String> allProductsprice() {
		List<String> prices = new LinkedList<String>();

		for (WebElement p : samsungProductsPrice) {
			prices.add(p.getText());
		}

		return prices;
	}

//capacity

	@FindBy(xpath = "//li[@id='p_n_feature_seven_browse-bin/1480497031']/span/a/div//i")
	WebElement capacity121200;

	public void clickOnCapcity121200() {
		capacity121200.click();
		System.out.println("clicked on capacity 121-200L");
	}

	@FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span")
	List<WebElement> productDiscription;

	public List<String> captureProductDiscriptions() {
		List<String> prodDisc = new LinkedList<String>();
		for (WebElement pd : productDiscription) {
			prodDisc.add(pd.getText());
		}

		return prodDisc;
	}

//Brands

	@FindBy(xpath = "//li[@id='p_89/Samsung']//input")
	WebElement brandSamsung;

	public void clickOnbrandSamsungCheckBox() {
		act.click(brandSamsung).perform();
		System.out.println("clicked on samsung brands");
	}

//Customer review star

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement customerReviewStar;

	public void clickOncustomerReviewStar() {
		act.click(customerReviewStar).perform();
		// return customerReviewStar.getText();
	}

	@FindBy(xpath = "//div[@class='a-row a-size-small']/" + "span/span[3]/a/i/span")
	List<WebElement> starOnProduct;

	public List<String> captureProductStar() {
		List<String> allStars = new LinkedList<String>();
		for (WebElement star : starOnProduct) {
			allStars.add(star.getText());
		}
		return allStars;

	}

//Discount

	@FindBy(xpath = "//span[text()='25% Off or more']")
	WebElement dicount25Off;

	public void clickOnDicount25Off() {
		dicount25Off.click();
	}

	@FindBy(xpath = "//div[@class='a-section a-spacing-none a-spacing-top-micro s-price-instructions-style']/div/span[2]")
	List<WebElement> discount;

	public List<Integer> captureDiscount() {
		List<Integer> discountPer = new LinkedList<Integer>();
		for (WebElement d : discount) {
			String dp = d.getText();
			dp = dp.substring(1, dp.indexOf("%"));
			int dpInt = Integer.parseInt(dp);
			discountPer.add(dpInt);
		}
		return discountPer;
	}

//Energy star
	@FindBy(xpath = "//li[@id='p_n_feature_two_browse-bin/28232662031']/span/a/div//input")
	WebElement energy2Star;

	public void clickOnEnergyStar() {
		act.click(energy2Star).perform();
		System.out.println("clicked on 2 star check box");
	}

}
