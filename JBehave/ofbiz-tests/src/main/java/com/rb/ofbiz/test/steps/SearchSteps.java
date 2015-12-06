package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

public class SearchSteps {
	private Home home;
	private String hostname;
	private String port;
	private String ofbizusername;
	private String ofbizpassword;

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setOfbizusername(String ofbizusername) {
		this.ofbizusername = ofbizusername;
	}

	public void setOfbizpassword(String ofbizpassword) {
		this.ofbizpassword = ofbizpassword;
	}

	public SearchSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	@Given("that I logged into ofbiz site")
	public void givenThatILoggedIntoOfbizSite() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/control/main";
        home.go(url);
        home.waitForPage("20000");

        home.enterText("USERNAME", ofbizusername);
        home.enterText("PASSWORD", ofbizpassword);
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	@Given("that I logged into ofbiz site to view Customer Details")
	public void givenThatILoggedIntoOfbizSiteforCustomerDetails() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/control/customerView?partyId=CUS_68169#";
        home.go(url);
        home.waitForPage("20000");

        home.enterText("USERNAME", ofbizusername);
        home.enterText("PASSWORD", ofbizpassword);
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	@Given("I logged in to ofbiz as a catalog manager")
	public void givenILoggedInToOfbizAsACatalogManager() {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "catalog/control/main";
		home.go(url);
		home.waitForPage("100000");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		home.enterText("USERNAME", ofbizusername);
		home.enterText("PASSWORD", ofbizpassword);
		home.clickUpdateButton("Login");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("I see $Products Search")
	public void whenISeeProductsSearch(String text) {
		assertTrue(home.hasContents(text));
	}

	@When("I click \"$ProductAdd\" link under Product")
	public void whenIClickProductAddLinkUnderProduct(String category) {
		home.clickcategory(category);
	}

	// @When("I click \"$SupplierSearch\" link under Supplier")
	// public void whenIClickSupplierSearchLinkUnderSupplier(String category) {
	// home.clickcategory(category);
	// }

	@Then("I look for the value \"$value\" as \"$field\"")
	public void thenILookForTheValueValueAsField(String text, String field) {
		home.waitForPage("300000");
		home.verifyTextboxValues(field, text);
	}

	@Then("I enter the <searchterm> in the search text box")
	public void thenIEnterThesearchtermInTheSearchTextBox(
			@Named("searchterm") String text) {
		home.typesearchkeyword("searchString", text);
	}

	@Then("I enter the <productcode> in the search text box")
	public void thenIEnterTheproductcodeInTheSearchTextBox(
			@Named("productcode") String text) {
		home.typesearchkeyword("searchString", text);
	}

	@Then("I should see \"$APR542\" as Product code")
	public void thenIShouldSeeAPR542AsProductCode(String text) {
		// home.WaitForPage("5000");
		home.presentContentsWithoutWait(text);
	}

	@Then("I should see \"$DDS3EG\" Product code")
	public void thenIShouldSeeDDS3EGProductCode(String text) {
		home.presentContents(text);
	}

	@Then("I verify the number of search results")
	public void thenIVerifyTheNumberOfSearchResults() {
		home.getallproductsfromsearch();
	}

	@Then("I click on search")
	public void thenIClickOnSearch() {
		home.ClickButtonIDforSearch("searchButtonImage");
		home.waitForPage("50000");

	}

	@Then("I click on edit")
	public void thenIClickOnEdit() {
		home.ClickButtonIDforEdit();
	

	}
	
	@Then("I get the product ID")
	public void thenIGetTheProductID() {
		home.seleniumsleep();
		home.getProductID();
		home.getprices("Selling Price");
		home.getprices("Buying Price");
	}

	@Then("I enter the product ID")
	public void thenIEnterTheProductID() {
		home.typeProductID();
	}

	@Then("I should see \"$text\"")
	public void thenIShouldSeeShowingAll10Products(String text) {
		home.presentContents(text);
	}

    @Then("I should see \"$text\" results")
    public void thenIShouldSeetextResults(String text) {
        home.gettotalsearchresults(text);
    }

	@Then("I select \"$published\" option")
	public void thenISelectpublishedOption(String text) {
		home.ClickButtonID(text);
	}

	@Then("I should see <productname>")
	public void thenIShouldSeeproductname(@Named("productname") String text) {
		home.getproductname(text);
	}

	@Then("I should see <suppliername>")
	public void thenIShouldSeesuppliername(@Named("suppliername") String text) {
		home.getsuppliername(text);
	}

	@Then("I should see <productcode>")
	public void thenIShouldSeeproductcode(@Named("productcode") String text) {
		home.getproductcode(text);
	}

	@Then("I do not enter the <searchterm> in the search text box")
	public void thenIDoNotEnterThesearchtermInTheSearchTextBox(
			@Named("searchterm") String text) {
		home.enterText("searchString", text);
	}

	// @Then("I enter <commissionsellingprice>")
	// public void
	// thenIEntercommissionsellingprice(@Named("commissionsellingprice") String
	// text) {
	// home.enterTextLabelswithbrspan("Commmisssionable Selling Price", text);
	// }

	@Then("I should not see \"$text\"")
	public void thenIShouldNotSeefoundResults() {

	}

    @Then("I get the SupplierID")
    public void thenIGetTheSupplierID() {
        home.seleniumsleep();
        home.getSupplierID();
    }

	// And I open "Notes" section
	// And I should see "test product notes" text
	@Then("I should see \"$message\" text")
	public void thenIShouldSeeMessageText(String text) {
		home.presentContentsWithoutWait(text);

	}

	@Then("I should see <numberofresults> text")
	public void thenIShouldSeenumberofresultsText(
			@Named("numberofresults") String text) {
		home.presentContentsWithoutWait(text);
	}

	// Verifying Product field values

	@Then("I check the value of \"$field\" as \"$value\"")
	public void thenICheckTheValueOfFieldAsValue(String field, String text) {
		home.verifyTextboxValues(field, text);
	}

	@Then("I check value of \"$field\" as \"$value\"")
	public void thenICheckTheValueOfFieldAsValueWithBr(String field, String text) {
		home.verifyTextboxValueswithbr(field, text);
	}

	@Then("I check the value of \"$field\" as  the \"$value\"")
	public void thenICheckTheValueOfFieldAsValueById(String field, String text) {
		home.verifyTextboxValuesByID(field, text);
	}

	@Then("I check the value of the \"$field\" as \"$value\"")
	public void thenICheckTheValueOfTheFieldAsValue(String field, String text) {
		home.verifynameinedit(field, text);
	}

	@Then("I check the value \"$field\" as \"$value\"")
	public void thenICheckTheValueFieldAsValue(String field, String text) {
		home.verifyTextboxValueswithbr(field, text);
	}

	@Then("I need to see value of \"$Name\" as \"$value\"")
	public void thenIVerifyTheValueOfNameAsValue(String field, String text) {
		home.waitForPage("200000");
		home.verifyTextboxValues(field, text);
	}

	@Then("I verify the value \"$value\" as \"$field\"")
	public void thenIVerifyTheValueOfValueAsField(String text, String field) {
		home.verifyTextInFirstColn(field, text);
	}

	@Then("I confirm \"$tagname\" value as \"$tagvalue\"")
	public void thenIConfirmTagnameValueAsTagvalue(String field, String text) {
		home.getoccasiontags(field, text);
	}

	// Search Supplier

	@Then("I select <activestatus>")
	public void thenISelectactivestatus(@Named("activestatus") String text) {
		home.selectdropdown("activeState", text);
	}

	@Then("I select <publishstatus>")
	public void thenISelectpublishstatus(@Named("publishstatus") String text) {
		home.selectdropdown("publishState", text);

	}

	@Then("I select <countrystatus>")
	public void thenISelectcountrystatus(@Named("countrystatus") String text) {
		home.selectdropdown("country", text);

	}

	@Then("I enter the <suppliername> in the search text box")
	public void thenIEnterThesuppliernameInTheSearchTextBox(
			@Named("suppliername") String text) {
		home.typesearchkeyword("searchString", text);
	}

	@Then("I click <suppliername> link")
	public void thenIClicksuppliernameLink(@Named("suppliername") String text) {
		home.clickLinkTextWithWait(text);
	}
	@Then("I add \"$text\" as customer \"$field\"")
	@When("I add \"$text\" as customer \"$field\"")
	public void thenIAddAsCustomer(String text,String field) {
	 home.enterText1(field, text);
	}
	@Then("I add \"$text\" as \"$email\"")
	@When("I add \"$text\" as \"$email\"")
	    public void whenIAddTextAsEmail(String text, String field){
	      home.enterText1(field, text);
	    }
}
