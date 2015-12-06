package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.UIRepository;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

public class CommonSteps {

	private Home home;
	private String hostname;
	private String port;

	public CommonSteps(PageFactory pageFactory) {
		home = pageFactory.newHome();
	}

	@Given("I'm logged in to AlfRED as user $username and password $password")
	public void givenImLoggedIn(String username, String password) {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "AlfRED/control/main";
		home.go(url);
		home.waitForPage("20000");

		home.enterText("USERNAME", username);
		home.enterText("PASSWORD", password);
		home.clickButtonBasedOnValue("Login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("that I logged into alfred site as Product Category Manager")
	public void givenThatILoggedIntoAlfredSiteAsProductCategoryManager() {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "AlfRED/control/main";
		home.go(url);
		home.waitForPage("20000");

		home.enterText("USERNAME", "jay");
		home.enterText("PASSWORD", "welcome2fun");
		home.clickButtonBasedOnValue("Login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

		@Given("that I logged into alfred site as Customer Experience Manager")
    public void givenThatILoggedIntoAlfredSiteAsCustomerExperienceManager() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/control/main";
        home.go(url);
        home.waitForPage("10000");

        home.enterText("USERNAME", "ben");
        home.enterText("PASSWORD", "welcome2fun");
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
		
		@Given("that I logged into alfred site as Customer Experience Manager to View Order Details")
	    public void givenThatILoggedIntoAlfredSiteAsCustomerExperienceManagerToViewOrders() {
	        home.deleteCookie();
	        String url = "https://" + hostname + ":" + port + "/"
	                + "AlfRED/control/orderView?orderId=ORD_8888880";
	        home.go(url);
	        home.waitForPage("10000");

	        home.enterText("USERNAME", "ben");
	        home.enterText("PASSWORD", "welcome2fun");
	        home.clickButtonBasedOnValue("Login");
	        try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }


    @Given("that I logged into alfred site and search Simon Fuller")
    public void givenThatILoggedIntoAlfredSiteAndSearchSimonFuller() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/control/customerView?partyId=CUS_910357";
        home.go(url);
        home.waitForPage("10000");

        home.enterText("USERNAME", "ben");
        home.enterText("PASSWORD", "welcome2fun");
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }  
		


	
    @Given("that I logged into alfred site as Product Manager")
    public void givenThatILoggedIntoAlfredSiteAsProductManager() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/Product/SSK181";
        home.go(url);
        home.waitForPage("10000");

        home.enterText("USERNAME", "jay");
        home.enterText("PASSWORD", "welcome2fun");
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }  

    @Given("that I logged into alfred site as Product Manager and go to unredeemed product")
    public void givenThatILoggedIntoAlfredSiteAsProductManagerAndGoToUnreedemed() {
        home.deleteCookie();
        String url = "https://" + hostname + ":" + port + "/"
                + "AlfRED/Product/WID955";
        home.go(url);
        home.waitForPage("10000");

        home.enterText("USERNAME", "jay");
        home.enterText("PASSWORD", "welcome2fun");
        home.clickButtonBasedOnValue("Login");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }  



	@Given("that I logged into alfred site as Product Analyst")
	public void givenThatILoggedIntoAlfredSiteAsTheProductAnalyst() {
		home.deleteCookie();
		String url = "https://" + hostname + ":" + port + "/"
				+ "AlfRED/control/main";
		home.go(url);
		home.waitForPage("20000");

		home.enterText("USERNAME", "jay");
		home.enterText("PASSWORD", "welcome2fun");
		home.clickButtonBasedOnValue("Login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("I open \"$productName\" product")
	public void givenIOpenProduct(String productName) {
		home.clicklink("Search");
		home.waitForPage("5000");
		home.typesearchkeyword("searchString", productName);
		home.ClickButtonIDforSearch("searchButtonImage");
		home.clickproductnameinsearch();
		home.waitForPage("5000");
	}

	@Given("I save changes")
	public void givenISaveChanges() {
		home.ClickButtonID("saveChangesToolbar");
		home.waitForPage("5000");
	}

	// Navigation in categories
	// ****
	@When("I click \"$category\" link under Supplier")
	public void whenIClickSupplierAddLinkUnderSupplier(String category) {
		home.clickcategory(category);
	}

	@When("I select \"$ADMA\" as Referrer")
	public void whenISelectADMAAsReferrer(String text) {
		home.selectdropdown("referrerID", text);
	}
	
	
	@When("I click \"$category\" link under $text")
	public void whenIClickSupplierAddLinkUndertext(String category) {
		home.clickcategory(category);
	}
	
	// same as, whenIClickSupplierAddLinkUnderSupplier , but rely on
	// UIRepository for mapping
	@Given("I go to $categoryPage")
	@When("I go to $categoryPage")
	public void givenGoToAddSupplierPage(String categoryPlainEnglish) {
		String categoryText = UIRepository.OFBizHomePage
				.getValue(categoryPlainEnglish);
		home.clickcategoryNoUiRepositoryCall(categoryText);
	}

	// ****
@Then("I add \"$text\" as $field")
	@When("I add \"$text\" as $field")
	public void whenIAddsAs(String text, String field) {
		String inputId = UIRepository.Alfred.getValue(field);
		home.enterTextByInputId(inputId, text);
	}



@Then("I add \"$text\" in the $field")
@When("I add \"$text\" in the $field")
public void whenIAddsAsName(String text, String field) {
    String inputId = UIRepository.Alfred.getValue(field);
    home.enterTextByInputName(inputId, text);
}

	@When("I add the \"$text\" as $field")
	public void thenIAddsTheAs(String text, String field) {
		String inputId = UIRepository.Alfred.getValue(field);
		home.enterTextByName(inputId, text);
	}

	
	
	@When("I change the $field to \"$text\"")
	public void whenIChangeJobTitleCEO(String field, String text) {
		String inputId = UIRepository.Alfred.getValue(field);
		home.enterTextByInputId(inputId, text);
	}

	@When("I Save")
	public void whenISave() {
		home.ClickButtonID("addProductSaveImage");
	}

	@Then("I click primary category remove button")
	public void thenIClickRemovePrimaryButton() {
		home.ClickButtonID("primaryRemoveBtn");
	}

	@Then("I click secondary category remove button")
	public void thenIClickRemoveSecondaryButton() {
		home.ClickButtonID("primaryRemoveBtn");
	}

	@Then("I click save button")
	public void thenIClickSaveButton() {
		home.ClickButtonID("addProductSaveImage");
	}

	@Then("I click save changes button")
	public void thenIClickSaveChanges() {
		home.ClickButtonID("saveChangesToolbar");
	}

	@Then("I click on Insurance Required Yes")
	public void thenIClickYes() {
		home.ClickButtonID("insuranceRequiredRadio01");
	}

	@Then("I should see $message message")
	public void thenIShouldSeeSupplierSuccessfullyCreatedMessage(String message) {
		String messageToCheck = UIRepository.Alfred.getValue(message);
		assertTrue(home.hasContents(messageToCheck));
	}

	@Then("I verify the image of \"$field\" as \"$value\"")
	public void thenIVerifyImage(String field, String value) {
		home.verifyImage(field, value);
	}

	@Then("I should check \"$value\" as \"$field\"")
	public void IShouldCheckAs(String value, String fieldPlainEnglish) {
		String fieldIdToCheck = UIRepository.Alfred.getValue(fieldPlainEnglish);
		home.verifyTextboxValuesByID(fieldIdToCheck, value);
	}

	@Then("I should see \"$value\" as $field")
	public void IShouldSeeAs(String value, String fieldPlainEnglish) {
		String fieldIdToCheck = UIRepository.Alfred.getValue(fieldPlainEnglish);
		home.verifyTextboxValuesByID(fieldIdToCheck, value);
	}

	@When("I choose \"$option\" as $field")
	public void thenIChooseAs(String option, String fieldPlainEnglish) {
		String fieldIdToCheck = UIRepository.Alfred.getValue(fieldPlainEnglish);
		home.selectdropdownbasedonID(fieldIdToCheck, option);
	}
 @Then("I click on the customer $text link")
	public void thenIClickOnTheCustomerFieldLink() {
	//	String linkToClick = UIRepository.Alfred.getValue(field);
    	home.clickOnlink();
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
