package com.rb.ofbiz.test.steps;

import org.jbehave.core.annotations.When;

import com.rb.ofbiz.test.pages.Home;


import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.UIRepository;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

public class CustomerSteps {

	private Home home;
	private String hostname;
	private String port;
	private String tingUrl;
	private String username;
	private String password;

	public CustomerSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	 @When("I search for the Customer to Edit Information")
	    public void whenISearchForTheCustomerToEditInformation() {
	        home.deleteCookie();
			home.go("https://" + tingUrl
					+ "/customers/users/index.cfm?action=editUser&id=68169");
	        home.waitForPage("100000");
	        home.waitForElementToBeVisible("j_username", "30000");
	        home.enterText("j_username", username);
	        home.enterText("j_password", password);
	        home.clickUpdateButton("Login");
	    }
	 
	@Given("that I logged into alfred site as Customer Service Manager")
	public void givenThatILoggedIntoAlfredSiteAsCustomerServiceManager() {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "/AlfRED/control/main";
		home.go(url);
		home.waitForPage("20000");

		home.enterText("USERNAME", "ben");
		home.enterText("PASSWORD", "welcome2fun");
		home.clickButtonBasedOnValue("Login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		home.hasContents("Ben Upton");
	}

	@Given("that I logged into Ofbiz Catalog Manager Site as User")
	public void givenThatILoggedIntoOfbizCatalogManagerSiteAsUser() {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "/catalog/control/main";
		home.go(url);
		home.waitForPage("20000");

		home.enterText("USERNAME", "reset.password1@panthacorp.com.au");
		home.enterText("PASSWORD", "welcome2fun");
		home.clickButtonBasedOnValue("Login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("I select $text as Country")
	@Then("I select $text as Country")
	public void thenISelectTextAsCountry() {

		home.selectCountry();
	}

	@When("I select $text as State")
	@Then("I select $text as State")
	public void thenISelectTextAsState() {

		home.selectState();
	}

	@When("I click $text User")
	@Then("I click $text User")
	public void thenICLickTextUser() {
		home.clcikButtonCSS();
	}

	@Then("I click the Add User Button")
	public void thenIClickTheTextButton(String text) {
		home.clickAddNewUseButtonWithNoWait(text);
	}

	/*
	 * @Then("I click the Edit Customer Image") public void
	 * thenIClickTheLogoutImage() { home.clickEditImage();
	 * 
	 * }
	 */

	// Prachi

	@Then("I verify customer credit \"$field\" as \"$text\"")
	public void thenIverifyCredit(String field, String text) {

		String fieldText = UIRepository.OFBizHomePage.getValue(field);
		/*
		 * String credit1 =
		 * UIRepository.OFBizHomePage.getValue("Initial Value1");
		 */
		home.verifyCustomerAddCredit(fieldText, text);
	}

	// Prachi

	@When("I search for $text on \"$field\"")
	public void thenISearchFortext(String field, String text) {
		String fieldLocator = UIRepository.OFBizHomePage.getValue(field);
		home.typeText(fieldLocator, text);
	}

	@Then("I go to create a customer ")
	public void thenIGoToCreateCustomer(String text) {
		assertTrue(home.hasContents("Add Customer"));
	}

	@Then("I click the Edit Customer Image")
	public void thenIClickTheEditCustomerImage() {
		home.clickEditImage();

	}

	@When("I save customer")
	public void whenISaveCustomer() {
		home.ClickButtonIDforSearch("saveChangesToolbar");
	}

	@When("I update customer")
	public void whenIUCustomer() {
		home.clickUpdateButton();
	}

	@When("I navigate to earlier customer page in Alfred")
	public void whenINavigateToEarlierCustomerPageInAlfred() {
		home.redirectToEarlierCustomerPage(hostname, port);
	}

	@Then("I verify the Subscription as Fun Newsletter")
	@When("I verify the Subscription as Fun Newsletter")
	public void whenIVerifyTheSubscription() {

		home.verifyRadioChecked();
	}

	@When("I navigate to Customer View Page")
	public void whenINavigateCustomerViewPage() {
		home.navigateToCustomerViewPage(hostname, port);
	}

	@Given("I see $text")
	@When("I see $text")
	@Then("I see $text")
	public void thenISeetext(String text) {
		assertTrue(home.hasContents(text));
	}

	@When("I navigate to customer edit page in Alfred")
	public void whenINavigateToCustomerEditPageinAlfred() {
		home.navigateToCustomerEditPage();
	}

	@Then("I add the Select the News Letter Subsription - Fun Newsletter")
	public void thenISelectTheNewsLetterSubscription() {

		home.selectNewsletter();
	}

	
	
	@Then("I add the Select the Special Offers Newsletter")
	public void thenISelectTheSpecialOfferNewsletter() {

		home.selectNewsletter2();
	}
	
	
	@Then("I click edit the NewsLetter link")
	public void thenIClickEditTheNewsletterLing(){
		home.clickEditNewsLetter();
	}
	
	@When("I select the Newsletter - Fun Newsletter")
	public void whenISelectTheNewsLetter() {
		home.selectNewsletterInTing();
	}
	
	@When("I select Special Offers Newsletter in Ting")
	public void whenISelectTheNewsLetter2() {
		home.selectNewsletterInTing2();
	}

	@Then("I select \"$HTML\" as Mail format")
	public void thenISelectHTMLAsMailFormat(String text) {
		home.checkRadio(text);
	}

	@Then("I select \"$Male\" as Gender")
	public void thenISelectMaleAsGender(String text) {
		home.checkRadio(text);
	}

	@Then("I add \"$22Dec1980\" as Birthday")
	public void thenIAdd22Dec1980AsBirthday(String text) {
		home.enterText("birthday", text);
	}

	@Then("I select \"$text\" as Referrer in Alfred")
	@When("I select \"$text\" as Referrer in Alfred")
	public void whenISelectTextAsReferrerInAlfred(String text) {
		home.selectReferrer(text);
	}

	@Then("I select \"$Australia\" as Country")
	public void thenISelectAustraliaAsCountry(String text) {
		home.selectdropdown("countryGeoId", text);
	}

	@Then("I get Customer ID in RB")
	public void thenIGetCustomerIDRB() {
		home.getCustomerIDRB();
	}

	@Then("I get Customer ID")
	public void thenIGetCustomerID() {
		home.getCustomerID();
	}

	@Then("I add \"$jimtest014peterbbjimcom\" as customer \"$email\"")
	public void thenIAddjimtest014peterbbjimcomAsCustomeremail(String text,
			String field) {
		home.enterText1(field, text);
	}

	@Then("I get the CustomerID")
	public void thenIGetTheCustomerID() {
		home.seleniumsleep();
		home.getCustomerID();
	}

	@When("I click on OK")
	@Then("I click on OK")
	public void thenIClickOnOK() {

		home.clickOK();

	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
