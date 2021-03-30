package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CapstonePageObjects;
import utilities.WebDriverUtility;

public class CapStoneStepDefiniations extends Base{

	CapstonePageObjects obj1 = new CapstonePageObjects();

	@When("^User click on the desktop$")
	public void user_click_on_the_desktop() throws Throwable {
		obj1.clickOnDeskTop();
		logger.info("User clicked on DeskTop"); 
		WebDriverUtility.screenShot();

	}

	@When("^User click on all desktop$")
	public void user_click_on_all_desktop() throws Throwable {
		obj1.clickOneShowAllD();
		logger.info("User cllicked on all show DeskTop");
		WebDriverUtility.screenShot();

	}

	@Then("^User should all items are present in Desktop page$")
	public void user_should_all_items_are_present_in_Desktop_page() throws Throwable {
		obj1.showAllDesktopItems();
		logger.info("User is able to see all items on the desktop");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		obj1.clickOnDeskTop();
		logger.info("User clicked on deskTop option");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		obj1.clickOneShowAllD();
		logger.info("User clicked on Show All Desktop Option");
		WebDriverUtility.screenShot();

	}

	@When("^User click ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		obj1.HpAddCartClick();
		logger.info("User added HP to the Cart");
		WebDriverUtility.screenShot();

	}

	@When("^User select quantity '(\\d+)'$")
	public void user_select_quantity(String value) throws Throwable {
		obj1.slectQuantity(value);
		logger.info("User selected quantity");
		WebDriverUtility.screenShot();

	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		obj1.AddToCart();
		logger.info("User clicked on the add to cart button");
		WebDriverUtility.screenShot();

	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(String value)
			throws Throwable {
		obj1.successfullyMessage(value);
		logger.info("user was able to see a message Successfully added");
		WebDriverUtility.screenShot();

	}

	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		obj1.addConnonToCart();
		logger.info("Canon has been added");
		WebDriverUtility.screenShot();

	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		obj1.selectColor();
		logger.info("color was selected");
		WebDriverUtility.screenShot();

	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(String value)
			throws Throwable {
		obj1.successfullyMessageCanon();
		logger.info("Message was successful");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		obj1.clickOnCanonEOS();
		logger.info("user click one  Canon EO");
		WebDriverUtility.screenShot();

	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		obj1.clickOnCanonReview();
		logger.info("user click on Canon EO review");
		WebDriverUtility.screenShot();

	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable reviewInfo) throws Throwable {
		List<Map<String, String>> ReviewInfor = reviewInfo.asMaps(String.class, String.class);
		obj1.name(ReviewInfor.get(0).get("yourname"));
		obj1.Reviewfield(ReviewInfor.get(0).get("yourReview"));
		obj1.rating();
		logger.info("user wrote a review");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		obj1.Continue();
		logger.info("user clicked on contiue button");
		WebDriverUtility.screenShot();

	}

	@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		obj1.Reviewmessage();
		logger.info("User saw the message");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		obj1.cickOnLoptopAndNotebook();
		logger.info("User clicked on Laptopand NoteBooks");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		obj1.clickOnAllShowloptopAndMacbook();
		logger.info("User clicked on Show all Laptop and Notebooks");
		WebDriverUtility.screenShot();

	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		obj1.clickOnmacBookItem();
		logger.info("User clicked on Macbook item");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		obj1.showSuccessMessage();
		logger.info("User saw success message");
		WebDriverUtility.screenShot();

	}

	@Then("^User should see ‘(\\d+) item\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_item_s_showed_to_the_cart(int quantity, int item, int amount) throws Throwable {
		obj1.showCartAmountMessage(quantity, item, amount);
		logger.info("User saw the ammount");
		WebDriverUtility.screenShot();

	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		obj1.clickCartOption();
		logger.info("User clicked on cart option");
		WebDriverUtility.screenShot();

	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		obj1.clickXButton();
		logger.info("User clicked on red x button");
		WebDriverUtility.screenShot();

	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
		obj1.showemptyCart(arg1);
		logger.info("item was removed from cart and zero was shown");
		WebDriverUtility.screenShot();

	}

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
		obj1.clickOnComparisonMacBook();
		logger.info("User clicked on MacBookComparion option");
		WebDriverUtility.screenShot();

	}

//	@When("^User click on product comparison icon on ‘MacBook Air’$")
//	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
//	    obj1.clickOnComparisonMacAir();
//	    logger.info("User clicked on MacBook Air");
//	    WebDriverUtility.screenShot();
//	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()
			throws Throwable {
		obj1.displayedMD();
		logger.info("User saw the success message");
		WebDriverUtility.screenShot();
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		obj1.clickonProductComparison();
		logger.info("User clicked on Product Comparison link");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		obj1.showProductChart();
		logger.info("User saw the product chart");
		WebDriverUtility.screenShot();
	}

	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		obj1.clickOnMyAccount();
		Thread.sleep(3000);

	}

	@When("^User clicks on Login$")
	public void user_clicks_on_Login() throws Throwable {
		obj1.clickOnLogin();

	}

	@When("^User enter username ‘userName’ and password 'password’ And User click on Login button'$")
	public void user_enter_username_userName_and_password_password_And_User_click_on_Login_button(String Username,
			String password) throws Throwable {
		obj1.enterUnserName(Username);
		obj1.enterPassord(password);
	}

	@When("^User click on Login button'$")
	public void user_click_on_Login_button() throws Throwable {
		obj1.clickOnLoginBT();

	}

	@When("^User should be logged in to MyAccounts dashboard$")
	public void user_should_be_logged_in_to_MyAccounts_dashboard() throws Throwable {
		obj1.accountDashboard();
		Thread.sleep(3000);

	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		obj1.clickOnAffiAccount();

	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable affiliate) throws Throwable {
		List<Map<String, String>> affiliateIfno = affiliate.asMaps(String.class, String.class);
		obj1.enterCompany(affiliateIfno.get(0).get("comepany"));
		obj1.enterWebsite(affiliateIfno.get(0).get("website"));
		obj1.enterTaxId(affiliateIfno.get(0).get("taxID"));
		obj1.enterPaymentMethod(affiliateIfno.get(0).get("paymentMethod"));

		Thread.sleep(3000);

	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		obj1.clickOnAboutUs();
		Thread.sleep(3000);

	}

	@When("^User click Continue button$")
	public void user_click_Continue_button() throws Throwable {
		obj1.clickOnContinueBTN();
		Thread.sleep(3000);
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		obj1.successMessageDisply();
		Thread.sleep(3000);
	}

	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		obj1.clickOnEditAffInfo();
		Thread.sleep(2000);
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		obj1.clickOneBankTransfer();
		Thread.sleep(2000);
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable affEdit) throws Throwable {
		List<Map<String, String>> affiliateEdit = affEdit.asMaps(String.class, String.class);
		obj1.enterBankName(affiliateEdit.get(0).get("bankName"));
		Thread.sleep(2000);
		obj1.enterABA(affiliateEdit.get(0).get("abaNumber"));
		obj1.enterSwiftCode(affiliateEdit.get(0).get("swiftCode"));
		Thread.sleep(2000);
		obj1.accountName(affiliateEdit.get(0).get("accountName"));
		Thread.sleep(2000);
		obj1.enterAccountNumber(affiliateEdit.get(0).get("accountNumber"));

		Thread.sleep(2000);
	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		obj1.clickAffContinue();
		Thread.sleep(2000);
	}

	@Then("^User should see a success's message$")
	public void user_should_see_a_success_s_message() throws Throwable {
		obj1.AffSuccerssMessage();
		Thread.sleep(2000);
	}
	
	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		obj1.clickOnEditAccInfo();
		logger.info("User clicked on the 'edit your account information link'");
		WebDriverUtility.screenShot();

	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable AccInfo) throws Throwable {
		List<Map<String, String>> accEdit = AccInfo.asMaps(String.class, String.class);
		obj1.validateFname(accEdit.get(0).get("firstname"));
		obj1.validateLastName(accEdit.get(0).get("lastName"));
		obj1.validateEmail(accEdit.get(0).get("email"));
		obj1.validatePhonNo(accEdit.get(0).get("telephone"));
		Thread.sleep(2000);
		logger.info("user entered modified the information");
		WebDriverUtility.screenShot();
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		obj1.clickAccContinueBTN();
		Thread.sleep(2000);
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button");

	}

	@Then("^User should see a message ‘Success: 'Your account has been successfully updated'$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		obj1.accSuccessMessageDisply();
		logger.info("User is able to see the message");
		WebDriverUtility.screenShot();
	}
	
	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
	    obj1.clickOnHeartIcon();
	    logger.info("user clicked on Sony VaIO laptop");
	  WebDriverUtility.screenShot();
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
	    obj1.DisplayedCreateAccount();
	    logger.info("user saw the message to login or create an account");
	    WebDriverUtility.screenShot(); 
	}
	
	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
	    obj1.clickonMackBookPro();
	    logger.info("user clicked on MacBookPro");
	    WebDriverUtility.screenShot();
	}

	@Then("^User should see  ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
	   obj1.DisplayedPriceTag();
	   logger.info("user saw the price tag");
	    WebDriverUtility.screenShot();
	}


	
	
}
