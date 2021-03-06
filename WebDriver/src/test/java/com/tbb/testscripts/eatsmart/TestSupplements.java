package com.tbb.testscripts.eatsmart;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tbb.constants.UIRepository.SupplementsTab;
import com.tbb.framework.BaseTest;
import com.tbb.framework.ConfigFileReader;
import com.tbb.pages.DashboardPage;
import com.tbb.pages.HomePage;
import com.tbb.pages.ShakeologyPage;
import com.tbb.pages.SignInPage;
import com.tbb.pages.eatsmart.EatSmartPage;
import com.tbb.pages.eatsmart.ShakeologyAndSupplementsPage;
import com.tbb.pages.shop.ShoppingCartPage;

/**
 * 
 * This test script contains test method(s) for Supplements page under Eat-Smart module
 * @author Jaya
 */
public class TestSupplements extends BaseTest implements SupplementsTab{

	@BeforeClass
	public void setUp() {
		startSeleniumServer();
	}

	@BeforeMethod
	public void setUp(Method method) {
		createSeleniumInstance(method);
	}


	@AfterMethod
	public void stopSelenium() {
		stopSeleniumInstance();
	}

	@AfterClass
	public void tearDown() {		
		stopSeleniumServer();
	}	

	/**
	 * Positive Test script for verifying viewing of Eat Smart Page.
	 * It verifies if all the required elements are present on the Eat Smart menu. 
	 */ 
	@Test 
	public void testMenuLinks(){

		selenium.logComment("Creating link for 'Detailed Report' in TestNG/ReportNG Logs");
		Reporter.log("<a href=" + "file://" + resultHtmlFileName	+ ">Detailed Report</a>");
		
		selenium.logComment("################## Scope of this test method ######################");
		selenium.logComment("Verifying whether are on Home page");
		selenium.logComment("Clicking on 'Sign In' Link");
		selenium.logComment("Entering valid username and password");
		selenium.logComment("Clicking on 'Eat Smart' link");
		selenium.logComment("Navigate to 'Shakeology And Supplements' Page");
		selenium.logComment("Verifying number of Supplement boxes in the center content area");
		selenium.logComment("Verifying number of Learn More links available on Page.");
		selenium.logComment("Clicking on 'Learn More' link under 'Shakeology'");
		selenium.logComment("Clicking on 'Eat Smart' link");
		selenium.logComment("Navigate to 'Shakeology And Supplements' Page");
		selenium.logComment("Clicking on 'Learn More' link under 'Slimming Formula'");
		selenium.logComment("Navigate back to 'Shakeology And Supplements' Page");
		selenium.logComment("Clicking on 'Learn More' link under 'P90X� Peak Performance Protein Bars'");
		selenium.logComment("Executing assertEmpty method");
		selenium.logComment("################## Scope of this test method ######################");
		
		
		

		selenium.logComment("Verifying whether are on Home page");
		HomePage homePage  = new HomePage(selenium);

		selenium.logComment("Clicking on 'Sign In' Link");
		DashboardPage dashboardPage;
		if(ConfigFileReader.getConfigItemValue("selenium.browser").equals("*iexploreproxy") || ConfigFileReader.getConfigItemValue("selenium.browser").equals("*safariproxy")) {
			dashboardPage = homePage.clickSignInSpecial(ConfigFileReader.getConfigItemValue("tbb.username1"), ConfigFileReader.getConfigItemValue("tbb.password1"));
		} else {
			SignInPage signInPage = homePage.clickSignIn();

			selenium.logComment("Entering valid username and password");
			dashboardPage = signInPage.loginValidUser(ConfigFileReader.getConfigItemValue("tbb.username1"), ConfigFileReader.getConfigItemValue("tbb.password1"));
		}

		selenium.logComment("Clicking on 'Eat Smart' link");
		EatSmartPage eatSmartPage = dashboardPage.clickEatSmartLink();

		selenium.logComment("Navigate to 'Shakeology And Supplements' Page");
		ShakeologyAndSupplementsPage shakeologyAndSupplementsPage = eatSmartPage.goToShakeologyAndSupplementsPage();

		selenium.logComment("Verifying number of Supplement boxes in the center content area");
		assertTrue("All supplements are not displayed", shakeologyAndSupplementsPage.getContentBoxesCount()==12, selenium );

		selenium.logComment("Verifying number of Learn More links available on Page.");
		assertTrue("All supplements are not displayed", shakeologyAndSupplementsPage.getLearnMoreLinksCount()==12, selenium );

		assertTrue("Header 'Supplements' is not displayed", selenium.isElementPresent(SUPPLEMENTS_HEADER), selenium );
		assertTrue("Expected Text 'Beachbody provides...' is not displayed", selenium.isTextPresent("Beachbody provides top-quality nutritional support for all your fitness goals. The following choices can help keep you lean, buff, healthy, and energized."), selenium );
		assertTrue("Expected Text 'Latest Release' is not displayed", selenium.isTextPresent("Latest Release"), selenium );

		selenium.logComment("Clicking on 'Learn More' link under 'Shakeology'");
		ShakeologyPage shakeologyPage = shakeologyAndSupplementsPage.clickShakeologyLearnMoreLink();

		selenium.logComment("Clicking on 'Eat Smart' link");
		eatSmartPage = shakeologyPage.clickEatSmartLink();

		selenium.logComment("Navigate to 'Shakeology And Supplements' Page");
		shakeologyAndSupplementsPage = eatSmartPage.goToShakeologyAndSupplementsPage();

		selenium.logComment("Clicking on 'Learn More' link under 'Slimming Formula'");
		ShoppingCartPage shoppingCartPage = shakeologyAndSupplementsPage.clickSlimmingFormulaLearnMoreLink();
		assertTrue("Expected Text 'Slimming Formula' is not displayed", selenium.isTextPresent("Slimming Formula"), selenium );

		selenium.logComment("Navigate back to 'Shakeology And Supplements' Page");
		homePage = shoppingCartPage.clickHomeLink();
		eatSmartPage = homePage.clickEatSmartLink();	
		shakeologyAndSupplementsPage = eatSmartPage.goToShakeologyAndSupplementsPage();

		selenium.logComment("Clicking on 'Learn More' link under 'P90X� Peak Performance Protein Bars'");
		shoppingCartPage = shakeologyAndSupplementsPage.clickP90XPeakPerformanceProteinBarsLearnMoreLink();
		assertTrue("Expected Text 'P90X Protein Bars' is not displayed", selenium.isTextPresent("P90X� Peak Performance Bars"), selenium );

		selenium.logComment("Executing assertEmpty method");
		emptyMessageBuilder();
	}
}