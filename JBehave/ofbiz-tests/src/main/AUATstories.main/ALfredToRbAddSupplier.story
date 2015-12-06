
Scenario: ALfred to RB add supplier - With Compulsory fields

Given that I logged into alfred site as Product Analyst
When I click "SupplierAdd" link under Supplier
Then I see Add Supplier

And I type "PanthaCorp" in the "Company Name"
And I type "PC1" in the "Product Code Prefix"
And I type "Sydney" in the "Address"
And I type "Manly" in the "Suburb"
And I type "92" in the "Post Code"
And I select "Australia" as "Country"
And I select "New South Wales" as "State"
And I type "44556677" in the "Phone"
And I type "4455667788" in the "Mobile"
And I type "12345" in the "Fax"
And I type "user1@pantha.com" in the "Booking Email"
And I type "user2@pantha.com" in the "Redirect Email"
And I type "panthacorp.com" in the "Website"
And I click save button
And I see Supplier successfully created. You can continue to make further changes.
And I get the SupplierName


And I wait for "15" seconds

Given that I logged into Ting site
When I go to newly added supplier page
Then I verify the value "PanthaCorp" as "Supplier Name"
Then I verify the value "44556677" as "Phone"
Then I verify the value "4455667788" as "Mobile Phone"
Then I verify the value of Email "user1@pantha.com" as "Contact Email"
Then I verify the value "12345" as "Fax"
Then I verify the value "panthacorp.com" as "Website"
Then I verify the value "Manly" as "Suburb"
Then I verify the value "92" as "Post Code"
Then I verify the value "New South Wales" as "State"


