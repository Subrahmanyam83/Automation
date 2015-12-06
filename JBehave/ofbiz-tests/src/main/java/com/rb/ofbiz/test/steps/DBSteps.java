package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.Given;

/**
 * Created by IntelliJ IDEA.
 * User: x
 * Date: 7/06/12
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class DBSteps {
    private Home home;

    public DBSteps(PageFactory pageFactory) {
        home = pageFactory.newHome();
    }


 /*   @Then("I verify the DB value of \"$field\" as \"$value\" in TabProducts table")
    public void thenIVerifyDBFieldValue(String field, String value) {
        home.verifyDBFieldValue(field,value);
    }*/

    @Then("I verify the DB value of \"$field\" as \"$value\" in TabProducts table")
    public void thenIVerifyTheDBValueOfFieldAsValueInTabProductsTable(String field, String value) {
        home.verifyDBFieldValue(field,value);
    }


    @Then("I connect to RBD Database")
    public void thenIConnectToRBDDatabase() {

    }

    @Given("I connect to RBD Database")
    public void givenIConnectToRBDDatabase() {

    }

    @Then("I verify the column value \"$columnname\" as \"$columnvalue\" in \"$tblPyramids\" Table")
    public void thenIVerifyTheColumnValueColumnNameAsColumnValueInTableNameTable(String field, String text, String tablename) {
        home.VerifyProductCategoriesinRBD(field,text, tablename);
    }

    @Then("I add the column value \"$columnname\" as \"$columnvalue\" in tblPyramids Table")
    public void thenIAddTheColumnValueColumnNameAsColumnValueInTblPyramidsTable(String field, String text) {
        home.EditProductCategoriesinRBD(field,text);
    }

    @Then("I add the column value \"$columnname\" as \"$columnvalue\" in TabAccessibilityType Table")
    public void thenIAddTheColumnValueColumnNameAsColumnValueInTabAccessibilityTypeTable(String field, String text) {
        home.AddProductAccessibilityOptionsinRBD(field,text);

    }

    @Then("I check the \"$field\" as \"$text\"")
    public void thenICheckTheFieldAsText(String field, String text) {
        home.verifyText(field, text);
    }

    @Then("I verify the column value \"$field\" as \"$text\" in \"$TabAccessibilityType\" Table")
    public void thenIVerifyTheColumnValueFieldAsTextInTabAccessibilityTypeTable(String field, String text, String tablename) {
         home.VerifyProductCategoriesinRBD(field,text,tablename);
    }

}
