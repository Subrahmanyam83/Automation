package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.UIRepository;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by IntelliJ IDEA. User: vincentbrou Date: 9/07/12 Time: 2:10 PM To
 * change this template use File | Settings | File Templates.
 */
public class TingSteps {

	private Home home;
	private String tingUrl;
	private String username;
	private String password;
	private String hostname;
	private String port;

	public void setPort(String port) {
		this.port = port;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public void setTingUrl(String tingUrl) {
		this.tingUrl = tingUrl;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TingSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	@Given("that I logged into Ting site")
	@Then("I logged into Ting site")
	@When("I logged into Ting site")
	public void givenThatILoggedIntoTingSite() {
		home.deleteCookie();
		home.go("https://" + tingUrl + "/");
		home.waitForPage("100000");
		home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");

	}

	
	
	
	@When("I search for the Product")
	public void whenISearchForTheProduct() {

		home.deleteCookie();
		home.go("https://" + tingUrl + "/products/product/index.cfm?id=6707");
		home.waitForPage("100000");
		home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");
	}

	@When("I search for the Supplier")
	public void whenISearchForTheSupplier() {

		home.deleteCookie();
		home.go("https://" + tingUrl
				+ "/products/supplier/index.cfm?action=viewSupplier&id=1361");
		home.waitForPage("100000");
		home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");
	}

	@When("I search for the Supplier to Edit Information")
	public void whenISearchForTheSupplierToEditInformation() {

		home.deleteCookie();
		home.go("https://" + tingUrl
				+ "/products/supplier/index.cfm?action=viewSupplier&id=1361");
		home.waitForPage("100000");
		home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");
	}

	@When("I search for the Product to Edit Information")
	public void whenISearchForTheProductToEditInformation() {
		home.deleteCookie();
		// home.go("https://" + tingUrl
		// + "/customers/users/index.cfm?action=editUser&id=68169");
		home.gotoproductdetailspageinTing(tingUrl);
		home.waitForPage("100000");
		home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");

	}

	@When("I search for the Simon Customer to Edit Information")
	public void whenISearchForSimonCustomerToEdit() {

		home.deleteCookie();
		home.go("https://" + tingUrl
				+ "/customers/users/index.cfm?action=editUser&id=381111");
		//home.waitForPage("100000");
		//home.waitForElementToBeVisible("j_username", "30000");
		home.enterText("j_username", username);
		home.enterText("j_password", password);
		home.clickUpdateButton("Login");
	}

	/*
	 * @When("I go to newly added product page") public void
	 * whenIGoToNewlyAddedProductPage() { home.getProductIDfromRB(tingUrl); }
	 */
/*	@Then("I verify customer credit \"$field\" as \"$text\"")
	public void thenIverifyCredit(String field, String text) {

		home.hasContents("$45.00");
		
		 * String fieldText = UIRepository.OFBizHomePage.getValue(field); //
		 * String credit1 =
		 * UIRepository.OFBizHomePage.getValue("Initial Value1");
		 * home.verifyCustomerAddCredit(fieldText, text);
		 
	}*/

	@Then("I verify customer credit $field as $text")
	public void thenIVerifyCreditValue(String text) {
		home.hasContents(text);
	}
	 @When("I navigate to the customer search page")
	 public void givenThatINavigateToSearchPage() {
	  home.deleteCookie();
	  home.go("https://" + tingUrl + "/customers/users/index.cfm");
	  home.waitForPage("100000");
	  home.waitForElementToBeVisible("j_username", "30000");
	  home.enterText("j_username", username);
	  home.enterText("j_password", password);
	  home.clickUpdateButton("Login");

	 }

	@When("I open the newly added product page in Ting")
	public void whenIOpenTheNewlyAddedProductPage() {
		// home.getProductIDfromTing(tingUrl);
		home.getProductIDfromRB(tingUrl);
	}

	@When("I go to newly added supplier page")
	public void whenIGoToNewlyAddedSupplierPage() {
		home.getSupplierIDfromRB(tingUrl);
	}

	@When("I go to newly added customer page")
	public void whenIGoToNewlyAddedPage() {
		home.getCustomerIDfromRB(tingUrl);
	}
	
	@Then("I log in with <NewPassword>")
	public void thenILogInWithNewPassword(@Named("NewPassword") String text) {
		home.deleteCookie();
		home.go("https://" + tingUrl + "/");
		home.waitForPage("100000");
		home.enterText("j_username", username);
		home.enterText("j_password", text);
		home.clickUpdateButton("Login");
	}
	/*
	 * Then("I verify the \"$Name\ as \"$value\"") public void
	 * thenIVerifyOrderId(String text){ home. }
	 */
}
