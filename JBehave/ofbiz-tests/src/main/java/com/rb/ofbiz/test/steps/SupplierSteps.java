package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.UIRepository;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA. User: x Date: 19/04/12 Time: 11:31 AM To change
 * this template use File | Settings | File Templates.
 */
public class SupplierSteps {

	private static final String WAIT_FOR_PAGE = "30000";
	private Home home;

	public SupplierSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	@Given("a customer exists with email address \"$email\"")
	public void aCustomerExistsWithEmailAddress(String email) {
		home.checkEmailExistsInContactMech(email);
	}

	@Given("I'm on supplier \"$text\" page in Alfred")
	public void givenImOnSupplierPageInAlfred(String supplierSearchInput) {
		String categoryLink = UIRepository.OFBizHomePage
				.getValue("SupplierSearch");
		home.clickcategoryNoUiRepositoryCall(categoryLink);
		assertTrue(home.hasContents("Supplier Search"));
		home.enterText("searchString", supplierSearchInput);
		home.ClickButtonID("searchButtonImage");
		home.waitForPage(WAIT_FOR_PAGE);
		home.goToSupplierPageFromSearchResults(supplierSearchInput);
		home.waitForPage(WAIT_FOR_PAGE);
		assertTrue(home.hasContents(supplierSearchInput));
	}

	@When("I clicks \"Add contact\"")
	public void whenIClicksAddContact() {
		home.clicklink("Add Contact");
		home.waitForTime(1);
		assertTrue(home.hasContents("Step 1"));
		assertTrue(home.hasContents("Email"));
	}

	
	
	
	@When("I add customer email address \"$text\"")
	public void whenITypeInCustomerEmailAddress(String text) {
		String inputId = UIRepository.Alfred.getValue("customer email");
		home.enterTextByInputId(inputId, text);
	}

	@When("I search the contact")
	public void whenISearchTheContact() {
		String idElement = UIRepository.Alfred.getValue("addContactEmailNext");
		home.clickElementBasedOnId(idElement);
		home.waitForTime(1);
		assertTrue(home.hasContents("Step 2"));
		assertTrue(home.hasContents("is already a customer!"));
	}

	@When("I go to the contact next step")
	public void whenIGoToTheContactNextStep() {
		String idElement = UIRepository.Alfred.getValue("addContactEmailNext");
		home.clickElementBasedOnId(idElement);
		home.waitForTime(1);
	}

	@When("I save the new contact")
	public void whenISaveToAddContact() {
		String elementId = UIRepository.Alfred.getValue("addContactSave");
		home.clickBasedOnCssId(elementId);
		home.waitForPage("30000");
	}

	@Then("I get the SupplierName")
	public void thenIGetTheSupplierName() {
		home.seleniumsleep();
		home.getSupplierName();
	}

	@Then("I get the PartyID")
	public void thenIGetThePartyID() {
		home.seleniumsleep();
		home.getPartyID();
	}

	@Then("I look for supplier error message \"$string\"")
	public void thenILookForSupplierErrorMessageString(String text) {
		home.getsuppliererrormessage();
	}

	@Then("I verify the value of Email \"$value\" as \"$field\"")
	public void thenIVerifyTheValueOfEMailValueAsField(String text, String field) {
		home.verifyTextInFirstColnForEmail(field, text);
	}

	@When("I save the customer as new contact")
	public void whenISaveTheCustomerAsNewContact() {
		String elementId = UIRepository.Alfred.getValue("addContactEmailSave");
		home.clickBasedOnCssId(elementId);
		home.waitForPage("30000");
	}

	@When("I save the existing contact")
	public void whenISaveTheExistingContact() {
		String elementId = UIRepository.Alfred.getValue("editContactSave");
		home.clickBasedOnCssId(elementId);
		home.waitForPage("30000");
	}

	@Then("I can see \"$text\" in contact list of supplier page")
	@Given("I can see \"$text\" in contact list of supplier page")
	public void thenIVerifyTheValueOfValueAsField(String text) {
		String elementId = UIRepository.Alfred
				.getValue("contactSuppliersBlock");
		home.verifyTextInDivClass(elementId, text);
		home.waitForTime(1);
	}

	@Then("I get \"Add contact\" screen with email  \"$text\" pre-filled")
	public void thenIGetAddContactScreenWithEmailPrefilled(String text) {
		home.waitForTime(1);
		String elementId = UIRepository.Alfred
				.getValue("newCustomerContactEmailElementId");
		home.verifySpanValueById(elementId, text);
	}

	@When("I remove the \"$text\" from contact list of supplier page")
	public void whenIRemoveTheEdwardSmithFromContactListOfSupplierPage(
			String text) {
		home.clickSpanElementInDivContainsStrongWith("Remove", text);
		home.waitForTime(1);
		String idElement = UIRepository.Alfred.getValue("deleteContactSave");
		home.clickElementBasedOnId(idElement);
		home.waitForTime(1);
	}

	@Then("I cannot see \"$text\" in contact list anymore")
	public void thenICannotSeeEdwardSmithInContactListAnymore(String text) {
		/*
		 * String elementId =
		 * UIRepository.Alfred.getValue("contactSuppliersBlock");
		 */
		// String Xpath = UIRepository.Alfred.getValue("contactSuppliersXpath");
		/* home.verifyNoTextInDivClass(elementId, text); */
		/* home.verifySupplierNameDeleted(); */

	}

	@When("I edit \"$text\" in contact list of supplier page")
	public void whenIEditMikePaulInContactListOfSupplierPage(String text) {
		home.clickSpanElementInDivContainsStrongWith("Edit", text);
	}

	@Then("can see contact \"$name\" changed with job tittle \"$jobTitle\"")
	public void thenCanSeeContactChangedWithNewJobTitleAndContactForInformationAsBooking(
			String strongContent, String spanContent) {
		// home.verifyStrongBrSpan(strongContent, spanContent);
		home.hasContents("CEO");

	}

	@Then("I should see supplier marked as active")
	public void thenIShouldSeeSupplierMarkedAsActive() {
		home.verifyImage("SupplierActive", "YesImage");
	}

	@Then("I should be able to see supplier \"$text\"")
	public void thenIShouldBeAbleToSeeSupplier(String text) {
		assertTrue(home.hasContents(text));
	}

	@When("I search for supplier \"$text\"")
	public void whenISearchFor(String text) {
		String categoryLink = UIRepository.OFBizHomePage
				.getValue("SupplierSearch");
		home.clickcategoryNoUiRepositoryCall(categoryLink);
		home.enterText("searchString", text);
		home.ClickButtonIDforSearch("searchButtonImage");
		home.waitForPage(WAIT_FOR_PAGE);
	}

	@When("I go to supplier \"$text\" details page")
	public void whenIGoOnTheDetailsOfTheSupplier(String text) {
		home.goToSupplierPageFromSearchResults(text);
		home.waitForPage("5000");
		assertTrue(home.hasContents(text));
	}

    @Then("I select \"$text\" as supplier")
    public void thenISelectTextAsSupplier(String text) {
        home.selectdropdown("supplierID", text);
    }

}