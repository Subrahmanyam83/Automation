
Scenario: Add Product, publish to supplier and publish to consumer in ofbiz

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier
And I type "Test Supplier" as the "groupName"
And I type "TE3" as the "groupNameLocal"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I check value of "Company Name" as "Test Supplier"

And I verify the image of "SupplierActive" as "YesImage"

And I click "SupplierActive" field
And I click "ActiveDeactive supplier" field
And I verify the image of "SupplierActive" as "NoImage"

