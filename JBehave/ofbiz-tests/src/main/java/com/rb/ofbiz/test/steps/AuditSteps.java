package com.rb.ofbiz.test.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.rb.ofbiz.test.pages.DB;
import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import static org.junit.Assert.*;

public class AuditSteps {

    private Home home;
    private DB db;

    public AuditSteps(PageFactory pageFactory) {
        home = pageFactory.newHome();
        db = pageFactory.newDB();
    }
    
    @Given("I change product name to \"$productName\"")
    public void givenIChangeProductNameTo(String productName) {
        home.enterText("productName", productName);
    }
    
    
    @Given("I change product summary from \"$oldValue\" to \"$newValue\"")
    public void givenIChangeProductSummaryFromTo(String oldValue, String newValue) {
        home.enterText("summary", oldValue);
        home.ClickButtonID("saveChangesToolbar");
        home.waitForPage("5000");
        home.enterText("summary", newValue);
    }
    
    @When("I go to audit log")
    public void whenIGoToAuditLog() {}
    
    @Then("I should see changes logged")
    public void thenIShouldSeeChangesLogged() {
        String productCode = home.getProductCodeFromProductPage();
        String productIdFromAuditLog = db.getColumnFromProductAuditLog("pk_combined_value_text", productCode);
        assertNotNull(productIdFromAuditLog);
    }
    
    @Then("I should see content changes logged")
    public void thenIShouldSeeContentChangesLogged() {
        String productCode = home.getProductCodeFromProductPage();
        String productIdFromAuditLog = db.getColumnFromContentAuditLog("pk_combined_value_text", productCode);
        assertNotNull(productIdFromAuditLog);
    }
    
    @Then("I should see previous value \"$value\"")
    public void thenIShouldSeePreviousValue(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String previousValue = db.getColumnFromProductAuditLog("old_value_text", productCode);
//        assertEquals(value, previousValue);
    }

    @Then("I should see new value \"$value\"")
    public void thenIShouldSeeNewValue(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String newValue = db.getColumnFromProductAuditLog("new_value_text", productCode);
        assertEquals(value, newValue);
    }
    
    @Then("I should see change by person \"$userName\"")
    public void thenIShouldSeeChangeBy(String userName) {
        String productCode = home.getProductCodeFromProductPage();
        String changedBy = db.getColumnFromProductAuditLog("changed_by_info", productCode);
        assertEquals(userName, changedBy);
    }

    @Then("I should see changed date time")
    public void thenIShouldSeeChangedDateTime() {
        String productCode = home.getProductCodeFromProductPage();
        String dateChanged = db.getColumnFromProductAuditLog("changed_date", productCode);
        assertNotNull(dateChanged);
    }
    
    @Then("I should see previous content value \"$value\"")
    public void thenIShouldSeePreviousContentValue(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String previousValue = db.getColumnFromContentAuditLog("old_value_text", productCode);
        assertEquals(value, previousValue);
    }

    @Then("I should see new content value \"$value\"")
    public void thenIShouldSeeNewContentValue(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String newValue = db.getColumnFromContentAuditLog("new_value_text", productCode);
        assertEquals(value, newValue);
    }
    
    @Then("I should see content change by person \"$userName\"")
    public void thenIShouldSeeContentChangeBy(String userName) {
        String productCode = home.getProductCodeFromProductPage();
        String changedBy = db.getColumnFromContentAuditLog("changed_by_info", productCode);
        assertEquals(userName, changedBy);
    }

    @Then("I should see changed date time for the content")
    public void thenIShouldSeeChangedDateTimeForContent() {
        String productCode = home.getProductCodeFromProductPage();
        String dateChanged = db.getColumnFromContentAuditLog("changed_date", productCode);
        assertNotNull(dateChanged);
    }
    
    @Given("I change product selling price from \"$from\" to \"$to\"")
    public void givenIChangeProductSellingPriceFromTo(String from, String to) {
        home.enterText("commissionableSellingPrice", from);
        home.ClickButtonID("saveChangesToolbar");
        home.waitForPage("5000");
        home.enterText("commissionableSellingPrice", to);
    }

    @Then("I should see price changes logged")
    public void thenIShouldSeePriceChangesLogged() {
        String productCode = home.getProductCodeFromProductPage();
        String productId = db.getColumnFromPriceAuditLog("product_id", productCode);
        assertNotNull(productId);
    }

    @Then("I should see previous price value \"$value\"")
    public void thenIShouldSeePreviousPriceValue(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String previousValue = db.getColumnFromPriceAuditLog("old_price", productCode);
//        assertEquals(value + ".00", previousValue);
    }

    @Then("I should see new price value \"$value\"")
    public void thenIShouldSeeNewPriceValue200(String value) {
        String productCode = home.getProductCodeFromProductPage();
        String previousValue = db.getColumnFromPriceAuditLog("price", productCode);
        assertEquals(value + ".00", previousValue);
    }

    @Then("I should see price change by person \"$userName\"")
    public void thenIShouldSeePriceChangeByPerson(String userName) {
        String productCode = home.getProductCodeFromProductPage();
        String changedBy = db.getColumnFromPriceAuditLog("changed_by_user_login", productCode);
        assertEquals(userName, changedBy);
    }

    @Then("I should see changed date time for the price")
    public void thenIShouldSeeChangedDateTimeForThePrice() {
        String productCode = home.getProductCodeFromProductPage();
        String dateChanged = db.getColumnFromPriceAuditLog("changed_date", productCode);
        assertNotNull(dateChanged);
    }
}
