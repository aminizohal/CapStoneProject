package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class CapstonePageObjects extends Base{

	public CapstonePageObjects() { 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement DeskTop;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktope;
 
	@FindBy(xpath = "//div[@id='content']")
	private WebElement desktopItems;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement AddTohpCart;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement slectQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCart;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement addSuccessfullMessage;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCartCanon;

	@FindBy(css = "#input-option226")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantityCanon;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartC;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement CanonAddMessage;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement CanonEOS;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement CanonReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement name;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement Review;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[5]")
	private WebElement rating;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement Continue;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement Reviewmessage;

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement LoptopAndNoteBook;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLoptop;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement macBookItem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtoCartBTN;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	@FindBy(xpath = "//a[contains(text(),'Apple')]")
	private WebElement item;
	@FindBy(xpath = "//h2[contains(text(),'$602.00')]")
	private WebElement amount;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartOption;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement xButton;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement emptyCart;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement comprisonMacBook;

//	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
//	private WebElement comprisonMacAir;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement MBsuccessMessage;

	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement productComparison;

	@FindBy(xpath = "//div[@id='product-compare']")
	private WebElement comparisonChart;

	public void clickOnDeskTop() {
		WebDriverUtility.clickOnElement(DeskTop);
	}

	public void clickOneShowAllD() {
		WebDriverUtility.clickOnElement(showAllDesktope);
	}

	public void showAllDesktopItems() {
		WebDriverUtility.isElementDisplayed(showAllDesktope);
	}

	public void HpAddCartClick() {
		WebDriverUtility.clickOnElement(AddTohpCart);
	}

	public void slectQuantity(String value) {
		WebDriverUtility.enterValue(slectQuantity, value);
		slectQuantity.clear();
		slectQuantity.sendKeys(value);

	}

	public void AddToCart() {
		WebDriverUtility.clickOnElement(AddToCart);
	}

	public boolean successfullyMessage(String value) {
		boolean successMessage = addSuccessfullMessage.isDisplayed();
		return successMessage;
	}

	public void addConnonToCart() {
		WebDriverUtility.clickOnElement(addToCartCanon);
	}

	public void selectColor() {
		Select avaialbeOptions = new Select(driver.findElement(By.id("input-option226")));
		avaialbeOptions.selectByIndex(1);

	}

	public void SeclectQuantity(String value) {
		WebDriverUtility.clickOnElement(selectQuantityCanon);
	}

	public void addToCartCanon() {
		WebDriverUtility.clickOnElement(addToCartC);
	}

	public boolean successfullyMessageCanon() {
		boolean CanonAddedMessage = CanonAddMessage.isDisplayed();
		return CanonAddedMessage;
	}

	public void clickOnCanonEOS() {
		WebDriverUtility.clickOnElement(CanonEOS);
	}

	public void clickOnCanonReview() {
		WebDriverUtility.clickOnElement(CanonReview);
	}

	public void name(String myName) {
		WebDriverUtility.enterValue(name, myName);
	}

	public void Reviewfield(String review) {
		WebDriverUtility.enterValue(Review, review);
	}

	public void rating() {
		WebDriverUtility.clickOnElement(rating);

	}

	public void Continue() {
		WebDriverUtility.clickOnElement(Continue);
	}

	public void Reviewmessage() {
		WebDriverUtility.isElementDisplayed(Reviewmessage);
	}

	public void cickOnLoptopAndNotebook() {
		WebDriverUtility.clickOnElement(LoptopAndNoteBook);
	}

	public void clickOnAllShowloptopAndMacbook() {
		WebDriverUtility.clickOnElement(ShowAllLoptop);
	}

	public void clickOnmacBookItem() {
		WebDriverUtility.clickOnElement(macBookItem);
	}

	public void clickAddtoCartBTN() {
		WebDriverUtility.clickOnElement(addtoCartBTN);
	}

	public void showSuccessMessage() {
		WebDriverUtility.isElementDisplayed(successMessage);
	}

	public void showCartAmountMessage(int quantity2, int item2, int amount2) {
		WebDriverUtility.isElementDisplayed(quantity);
		WebDriverUtility.isElementDisplayed(item);
		WebDriverUtility.isElementDisplayed(amount);
	}

	public void clickCartOption() {
		WebDriverUtility.clickOnElement(cartOption);
	}

	public void clickXButton() {
		WebDriverUtility.clickOnElement(xButton);
	}

	public void showemptyCart(int zero) {
		WebDriverUtility.clickOnElement(emptyCart);
	}

	public void clickOnComparisonMacBook() {
		WebDriverUtility.clickOnElement(comprisonMacBook);
	}

//	public void clickOnComparisonMacAir() {
//		WebDriverUtility.clickOnElement(comprisonMacAir);
//	}

	public void displayedMD() {
		WebDriverUtility.isElementDisplayed(MBsuccessMessage);
	}

	public void clickonProductComparison() {
		WebDriverUtility.clickOnElement(productComparison);
	}

	public void showProductChart() {
		WebDriverUtility.isElementDisplayed(comparisonChart);
	}
	
	@FindBy(xpath ="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath ="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement login;
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath ="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement loginBTN;
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement loginDashboard;
	
	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement regAffAccounLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement paymentMethod;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutUs;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueBTN;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessagein;
	
	
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffilInfo;
	
@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
	private WebElement bankTransfBTN;

@FindBy(xpath = "//input[@id='input-bank-name']")
private WebElement bankName;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;
	
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	
@FindBy(xpath = "//input[@id='input-bank-account-name']")
private WebElement accountName;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement ContinueAffilBTN;
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement editAffilMessage;



	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}
	
	public void enterUnserName(String username) {
		WebDriverUtility.clickOnElement(email);
	}
	
	public void enterPassord(String Password) {
		WebDriverUtility.clickOnElement(password);
	}
	
	public void clickOnLoginBT() {
		WebDriverUtility.clickOnElement(loginBTN);
	}
	
	public void accountDashboard() {
		WebDriverUtility.isElementDisplayed(loginDashboard);
	}
	
	
	public void clickOnAffiAccount() {
		WebDriverUtility.clickOnElement(regAffAccounLink);
	}
	public void enterCompany(String compaany) {
		WebDriverUtility.enterValue(company, compaany);
	}
	public void enterWebsite(String websit) {
		WebDriverUtility.enterValue(website, websit);
	}
	
	public void enterTaxId(String taxid) {
		WebDriverUtility.enterValue(taxID, taxid);
	}
	
	public void enterPaymentMethod(String name) {
		WebDriverUtility.enterValue(paymentMethod, name);
	}
	public void clickOnAboutUs() {
		WebDriverUtility.clickOnElement(aboutUs);
	}
	public void clickOnContinueBTN() {
		WebDriverUtility.clickOnElement(continueBTN);
	}
	public void successMessageDisply() {
		WebDriverUtility.isElementDisplayed(successMessagein);
	}
	
	
	
	public void clickOnEditAffInfo() {
		WebDriverUtility.clickOnElement(editAffilInfo);
	}
	public void clickOneBankTransfer() {
		WebDriverUtility.clickOnElement(bankTransfBTN);
}
	public void enterBankName(String Bname) {
		WebDriverUtility.enterValue(bankName, Bname);
	}
	public void enterABA(String aba) {
	WebDriverUtility.enterValue(abaNumber, aba);
}
	public void enterSwiftCode(String swift) {
		WebDriverUtility.enterValue(swiftCode, swift); 
	}
	public void accountName(String accName) {
	WebDriverUtility.enterValue(accountName, accName);
}
	public void enterAccountNumber(String accNum) {
		WebDriverUtility.enterValue(accountNumber, accNum);
	}
	public void clickAffContinue() {
		WebDriverUtility.clickOnElement(ContinueAffilBTN);
	}
	
	
	public void AffSuccerssMessage() {
		WebDriverUtility.isElementDisplayed(editAffilMessage);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAccountInfo;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement accFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement accLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement accEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement accTelephoneNo;
	@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement accContinueBT;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]")
	private WebElement accMessageSuccess;
	
	public void clickOnEditAccInfo() {
		WebDriverUtility.clickOnElement(editAccountInfo);
	}

	public void validateFname(String string) {
		WebDriverUtility.isElementDisplayed(accFirstName);
	}

	public void validateLastName(String lastname) {
		WebDriverUtility.isElementDisplayed(accLastName);
	}

	public void validateEmail(String email) {
		WebDriverUtility.isElementDisplayed(accEmail);
	}

	public void validatePhonNo(String email) {
		WebDriverUtility.isElementDisplayed(accTelephoneNo);
	}

	public void clickAccContinueBTN() {
		WebDriverUtility.isElementDisplayed(accContinueBT);
	}

	public void accSuccessMessageDisply() {
		WebDriverUtility.isElementDisplayed(accMessageSuccess);
		

		
	}
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2] ")
	private WebElement HeartIcon;
	
	@FindBy(xpath=" //body/div[@id='product-category']/div[1]")
	private WebElement loginMessage;
	
	@FindBy(xpath= "//a[contains(text(),'MacBook Pro')]")
	private WebElement clickMacBookPro;
	
	@FindBy(xpath="//h2[contains(text(),'$2,000.00')] ")
	private WebElement MacBookProPrice;
	
	public void clickOnHeartIcon() {
		WebDriverUtility.clickOnElement(HeartIcon);
	}
	public void DisplayedCreateAccount() {
		WebDriverUtility.isElementDisplayed(loginMessage);
	}
	
	public void clickonMackBookPro() {
		WebDriverUtility.clickOnElement(clickMacBookPro);
	}
	public void DisplayedPriceTag() {
	 WebDriverUtility.isElementDisplayed(MacBookProPrice);
		
		}

}
	
	
	
	
	
	
	
	

