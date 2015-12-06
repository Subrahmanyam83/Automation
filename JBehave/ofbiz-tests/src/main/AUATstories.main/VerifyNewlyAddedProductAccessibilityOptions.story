
Scenario: Add Newly added product accessibility options Ofbiz to RBD

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I click "New Category" link
And I type "Mobility gift" in the "Product Category Name"
And I type "Mobility gift test description" in the "Product Category Description"
And I type "Mobility gift" in the "Display Name"
And I type "RB_1001" in the "Primary Product Cateogory ID"
And I type "test.png" in the "Category Image"
And I click "Update" button

Then I connect to RBD Database
And I verify the column value "shortName" as "Mobility gift" in "TabAccessibilityType" Table
And I verify the column value "displayName" as "Mobility gift" in "TabAccessibilityType" Table
And I verify the column value "description" as "Mobility gift test description" in "TabAccessibilityType" Table
