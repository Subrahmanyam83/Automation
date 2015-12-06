
Scenario: Add Supplier in Ofbiz - With Compulsory fields

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "Test Supplier" in the "Company Name"
And I type "TE1" in the "Product Code Prefix"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I check the value "Company Name" as "Test Supplier"


Scenario: Add Supplier in Ofbiz - With Null Values

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I click save button
And I look for supplier error message "This field is mandatory"



