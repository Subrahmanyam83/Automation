
Scenario: Add Product Special in OFbiz

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshProductSpecials" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I click save button
And I see Congratulations. You just added a new product

And I click "Add New Special" field
And I type text "TestAppended" as "Append to Product Name"
And I type text "TestAppended" as "Append to Print Name"
And I type text "01/01/2013" as "Start Date"
And I type text "31/01/2013" as "End Date"
And I type text "3" as "Number Of Persons"
And I type text "1000" as "Special Price"
And I type text "100" as "Special Discount"
And I type text "10" as "Special Commission"
And I click "Product Special Save" field
And I wait for "5" seconds
And I wait for "Name" field to be visible with timeout "5"

And I click "Product Special Edit Button" field
And I verify the value of "Append to Product Name" as "TestAppended"
And I verify the value of "Append to Print Name" as "TestAppended"
And I verify the value of "Start Date" as "01/01/2013"
And I verify the value of "End Date" as "31/01/2013"
And I verify the value of "Number Of Persons" as "3"
And I verify the value of "Special Price" as "1000"
And I verify the value of "Special Discount" as "100"
And I verify the value of "Special Commission" as "10"
And I click "Product Special Cancel" field
And I wait for "Name" field to be visible with timeout "5"

Scenario: Add Product Special in OFbiz, Mark as Special

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "NiteshProductSpecials" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I click save button
And I see Congratulations. You just added a new product

And I click "Add New Special" field
And I type text "TestAppended" as "Append to Product Name"
And I type text "TestAppended" as "Append to Print Name"
And I type text "[date][Today]" as "Start Date"
And I type text "31/01/2013" as "End Date"
And I type text "3" as "Number Of Persons"
And I type text "1000" as "Special Price"
And I type text "100" as "Special Discount"
And I type text "10" as "Special Commission"
And I click "Product Special Save" field
And I wait for "5" seconds
And I wait for "Name" field to be visible with timeout "5"
And I click "Product Special On Button" field
And I click "End Product Special Ok" field
And I wait for "Name" field to be visible with timeout "5"
And I click "Product Special Off Button" field
And I wait for "3" seconds
And I click "Mark As Special" field
And I wait for "3" seconds