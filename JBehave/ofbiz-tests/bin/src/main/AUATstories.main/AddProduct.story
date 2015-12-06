


Scenario: Add Product in Ofbiz - With Compulsory fields

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "Test Product" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I click save button
And I need to see value of "Name" as "Test Product"


Scenario: Add Product in Ofbiz - With Null Values

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I click save button
And I look for error message "This field is mandatory"