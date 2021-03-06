package com.tbb.testscripts.eatsmart;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tbb.constants.UIRepository.MichisLadderTab;
import com.tbb.framework.BaseTest;
import com.tbb.framework.ConfigFileReader;
import com.tbb.pages.DashboardPage;
import com.tbb.pages.HomePage;
import com.tbb.pages.SignInPage;
import com.tbb.pages.eatsmart.EatSmartPage;
import com.tbb.pages.eatsmart.MichisLadderPage;


/**
 * 
 * This test script contains test method(s) for Michis Ladder page under Eat-Smart module
 * @author Jaya
 */
public class TestMichisLadder extends BaseTest implements MichisLadderTab{

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
	 * Positive Test script for verifying viewing of Michi's Ladder Page.
	 * It verifies if all the required elements are present on the Michi's Ladder Page. 
	 */ 
	@Test 
	public void testMichisLadder(){

		selenium.logComment("Creating link for 'Detailed Report' in TestNG/ReportNG Logs");
		Reporter.log("<a href=" + "file://" + resultHtmlFileName	+ ">Detailed Report</a>");
		
		selenium.logComment("################## Scope of this test method ######################");
		selenium.logComment("Verifying whether are on Home page");
		selenium.logComment("Clicking on 'Sign In' Link");
		selenium.logComment("Entering valid username and password");
		selenium.logComment("Clicking on 'Eat Smart' link");
		selenium.logComment("Navigate to 'Michi's Ladder' Page");
		selenium.logComment("Verifying that all the 'Tier titles' are available.");
		selenium.logComment("Verifying that all the Tiers content is available.");
		selenium.logComment("Verifying that all the 'Back to top' links are available.");
		selenium.logComment("Executing assertEmpty method");
		selenium.logComment("################## Scope of this test method ######################");
		

		selenium.logComment("Verifying whether are on Home page");
		HomePage homePage  = new HomePage(selenium);

		selenium.logComment("Clicking on 'Sign In' Link");
		DashboardPage dashboardPage;
		if(ConfigFileReader.getConfigItemValue("selenium.browser").equals("*iexploreproxy") || ConfigFileReader.getConfigItemValue("selenium.browser").equals("*safariproxy")) {
			dashboardPage = homePage.clickSignInSpecial(ConfigFileReader.getConfigItemValue("tbb.username"), ConfigFileReader.getConfigItemValue("tbb.password"));
		} else {
			SignInPage signInPage = homePage.clickSignIn();

			selenium.logComment("Entering valid username and password");
			dashboardPage = signInPage.loginValidUser(ConfigFileReader.getConfigItemValue("tbb.username"), ConfigFileReader.getConfigItemValue("tbb.password"));
		}

		selenium.logComment("Clicking on 'Eat Smart' link");
		EatSmartPage eatSmartPage = dashboardPage.clickEatSmartLink();

		selenium.logComment("Navigate to 'Michi's Ladder' Page");
		MichisLadderPage michisLadderPage = eatSmartPage.goToMichisLadderPage();

		assertTrue("Expected header 'Climb Michi's Ladder' is not displayed", selenium.isElementPresent(CLIMB_MICHIS_LADDER_HEADER), selenium );;
		assertTrue("Expected text 'Michi's Ladder is not...' is not displayed", selenium.isTextPresent("Michi's Ladder is not a diet. It's a simple substitution plan. To lose weight, try swapping the foods you eat for similar foods in tiers 1 and 2. The more you eat in tiers 1 and 2, the more you'll increase your chances of losing weight."), selenium );
		assertTrue("Expected text 'There are some...' is not displayed", selenium.isTextPresent("There are some healthy foods in lower tiers, but they're either calorie dense or nutrient deficient. To lose weight, you want to maximize the nutrients in every calorie you consume."), selenium );
		assertTrue("Expected text 'Note on frying:...' is not displayed", selenium.isTextPresent("Note on frying: Foods should be eaten raw, steamed, grilled, poached, baked, or broiled. Frying automatically drops even the best foods into tier 5."), selenium );
		assertTrue("Expected image for Carb Fat Protein Symbols is not displayed", selenium.isElementPresent(CARB_FAT_PROTEIN_IMAGE), selenium );;

		selenium.logComment("Verifying that all the 'Tier titles' are available.");
		assertTrue("All the Tier Titles are not displayed", michisLadderPage.getTierTitlesCount()==5, selenium );	

		selenium.logComment("Verifying that all the Tiers content is available.");
		assertTrue("All tiers are not displayed", michisLadderPage.getTiersCount()==5, selenium );

		selenium.logComment("Verifying that all the 'Back to top' links are available.");
		assertTrue("All 'Back to Top' links are not displayed", michisLadderPage.getBackToTopLinksCount()==5, selenium );	

		selenium.logComment("Executing assertEmpty method");
		emptyMessageBuilder();
	}
}