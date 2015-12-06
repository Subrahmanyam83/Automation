Scenario: Add Product in Ofbiz - With Compulsory fields

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "Test Product" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I select Hearing Accessibility
And I click save button
And I need to see value of "Name" as "Test Product"
And I verify Accessiblity as Hearing


