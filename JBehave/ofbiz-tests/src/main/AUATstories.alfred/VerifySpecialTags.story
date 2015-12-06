
Scenario: Add Product with Tags using Special Characters

Given that I logged into alfred site as Product Category Manager
When I click "Add" link
Then I see Add Product
And I enter "Diving experience" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I enter the Occassion as "Birthday Gifts > 10th Birthday"
And I enter the Occassion as "Birthday Gifts > 18th Birthday"
And I enter the Location as "Sydney & Surrounds"
And I click save button
And I see Congratulations. You just added a new product
And I check the value of "Name" as "Diving experience"
And I confirm "Occasion Tags" value as "Birthday Gifts > 10th Birthday"
And I confirm "Occasion Tags" value as "Birthday Gifts > 18th Birthday"
And I confirm "Location Tags" value as "Sydney & Surrounds"


