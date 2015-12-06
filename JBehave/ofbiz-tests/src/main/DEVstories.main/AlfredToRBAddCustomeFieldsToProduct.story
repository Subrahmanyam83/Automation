
Scenario: Add Custom fields to a product

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Jet Boating" as the "categoryName"
And I hit "Find" submit button
And I click to open "Jet Boating" page
And I see Category For
And I click the "Attributes" link
And I see Category Attributes
And I enter "Fields" as the "Attr Name"
And I enter "Testfield1,Tstfield2" as the "Attr Value"
And I click "Create" button
And I click the "Logout" link

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "newtestproduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I enter the Primary category as "Jet Boating"
And I type "Test summary" as the "summary"
And I click the "Cancellation Policy"
And I type the "applicable" as "Cancellation Policy"
And I click the new custom field "Testfield1" with "attribute0"
And I type in custom value "test" as "Testfield1"
And I click the new custom field "Tstfield2" with "attribute1"
And I type in custom value "test2" as "Tstfield2"
And I click save button
And I see Congratulations. You just added a new product

Scenario: Remove Custom fields to a product

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Jet Boating" as the "categoryName"
And I hit "Find" submit button
And I click to open "Jet Boating" page
And I see Category For
And I click the "Attributes" link
And I see Category Attributes
And I update "attrValue" as "Testfield1"
And I click "Update" button
And I click the "Logout" link

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "newtestproduct" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I enter the Primary category as "Jet Boating"
And I type "Test summary" as the "summary"
And I click the new custom field "Testfield1" with "attribute0"
And I type in custom value "test" as "Testfield1"
And I do not see "Tstfield2" with "attribute1"
And I click save button
And I see Congratulations. You just added a new product











