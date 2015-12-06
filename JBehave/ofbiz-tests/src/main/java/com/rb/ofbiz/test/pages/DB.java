package com.rb.ofbiz.test.pages;

public interface DB {

    public String getColumnFromProductAuditLog(String column, String productCode);
    
    public String getColumnFromContentAuditLog(String column, String productCode);

    public String getProductIdForCode(String productCode);
    
    public String getColumnFromPriceAuditLog(String column, String productCode);
    
}
