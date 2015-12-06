

Scenario: Add Newly added product Categories Ofbiz to RBD

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Driving Experiences" as the "categoryName"
And I hit "Find" submit button
And I click to open "Driving Experiences" page
And I see Category For
And I select "Experience" in the "Product Category Type"
And I type "Driving Experiences test" in the "Product Category Name"
And I type "Driving Experiences description test" in the "Product Category Description"
And I type "driving_experiences" in the "Friendly URL"
And I click "Update" button

Then I connect to RBD Database
And I verify the column value "categoryName" as "Driving Experiences test" in "tblPyramids" Table
And I verify the column value "categoryDescription" as "Driving Experiences description test" in "tblPyramids" Table
And I verify the column value "friendlyURL" as "driving_experiences" in "tblPyramids" Table

Scenario: Add Newly added product Categories RBD to Ofbiz

Given I connect to RBD Database
Then I add the column value "categoryName" as "Driving Experiences test" in tblPyramids Table
Then I add the column value "categoryDescription" as "Driving Experiences description test" in tblPyramids Table
Then I add the column value "friendlyURL" as "driving_experiences" in tblPyramids Table

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Driving Experiences" as the "categoryName"
And I hit "Find" submit button
And I click to open "Driving Experiences" page
And I see Category For
And I check the "Product Category Name" as "Driving Experiences"
And I check the "Product Category Description" as "desc"
And I check the "Friendly URL" as "driving-experiences"




