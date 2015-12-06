package com.rb.ofbiz.test.pages.catalog;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.UIRepository;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;
import junit.framework.Assert;
import org.apache.html.dom.HTMLDocumentImpl;
import org.jbehave.web.selenium.SeleniumPage;
import org.junit.Rule;

import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import static junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;

//import org.junit.runners.model.Statement;

/**
 * Created by IntelliJ IDEA. User: vinu Date: 7/11/11 Time: 4:29 PM To change
 * this template use File | Settings | File Templates.
 */
public class OFBizHome extends SeleniumPage implements Home {

	private static final String _WAIT_FOR_PAGE_TO_LOAD = "30000";
	private String loadtime;
	private HTMLDocumentImpl document;
	public String ProductID;
	public String ProductIDinRB;
	private String sqldb;
	private String rbdbuser;
	private String rbdbpasswd;
	public String ProductIDTemp;
	private String SupplierIDinRB;
	private String CustomerIDinRB;
	public String customerID;
	public String supID;
	public String SupplierName;
	public String OrderID;

	private String ofbizdbHost;
	private String ofbizdbUsername;
	private String ofbizdbPassword;

	HashMap id = new HashMap();

	public OFBizHome(Selenium selenium, ConditionRunner conditionRunner) {
		super(selenium, conditionRunner);
	}

	public OFBizHome(Selenium selenium, ConditionRunner conditionRunner,
			String loadtime, String sqldb, String rbduser, String rbdpasswd) {
		super(selenium, conditionRunner);
		this.loadtime = loadtime;
		this.sqldb = sqldb;
		this.rbdbuser = rbduser;
		this.rbdbpasswd = rbdpasswd;
	}

	HashMap hm = new HashMap();

	@Rule
	// public ScreenshotTestRule screenshotTestRule = new ScreenshotTestRule();
	public void go(String url) {
		selenium.windowMaximize();
		selenium.open(url);
		try {

			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		} catch (Exception e) {
			System.out.println("Timeout");
			selenium.open(url);
		}
	}

	// Deletes all the cookies in the current browser
	public void deleteCookie() {
		selenium.deleteAllVisibleCookies();
	}

	// Common Method for PageLoad
	public void waitForPage(String text) {
		selenium.waitForPageToLoad(text);
	}

	// Verifying the presence and absence of text
	public boolean hasContents(String content) {
		try {
			if (!selenium.isTextPresent(content))
				selenium.waitForPageToLoad("100000");
			return selenium.isTextPresent(content);
		} catch (Throwable e) {
			e.fillInStackTrace();
			return false;

		}
	}

	public void presentContents(String content) {
		selenium.waitForPageToLoad("10000");
		assertTrue(selenium.isTextPresent(content));
	}

	public void deletedContents(String content) {
		selenium.waitForPageToLoad("10000");
		assertFalse(selenium.isTextPresent(content));

	}

	public void presentContentsWithoutWait(String content) {
		assertTrue(selenium.isTextPresent(content));
	}

	public void presentmandatorytext(String text) {
		assertTrue(selenium.isTextPresent(text));
		// System.out.print(selenium.getText("div[@id='supplierError']"));
		// assertEquals(text,
		// selenium.getText("css=div:contains('Name')+input+div"));
	}

	public void geterrormessage() {
		// System.out.print(selenium.getText("//div[@id='productNameError']"));
		assertTrue(selenium.isVisible("//div[@id='productNameError']"));
		assertTrue(selenium.isVisible("//div[@id='supplierError']"));
	}

	public void verifyorderID() {
		// System.out.print(selenium.getText("//div[@id='productNameError']"));
		assertTrue(selenium.isVisible("link=2047885"));
	}

	public void notpresentContents(String content) {
		selenium.waitForPageToLoad(loadtime);
		assertFalse(selenium.isTextPresent(content));
	}

	public void notpresenttableContents(String content) {
		selenium.waitForPageToLoad(loadtime);
		assertFalse(selenium
				.isTextPresent("//div[@class='datagrid']/table/tbody/tr/td[text()='"
						+ content + "']"));
	}

	// Enter Text based on Name field
	public void enterText(String field, String text) {
		// selenium.setCursorPosition(field, "0");
		selenium.type(field, text);
		assertEquals(text, selenium.getValue("name=" + field + ""));
	}

	// Click Button

	public void clickcategory(String category) {
		selenium.click(UIRepository.OFBizHomePage.getValue(category));
	}

	public void clickcategoryNoUiRepositoryCall(String category) {
		selenium.click(category);
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void clickButtonBasedOnValue(String name) {
		selenium.click("//input[@value='" + name + "']");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void clickButtonBasedOnClass(String link) {
		selenium.click("//div[@class='addCreditButton']'" + link + "']");
		selenium.waitForPageToLoad("100000");
	}

	public void clickElementBasedOnId(String elementId) {
		selenium.click("id=" + elementId);
	}

	public void clickBasedOnCssId(String buttonId) {
		selenium.click("css=#" + buttonId);
	}

	public void typesearchkeyword(String field, String text) {
		selenium.type(field, text);
		assertEquals(text, selenium.getValue("name=" + field + ""));
		selenium.typeKeys(field, text);
	}

	public void ClickButtonID(String name) {
		selenium.click("//input[@id='" + name + "']");
	}

	public void ClickButtonID2(String name) {
		selenium.click("//button[@id='" + name + "']");
	}

	public void ClickButtonClass(String name) {
		selenium.click("//a[@class='" + name + "']");
	}

	public void ClickButtonXpathOK(String name) {
		selenium.click("xpath=//*[@id='honour-confirm-Yes']");
	}

	public void ClickButtonSaveXpath() {
		selenium.click("xpath=(//button[@id='turnOnSpecialSave'])[2]");
	}

	public void ClickButtonXpath(String value) {
		selenium.click("//input[@value='" + value + "']");

		// selenium.getAlert();
	}

	public void ClickButtonIDforSearch(String name) {
		selenium.click("//input[@id='" + name + "']");
		// selenium.windowFocus();
		// selenium.keyDownNative("13");
		// selenium.getAlert();
		selenium.keyPressNative(String.valueOf(KeyEvent.VK_ENTER));
	}

	public void ClickButtonIDforEdit() {
		assertTrue("Element Not Present",
				selenium.isElementPresent("saveChangesToolbar"));
		selenium.click("saveChangesToolbar");
		selenium.waitForPageToLoad("30000");
		selenium.waitForPopUp("_self", "30000");
	}

	public void ClickButton(String name) {
		selenium.click("//input[@name='" + name + "']");
	}

	public void clickUpdateButton(String name) {
		selenium.click("//input[@value='" + name + "']");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void clickEditImage() {
		selenium.click("css=img[alt='edit this']");
	}

	public void editCompanyName() {
		selenium.type("id=CompanyName", "AuatSupplierEdited");
	}

	public void editPhone() {
		selenium.type("id=Phone", "44556677");
	}

	public void editMobile() {
		selenium.type("id=Phone2", "4455667788");

	}

	public void editFax() {
		selenium.type("id=Fax", "12345");
	}

	public void editMail() {
		selenium.type("id=Email", "user1@pantha.com");

	}

	public void editMail2() {
		selenium.type("id=EmailDivertList", "user2@pantha.com");

	}

	public void editWebsite() {

		selenium.type("id=website", "panthacorp.com");
	}

	public void editAddress() {

		selenium.type("id=Address", "Sydney");
	}

	public void editSuburb() {

		selenium.type("id=Suburb", "Manly");
	}

	public void saveRBChanges() {

		selenium.click("name=btnSave");
		selenium.waitForPageToLoad("30000");

	}

	public void clickUpdateButtonWithNoWait(String name) {
		selenium.click("//input[@value='" + name + "']");
	}

	public void clickUpdateButtonWithNoWaitByCss(String name) {
		selenium.click("css=a.buttonEdit.editCreditButton > span");
	}

	public void clickAddNewUseButtonWithNoWait(String name) {
		selenium.click("//input[@name='newUser']");
	}

	public void clickFind(String text) {
		selenium.click("//td/input[@value='" + text + "']");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);

	}

	public void clickLinkTextWithWait(String link) {
		selenium.click("//a[text()='" + link + "']");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void clicklinktext(String link) {
		selenium.click(UIRepository.OFBizHomePage.getValue(link));
	}

	// @SuppressWarnings("null")
	public void hoverTheLink(String category) {

		assertTrue(
				"Element not present to hover",
				selenium.isElementPresent("xpath=.//*[@id='addCustomerOrUpdate']/div[26]/div/div[2]/a/span"));
		assertFalse(
				"Element is not hidden",
				selenium.isVisible("xpath=.//*[@id='addCustomerOrUpdate']/div[26]/div/div[2]/a/span"));
	}

	// WebDriver webDriver = null;
	//
	// WebElement myElement = webDriver.findElement(By
	// .cssSelector("a.buttonEdit.editCreditButton > span"));
	//
	// Actions builder = new Actions(webDriver);
	//
	// builder.moveToElement(myElement).build().perform();
	//
	// }

	public void clickLinkTextWithNoWait(String link) {
		selenium.click("//a[text()='" + link + "']");

	}

	public void clickRunService(String link) {
		selenium.click("//div[@class='screenlet-title-bar']/ul/li/a[text()='"
				+ link + "']");
		selenium.waitForPageToLoad("100000");
	}

	public void clickSpanElementWithWait(String text) {
		// selenium.waitForPageToLoad(String.valueOf(100000));
		selenium.click("//span[text()='" + text + "']");
		selenium.waitForPageToLoad(String.valueOf(100000));
	}

	public void clickSecondaryBtn2() {
		selenium.click("//div[@id='mainContentPad']/form[2]/fieldset/div[@id='subCatPanel']/div/ul/li/input");
		if (selenium.isAlertPresent()) {
			selenium.click("OK");
		}
		selenium.click("//div[@id='mainContentPad']/form[2]/fieldset/div[@id='subCatPanel']/div/div/input[2]");
	}

	public void clickSecondaryBtn3() {
		selenium.click("//div[@id='mainContentPad']/form[3]/fieldset/div[@id='subCatPanel']/div/ul/li/input");
		selenium.click("//div[@id='mainContentPad']/form[3]/fieldset/div[@id='subCatPanel']/div/div/input[2]");
	}

	public void clickAddLocationBtn() {
		selenium.click("//div[@id='mainContentPad']/form[4]/fieldset/div[@id='subCatPanel']/div/ul/li/input");
		selenium.click("//div[@id='mainContentPad']/form[4]/fieldset/div[@id='subCatPanel']/div/div/input[2]");
	}

	public void enterTextbasedoncolumnhead(String field, String text) {
		selenium.type("css=th:contains('" + field + "')+td>input", text);
		assertEquals(
				selenium.getValue("css=th:contains('" + field + "')+td>input"),
				text);
	}

	public void enterTextArea(String field, String text) {
		selenium.type("css=th:contains('" + field + "')+td>textarea", text);
		assertEquals(
				selenium.getValue("css=th:contains('" + field
						+ "')+td>textarea"), text);
	}

	public void enterTextLabels(String field, String text) {
		selenium.type("css=label:contains('" + field + "')+input", text);
		assertEquals(
				selenium.getValue("css=label:contains('" + field + "')+input"),
				text);
	}

	public void enterTextName(String field, String text) {
		selenium.type("css=label:contains('" + field + "')+input", text);
		assertEquals(
				selenium.getValue("css=label:contains('" + field
						+ "')+br+input"), text);
		// selenium.isElementPresent("css=input[name=('" + field + "')");
		//
		// selenium.type("css=input[name=('" + field + "')]", text);
		/*
		 * assertEquals( selenium.getValue("css=label:contains('" + field +
		 * "')+input"), text);
		 */
	}

	public void enterTextLabelInVisibleDiv(String fieldLabel, String text) {
		// System.out.println("Label: "+
		// selenium.getText("//label[.='"+fieldLabel+"' and not(ancestor::div[contains(@style,'display:none')])]"));

		String inputLocator = "//label[.='"
				+ fieldLabel
				+ "' and not(ancestor::div[contains(@style,'display:none')])]/following-sibling::input";
		selenium.type(inputLocator, text);

		assertEquals(selenium.getValue(inputLocator), text);

		// System.out.print("Value: "+ selenium.getValue(inputLocator));
	}

	public void enterTextLabelswithbr(String field, String text) {

		selenium.type("css=label:contains('" + field + "')+br+input", text);
		assertEquals(
				selenium.getValue("css=label:contains('" + field
						+ "')+br+input"), text);
	}

	public void enterTextinRichTexteditor(String field, String text) {
		// selenium.type("css=label:contains("+field+")+br+div>div>iframe");
		selenium.type("//label[text()=" + field
				+ "]/br/div/div[2]/iframe/html/body", text);
		assertEquals(
				selenium.getText("//label[text()=" + field
						+ "]/br/div/div[2]/iframe/html/body"), text);
	}

	public void enterTextareaswithbrdiv(String field, String text) {
		// selenium.type("summary", "teshgjgkg");

		// selenium.type("css=label:contains('"+field+"')+br+div>textarea",
		// text);
		// assertEquals(selenium.getValue("css=label:contains('"+field+"')+br+div>textarea"),
		// text);
	}

	public void enterTextLabelswithbrspan(String field, String text) {
		selenium.type("css=label:contains('" + field + "')+br+span+input", text);
		assertEquals(
				selenium.getValue("css=label:contains('" + field
						+ "')+br+span+input"), text);
		selenium.typeKeys("css=label:contains('" + field + "')+br+span+input",
				text);

	}

	public void enterTextareaswithbr(String field, String text) {
		selenium.type("css=label:contains('" + field + "')+br+textarea", text);
		assertEquals(
				selenium.getValue("css=label:contains('" + field
						+ "')+br+textarea"), text);
	}

	public void enternullvalue(String field) {
		selenium.setCursorPosition("css=div:contains('" + field + "')+input",
				"0");
	}

	public void enterTextareabasedondiv(String field, String text) {
		selenium.type("css=div:contains('" + field + "')+textarea", text);
		assertEquals(
				selenium.getValue("css=div:contains('" + field + "')+textarea"),
				text);
	}

	public void enterTextByInputId(String inputId, String text) {
		selenium.type("id=" + inputId, text);
		assertEquals(selenium.getValue("id=" + inputId), text);
	}

	public void enterText1(String field, String text) {
		selenium.type("css=th:contains('" + field + "')+td>input", text);
		assertEquals(
				selenium.getValue("css=th:contains('" + field + "')+td>input"),
				text);
	}

	public void enterTextByInputName(String inputId, String text) {
		selenium.type("name=" + inputId, text);
		assertEquals(selenium.getValue("name=" + inputId), text);
	}

	public void enterTextByName(String inputId, String text) {
		selenium.type("name=" + inputId, text);
		assertEquals(selenium.getValue("name=" + inputId), text);
	}

	public void enterTextbasedonspan(String field, String text) {
		// selenium.waitForCondition("selenium.isElementPresent(//td/span[contains(text(),'"+field+"')]/../../td[2]/input)",
		// "10000");
		selenium.type("//td/span[contains(text(),'" + field
				+ "')]/../../td[2]/input", text);
		assertEquals(
				selenium.getValue("//td/span[contains(text(),'" + field
						+ "')]/../../td[2]/input"), text);

	}

	public void updateAttrvalues(String field, String text) {
		selenium.type("//form/input[@name='" + field + "']", text);
		assertEquals(selenium.getValue("//form/input[@name='" + field + "']"),
				text);
	}

	public void verifynameinedit(String field, String text) {
		if (selenium.isAlertPresent()) {
			System.out.print("Alert Message is:" + selenium.getAlert());

		} else {
			while (!selenium.isElementPresent("css=label:contains(" + field
					+ ")+input")) {
				selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
				// selenium.keyPressNative("\13");
				try {
					// System.out.print(selenium.getValue("css=label:contains("+field+")+input"));
					assertEquals(
							text,
							selenium.getValue("css=label:contains(" + field
									+ ")+input"));
				} catch (Exception e) {

				}

			}

		}
	}

	public void clciklabel(String text) {
		selenium.click("css=label:contains(" + text + ")");
	}

	public void selectNewsletter() {

		selenium.click("xpath=.//*[@id='subscription1.1']");
	}

	public void selectNewsletter2() {

		selenium.click("xpath=.//*[@id='subscription1.2']");
	}

	public void clickEditNewsLetter() {

		selenium.click("xpath=(//a[contains(text(),'Edit')])[2]");
	}

	public void selectNewsletterInTing() {

		selenium.click("xpath=(//input[@id='prefIDs'])[1]");
	}

	public void selectHearingAccessibility() {

		selenium.click("id=accessible_Hearing");
	}

	public void selectNewsletterInTing2() {

		selenium.click("xpath=(//input[@id='prefIDs'])[2]");
	}

	public void navigateToViewPage() {

	}

	public void clcikButtonCSS() {
		selenium.click("css=div.submitAreaPad > input[name='submit']");
	}

	public void clicklink(String text) {
		selenium.click("//a[text()='" + text + "']");
	}

	public void clickOnlink() {
		// String link= UIRepository.Alfred.getValue("Simon Fuller");
		// selenium.click("link=Simon Fuller");
		selenium.click("xpath=.//a[contains(text(),'Simon Fuller')]");

	}

	public void clickSpanElement(String text) {
		selenium.click("//span[text()='" + text + "']");
	}

	public void clickSpanElementInDivContainsStrongWith(String spanContent,
			String strongText) {
		/*
		 * String locator = "//strong[text()='" + strongText +
		 * "']/../div//span[text()='" + spanContent + "']";
		 * selenium.click(locator);
		 */

		String locator = "xpath=.//*[@id='addSupplierForm']/div[21]/div/div[1]/div/a[3]/span";

		selenium.click(locator);

		/*
		 * selenium.click("//div[@class='cols']/strong[text()='" + strongText +
		 * "']/../span/div/a[@class='buttonEdit contactEdit']");
		 */
		// selenium.click("css=a.buttonEdit > span");

		// selenium.click("xpath=.//*[@id='addSupplierForm']/div[21]/div/div[1]/div/a[2]/span");
	}

	public void clickEdit(String text) {
		selenium.click("//fieldset/legend[text()='" + text + "']/a");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void clickCustomField(String field) {
		// assertTrue(selenium.isElementPresent("//div[@id='"+field+"']/div/input"));
		// selenium.check("//div[@id='"+field+"']/div/input");
		assertTrue(selenium.isElementPresent(UIRepository.OFBizHomePage
				.getValue(field)));
		selenium.check(UIRepository.OFBizHomePage.getValue(field));

	}

	public void clickCategoryName(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@class='basic-table hover-bar']/tbody/tr");
		System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			if (selenium
					.getText(
							"//table[@class='basic-table hover-bar']/tbody/tr["
									+ i + "]/td[4]").trim().contains(text)) {
				assertTrue(selenium
						.getText(
								"//table[@class='basic-table hover-bar']/tbody/tr["
										+ i + "]/td[4]").trim().contains(text));
				selenium.click("//table[@class='basic-table hover-bar']/tbody/tr["
						+ i + "]/td[1]/a");
			}
		}
	}

	public void clickSiteName(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='anotherTable']/tbody/tr");
		System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			if (selenium
					.getText(
							"//table[@id='anotherTable']/tbody/tr[" + i
									+ "]/td[5]").trim().contains(text)) {
				assertTrue(selenium
						.getText(
								"//table[@id='anotherTable']/tbody/tr[" + i
										+ "]/td[5]").trim().contains(text));
				selenium.click("//table[@id='anotherTable']/tbody/tr[" + i
						+ "]/td[2]/a");
			}
		}
		selenium.waitForPageToLoad("10000");
	}

	public void clickproductnameinsearch() {
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		selenium.click("//table[@id='showProductsMainTable']/tbody/tr[1]/td[1]/div/div/a");
	}

	public void entertextareabasedondivlabel(String field, String text) {
		// selenium.type("css=label:contains('"+field+"')+textarea", text);
		// assertEquals(selenium.getValue("css=label:contains('"+field+"')+textarea"),
		// text);

		selenium.type("//textarea[@name='" + field + "']", text);
		assertEquals(selenium.getValue("//textarea[@name='" + field + "']"),
				text);

	}

	public void getSupplierName() {
		SupplierName = selenium.getValue("//input[@id='groupName']");
		System.out.print(SupplierName);
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("supplier.txt", false);

			// Print a line of text
			new PrintStream(fout).println(SupplierName);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Product ID:" + SupplierName);
	}

	public void enterTextinAutocomplete(String field, String text) {
		String supvalue = text;
		String keyword = supvalue.substring(0, 3);
		// selenium.type("supplier", keyword);
		selenium.type(field, keyword);
		selenium.typeKeys(field, keyword);
		// Thread.sleep(5000);
		synchronized (selenium) {
			try {
				selenium.wait(5000);
			} catch (InterruptedException e) {
				e.printStackTrace(); // To change body of catch statement use
										// File | Settings | File Templates.
			}
		}

		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (selenium.isTextPresent(supvalue))
					break;
			} catch (Exception e) {
			}
			// Thread.sleep(5000);
		}
		// selenium.waitForPageToLoad("5000");

		// System.out.print(selenium.getText("css=li:contains(Crazy April Fool Experiences)"));
		selenium.mouseOver("//html/body/ul/li/a[. = \"" + supvalue + "\"]");
		selenium.click("//html/body/ul/li/a[. = \"" + supvalue + "\"]");
	}

	public void selectdropdown(String field, String text) {
		selenium.select("//select[@name='" + field + "']", "label=" + text + "");

	}

	public void selectReferrer(String text) {

		selenium.select("id=referrer", "label=" + text + "");
	}

	public void selectdropdownbasedonscript(String field, String text) {
		// selenium.fireEvent("//select[@id='"+field+"']", "label=ACT");
		selenium.click("//select[@id='" + field + "']");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
		selenium.select("//select[@id='" + field + "']", "label=ACT");
		// selenium.runScript("$('#stateID').trigger('change')");
		selenium.fireEvent("//select[@id='" + field + "']", "onchange");

	}

	public void verifyTextboxValuesByID(String field, String text) {
		assertEquals(text, selenium.getValue("name=" + field + ""));

	}

	public void verifySpanValueById(String spanId, String value) {
		assertEquals(value, selenium.getText("//span[@id='" + spanId + "']"));

	}

	public void verifyStrongBrSpan(String strongContent, String spanContent) {
		// selenium.click("//div[@class='cols']/strong[text()='Ainsley Lachlan']/../span/div/a[@class='buttonEdit contactEdit']");
		assertEquals(
				selenium.getText("//div[@class='cols']/strong[text()='"
						+ strongContent + "']/../span/span"), spanContent);
		// assertEquals(
		// selenium.getText("//strong[text()='" + strongContent
		// + "']/following-sibling::span"), spanContent);

	}

	// public void verifyTextboxValueswithbr(String field, String text) {
	// assertEquals(
	// text,
	// selenium.getValue("css=label:contains('" + field
	// + "')+br+input"));
	// }
	//
	// public void verifyTextboxValueswithspan(String field, String text) {
	// assertEquals(
	// text,
	// selenium.getValue("css=label:contains('" + field
	// + "')+br+span+input"));
	// }
	//
	// public void verifyTextareawithbr(String field, String text) {
	// assertEquals(
	// text,
	// selenium.getValue("css=label:contains('" + field
	// + "')+br+textarea"));
	// }
	//
	// public void verifydropdown(String field, String text) {
	// assertEquals(
	// text,
	// selenium.getSelectedLabel("css=label:contains('" + field
	// + "')+br+select"));
	// //
	// selenium.select("css=th:contains('"+field+"')+td>select","label="+text+"");
	// }
	//
	// public void verifytextareabasedonname(String field, String text) {
	// assertEquals(text,
	// selenium.getValue("//textarea[@name='" + field + "']"));
	// }
	//
	// public void verifyTextInFirstColn(String field, String text) {
	// assertEquals(text,
	//
	// selenium.getText("css=th:contains('" + field + "')+td").trim());
	//
	// }
	//
	// public void verifyTextInFirstColnForEmail(String field, String text) {
	//
	// assertTrue(selenium.getText("css=th:contains('" + field +
	// "')+td").trim().contains(text));
	// }
	//
	// public void verifytextinlegend(String field, String text) {
	// assertEquals(
	// selenium.getText("//fieldset/legend[text()='" + field
	// + "']/../div/p"), text);
	// }
	//
	// public void getoccasiontags(String field, String text) {
	// String occasiontags = selenium.getText("css=label:contains(" + field
	// + ")+input+div");
	// assertTrue(occasiontags.contains(text));
	// }
	//
	// public void verifyTagsinTing(String field, String text) {
	// assertTrue(selenium.getText("css=th:contains('" + field + "')+td")
	// .contains(text));
	// }
	//
	// public void verifyLocationinTing(String text) {
	// assertTrue(selenium.getText("//fieldset/ul/li").contains(text));
	// }
	//
	// public void clickProductDetails(String text) {
	// selenium.click("//fieldset/legend[text()='" + text + "']");
	// }
	//
	// // Get Prices
	//
	// public void getprices(String pricename) {
	// // String price =
	// // selenium.getText("css=label:contains("+pricename+")+label>label");
	// assertTrue(selenium.isTextPresent("Selling Price: "));
	// String price = selenium.getText("css=label:contains('" + pricename
	// + "')+label");
	// hm.put(pricename, price);
	// System.out.print(pricename + "is:" + hm.get(pricename));
	// }
	//
	// // Get field values in Ting
	//
	// public void getColumnvaluesinTing(String field) {
	// String value = selenium.getText("css=th:contains('" + field + "')+td")
	// .trim();
	// hm.put(field, value);
	// System.out.print(field + "is:" + hm.get(field));
	// }
	//
	// public void verifyprices(String field, String text) {
	// String data = hm.get(field).toString();
	// if (data.indexOf(".") == -1) {
	// data = data + ".00";
	// }
	// assertEquals(data,
	// selenium.getText("css=th:contains('" + text + "')+td").trim());
	//
	// }
	//
	// public void verifypricesinofbiz(String field) {
	// assertEquals(hm.get(field),
	// selenium.getText("css=label:contains(" + field + ")+label"));
	// }
	//
	// public void verifycommissioninofbiz(String field, String text) {
	//
	// String commission = (String) hm.get(field);
	// String commissionvalue = commission.replaceAll("\\D+", "");
	// assertEquals(
	// commissionvalue + ".00%",
	// selenium.getValue("css=label:contains('" + text + "')+br+input")
	// + "%");
	//
	// }
	//
	// public void categoryCheckbox(String text) {
	// selenium.click("//li[@id='" + text + "']");
	// }
	//
	// // Get Product ID
	// public void getProductID() {
	// ProductID = selenium.getValue("//input[@id='productId']");
	// System.out.print(ProductID);
	// FileOutputStream fout;
	//
	// try {
	// // Open an output stream
	// fout = new FileOutputStream("product.txt", false);
	//
	// // Print a line of text
	// new PrintStream(fout).println(ProductID);
	//
	// // Close our output stream
	// fout.close();
	// }
	// // Catches any error conditions
	// catch (IOException e) {
	// System.err.println("Unable to write to file");
	// System.exit(-1);
	// }
	// System.out.print("Product ID:" + ProductID);
	// }
	//
	// public void getSupplierName() {
	// SupplierName = selenium.getValue("//input[@id='groupName']");
	// System.out.print(SupplierName);
	// FileOutputStream fout;
	//
	// try {
	// // Open an output stream
	// fout = new FileOutputStream("supplier.txt", false);
	//
	// // Print a line of text
	// new PrintStream(fout).println(SupplierName);
	//
	// // Close our output stream
	// fout.close();
	// }
	// // Catches any error conditions
	// catch (IOException e) {
	// System.err.println("Unable to write to file");
	// System.exit(-1);
	// }
	// System.out.print("Product ID:" + SupplierName);
	// }
	//
	public void getPartyID() {
		String PartyId = selenium.getValue("//input[@id='partyId']");
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("supplierID.txt", false);

			// Print a line of text
			new PrintStream(fout).println(PartyId);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Product ID:" + PartyId);
	}

	// public void typeProductID() {
	// try {
	// String field = "searchString";
	// FileInputStream fin;
	// String s;
	// fin = new FileInputStream("product.txt");
	//
	// // Read a line of text
	// BufferedReader in = new BufferedReader(new InputStreamReader(fin));
	// s = in.readLine();
	// selenium.type(field, "PROD" + s);
	// assertEquals("PROD" + s, selenium.getValue("name=" + field + ""));
	// selenium.typeKeys(field, "PROD" + s);
	// fin.close();
	//
	// } catch (IOException e) {
	// System.err.println("Unable to read from file");
	// System.exit(-1);
	// }
	//
	// }
	//
	// // Go to product Details Pgae
	// public void gotoproductpageinting(String url) {
	// selenium.windowMaximize();
	// selenium.open("http://" + url + "/products/product/index.cfm?id="
	// + ProductID + "");
	// selenium.waitForPageToLoad("30000");
	// selenium.refresh();
	// selenium.waitForPageToLoad("30000");
	// }
	//
	// // //////RB Database////////
	// public void getProductIDfromRB(String url) {
	// try {
	//
	// FileInputStream fin;
	// String s;
	// fin = new FileInputStream("product.txt");
	//
	// // Read a line of text
	// BufferedReader in = new BufferedReader(new InputStreamReader(fin));
	// s = in.readLine();
	// Class.forName("net.sourceforge.jtds.jdbc.Driver");
	// Connection con = DriverManager.getConnection(
	// "jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
	// rbdbpasswd);
	// System.out.print("Connected to the database");
	// Statement stmt = con.createStatement();
	// ResultSet rs;
	//
	// rs = stmt
	// .executeQuery("select ProductID from dbo.TabProducts where ProductCode = 'PROD"
	// + s + "' ");
	// while (rs.next()) {
	// ProductIDinRB = rs.getString("ProductID");
	// System.out.print(ProductIDinRB);
	// }
	//
	// fin.close();
	// con.close();
	// selenium.windowMaximize();
	// selenium.open("http://" + url + "/products/product/index.cfm?id="
	// + ProductIDinRB + "");
	// selenium.waitForPageToLoad("30000");
	// selenium.refresh();
	// selenium.waitForPageToLoad("30000");
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// } catch (ClassNotFoundException e) {
	// e.printStackTrace(); // To change body of catch statement use File |
	// // Settings | File Templates.
	// } catch (IOException e) {
	// System.err.println("Unable to read from file");
	// System.exit(-1);
	// }
	//
	//

	public void getSupplierIDfromRB(String url) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("supplier.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print("Supplier ID:" + s);
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs;

			rs = stmt
					.executeQuery("select SupplierID FROM dbo.TabSuppliers where CompanyName='"
							+ s + "' ");
			while (rs.next()) {
				SupplierIDinRB = rs.getString("SupplierID");
				System.out.print(SupplierIDinRB);
			}

			fin.close();
			con.close();
			selenium.windowMaximize();
			selenium.open("https://" + url + "/products/supplier/index.cfm?id="
					+ SupplierIDinRB + "");
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
			selenium.refresh();
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void getCustomerIDfromRB(String url) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("customer.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print("Customer ID:" + s);
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs;

			rs = stmt
					.executeQuery("select CustomerID FROM dbo.TabCustomers where CompanyName='"
							+ s + "' ");
			while (rs.next()) {
				CustomerIDinRB = rs.getString("CustomerID");
				System.out.print(CustomerIDinRB);
			}

			fin.close();
			con.close();
			selenium.windowMaximize();
			selenium.open("https://" + url
					+ "/customers/users/index.cfm?action=editUser&id=="
					+ CustomerIDinRB + "");
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
			selenium.refresh();
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void selectdropdownbasedonlabel(String field, String text) {
		selenium.select("css=label:contains('" + field + "')+br+select",
				"label=" + text + "");
	}

	public void selectItemFromDropDown() {

		selenium.select("id=paymentTerms", "label=14 days before Experience");
	}

	public void selectdropdownbasedonID(String field, String text) {
		selenium.select(field, text);
	}

	public void selectdropdownbasedonth(String field, String text) {
		selenium.isElementPresent("css=th:contains('" + field + "')+td>select");
		selenium.select("css=th:contains('" + field + "')+td>select",
				"label=NSW");
	}

	public void selectoption(String field, String text) {
		selenium.select(UIRepository.OFBizHomePage.getValue(field), "label="
				+ text + "");
	}

	public void gettotalsearchresults(String text) {
		String resulttext = selenium.getText("//span[@id='numOfResults']");
		String noofresults = resulttext.replaceAll("\\D+", "");
		Integer a = Integer.parseInt(noofresults);
		Integer expectedresults = Integer.parseInt(text);
		assertEquals(expectedresults, a);
	}

	public void getallproductsfromsearch() {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		System.out.print(totalrows);
		assertTrue(totalrows.equals(200));

	}

	public void getproductname(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		System.out.print("Total Number of rows:" + totalrows);
		for (int i = 1; i <= totalrows; i++) {
			String productname = selenium
					.getText("//table[@id='showProductsMainTable']/tbody/tr["
							+ i + "]/td/div/div/a");
			// System.out.print("Product Name is "+productname);
			assertEquals(text, productname);
		}

	}

	public void getsuppliername(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		// System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			String suppliername = selenium
					.getText("//table[@id='showProductsMainTable']/tbody/tr["
							+ i + "]/td/div/div[2]/a");
			// System.out.print("supplier Name is "+suppliername);
			assertEquals(text, suppliername);
		}

	}

	public void goToSupplierPageFromSearchResults(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		// System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			if (selenium
					.getText(
							"//table[@id='showProductsMainTable']/tbody/tr["
									+ i + "]/td[1]").trim().contains(text)) {
				Assert.assertTrue(selenium
						.getText(
								"//table[@id='showProductsMainTable']/tbody/tr["
										+ i + "]/td[1]").trim().contains(text));
				selenium.click("//table[@id='showProductsMainTable']/tbody/tr["
						+ i + "]/td[1]/div/div/a");
			}
		}

	}

	public void getproductcode(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		// System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			String productcode = selenium
					.getText("//table[@id='showProductsMainTable']/tbody/tr["
							+ i + "]/td[2]/div");
			// System.out.print("Product Code is "+productcode);
			assertEquals(text, productcode);
		}

	}

	public String getProductCodeFromProductPage() {
		String productCode = selenium
				.getText("//*[@id='addProductForm']/div[1]/span");
		// Remove the parenthesises
		return productCode.subSequence(1, productCode.length() - 1).toString();
	}

	public void gotoproductpageinalfred(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@id='showProductsMainTable']/tbody/tr");
		// System.out.print(totalrows);
		for (int i = 1; i <= totalrows; i++) {
			if (selenium.getText(
					"//table[@id='showProductsMainTable']/tbody/tr[" + i
							+ "]/td[2]/div").contains(text)) {
				assertEquals(
						selenium.getText("//table[@id='showProductsMainTable']/tbody/tr["
								+ i + "]/td[2]/div"), text);
				selenium.click("//table[@id='showProductsMainTable']/tbody/tr["
						+ i + "]/td/div/div/a");
			}
			// String productcode=
			// selenium.getText("//table[@id='showProductsMainTable']/tbody/tr["+i+"]/td[2]/div");
			// assertEquals(text, productcode);

			// System.out.print("Product Code is "+productcode);

		}
	}

	// Verify the text box value
	public void verifyTextboxValues(String field, String text) {
		assertEquals(text,
				selenium.getValue("css=label:contains(" + field + ")+input"));
	}

	public void verifyTextboxValueswithbr(String field, String text) {
		assertEquals(
				text,
				selenium.getValue("css=label:contains('" + field
						+ "')+br+input"));
	}

	public void verifyTextboxValueswithspan(String field, String text) {
		assertEquals(
				text,
				selenium.getValue("css=label:contains('" + field
						+ "')+br+span+input"));
	}

	public void verifyTextareawithbr(String field, String text) {
		assertEquals(
				text,
				selenium.getValue("css=label:contains('" + field
						+ "')+br+textarea"));
	}

	public void verifydropdown(String field, String text) {
		assertEquals(
				text,
				selenium.getSelectedLabel("css=label:contains('" + field
						+ "')+br+select"));
		// selenium.select("css=th:contains('"+field+"')+td>select","label="+text+"");
	}

	public void verifytextareabasedonname(String field, String text) {
		assertEquals(text,
				selenium.getValue("//textarea[@name='" + field + "']"));
	}

	public void verifyTextInFirstColn(String field, String text) {
		assertEquals(text,
				selenium.getText("css=th:contains('" + field + "')+td").trim());
	}

	public void verifyTextInDivClass(String className, String text) {
		assertTrue(selenium
				.getText("//div[" + containingClass(className) + "]").contains(
						text));
	}

	public void verifyNoTextInDivClass(String className, String text) {
		assertFalse(selenium.getText(
				"//div[" + containingClass(className) + "]").contains(text));
	}

	public void verifySupplierNameDeleted() {
		// assertFalse(selenium.getText(Xpath).contains(text));
		/* assertFalse(selenium.isTextPresent("Keshawn Graeme")); */
	}

	/**
	 * Generates a partial xpath expression that matches an element whose
	 * 'class' attribute contains the given CSS className. So to match &lt;div
	 * class='foo bar'&gt; you would say "//div[" + containingClass("foo") +
	 * "]".
	 * 
	 * @param className
	 *            CSS class name
	 * @return XPath fragment
	 */
	protected static String containingClass(String className) {
		return "contains(concat(' ',normalize-space(@class),' '),' "
				+ className + " ')";
	}

	public void verifytextinlegend(String field, String text) {

		assertEquals(
				text,
				selenium.getText("//fieldset/legend[text()='" + field
						+ "']/../div/p"));
	}

	public void verifyTextInFirstColnForEmail(String field, String text) {

		assertTrue(selenium.getText("css=th:contains('" + field + "')+td")
				.trim().contains(text));
	}

	public void getoccasiontags(String field, String text) {
		String occasiontags = selenium.getText("css=label:contains(" + field
				+ ")+input+div");
		assertTrue(occasiontags.contains(text));
	}

	public void verifysuppliersearchstatus(String field, String text) {
		assertTrue(selenium.getSelectedLabel(
				"//select[@name='" + UIRepository.OFBizHomePage.getValue(field)
						+ "']").contains(text));
	}

	public void verifyTagsinTing(String field, String text) {
		assertTrue(selenium.getText("css=th:contains('" + field + "')+td")
				.contains(text));
	}

	public void verifyLocationinTing(String text) {
		assertTrue(selenium.getText("//fieldset/ul/li").contains(text));
	}

	public void verifyAccessibilityHearing() {

		assertTrue(selenium.isChecked("id=accessible_Hearing"));

	}

	public void clickProductDetails(String text) {
		selenium.click("//fieldset/legend[text()='" + text + "']");
	}
	
	public void clickAccessibility(){
		selenium.click("//fieldset[7]/legend");
	}

	// Get Prices

	public void getprices(String pricename) {
		// String price =
		// selenium.getText("css=label:contains("+pricename+")+label>label");
		assertTrue(selenium.isTextPresent("Selling Price: "));
		String price = selenium.getText("css=label:contains('" + pricename
				+ "')+label");
		hm.put(pricename, price);
		System.out.print(pricename + "is:" + hm.get(pricename));
	}

	// Get field values in Ting

	public void getColumnvaluesinTing(String field) {
		String value = selenium.getText("css=th:contains('" + field + "')+td")
				.trim();
		hm.put(field, value);
		System.out.print(field + "is:" + hm.get(field));
	}

	public void verifyprices(String field, String text) {
		String data = hm.get(field).toString();
		if (data.indexOf(".") == -1) {
			data = data + ".00";
		}
		assertEquals(data,
				selenium.getText("css=th:contains('" + text + "')+td").trim());
	}

	public void verifypricesinofbiz(String field) {
		assertEquals(hm.get(field),
				selenium.getText("css=label:contains(" + field + ")+label"));
	}

	public void verifycommissioninofbiz(String field, String text) {

		String commission = (String) hm.get(field);
		String commissionvalue = commission.replaceAll("\\D+", "");
		assertEquals(
				commissionvalue + ".00%",
				selenium.getValue("css=label:contains('" + text + "')+br+input")
						+ "%");

	}

	public void categoryCheckbox(String text) {
		selenium.click("//li[@id='" + text + "']");
	}

	// Get Product ID
	public void getProductID() {
		ProductID = selenium.getValue("//input[@id='productId']");
		System.out.print(ProductID);
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("product.txt", false);

			// Print a line of text
			new PrintStream(fout).println(ProductID);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Product ID:" + ProductID);
	}

	public void typeProductID() {
		try {
			String field = "searchString";
			FileInputStream fin;
			String s;
			fin = new FileInputStream("product.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			selenium.type(field, "APR" + s);
			assertEquals("APR" + s, selenium.getValue("name=" + field + ""));
			selenium.typeKeys(field, "APR" + s);
			fin.close();

		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	// Go to product Details Pgae
	public void gotoproductpageinting(String url) {
		selenium.windowMaximize();
		selenium.open("https://" + url + "/products/product/index.cfm?id="
				+ ProductID + "");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		selenium.refresh();
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void checkEmailExistsInContactMech(String email) {
		boolean result = false;
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://"
					+ ofbizdbHost + ":5432/ofbiz", ofbizdbUsername,
					ofbizdbPassword);

			Statement stmt = con.createStatement();
			ResultSet rs;

			rs = stmt
					.executeQuery("select INFO_STRING from CONTACT_MECH where CONTACT_MECH_TYPE_ID='EMAIL_ADDRESS'"
							+ " AND INFO_STRING='" + email + "'");

			while (rs.next()) {
				result = true;
			}
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
		assertTrue(result);
	}

	// //////RB Database////////
	public void getProductIDfromRB(String url) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("product.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs;

			rs = stmt
					.executeQuery("select ProductID from dbo.TabProducts where ProductCode = 'APR"
							+ s + "' ");
			while (rs.next()) {
				ProductIDinRB = rs.getString("ProductID");
				System.out.print(ProductIDinRB);
			}

			fin.close();
			con.close();
			selenium.windowMaximize();
			selenium.open("https://" + url + "/products/product/index.cfm?id="
					+ ProductIDinRB + "");
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
			selenium.refresh();
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void getProductIDfromTing(String url) {
		selenium.windowMaximize();
		selenium.open("https://" + url + "/products/product/index.cfm?id="
				+ hm.get("Product ID") + "");
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		selenium.refresh();
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void verifyProductCodeTing() {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("product.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			assertEquals("APR" + s,
					selenium.getText("css=th:contains('Product Code')+td")
							.trim());

		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void gotoproductdetailspageinTing(String url) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("product.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			selenium.open("https://" + url + "/products/product/index.cfm?id="
					+ s.replaceAll("\\D+", ""));

		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void getsuppliererrormessage() {
		// System.out.print(selenium.getText("//div[@id='productNameError']"));
		assertTrue(selenium.isVisible("//div[@id='groupNameError']"));
		assertTrue(selenium.isVisible("//div[@id='groupNameLocalError']"));
	}

	public void verifyText(String field, String value) {
		assertEquals(value,
				selenium.getValue(UIRepository.OFBizHomePage.getValue(field)));
	}

	public void typeRichText(String field, String value) {
		selenium.selectFrame(UIRepository.OFBizHomePage.getValue(field));
		selenium.type("//body", value);
		// assertEquals(value,
		// selenium.getValue(UIRepository.OFBizHomePage.getValue("//body")));
		selenium.selectWindow("null");
	}

	public void typeRichTextbasedondiv(String field, String value) {
		// selenium.selectFrame("xpath=//div/label[contains(text(),'"+field+"')]/../../div[@class='jHtmlArea']/div[2]/iframe");
		selenium.selectFrame(UIRepository.OFBizHomePage.getValue(field));
		selenium.type("//body", value);
		// assertEquals(value,
		// selenium.getValue(UIRepository.OFBizHomePage.getValue("//body")));
		selenium.selectWindow("null");
	}

	public void verifyRichText(String field, String value) {
		selenium.selectFrame(UIRepository.OFBizHomePage.getValue(field));
		assertEquals(value, selenium.getText("//body"));
		selenium.selectWindow("null");
	}

	public void verifyRichTextbasedondiv(String field, String value) {
		// selenium.selectFrame("xpath=//div/label[contains(text(),'"+field+"')]/../../div[@class='jHtmlArea']/div[2]/iframe");
		selenium.selectFrame(UIRepository.OFBizHomePage.getValue(field));
		assertEquals(value, selenium.getText("//body"));
		selenium.selectWindow("null");
	}

	public void verifyDropDownText(String field, String value) {
		assertEquals(value,
				selenium.getSelectedLabel(UIRepository.OFBizHomePage
						.getValue(field)));
	}

	public void verifyboxdimensioninofbiz(String field, String text) {
		assertEquals(
				selenium.getValue("css=div:contains('" + field + "')+input"),
				text);
	}

	public String getSqldb() {
		return sqldb;
	}

	public void setSqldb(String sqldb) {
		this.sqldb = sqldb;
	}

	public String getRbdbpasswd() {
		return rbdbpasswd;
	}

	public void setRbdbpasswd(String rbdbpasswd) {
		this.rbdbpasswd = rbdbpasswd;
	}

	public String getRbdbuser() {
		return rbdbuser;
	}

	public void setRbdbuser(String rbdbuser) {
		this.rbdbuser = rbdbuser;
	}

	public void seleniumsleep() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}
	}

	public void typeText(String field, String value) {
		selenium.type(UIRepository.OFBizHomePage.getValue(field), value);
		assertEquals(
				selenium.getValue(UIRepository.OFBizHomePage.getValue(field)),
				value);
	}

	public void clickOK() {

		selenium.click("id=resetPasswordOk");
	}

	public void typecustomfieldvalue(String field, String text) {
		// System.out.print(field);
		selenium.type("//input[@id='" + field + "'][@type='text']", text);
		// System.out.print(selenium.getValue("//input[@id='"+field+"'][@type='text']"));

		// selenium.type("//input[@id='"+field+"']", text);
		assertEquals(text,
				selenium.getValue("//input[@id='" + field + "'][@type='text']"));
	}

	public void textnotpresent(String text) {
		assertFalse(selenium.isElementPresent(UIRepository.OFBizHomePage
				.getValue(text)));
	}

	public void click(String field) {
		String fieldLocater = UIRepository.OFBizHomePage.getValue(field);
		if (!selenium.isElementPresent(fieldLocater)) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		selenium.click(fieldLocater);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickUpdateButton() {
		selenium.click("xpath=(//input[@id='saveChangesToolbar'])[2]");
		selenium.waitForPageToLoad("30000");
	}

	public void verifyImage(String field, String imageSrc) {
		String fieldLocater = UIRepository.OFBizHomePage.getValue(field);
		String imgSrcReceived = selenium.getAttribute("id=" + fieldLocater
				+ "@src");
		String imageSrcExpected = UIRepository.OFBizHomePage.getValue(imageSrc);
		assertEquals(imageSrcExpected, imgSrcReceived);
	}

	public void verifyNotVisible(String field) {
		String fieldLocater = UIRepository.OFBizHomePage.getValue(field);
		assertFalse(selenium.isElementPresent(fieldLocater)
				&& selenium.isVisible(fieldLocater));
	}

	public void verifyVisible(String field) {
		String fieldLocater = UIRepository.OFBizHomePage.getValue(field);
		assertTrue(selenium.isElementPresent(fieldLocater));
	}

	public void waitForElementToBeVisible(String field, String Timeout) {
		int currentTime = 0;
		int totalTimeout = Integer.parseInt(Timeout);
		String fieldLocater = UIRepository.OFBizHomePage.getValue(field);
		while (totalTimeout > currentTime) {
			try {
				Thread.sleep(2000);
				currentTime = currentTime + 2000;
				if (selenium.isElementPresent(fieldLocater)) {
					return;
				}
			} catch (Exception e) {
				throw new RuntimeException("Exception");
			}
		}
		throw new RuntimeException("Element " + field + " timed out");
	}

	public void verifyDBFieldValue(String field, String value) {
		Connection con = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + sqldb
					+ ":1433/rbd", rbdbuser, rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select ProductID from dbo.TabProducts where ProductCode = 'APR"
							+ ProductIDTemp + "' ");

			while (rs.next()) {
				String DBValue = rs.getString(field);
				System.out.print(DBValue);
				assertEquals(value, DBValue);
			}
			con.close();
		} catch (Exception e) {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void VerifyProductCategoriesinRBD(String field, String value,
			String tablename) {
		Connection con = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + sqldb
					+ ":1433/rbd", rbdbuser, rbdbpasswd);
			// System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(UIRepository.OFBizHomePage
					.getValue(tablename));
			// ResultSet rs =
			// stmt.executeQuery("select * from tblPyramids where categoryName = 'Driving Experiences' ");
			while (rs.next()) {
				String DBValue = rs.getString(field);
				System.out.print("dbvalue" + DBValue);
				assertEquals(value, DBValue);
				// System.out.print(DBValue+":"+value);
			}
			con.close();
		} catch (Exception e) {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void EditProductCategoriesinRBD(String field, String value) {
		Connection con = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + sqldb
					+ ":1433/rbd", rbdbuser, rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			// stmt.executeUpdate("Update tblPyramids set" + field + "=" + value
			// + "where categoryName = 'Driving Experiences new test'");
			stmt.executeUpdate("Update tblPyramids set " + field + "= '"
					+ value
					+ "'where categoryName = 'Driving Experiences new test'");
			con.close();
		} catch (Exception e) {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void AddProductAccessibilityOptionsinRBD(String field, String value) {
		Connection con = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + sqldb
					+ ":1433/rbd", rbdbuser, rbdbpasswd);
			System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("Update TabAccessibilityType set" + field + "="
					+ value + "where AccessibilityTypeID=''");
			con.close();
		} catch (Exception e) {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void storeProductID() {
		ProductIDTemp = selenium
				.getText("xpath=/html/body/div[2]/div[2]/div/div/form/div/span");
		ProductIDTemp = ProductIDTemp.replace("(", "").replace(")", "");
		System.out.print(ProductIDTemp);
	}

	public void waitForTime(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void getSupplierID() {

		String location = selenium.getLocation();

		String SupplierId = location.substring((location.indexOf("id") + 3),
				location.length());
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("supplierID.txt", false);

			// Print a line of text
			new PrintStream(fout).println(SupplierId);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Supplier ID:" + SupplierId);

	}

	// Get Customer ID when new customer is created in Ting
	public void getCustomerIDRB() {
		customerID = selenium.getText("css=th:contains('Customer ID:')+td>a");
		System.out.print(customerID);
		// id.put("CustId", supID);
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("mycust.txt", false);

			// Print a line of text
			new PrintStream(fout).println(customerID);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Customer ID:" + customerID);
	}

	public void getCustomerID() {

		String location = selenium.getLocation();
		String urls[] = location.split("/");
		String CustomerId = urls[urls.length - 1];
		FileOutputStream fout;

		try {
			// Open an output stream
			fout = new FileOutputStream("customerID.txt", false);

			// Print a line of text
			new PrintStream(fout).println(CustomerId);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Customer ID:" + CustomerId);

	}

	public void redirectToSupplierPage(String hostname, String port) {

		try {

			FileInputStream fin;
			String supplierID;
			fin = new FileInputStream("supplierID.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			supplierID = in.readLine();
			fin.close();
			String url = "https://" + hostname + ":" + port + "/"
					+ "AlfRED/Supplier/SUP_" + supplierID;
			System.out.println("URL is +++++++++" + url);

			selenium.open(url);
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void redirectToEditedSupplierPage(String hostname, String port) {

		// Read a line of text
		String url = "https://" + hostname + ":" + port + "/"
				+ "AlfRED/Supplier/SUP_1361";
		System.out.println("URL is +++++++++" + url);

		selenium.open(url);
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
	}

	public void getSupplierErrorMessage() {
		// TODO Auto-generated method stub
		assertTrue(selenium.isVisible("//div[@id='groupNameLocalError']"));
		assertTrue(selenium.isVisible("//div[@id='groupNameError']"));
	}

	public void redirectToEarlierSupplierPage(String hostname, String port) {

		try {

			FileInputStream fin;
			String supplierID;
			fin = new FileInputStream("supplierID.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			supplierID = in.readLine();
			fin.close();
			String url = "https://" + hostname + ":" + port + "/"
					+ "AlfRED/Supplier/" + supplierID;
			System.out.println("URL is +++++++++" + url);

			selenium.open(url);
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void redirectToSupplierPageById(String hostname, String port,
			String supplierId) {

		String url = "http://" + hostname + ":" + port + "/"
				+ "AlfRED/Supplier/SUP_" + supplierId;
		System.out.println("URL is +++++++++" + url);

		selenium.open(url);
		selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);

	}

	public void redirectToEarlierCustomerPage(String hostname, String port) {

		try {

			FileInputStream fin;
			String customerID;
			fin = new FileInputStream("customerID.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			customerID = in.readLine();
			fin.close();
			String url = "https://" + hostname + ":" + port + "/"
					+ "AlfRED/control/customerView?partyId=" + customerID;
			System.out.println("URL is +++++++++" + url);

			selenium.open(url);
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void navigateToCustomerViewPage(String hostname, String port) {

		try {

			FileInputStream fin;
			String customerID;
			fin = new FileInputStream("customerID.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			customerID = in.readLine();
			fin.close();
			String url = "https://" + hostname + ":" + port + "/"
					+ "AlfRED/control/customerView?partyId=" + customerID;
			System.out.println("URL is +++++++++" + url);

			selenium.open(url);
			selenium.waitForPageToLoad(_WAIT_FOR_PAGE_TO_LOAD);
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void setOfbizdbPassword(String ofbizdbPassword) {
		this.ofbizdbPassword = ofbizdbPassword;
	}

	public void setOfbizdbHost(String ofbizdbHost) {
		this.ofbizdbHost = ofbizdbHost;
	}

	public void verifyEditedDateValue() {

		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateNow = formatter.format(currentDate.getTime());
		System.out.println("Now the date is :=>  " + dateNow);

		selenium.isTextPresent(dateNow);

	}

	// Prachi

	public void verifyCustomerAddCredit(String field, String value) {

		String fieldText = UIRepository.OFBizHomePage.getValue(field);

		assertEquals(value, selenium.getText(fieldText));
	}

	public void selectCountry() {

		selenium.selectWindow("name=fbMainContainer");
		selenium.click("id=fbMinimizeButton");

		selenium.select("name=countryCode", "label=Australia");
	}

	public void selectState() {

		selenium.select("id=stateProvinceGeoId", "label=New South Wales");
	}

	// Prachi

	public void hover() {
		assertTrue(
				"Element not present to hover",
				selenium.isElementPresent("xpath=.//*[@id='addCustomerOrUpdate']/div[26]/div/div[2]/a/span"));
		assertFalse(
				"Element is not hidden",
				selenium.isVisible("xpath=.//*[@id='addCustomerOrUpdate']/div[26]/div/div[2]/a/span"));
	}

	// Click the radio text or checkbox text based on label
	public void checkRadio(String text) {

		selenium.click("css=label:contains(" + text + ")");
		// assertTrue(selenium.isChecked("css=label:contains("+text+")"));
	}

	public void setOfbizdbUsername(String ofbizdbUsername) {
		this.ofbizdbUsername = ofbizdbUsername;
	}

	public void verifyRadioChecked() {

		assertTrue(selenium.isChecked("id=prefIDs"));

	}

	public void enterLogin(String field, String text) {
		selenium.type(field, text);
		assertEquals(text, selenium.getValue("name=" + field + ""));
	}

	public void gotoconsumersite(String url) {
		open(url);
		selenium.waitForPageToLoad("100000");
		// selenium.waitForPageToLoad("20000");
	}

	public void getOrderID() {
		String order_id = selenium.getText("//div[@id='cartHeader']/h1");
		OrderID = order_id.replaceAll("\\D+", "");
		FileOutputStream fout;
		try {
			// Open an output stream
			fout = new FileOutputStream("order.txt", false);

			// Print a line of text
			new PrintStream(fout).println(OrderID);

			// Close our output stream
			fout.close();
		}
		// Catches any error conditions
		catch (IOException e) {
			System.err.println("Unable to write to file");
			System.exit(-1);
		}
		System.out.print("Order ID:" + OrderID);
	}

	public void enterOrderID(String field, String text) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("order.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print(s);
			selenium.type(field, text + s);
			assertEquals(text + s, selenium.getValue("name=" + field + ""));
			fin.close();
		}

		catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

	}

	public void Verifycustomer() {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("mycust.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print(s);
			assertTrue(selenium.isTextPresent("CUS_" + s));

			fin.close();
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void chooseDeliveryOption() {
		selenium.click("//div[@id='giftPackaging']/ul/li[@class='standard']/input");
	}

	public void Randomname(String field, String text) {
		int low = 1;
		int high = 40;
		int randomInt;
		Random random = new Random();
		for (int i = 0; i < 1; i++) {
			randomInt = random.nextInt(high) + low;
			selenium.type("css=th:contains('" + field + "')+td>input", text
					+ randomInt);
			assertEquals(
					selenium.getValue("css=th:contains('" + field
							+ "')+td>input"), text + randomInt);
		}
	}

	public void Randomdescription(String field, String text) {
		int low = 1;
		int high = 40;
		int randomInt;
		Random random = new Random();
		for (int i = 0; i < 1; i++) {
			randomInt = random.nextInt(high) + low;
			selenium.type("css=th:contains('" + field + "')+td>textarea", text
					+ randomInt);
			assertEquals(
					selenium.getValue("css=th:contains('" + field
							+ "')+td>textarea"), text + randomInt);
		}
	}

	public void clickEditImagebtnOrder() {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("order.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print(s);
			String productcode = selenium
					.getText("//div[@class='datagrid']/table/tbody/tr/td[2]");
			if (productcode.equals(s)) {
				System.out.print("Product Code found is:" + productcode);
				selenium.click("//td[1]/a/img[@src='/assets/images/admin/edit.gif']");
			} else {
				System.out.print("Product Code not found");
			}
			fin.close();
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}

		catch (Exception ex) {
			ex.toString();
		}

	}

	public void clickBookforOrder(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//table[@class='grid clearer']/tbody/tr");
		assertEquals(
				selenium.getText("//table[@class='grid clearer']/tbody/tr[1]/td[1]"),
				text);
		for (int i = 1; i <= totalrows; i++) {
			if (selenium.getText(
					"//table[@class='grid clearer']/tbody/tr[" + i + "]/td[1]")
					.contains(text)) {
				selenium.click("//table/tbody/tr[" + i + "]/td[5]/label/input");

			}
		}
	}

	public void enterpreferreddateforOrderBooking(String field) {

		String s1, s2;
		Date date;
		Format formatter;
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DATE, 1);
		date = calendar.getTime();
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		s1 = formatter.format(date);
		// System.out.println("Tomorrow : " + s1);

		selenium.type(field, s1);
		assertEquals(s1, selenium.getValue("name=" + field + ""));

	}

	public void VerifyBooking() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			// System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs;
			rs = stmt
					.executeQuery("select * from dbo.TabRedemption where RecipEmail = 'jimtest037.peterbb@jim.com'");
			while (rs.next()) {
				String redemptionid = rs.getString("RedemptionID");
				// String orderitemid = rs.getString("OrderItemID");
				String voucherNo = rs.getString("voucherNumber");
				String torecp = rs.getString("toRecipient");
				String txtmsg = rs.getString("messageText");
				String frmpurchsr = rs.getString("fromPurchaser");
				hm.put("Redemptionid", redemptionid);
				// hm.put("Orderitemid", orderitemid);
				hm.put("VoucherNumber", voucherNo);
				hm.put("ToRecipient", torecp);
				hm.put("TextMessage", txtmsg);
				hm.put("FromPurchaser", frmpurchsr);
				System.out.print("Voucher Number in RBD: " + voucherNo);
				System.out.print("Booking id is:" + hm.get("BookingID"));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		}

	}

	public void enteralternatedateforOrderBooking(String field) {

		String s1, s2;
		Date date;
		Format formatter;
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.DATE, 2);
		date = calendar.getTime();
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		s2 = formatter.format(date);
		// System.out.println("Day after Tomorrow : " + s2);

		selenium.type(field, s2);
		assertEquals(s2, selenium.getValue("name=" + field + ""));

	}

	public void enterbookingid(String field) {
		selenium.type("css=td:contains('" + field + "')+td>input",
				hm.get("Redemptionid").toString());
		assertEquals(
				selenium.getValue("css=td:contains('" + field + "')+td>input"),
				hm.get("Redemptionid").toString());
	}

	public void enterorderitemid(String field) {
		selenium.type("css=td:contains('" + field + "')+td>input",
				hm.get("Orderitemid").toString());
		assertEquals(
				selenium.getValue("css=td:contains('" + field + "')+td>input"),
				hm.get("Orderitemid").toString());
	}

	public void enterparticipantid(String field) {
		selenium.type("css=td:contains('" + field + "')+td>input",
				hm.get("ParticipantID").toString());
		assertEquals(
				selenium.getValue("css=td:contains('" + field + "')+td>input"),
				hm.get("ParticipantID").toString());
	}

	public void gotoVoucherPage() {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//form[@name='voucherForm']/fieldset/table/tbody/tr");
		System.out.print(totalrows);
		selenium.click("//form[@name='voucherForm']/fieldset/table/tbody/tr[1]/td[2]/a");

	}

	public void clickOrderIteminRB(String text) {
		String orderitem = selenium
				.getText("//fieldset/legend[text()='Order Items']/../table/tbody/tr/td[2]");
		if (orderitem.equals(text)) {
			selenium.click("//fieldset/legend[text()='Order Items']/../table/tbody/tr/td[1]/a");
		}

	}

	public void VerifyVoucherNoteRB(String text) {
		try {
			FileInputStream fin;
			String s;
			fin = new FileInputStream("order.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			// System.out.print("Connected to the database");
			Statement stmt = con.createStatement();
			ResultSet rs;
			System.out.print(s);
			rs = stmt
					.executeQuery("select * from dbo.TabVoucherNotes where OrderItemID = '"
							+ s + "';");
			while (rs.next()) {
				String note = rs.getString("Note").toString();
				assertEquals(note, text);
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void ClickcustomerinOrderPage(String host, String port) {
		try {

			FileInputStream fin;
			String s;
			fin = new FileInputStream("mycust.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			System.out.print(s);
			assertTrue(selenium.isTextPresent("CUS_" + s));
			// selenium.click("//a[text()='CUS_"+s+"']");
			selenium.windowMaximize();
			selenium.open("https://" + host + ":" + port
					+ "/partymgr/control/viewprofile?partyId=CUS_" + s + "");
			fin.close();
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void updateCustomerAddress(String text) {
		Integer totalrows = (Integer) selenium
				.getXpathCount("//div[@id='partyContactInfo']/div/table[@class='basic-table']/tbody/tr");
		String addresstext = selenium
				.getText("//div[@id='partyContactInfo']/div/table[@class='basic-table']/tbody/tr[3]/td[2]");
		// System.out.print(addresstext);
		if (addresstext.contains(text)) {
			selenium.click("//div[@id='partyContactInfo']/div/table[@class='basic-table']/tbody/tr[3]/td[4]/a");
		}
		selenium.waitForPageToLoad("100000");
		// for(int i=1; i<=totalrows; i++){
		// //
		// if(selenium.getText("////div[@id='partyContactInfo']/div/table[@class='basic-table']/tbody/tr["+i+"]/td[3]").contains("ORD_"+s))
		// // {
		// // selenium.click("//table/tbody/tr["+i+"]/td[2]/a");
		// // }
		//
		// }
	}

	public void selectdropdownreview(String field, String text) {
		selenium.select("\"css=th:contains('" + field + "')+td>select",
				"label=" + text + "");
	}

	public void clickproductforRefund() {

		selenium.check("//input[@name='refundOrderItemIDList']");

	}

	// OPen Refund Details page
	public void clickrefundIDinOfbiz() {
		selenium.waitForPageToLoad("3000");
		assertEquals(
				selenium.getText("//table[@class='basic-table hover-bar']/tbody/tr[2]/td[1]/a"),
				"" + hm.get("RefundID") + "");
		selenium.click("//table[@class='basic-table hover-bar']/tbody/tr[2]/td[1]/a");
	}

	public void getRefundIDfromRBD() {
		try {
			FileInputStream fin;
			String s;
			fin = new FileInputStream("order.txt");

			// Read a line of text
			BufferedReader in = new BufferedReader(new InputStreamReader(fin));
			s = in.readLine();
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:jtds:sqlserver://" + sqldb + ":1433/rbd", rbdbuser,
					rbdbpasswd);
			// System.out.print("Connected to the database");

			Statement stmt = con.createStatement();
			ResultSet rs;
			rs = stmt
					.executeQuery("select * from tabRefund where refundedOrderID = '"
							+ s + "'");
			while (rs.next()) {
				String refID = rs.getString("refundID");
				hm.put("RefundID", refID);
				System.out.print(refID);

			}
			con.close();
			selenium.type("returnId", s);
			// assertEquals(s, selenium.getValue("name='returnId'"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // To change body of catch statement use File |
									// Settings | File Templates.
		} catch (IOException e) {
			System.err.println("Unable to read from file");
			System.exit(-1);
		}
	}

	public void navigateToCustomerEditPage() {

		selenium.click("id=saveChangesToolbar");
		selenium.waitForPageToLoad("30000");
		/* selenium.waitForPopUp("_self", "30000"); */
	}

	public void clickButtonCSS(String text) {
		selenium.click(text);

	}

	public void clickRadioButton(String inputId) {
		selenium.click("id=" + inputId);
	}

	public void clickEditImagebtn(String text) {
		try {
			String productcode = selenium
					.getText("//table[@id = 'anotherTable']/tbody/tr/td[2]");
			if (productcode.equals(text)) {
				System.out.print("Product Code found is:" + productcode);
				selenium.click("//td[1]/a/img[@src='/assets/images/admin/edit.gif']");
			} else {
				System.out.print("Product Code not found");
			}
		} catch (Exception ex) {
			ex.toString();
		}

	}
}
