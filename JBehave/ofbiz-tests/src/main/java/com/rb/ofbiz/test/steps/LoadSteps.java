package com.rb.ofbiz.test.steps;

import com.rb.ofbiz.test.pages.Home;
import com.rb.ofbiz.test.pages.PageFactory;
import org.jbehave.core.annotations.Then;

/**
 * Created by IntelliJ IDEA.
 * User: x
 * Date: 20/08/12
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoadSteps {
    private Home home;

    public LoadSteps(PageFactory pageFactory) {
        home = pageFactory.newHome();
    }

    @Then("I do not see \"$text\" message")
    public void thenIDoNotSeeTextMessage(String text) {
        home.notpresenttableContents(text);
    }



}
