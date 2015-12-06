
Scenario: Edit product Categories RBD to Ofbiz

Given I connect to RBD Database
Then I add the column value "categoryName" as "Driving Experiences" in tblPyramids Table
Then I add the column value "categoryDescription" as "Driving Experiences description" in tblPyramids Table
Then I add the column value "friendlyURL" as "driving_experiences" in tblPyramids Table

Given I logged in to ofbiz as a catalog manager
When I click "Categories" link
Then I add "Driving Experiences new test" as the "categoryName"
And I hit "Find" submit button
And I click to open "Driving Experiences new test" page
And I see Category For
And I check the "Product Category Name" as "Driving Experiences"
And I check the "Product Category Description" as "Driving Experiences description"
And I check the "Friendly URL" as "driving_experiences"
