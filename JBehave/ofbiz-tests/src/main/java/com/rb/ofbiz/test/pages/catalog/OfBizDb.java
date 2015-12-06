package com.rb.ofbiz.test.pages.catalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jbehave.web.selenium.SeleniumPage;

import com.rb.ofbiz.test.pages.DB;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;

public class OfBizDb extends SeleniumPage implements DB {

    private String ofbizdbHost;
    private String ofbizdbUsername;
    private String ofbizdbPassword;

    public OfBizDb(Selenium selenium, ConditionRunner conditionRunner) {
        super(selenium, conditionRunner);
    }

    public String getColumnFromProductAuditLog(String column, String productCode) {
        String query = "select * from entity_audit_log el, product p " +
        		"where el.changed_entity_name = 'Product' " +
        		"and el.changed_by_info = 'alfred' " +
        		"and el.pk_combined_value_text = p.product_id " +
        		"and p.internal_name = '" + productCode + "'" +
        		"order by changed_date desc limit 1";
        String result = runSingleResultQuery(query, column);
        return result;
    }
    
    public String getColumnFromContentAuditLog(String column, String productCode) {
        String query = "select * from entity_audit_log el, product_content pc, data_resource dr, product p " +
        		"where el.changed_entity_name = 'DataResource' " +
        		"and el.changed_by_info = 'alfred' " +
        		"and el.pk_combined_value_text = dr.data_resource_id " +
        		"and p.product_id = pc.product_id and pc.content_id = dr.data_resource_id " +
        		"and p.internal_name = '" + productCode + "'" +
        		"order by changed_date desc limit 1";
        String result = runSingleResultQuery(query, column);
        return result;
    }
    

    public String getProductIdForCode(String productCode) {
        String query = "SELECT * FROM product WHERE internal_name = '" + productCode.toUpperCase() + "'";
        String result = runSingleResultQuery(query, "product_id");
        return result;   
    }

    public String getColumnFromPriceAuditLog(String column, String productCode) {
        String query = "SELECT * FROM product_price_change ppc, product p " +
        		"WHERE ppc.product_id = p.product_id " +
        		"AND p.internal_name = '" + productCode + "'" +
        		"ORDER BY changed_date desc LIMIT 1";
        String result = runSingleResultQuery(query, column);
        return result;
    }

    private String runSingleResultQuery(String query, String column) {
        String result = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://"+ofbizdbHost+":5432/ofbiz",ofbizdbUsername,ofbizdbPassword);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            rs.next();
            result = rs.getString(column);
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    
    public void setOfbizdbPassword(String ofbizdbPassword) {
        this.ofbizdbPassword = ofbizdbPassword;
    }

    public void setOfbizdbHost(String ofbizdbHost) {
        this.ofbizdbHost = ofbizdbHost;
    }

    public void setOfbizdbUsername(String ofbizdbUsername) {
        this.ofbizdbUsername = ofbizdbUsername;
    }

}
