package com.rb.ofbiz.test.pages;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

/**
 * Created by IntelliJ IDEA.
 * User: vinu
 * Date: 7/11/11
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeleniumPageFactory extends PageFactory{
    private Selenium selenium;
    private ConditionRunner conditionRunner;
    private Home home;
    private DB db;
    private String loadtime;
    private String sqldb;
    private String rbdbuser;
    private String rbdbpassword;

    public void setLoadtime(String loadtime)
    {
         this.loadtime = loadtime;
    }

    public String getLoadtime()
    {
        return loadtime;
    }

    public void setsqldb(String sqldb) {
        this.sqldb = sqldb;
    }

    public String getsqldb()
    {
        return sqldb;
    }

    public String getRbdbuser() {
        return rbdbuser;
    }

    public void setRbdbuser(String rbdbuser) {
        this.rbdbuser = rbdbuser;
    }

    public String getRbdbpassword() {
        return rbdbpassword;
    }

    public void setRbdbpassword(String rbdbpassword) {
        this.rbdbpassword = rbdbpassword;
    }


    public SeleniumPageFactory()
    {

    }

    public SeleniumPageFactory(Selenium selenium, ConditionRunner conditionRunner) {
        this.selenium = selenium;
        this.conditionRunner = conditionRunner;

    }

    public void setHome(Home home) {
        this.home = home;
    }

    public void setDb(DB db) {
        this.db = db;
    }
     
    @Override
    public Home newHome() {
            return home;
    }

    @Override
    public DB newDB() {
        return db;
    }
}


