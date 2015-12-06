

Scenario: Add Newly added product accessibility options Ofbiz to RBD

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Mobility Impairment" as the "categoryName"
And I hit "Find" submit button
And I click to open "Mobility Impairment" page
And I see Category For
And I click on the "Content" link
And I wait for "Product Accessibility Category Name" element to be visible
And I type "Mobility Impairment test" in the "Product Accessibility Category Name"
And I type "Mobility Impairment test description" in the "Product Category Description"
And I type "Wheelchair Access available" in the "Product Accessibility Long Description"
And I click "Update" button

Then I connect to RBD Database
And I verify the column value "shortName" as "Mobility Impairment" in "TabAccessibilityType" Table
And I verify the column value "displayName" as "Mobility Impairment" in "TabAccessibilityType" Table
And I verify the column value "description" as "Mobility Impairment - Wheelchair Access" in "TabAccessibilityType" Table

Scenario: Add Newly added product accessibility options RBD to Ofbiz

Given I connect to RBD Database
Then I add the column value "shortName" as "Driving Experiences test" in TabAccessibilityType Table
Then I add the column value "displayName" as "Driving Experiences test" in TabAccessibilityType Table
Then I add the column value "description" as "Driving Experiences test" in TabAccessibilityType Table

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Mobility Impairment" as the "categoryName"
And I hit "Find" submit button
And I click to open "Mobility Impairment" page
And I see Category For
And I wait for "Product Accessibility Category Name" element to be visible
And I check the "Product Category Name" as "Mobility Impairment"
And I check the "Product Category Description" as "Mobility Impairment"
And I check the "Product Accessibility Long Description" as "Mobility Impairment - Wheelchair Access"








