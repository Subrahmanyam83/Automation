package com.rb.ofbiz.test.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.UIRepository;
import com.rb.ofbiz.test.utilities.CommonUtils;

/**
 * Created by IntelliJ IDEA. User: x Date: 19/04/12 Time: 11:31 AM To change
 * this template use File | Settings | File Templates.
 */
public class AddProductSteps {

	private Home home;
	private String hostname;
	private String port;

	public void setPort(String port) {
		this.port = port;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public AddProductSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	@Then("I click \"$Text\" link")
	@When("I click \"$Text\" link")
	public void whenIClickTextLink(String text) {
		home.clickLinkTextWithWait(text);
	}

	@Then("I click on \"$Text\" link")
	public void thenIClickOnTextLink(String text) {
		home.clickLinkTextWithNoWait(text);
	}

	@Then("I click the \"$Text\" link")
	public void thenIClickTheTextLink(String text) {
		home.clicklink(text);
	}

	@Then("I click on the \"$Text\" link")
	public void thenIClickOnTheTextLink(String text) {
		home.clicklinktext(text);
	}

	@Then("I see $text")
	public void thenISeetext(String text) {
		assertTrue(home.hasContents(text));
	}

	@Then("I donot see $text")
	public void thenIDoNotSeetext(String text) {
		assertFalse(home.hasContents(text));
	}

	@Then("I hover edit credit link")
	public void andIHovereditcreditlink(String category) {
		home.hoverTheLink(category);
	}

	@Then("I see the note $text")
	public void thenISeeNotetext(String text) {
		assertTrue(home.hasContents(text));
	}

	/*
	 * @Then("I Verify the Note as \"$Text\"") public void
	 * thenIVerifyNote(String text) { assertTrue(home.hasContents(text)); }
	 */

	@Then("I enter \"$value\" as \"$Name\"")
	public void thenIEntervalueAsName(String text, String field) {
		home.enterTextLabels(field, text);
	}

	@Then("I type \"$value\" in \"$Name\"")
	public void thenITypevalueInName(String text, String field) {
		home.enterTextName(field, text);
	}

	@Then("I type \"$value\" in the Note")
	public void thenITypevalueIntheName(String text, String field) {
		home.enterTextByName(field, text);
	}

	@Then("I enter \"$value\" as the \"$Name\"")
	public void thenIEntervalueAsTheName(String text, String field) {
		home.enterTextbasedonspan(field, text);
	}

	@Then("I enter the \"$value\" as \"$Name\"")
	public void thenIEnterThevalueAsName(String text, String field) {
		home.enterTextLabelswithbr(field, text);
	}

	@Then("I enter <productname> as <productlabel>")
	public void thenIEnterproductnameAsproductlabel(
			@Named("productname") String text,
			@Named("productlabel") String field) {
		home.enterTextLabels(field, text);
	}

	@Then("I enter <suppliername> as <supplierlabel>")
	public void thenIEntersuppliernameAssupplierlabel(
			@Named("suppliername") String text,
			@Named("supplierlabel") String field) {
		home.enterTextLabels(field, text);
	}

	// @Then("I select <producttype> as <producttypelabel>")
	// public void
	// thenISelectproducttypeAsproducttypelabel(@Named("producttype") String
	// text, @Named("producttypelabel") String field) {
	// home.selectdropdownbasedonlabel(field,text);
	// }

	// @Then("I select <producttype> as \"$ProductType\"")
	// public void thenISelectproducttypeAsProductType(@Named("producttype")
	// String text, String field) {
	// home.selectdropdownbasedonlabel(field,text);
	// }

	@Then("I select the <producttype>")
	public void thenISelectTheproducttype(@Named("producttype") String text,
			String field) {
		home.selectdropdownbasedonlabel(field, text);
	}

	@Then("I click on newly added product")
	public void thenIClickOnNewlyAddedProduct() {
		home.clickproductnameinsearch();
	}

	@Then("I look for error message \"$text\"")
	public void thenILookForErrorMessageText(String text) {
		home.geterrormessage();
	}

	@Then("I look for supplier error message \"$text\"")
	public void thenILookForSupplierErrorMessageText(String text) {

		home.getSupplierErrorMessage();
	}

	@Then("I select \"$GiftCertificate\" as \"$ProductType\"")
	public void thenISelectGiftCertificateAsProductType(String text,
			String field) {
		home.selectdropdownbasedonlabel(field, text);
	}

	@Then("I select \"$text\" as the \"$field\"")
	public void thenISelectTextAsTheField(String text, String field) {
		home.selectdropdownbasedonID(field, text);
		// home.selectdropdownbasedonID("stateID", "QLD");
	}

	// @Then("I enter category tag")
	// public void thenIEnterCategoryTag() {
	// home.enterTextinAutocomplete();
	// }
	@Then("I click save button")
	public void thenIClickSaveButton() {
		home.ClickButtonID("addProductSaveImage");
	}

	@Then("I click on \"$text\"")
	public void thenIClickOntext(String text) {
		home.clickButtonCSS(text);
	}

	@Then("I click on country \"$text\"")
	public void thenIClickOnCountrytext(String text) {
		String inputId = UIRepository.Alfred.getValue(text);
		home.clickRadioButton(inputId);
	}

	@Then("I click on Yes Pop Up")
	public void thenIClickOnYesPopUp(String text) {
		home.ClickButtonID("deleteNote-confirm-Yes");
	}

	@Then("I click the save button")
	public void thenIClickTheSaveButton() {
		home.ClickButtonXpath("Save");

	}

	/*
	 * @Then("I click the edit button") public void thenIClickTheEditButton() {
	 * home.clickButtonCSS("css=a.editNote > span");
	 * 
	 * }
	 */

	@Then("I should see the Edit Date as Current Date")
	public void thenIshouldSeeTheCurrentDate() {
		home.verifyEditedDateValue();
	}

	@Then("I click Add Notes button")
	public void thenIClickAddNotesButton() {
		home.ClickButtonID("addNoteNew");
	}

	@Then("I click on \"$field\" button by class")
	public void thenIclickButtonBasedOnClass(String field) {
		home.clickButtonBasedOnClass(field);
	}

	@When("I click on \"$field\" button")
	@Then("I click on \"$field\" button")
	public void thenIClickOnButton(String field) {
		home.ClickButtonID(field);
	}

	@When("I press \"$field\" button")
	@Then("I press \"$field\" button")
	public void thenIClickOnOKButton(String field) {
		home.ClickButtonID2(field);
	}

	@Then("I must see \"$text\"")
	public void thenIMustSeetext(String text) {
		home.presentmandatorytext(text);
	}

	@Then("I enter null value as \"$Name\"")
	public void thenIEnterNullValueAsName(String field) {
		home.enternullvalue(field);
	}

	// @Then("I enter <productname> as \"$Name\"")
	// public void thenIEnterproductnameAsName(@Named("productname") String
	// text, String field) {
	// home.enterTextLabels(field, text);
	// }
	// //
	// @Then("I enter <supplier> as \"$Supplier\"")
	// public void thenIEntersupplierAsSupplier(@Named("supplier") String text,
	// String field) {
	// home.enterTextLabels(field, text);
	// }

	// //Extended product fields

	@Then("I select \"$14 days before Experience\" from \"$PaymenTerms\"")
	public void thenISelect14daysFromPaymentTerms() {
		home.selectItemFromDropDown();

	}

	@When("I select \"$GoldVoucher\" as \"$VoucherLevel\"")
	@Then("I select \"$GoldVoucher\" as \"$VoucherLevel\"")
	public void thenISelectGoldVoucherAsVoucherLevel(String text, String field) {
		home.selectdropdownbasedonlabel(field, text);
	}

	@Then("I select Hearing Accessibility")
	@When("I select Hearing Accessibility")
	public void thenISelectHearingAccess() {

		home.selectHearingAccessibility();

	}

	@Then("I type \"$Testdescription\" as \"$Description\"")
	public void thenITypeTestDescriptionAsDescription(String text, String field) {
		// home.enterTextareaswithbr(field, text);
		// home.enterText("description", text);
		home.typeRichText(field, text);
	}

	@Then("I type \"$value\" as the \"$field\"")
	public void thenITypeValueAsTheField(String text, String field) {
		// home.enterTextareaswithbr(field, text);
		home.enterText(field, text);
	}

	@Then("I type \"$value\" in the \"$field\"")
	@When("I type \"$value\" in the \"$field\"")
	public void whenITypeValueInTheField(String text, String field) {
		home.typeText(field, text);
	}

	@Then("I type the \"$value\" as \"$field\"")
	public void thenITypeTheValueAsField(String text, String field) {
		// home.entertextareabasedondivlabel(field, text);
		home.typeRichTextbasedondiv(field, text);
	}

	@Then("I click the Add Notes button")
	public void thenIClickTheAddNotesButton() {
		home.ClickButton("addNote");

	}

	// And I type "test product notes" as Internal Notes
	@Then("I type \"$value\" as Internal Notes")
	public void thenITypeValueAsInternalNotes(String text) {
		home.enterText("internalNotes", text);
	}

	@Then("I delete the \"$text\" \"$Value\" tag")
	public void thenIDeleteThe(String categoryPlainEnglish) {
		String tagText = UIRepository.OFBizHomePage
				.getValue(categoryPlainEnglish);
		home.click(tagText);
	}

	@Then("I click the \"$Venue\"")
	public void thenIClickTheVenue(String text) {
		home.clciklabel(text);
	}

	@Then("I click the \"$text\" button")
	public void thenIClickTheTextButton(String text) {
		home.clickUpdateButtonWithNoWait(text);
	}

	@Then("I save Credit")
	public void thenISaveCredit() {
		home.ClickButtonID2("turnOnSpecialSave");
	}

	@Then("I click Edit Credit")
	public void thenIClickEditCredit() {
		home.ClickButtonClass("buttonEdit editCreditButton");
	}

	@Then("I save Edit Credit")
	public void thenISaveEditCredit() {
		home.ClickButtonSaveXpath();
	}

	@Then("I click hover \"$text\" button")
	public void thenIClickHoverTextButton(String text) {
		home.clickUpdateButtonWithNoWaitByCss(text);
	}

	@Then("I check value of \"$Summary\" as \"$Testsummary\"")
	public void thenICheckValueOfSummaryAsTestSummary(String field, String text) {
		home.verifyTextareawithbr(field, text);
	}

	@Then("I verify value of \"$ProductType\" as \"$Experience\"")
	public void thenIVerifyValueOfProductTypeAsExperience(String field,
			String text) {
		home.verifydropdown(field, text);
	}

	@Then("I should see the \"$value\" as \"$field\"")
	public void thenIShouldSeeTheValueAsField(String text, String field) {
		// home.verifytextareabasedonname(field, text);
		home.verifyRichTextbasedondiv(field, text);
	}

	// And I must see the "test product notes" as "internalNotes"
	@Then("I must see the \"$value\" as \"$field\"")
	public void thenIMustSeeTheValueAsField(String text, String field) {
		home.verifytextareabasedonname(field, text);
	}

	/*
	 * And I type the "Manly south beach" as "Venue" And I type the "Take ferry"
	 * as "How to get there" And I type the "can be long" as "Session Length"
	 * And I type the "anyone can participate" as "Guidelines" And I type the
	 * "Casual" as "Dress Code" And I type the "found" as "Other Info" And I
	 * type the "windy and sunny" as "Weather" And I type the "can be anynumber"
	 * as "Numbers on the day" And I type the "allowed" as "Spectators" And I
	 * type the "applicable" as "Cancellation Policy" And I type the
	 * "wheelchair accessible" as "Accessibility"
	 */

	@When("I go to newly added supplier page in Alfred")
	public void whenIGoToNewlyAddedSupplierPageInAlfred() {
		home.redirectToSupplierPage(hostname, port);
	}

	@When("I go to the edited supplier page in Alfred")
	public void whenIGoToEditedSupplierPageInAlfred() {
		home.redirectToEditedSupplierPage(hostname, port);
	}

	@When("I go to earlier supplier page in Alfred")
	public void whenIGoToEarlierSupplierPageInAlfred() {
		home.redirectToEarlierSupplierPage(hostname, port);
	}

	// @Then("I enter the supplier")
	// public void thenIEnterTheSupplier() {
	// try {
	// home.enterTextinAutocomplete();
	// } catch (InterruptedException e) {
	// e.printStackTrace(); //To change body of catch statement use File |
	// Settings | File Templates.
	// }
	// }

	// Edit Product

	@Then("I enter the supplier as \"$text\"")
	public void thenIEnterTheSupplierAsText(String text) {
		try {
			home.enterTextinAutocomplete("supplier", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the Primary category as \"$text\"")
	public void thenIEnterThePrimaryCategoryAsText(String text) {
		try {
			home.enterTextinAutocomplete("primaryCategory", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the Category as \"$text\"")
	public void thenIEnterTheCategoryAstext(String text) {
		try {
			home.enterTextinAutocomplete("categoryTags_tag", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the recipient as \"$text\"")
	public void thenIEnterTheRecipientAstext(String text) {
		try {
			home.enterTextinAutocomplete("recipientTags_tag", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the Occassion as \"$text\"")
	public void thenIEnterTheOccassionAsText(String text) {
		try {
			home.enterTextinAutocomplete("occasionTags_tag", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the Location as \"$text\"")
	public void thenIEnterTheLocationAsText(String text) {
		try {
			home.enterTextinAutocomplete("locationTags_tag", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I enter the Duration as \"$text\"")
	public void thenIEnterTheDurationAsText(String text) {
		try {
			home.enterTextinAutocomplete("experienceLength", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	@Then("I change the value of \"$Name\" as \"$text\"")
	public void thenIChangeTheValueOfNameAsText(String field, String text) {
		home.enterTextLabels(field, text);
	}

	// Product Prices

	@Then("I enter <commissionsellingprice>")
	public void thenIEntercommissionsellingprice(
			@Named("commissionsellingprice") String text) {
		home.enterTextLabelswithbrspan("Commissionable Selling Price", text);
		// home.typesearchkeyword("", text);
	}

	@Then("I enter <newcommissionsellingprice>")
	public void thenIEnternewcommissionsellingprice(
			@Named("newcommissionsellingprice") String text) {
		home.enterTextLabelswithbrspan("Commissionable Selling Price", text);
		// home.typesearchkeyword("", text);
	}

	@Then("I enter <levies>")
	public void thenIEnterlevies(@Named("levies") String text) {
		home.enterTextLabelswithbrspan("Non-Commissionable Component", text);
	}

	@Then("I enter <newlevies>")
	public void thenIEnternewlevies(@Named("newlevies") String text) {
		home.enterTextLabelswithbrspan("Non-Commissionable Component", text);
	}

	@Then("I enter <commission>")
	public void thenIEntercommission(@Named("commission") String text) {
		home.enterTextLabelswithbr("Commission", text);
	}

	@Then("I enter <newcommission>")
	public void thenIEnternewcommission(@Named("newcommission") String text) {
		home.enterTextLabelswithbr("Commission", text);
	}

	@Then("I enter <rrp>")
	public void thenIEnterrrp(@Named("rrp") String text) {
		home.enterTextLabelswithbrspan("Supplier RRP", text);
		// home.WaitForPage("3000");

	}

	@Then("I enter <newrrp>")
	public void thenIEnternewrrp(@Named("newrrp") String text) {
		home.enterTextLabelswithbrspan("Supplier RRP", text);
		// home.WaitForPage("3000");

	}

	// Verify product fields in ting

	@Then("I verify Unit Price")
	public void thenIVerifyUnitPrice() {
		home.verifyprices("Selling Price", "Unit Price");
	}

	@Then("I verify Buy Price")
	public void thenIVerifyBuyPrice() {
		home.verifyprices("Buying Price", "Buy Price");
	}

	@Then("I verify the value <rrp>")
	public void thenIVerifyTheValuerrp(@Named("rrp") String text) {
		home.verifyTextInFirstColn("RRP", "$" + text + ".00");
	}

	@Then("I verify the value <newrrp>")
	public void thenIVerifyTheValuenewrrp(@Named("newrrp") String text) {
		home.verifyTextInFirstColn("RRP", "$" + text + ".00");
	}

	@Then("I verify the value <newcommission>")
	public void thenIVerifyTheValuenewcommission(
			@Named("newcommission") String text) {
		home.verifyTextInFirstColn("Commission Rate", text + "%");
	}

	@Then("I verify the value <commission>")
	public void thenIVerifyTheValuecommission(@Named("commission") String text) {
		home.verifyTextInFirstColn("Commission Rate", text + "%");
	}

	@Then("verify the value \"$value\" as \"$field\"")
	public void thenVerifyTheValueValueAsField(String text, String field) {
		// home.verifytextinlegend(field, text);
		home.verifyRichText(field, text);
	}

	@Then("I verify the Location as \"$text\"")
	public void thenIVerifyTheLocationAsText(String text) {
		home.verifyLocationinTing(text);
	}

	@Then("I verify Accessiblity as Hearing")
	public void thenIVerifyAccesiblityAsHearing() {
		home.verifyAccessibilityHearing();
	}

	@Then("I verify the product code")
	public void thenIVerifyTheProductCode() {
		home.verifyProductCodeTing();
	}

	@Then("I need to see \"$value\" as \"$field\"")
	public void thenINeedToSeeValueAsField(String text, String field) {
		home.verifytextinlegend(field, text);
	}

	@Then("I open \"$text\" section")
	public void thenIOpenTextSection(String text) {
		// home.WaitForPage("100000");
		home.clickProductDetails(text);
	}

	@Then("I open Accessibility Drop Down")
	public void thenIOpenAccessibilityDropDown() {
		home.clickAccessibility();
	}

	@Then("I check \"$field\" as \"$value\"")
	public void thenICheckFieldAsValue(String field, String text) {
		home.verifyTagsinTing(field, text);
	}

	// Verify product fields in ofbiz

	@Then("I look for <commissionsellingprice>")
	public void thenILookForcommissionsellingprice(
			@Named("commissionsellingprice") String text) {
		home.verifyTextboxValueswithspan("Commissionable Selling Price", text);
	}

	@Then("I look for <newcommissionsellingprice>")
	public void thenILookFornewcommissionsellingprice(
			@Named("newcommissionsellingprice") String text) {
		home.verifyTextboxValueswithspan("Commissionable Selling Price", text);
	}

	@Then("I look for <levies>")
	public void thenILookForlevis(@Named("levies") String text) {
		home.verifyTextboxValueswithspan("Non-Commissionable Component", text);
	}

	@Then("I look for <commission>")
	public void thenILookForcommission(@Named("commission") String text) {
		home.verifyTextboxValueswithbr("Commission", text + ".00");
	}

	@Then("I look for <rrp>")
	public void thenILookForrrp(@Named("rrp") String text) {
		home.verifyTextboxValueswithspan("Supplier RRP", text);
	}

	@Then("I look for <newrrp>")
	public void thenILookFornewrrp(@Named("newrrp") String text) {
		home.verifyTextboxValueswithspan("Supplier RRP", text);
	}

	@Then("I verify \"$text\"")
	public void thenIVerifyText(String text) {
		home.verifypricesinofbiz(text);
	}

	@Then("I verify the \"$text\"")
	public void thenIVerifyTheText(String text) {
		home.verifycommissioninofbiz("Commission Rate", text);
	}

	@Then("I verify <BoxWidth>")
	public void thenIVerifyBoxWidth(@Named("BoxWidth") String text) {
		home.verifyboxdimensioninofbiz("Box Width", text);
	}

	@Then("I verify <BoxHeight>")
	public void thenIVerifyBoxHeight(@Named("BoxHeight") String text) {
		home.verifyboxdimensioninofbiz("Box Height", text);
	}

	@Then("I verify <BoxLength>")
	public void thenIVerifyBoxLength(@Named("BoxLength") String text) {
		home.verifyboxdimensioninofbiz("Box Length", text);
	}

	@Then("I verify <BoxWeight>")
	public void thenIVerifyBoxWeight(@Named("BoxWeight") String text) {
		home.verifyboxdimensioninofbiz("Box Weight", text);
	}

	// Create product in Ting

	@Then("I click \"$text\"")
	public void thenIClickText(String text) {

		home.clickSpanElementWithWait(text);
	}

	@When("I click \"$text\"")
	public void whenIClickText(String text) {

		home.clickSpanElementWithWait(text);
	}

	@When("I click \"$text\" button")
	@Then("I click \"$text\" button")
	public void thenIClickTextButton(String text) {
		home.clickUpdateButton(text);
	}

	@Then("I click the Edit Customer Image")
	public void thenIEditCustomerImage() {
		home.clickEditImage();

	}

	@Then("I edit the Company Name as AuatSupplierEdited")
	public void thenIEditRBCompanyName() {
		home.editCompanyName();
	}

	@Then("I edit the Phone as 44556677")
	public void thenIEditRBPhone() {
		home.editPhone();
	}

	@Then("I edit the Mobile Phone as 4455667788")
	public void thenIEditRBMobile() {
		home.editMobile();
	}

	@Then("I edit the Fax as 12345")
	public void thenIEditRBFax() {
		home.editFax();
	}

	@Then("I edit Contact Email as user1@pantha.com")
	public void thenIEditRBEmail() {
		home.editMail();
	}

	@Then("I edit emailDivertList as user2@pantha.com")
	public void thenIEditRBEmail2() {
		home.editMail2();
	}

	@Then("I edit Website as panthacorp.com")
	public void thenIEditRBWebSite() {
		home.editWebsite();
	}

	@Then("I edit Address as Sydney")
	public void thenIEditRBAddress() {
		home.editAddress();
	}

	@Then("I edit Suburb as Manly")
	public void thenIEditRBSuburb() {
		home.editSuburb();
	}

	@Then("I click on Save Button to update supplier on RB")
	public void thenISaveRBChanges() {
		home.saveRBChanges();
	}

	@Then("I add \"$value\" as \"$field\"")
	public void thenIAddValueAsField(String text, String field) {
		home.enterTextbasedoncolumnhead(field, text);
	}

	@Then("I add \"$value\" as the \"$field\"")
	public void thenIAddValueAsTheField(String text, String field) {
		home.enterText(field, text);
	}

	@Then("I add \"$value\" in \"$field\"")
	public void thenIAddTestProductValueInField(String text, String field) {
		home.enterTextArea(field, text);
	}

	@Then("I select the \"$option\" as \"$field\"")
	public void thenISelectTheOptionAsField(String text, String field) {
		home.selectdropdown(field, text);
	}

	@Then("I select \"$option\" as supplier status")
	public void thenISelectOptionAsSupplierStatus(String text) {
		home.selectdropdown("status", text);
	}

	@Then("I select \"$option\" as Honouring Vouchers")
	public void thenISelectOptionAsHonouringVouchers(String text) {
		home.selectdropdown("isHonouring", text);
	}

	@Then("I add <BoxHeight>")
	public void thenIAddBoxHeight(@Named("BoxHeight") String text) {
		home.enterTextbasedoncolumnhead("Box Height", text);
	}

	@Then("I add <BoxWidth>")
	public void thenIAddBoxWidth(@Named("BoxWidth") String text) {
		home.enterTextbasedoncolumnhead("Box Width", text);
	}

	@Then("I add <BoxLength>")
	public void thenIAddBoxLength(@Named("BoxLength") String text) {
		home.enterTextbasedoncolumnhead("Box Length", text);
	}

	@Then("I add <BoxWeight>")
	public void thenIAddBoxWeight(@Named("BoxWeight") String text) {
		home.enterTextbasedoncolumnhead("Box Weight", text);
	}

	@Then("I select \"$text\" as Primary Subcategory under Primary and Secondary Subcategories")
	public void thenISelectTextAsPrimarySubcategoryUnderPrimaryAndSecondarySubcategories(
			String text) {
		home.categoryCheckbox("8");
		home.clickLinkTextWithNoWait(text);
		home.ClickButton("primaryAddBtn");
	}

	@Then("I select \"$text\" as Secondary Subcategories under Primary and Secondary Subcategories")
	public void thenISelectTextAsSecondarySubcategoriesUnderPrimaryAndSecondarySubcategories(
			String text) {
		home.categoryCheckbox("8");
		home.clickLinkTextWithNoWait(text);
		home.ClickButton("secondaryAddBtn");
	}

	@Then("I select \"$text\" under Sub Occassions")
	public void thenISelectTextUnderSubOccassions(String text) {
		home.categoryCheckbox("276");
		home.clickLinkTextWithNoWait(text);
		home.clickSecondaryBtn2();
	}

	@Then("I select \"$text\" under Sub Recipients")
	public void thenISelectTextUnderSubRecipients(String text) {
		home.categoryCheckbox("335");
		home.clickLinkTextWithNoWait(text);
		home.clickSecondaryBtn3();

	}

	@Then("I select \"$text\" under Sub Locations")
	public void thenISelectTextUnderSubLocations(String text) {
		home.categoryCheckbox("412");
		home.clickLinkTextWithNoWait(text);
		home.clickAddLocationBtn();

	}

	@Then("I \"$Logout\"")
	public void thenILogout(String text) {
		// home.selwait();
		home.clickSpanElement(text);
		home.deleteCookie();
	}

	@Then("I select \"$value \" as country")
	public void thenISelectValueAsCountry(String text) {
		home.selectdropdown("countryCode", text);
	}

	@Then("I select \"$value\" as state for location")
	public void thenISelectValueAsStateForLocation(String text) {
		// home.waitForElementToBeVisible("stateID", "50000");
		home.selectdropdownbasedonscript("stateID", text);
	}

	@Then("I add <productcode> as Product Code in textbox")
	public void thenIAddproductcodeAsProductCodeInTextbox(
			@Named("productcode") String text) {
		home.enterText("productCode", text);
	}

	@Then("I select \"$option \" as supplier")
	public void thenISelectOptionAsSupplier(String text) {
		home.selectdropdown("supplierID", text);
	}

	@Then("I select \"$option\" as product type")
	public void thenISelectOptionAsProductType(String text) {
		home.selectdropdown("productTypeID", text);
	}

	@Then("I select \"$option\" as Voucher level")
	public void thenISelectOptionAsVoucherLevel(String text) {
		home.selectdropdown("VoucherLevelID", text);
	}

	@Then("I select \"$option\" as Supplier sign off")
	public void thenISelectOptionAsSupplierSignOff(String text) {
		home.selectdropdown("signOff", text);
	}

	@Then("I select \"$option\" as New product")
	public void thenISelectOptionAsNewProduct(String text) {
		home.selectdropdown("newStuff", text);
	}

	@Then("I select \"$text\" as Includes shipping")
	public void thenISelectTextAsIncludesShipping(String text) {
		home.selectdropdown("includesShipping", text);
	}

	@Then("I select \"$text\" as Duration")
	public void thenISelectTextAsDuration(String text) {
		home.selectdropdown("ExperienceLength", text);
	}

	@Then("I select \"$option\" as Voucher valid for")
	public void thenISelectOptionAsVoucherValidFor(String text) {
		home.selectdropdown("NumberParticipants", text);
	}

	@Then("I select \"$value\" as Update Reason")
	public void thenISelectValueAsUpdateReason(String text) {
		home.selectdropdown("updateTypeID", text);
		home.enterText("updateReason", "Test");
	}

	@When("I click \"$text\" link")
	@Then("I click \"$text\" link")
	public void thenIClickTextLink(String text) {
		home.clickLinkTextWithWait(text);
	}

	@Then("I open product page for \"$text\"")
	public void thenIProductPageForText(String text) {
		home.gotoproductpageinalfred(text);
	}

	@Then("I type Rich text \"$value\" as \"$field\"")
	public void thenITypeRichText(String text, String field) {
		home.typeRichText(field, text);
	}

	@Then("I verify the rich text value of \"$field\" as \"$value\"")
	public void thenVerifyRichTextFieldValue(String field, String value) {
		home.verifyRichText(field, value);
	}

	@Then("I verify the value of \"$field\" as \"$value\"")
	public void thenVerifyFieldValue(String field, String value) {
		home.verifyText(field, value);
	}

	@Then("I verify the dropdown value of \"$field\" as \"$value\"")
	public void thenVerifyDropDownFieldValue(String field, String value) {
		home.verifyDropDownText(field, value);
	}

	// Get values from Ting to verify in ofbiz

	@Then("I get the value of \"$text\"")
	public void thenIGetTheValueOfText(String field) {
		home.getColumnvaluesinTing(field);
	}

	/*
	 * @Then("I go to the product details page") public void
	 * thenIGoToTheProductDetailsPage(){ home.goProducts(envurl, "TES018"); }
	 */

	@Then("I type text \"$value\" as \"$field\"")
	public void thenITypeText(String text, String field) {
		if (text.contains("[date]")) {
			text = CommonUtils.getSmartValue(text);
		}
		home.typeText(field, text);
	}

	@Then("I click \"$field\" field")
	public void thenIClick(String field) {
		home.click(field);
	}

	@Then("I verify the note to be present")
	public void thenIVerifyTheNoteToBePresent() {

		home.presentContents("Add Notes Test");

	}

	@Then("I verify the note to be deleted")
	public void thenIVerifyTheNoteToBeDeleted() {
		home.deletedContents("Adding note to delete.");

	}

	@Then("I verify the edited note to be present")
	public void thenIVerifyTheEditedNoteToBePresent() {
		home.presentContents("New Note Edited");

	}

	@Then("I verify note to be present")
	public void thenIVerifyNoteToBePresent() {
		home.presentContents("Adding New Note");

	}

	@Then("I verify the image of \"$field\" as \"$value\"")
	public void thenIVeifyImage(String field, String value) {
		home.verifyImage(field, value);
	}

	@Then("I verify the \"$field\" field is not visible")
	public void thenIVerifyFieldNotVisible(String field) {
		home.verifyNotVisible(field);
	}

	@Then("I verify the \"$field\" field is visible")
	public void thenIVerifyFieldVisible(String field) {
		home.verifyVisible(field);
	}

	@Then("I store the ProductID")
	public void thenIStoreProductID() {
		home.storeProductID();
	}

	// Edit fields in Ting
	@Then("I click Edit under \"$Categorisation\"")
	public void thenIClickEditUnderCategorisation(String text) {
		home.clickEdit(text);
	}

	@Then("I wait for \"$field\" field to be visible with timeout \"$value\"")
	public void thenIWaitForElementTobeVisible(String field, String value) {
		home.waitForElementToBeVisible(field, value);
	}

	@When("I wait for \"$field\" seconds")
	@Then("I wait for \"$field\" seconds")
	public void thenIWaitForTime(String field) {
		home.waitForTime(Integer.parseInt(field));
	}

	// Editing User Profile
	@Then("I enter <NewPassword>")
	public void thenIEnterNewPassword(@Named("NewPassword") String text) {
		home.enterTextLabels("New Password", text);
	}

	@Then("I enter <verifyNewPassword>")
	public void thenIEnterverifyNewPassword(
			@Named("verifyNewPassword") String text) {
		home.enterTextLabels("Verify New Password", text);
	}

	// Add and remove custom fields to product

	@Then("I click the new custom field \"$Testfield1\" with \"$element\"")
	public void thenIClickTheNewCustomFieldTestfield1WithElement(String text,
			String element) {
		home.waitForElementToBeVisible(element, "5000");
		home.clickCustomField(element);
	}

	@Then("I type in custom value \"$text\" as \"$field\"")
	public void thenITypeInCustomValueTextAsField(String text, String field) {
		home.typecustomfieldvalue(field, text);
	}

	@Then("I hit \"$text\" submit button")
	public void thenIHitTextSubmitButton(String text) {
		home.clickFind(text);
	}

	@Then("I click to open \"$text\" page")
	public void thenIClickToOpenTextPage(String text) {
		home.clickCategoryName(text);
	}

	@When("I click the \"$Logout\" link")
	@Then("I click the \"$Logout\" link")
	public void thenIClickTheLogoutLink(String text) {
		home.clicklink(text);
		home.deleteCookie();
	}

	@Then("I update \"$field\" as \"$text\"")
	public void thenIUpdateFieldAsText(String field, String text) {
		home.updateAttrvalues(field, text);
	}

	@Then("I do not see \"$text\" with \"$element\"")
	public void thenIDoNotSeeText(String text, String element) {
		home.textnotpresent(element);
	}

	@Then("I select \"$text\" in the \"$field\"")
	public void thenISelectTextInTheField(String text, String field) {
		home.selectoption(field, text);
	}

	// Update Product Accessibility Options

	@Then("I wait for \"$field\" element to be visible")
	public void thenIWaitForFieldElementToBeVisible(String field) {
		home.waitForElementToBeVisible(field, "3000");
	}

	// search Supplier

	@Then("I verify the status of <activestatus>")
	public void thenIVerifyTheStatusOfactivestatus(
			@Named("activestatus") String text) {
		home.verifysuppliersearchstatus("activestatus", text);
	}

	@Then("I verify the status of <publishstatus>")
	public void thenIVerifyTheStatusOfpublishstatus(
			@Named("publishstatus") String text) {
		home.verifysuppliersearchstatus("publishstatus", text);
	}

	@Then("I verify the status of <countrystatus>")
	public void thenIVerifyTheStatusOfcountrystatus(
			@Named("countrystatus") String text) {
		home.verifysuppliersearchstatus("countrystatus", text);
	}

	// create site data

	@Then("I click Next button")
	public void thenIClickNextButton() {
		home.ClickButton("btnSave");
	}

	@Then("I click \"$ServiceEngine\" from left navigation")
	public void thenIClickServiceEngineFromLeftNavigation(String text) {
		home.clickLinkTextWithWait(text);
	}

	@Then("I click \"$createProductReview\" service")
	public void thenIClickcreateProductReviewService(String text) {
		home.clickLinkTextWithWait(text);
	}

	@Then("I click \"$RunService\" under service")
	public void thenIClickRunServiceUnderService(String text) {
		home.clickRunService(text);
	}

	@Then("I enter the Restricted Site Name as \"$test\"")
	public void thenIEnterTheRestrictedSiteNameAsTest(String text) {
		try {
			home.enterTextinAutocomplete("siteName", text);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	// Edit Site data
	@Then("I \"$Edit\" the sites")
	public void thenIEditTheSites(String text) {
		home.clickLinkTextWithWait(text);
	}

	@Then("I click to open \"$value\" site details page")
	public void thenIClickToOpenValueSiteDetailsPage(String text) {
		home.clickSiteName(text);
	}

}
