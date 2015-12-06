package com.rb.ofbiz.test.pages;

public interface Home {

	void go(String url);

	void deleteCookie();

	void waitForPage(String text);

	boolean hasContents(String content);

	void presentContents(String content);

	void presentContentsWithoutWait(String content);

	void presentmandatorytext(String text);

	void clickcategory(String category);

	void clickcategoryNoUiRepositoryCall(String category);

	void enterText(String field, String text);

	void typesearchkeyword(String field, String text);

	void enternullvalue(String field);

	void editCompanyName();

	void editPhone();

	void editMobile();

	void editFax();

	void editMail();

	void editMail2();

	void selectReferrer(String text);

	void editWebsite();

	void editAddress();

	void editSuburb();

	void saveRBChanges();

	void enterTextareabasedondiv(String field, String text);

	void entertextareabasedondivlabel(String field, String text);

	void enterTextareaswithbr(String field, String text);

	void enterTextLabelswithbr(String field, String text);

	void enterTextLabelswithbrspan(String field, String text);

	void enterTextareaswithbrdiv(String field, String text);

	void clickButtonBasedOnValue(String name);

	void clickUpdateButton(String name);

	void clickUpdateButtonWithNoWait(String name);

	void clickUpdateButtonWithNoWaitByCss(String name);

	void clciklabel(String text);

	void ClickButtonID(String name);

	void ClickButtonXpath(String value);

	void ClickButtonID2(String value);

	void ClickButtonClass(String value);

	void ClickButtonSaveXpath();

	void clickSpanElementWithWait(String text);

	void clickLinkTextWithWait(String link);

	void clickSpanElement(String text);

	void clickButtonCSS(String text);

	void deletedContents(String text);

	void enterTextLabels(String field, String text);

	void enterTextinRichTexteditor(String field, String text);

	void selectdropdownbasedonlabel(String field, String text);

	void selectItemFromDropDown();

	void selectdropdown(String field, String text);

	void enterTextbasedoncolumnhead(String field, String text);

	void enterTextArea(String field, String text);

	void selectdropdownbasedonID(String field, String text);

	void enterTextinAutocomplete(String field, String text)
			throws InterruptedException;

	void getallproductsfromsearch();

	void getproductname(String text);

	void getsuppliername(String text);

	void getproductcode(String text);

	void getoccasiontags(String field, String text);

	void verifyEditedDateValue();

	void verifyTextboxValues(String field, String text);

	void verifyTextboxValueswithbr(String field, String text);

	void verifyTextareawithbr(String field, String text);

	void verifyTextInFirstColn(String field, String text);

	void verifyTextInFirstColnForEmail(String field, String text);

	void verifytextinlegend(String field, String text);

	void verifydropdown(String field, String text);

	void selectdropdownbasedonth(String field, String text);

	void verifytextareabasedonname(String field, String text);

	void verifyTextboxValueswithspan(String field, String text);

	void verifypricesinofbiz(String field);

	void getProductID();

	void gotoproductpageinting(String url);

	void gotoproductpageinalfred(String text);

	void clickproductnameinsearch();

	void geterrormessage();

	void getSupplierErrorMessage();

	void getProductIDfromRB(String url);

	void getprices(String field);

	void getColumnvaluesinTing(String field);

	void verifyprices(String field, String text);

	void seleniumsleep();

	void getsuppliererrormessage();

	void verifyRichText(String field, String value);

	void verifyRichTextbasedondiv(String field, String value);

	void clickProductDetails(String text);

	void verifyTagsinTing(String field, String text);

	void verifyText(String field, String value);

	void verifyDropDownText(String field, String value);

	void typeRichText(String field, String text);

	void typeRichTextbasedondiv(String field, String value);

	void verifyProductCodeTing();

	void verifyboxdimensioninofbiz(String field, String text);

	void verifycommissioninofbiz(String field, String text);

	void verifynameinedit(String field, String text);

	void typeText(String field, String text);

	void enterTextByInputName(String field, String text);

	void click(String field);

	void clickRunService(String link);

	void clickEdit(String text);

	void verifyImage(String field, String imageSr);

	void verifyNotVisible(String field);

	void verifyVisible(String field);

	void verifyDBFieldValue(String field, String value);

	void storeProductID();

	void typeProductID();

	void getProductIDfromTing(String url);

	void clickLinkTextWithNoWait(String link);

	void categoryCheckbox(String text);

	void ClickButton(String name);

	void clickSecondaryBtn2();

	void clickSecondaryBtn3();

	void waitForElementToBeVisible(String field, String value);

	void waitForTime(int parseInt);

	void clickCategoryName(String text);

	void clickFind(String text);

	void clicklink(String text);

	void enterTextbasedonspan(String field, String text);

	void updateAttrvalues(String field, String text);

	void textnotpresent(String text);

	void ClickButtonIDforSearch(String name);

	void VerifyProductCategoriesinRBD(String field, String value,
			String tablename);

	void EditProductCategoriesinRBD(String field, String value);

	void clickCustomField(String field);

	void typecustomfieldvalue(String field, String text);

	void selectoption(String field, String text);

	void clicklinktext(String link);

	void AddProductAccessibilityOptionsinRBD(String field, String value);

	void selectdropdownbasedonscript(String field, String text);

	void verifyLocationinTing(String text);

	void verifysuppliersearchstatus(String field, String text);

	void verifyTextboxValuesByID(String field, String text);

	void getSupplierName();

	void getPartyID();

	void getCustomerIDfromRB(String envurl);

	void getSupplierIDfromRB(String envurl);

	void getSupplierID();

	void redirectToSupplierPage(String hostname, String port);

	void redirectToEditedSupplierPage(String hostname, String port);

	void redirectToEarlierSupplierPage(String hostname, String port);

	void clickSiteName(String text);

	void goToSupplierPageFromSearchResults(String text);

	void verifyTextInDivClass(String cssClass, String text);

	void verifyNoTextInDivClass(String cssClass, String text);

	void checkEmailExistsInContactMech(String email);

	void enterTextLabelInVisibleDiv(String field, String text);

	void clickSpanElementInDivContainsStrongWith(String spanContent,
			String divText);

	void clickElementBasedOnId(String buttonId);

	void verifyStrongBrSpan(String StrongContent, String spanContent);

	void clickBasedOnCssId(String id);

	void enterTextByInputId(String inputId, String text);

	void verifySpanValueById(String spanId, String value);

	void clickAddLocationBtn();

	public String getProductCodeFromProductPage();

	void verifySupplierNameDeleted();

	void verifyCustomerAddCredit(String field, String value);

	void enterTextName(String field, String text);

	void clickButtonBasedOnClass(String link);

	void clickOnlink();

	void ClickButtonIDforEdit();

	public void hoverTheLink(String Category);

	void clickRadioButton(String inputId);

	void enterTextByName(String field, String name);

	void gotoproductdetailspageinTing(String url);

	void clickEditImage();

	void clickAddNewUseButtonWithNoWait(String text);

	void selectCountry();

	void clcikButtonCSS();

	void selectState();

	void getCustomerID();

	void enterText1(String field, String text);

	void redirectToEarlierCustomerPage(String hostname, String port);

	void navigateToCustomerViewPage(String hostname, String port);

	void checkRadio(String text);

	void getCustomerIDRB();

	void navigateToCustomerEditPage();

	void clickOK();

	void selectNewsletter();

	void selectNewsletterInTing();

	void clickUpdateButton();

	void verifyRadioChecked();

	void selectNewsletter2();

	void clickEditNewsLetter();

	void selectNewsletterInTing2();

	void notpresenttableContents(String content);

	void enterLogin(String field, String text);

	void gotoconsumersite(String url);

	void getOrderID();

	void enterOrderID(String field, String text);

	void Verifycustomer();

	void chooseDeliveryOption();

	void Randomname(String field, String text);

	void Randomdescription(String field, String text);

	void clickEditImagebtnOrder();

	void clickBookforOrder(String text);

	void enterpreferreddateforOrderBooking(String field);

	void VerifyBooking();

	void enteralternatedateforOrderBooking(String field);

	void enterbookingid(String field);

	void enterorderitemid(String field);

	void enterparticipantid(String field);

	void gotoVoucherPage();

	void clickOrderIteminRB(String text);

	void VerifyVoucherNoteRB(String text);

	void ClickcustomerinOrderPage(String host, String port);

	void updateCustomerAddress(String text);

	void selectdropdownreview(String field, String text);

	void getRefundIDfromRBD();

	void clickproductforRefund();

	void clickrefundIDinOfbiz();

	void clickEditImagebtn(String text);

	void refresh();

	void gettotalsearchresults(String text);

	void selectHearingAccessibility();

	void verifyAccessibilityHearing();

	void clickAccessibility();

}
