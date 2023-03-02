package numadicJobApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JobApplicationPagePOMClass {

	private WebDriver driver;

	public JobApplicationPagePOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// basic info

	@FindBy(xpath = "//div[@class='crc-form-row  crc-section-53264000000002559_1 crc-form-sec ']//a")
	WebElement clearBasicInfo;

	public void clickOnClearBasicInfo() {
		clearBasicInfo.click();
		System.out.println("clicked on clear button");
	}

	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003149 ']//div//crux-text-component//input")
	WebElement firstName;

	public void enterFirstName(String fn) {
		firstName.sendKeys(fn);
		System.out.println("entered first name");
	}

	@FindBy(xpath = "//crux-error-message[@error-message='First Name cannot be empty.']//span")
	WebElement firstNamePopup;

	public String captureFirstNamePopup() {
		String fNamePopup = firstNamePopup.getText();
		System.out.println("captured first name popup");
		return fNamePopup;
	}

	@FindBy(xpath = "//div[@class='crc-form-field cnl-firstname-row ']//lyte-drop-button")
	WebElement dropDown;

	@FindBy(xpath = "//lyte-drop-item[@data-value='Mr.']")
	WebElement Mr;

	public void clickOnDropDown() {
		dropDown.click();
		System.out.println("clicked on dropDownButton");
		Mr.click();
		System.out.println("selected Mr from dropdown");
	}

	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003151 ']//div//crux-text-component//input")
	WebElement lastName;

	public void enterLastName(String ln) {
		lastName.sendKeys(ln);
		System.out.println("entered last name");
	}

	@FindBy(xpath = "//crux-error-message[@error-message='Last Name cannot be empty.']//span")
	WebElement lastNamePopup;

	public String captureLastNamePopup() {
		String lNamePopup = lastNamePopup.getText();
		System.out.println("captured last name popup");
		return lNamePopup;
	}

	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003155 ']//div//crux-email-component//input")
	WebElement email;

	public void enterEmail(String e) {
		email.sendKeys(e);
		System.out.println("entered email");
	}

	@FindBy(xpath = "//crux-error-message[@error-message='Email cannot be empty.']//span")
	WebElement emailPopup;

	public String captureEmailPopup() {
		String ePopup = emailPopup.getText();
		System.out.println("captured email popup");
		return ePopup;
	}

	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003161 ']//div//crux-phone-component//input")
	WebElement mobile;

	public void enterMobile(String m) {
		mobile.sendKeys(m);
		System.out.println("entered mobile");
	}

	@FindBy(xpath = "//crux-phone-component[@id='rec-form_53264000000003161']//span")
	WebElement mobilePopup;

	public String captureMobilePopup() {
		String mPopup = mobilePopup.getText();
		System.out.println("captured mobile popup");
		return mPopup;
	}

	// address info

	@FindBy(xpath = "//div[@class='crc-form-row  crc-section-53264000000002559_2 crc-form-sec ']//a")
	WebElement clearAddressInfo;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003169 ']//div//crux-text-component//input")
	WebElement street;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003171 ']//div//crux-text-component//input")
	WebElement city;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003173 ']//div//crux-text-component//input")
	WebElement state;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003175 ']//div//crux-text-component//input")
	WebElement zipCode;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003177 ']//div//crux-text-component//input")
	WebElement country;

	// professional details

	@FindBy(xpath = "//div[@class='crc-form-row  crc-section-53264000000002559_3 crc-form-sec ']//a")
	WebElement clearProfessionalDetails;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003181 ']//crux-text-component//input")
	WebElement currentEmployer;
	@FindBy(xpath = "//span[text()='Current Employer cannot be empty.']")
	WebElement currentEmployerPopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003183 ']//crux-picklist-component//lyte-dropdown//lyte-drop-button")
	WebElement currentJobTitleDropDown;
	@FindBy(xpath = "//span[text()='Current Job Title cannot be empty.']")
	WebElement currentJobTitleDropDownPopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000003185 ']//rec-skills-component//ul")
	WebElement skillSet;
	@FindBy(xpath = "//span[text()='Skill Set cannot be empty.']")
	WebElement skillSetPopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000285107 ']//crux-text-component//input")
	WebElement currentCTC;
	@FindBy(xpath = "//span[text()='Current CTC cannot be empty.']")
	WebElement currentCTCPopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000285115 ']//crux-text-component//input")
	WebElement expectedCTC;
	@FindBy(xpath = "//span[text()='Expected CTC cannot be empty.']")
	WebElement expectedCTCPopup;

	// Other info
	@FindBy(xpath = "//div[@class='crc-form-row  crc-section-53264000000002559_4 crc-form-sec ']//a")
	WebElement clearOtherInfo;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000279001 ']//crux-number-component//input")
	WebElement noticePeriod;
	@FindBy(xpath = "//span[text()='Notice Period (days) cannot be empty.']")
	WebElement noticePeriodPopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000279009 ']//crux-text-component//input")
	WebElement reasonForChange;
	@FindBy(xpath = "//span[text()='Reason for change cannot be empty.']")
	WebElement reasonForChangePopup;
	@FindBy(xpath = "//div[@class='crc-form-row crc-rec-form_53264000000279013 ']//crux-text-component//input")
	WebElement whyJoinNumadic;
	@FindBy(xpath = "//span[text()='Why Join Numadic ? cannot be empty.']")
	WebElement whyJoinNumadicPopup;

}
