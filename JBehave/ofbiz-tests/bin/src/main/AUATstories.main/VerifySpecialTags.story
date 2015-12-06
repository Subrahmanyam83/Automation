
Scenario: Add Product with Tags using Special Characters

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "Diving experience" as "Name"
And I enter the supplier as "Crazy April Fool Experiences"
And I select "Experience" as "Product Type"
And I enter the Occassion as "Mother's Day Gifts"
And I enter the Occassion as "Father's Day Gifts"
And I enter the Location as "Sydney & Surrounds"
And I click save button
And I see Congratulations. You just added a new product
And I check the value of "Name" as "Diving experience"
And I verify "Occasion Tags" value as "Mother's Day Gifts"
And I verify "Occasion Tags" value as "Father's Day Gifts"
And I verify "Location Tags" value as "Sydney & Surrounds"



