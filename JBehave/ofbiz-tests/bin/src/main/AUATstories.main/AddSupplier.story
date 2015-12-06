

Scenario: Add Supplier in Ofbiz - With Compulsory fields

Given that I logged into ofbiz site
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "Test Supplier" as the "groupName"
And I type "TES" as the "groupNameLocal"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I check the value of "Company Name" as "Test Supplier"

Scenario: Add Supplier in Ofbiz - With Null Values

Given that I logged into ofbiz site
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I click save button
And I look for  supplier error message "This field is mandatory"